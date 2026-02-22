package com.meeting.room.booking;

import java.time.OffsetDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{
	
	List<Booking> findByUserId(Long userId);
	
	List<Booking> findByRoomId(Long roomId);
	
	List<Booking> findByRoomIdAndStatus(Long roomId, BookingStatus status);
	
	@Query("""
		    SELECT b FROM Booking b
		    WHERE b.room.id = :roomId
		    AND b.status = 'CONFIRMED'
		    AND (
		        :startTime < b.endTime
		        AND :endTime > b.startTime
		    )
		""")
		List<Booking> findConflictingBookings(
		        @Param("roomId") Long roomId,
		        @Param("startTime") OffsetDateTime startTime,
		        @Param("endTime") OffsetDateTime endTime
		);
}
