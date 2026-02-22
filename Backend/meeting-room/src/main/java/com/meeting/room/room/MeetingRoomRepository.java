package com.meeting.room.room;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, Long>{
	
	Optional<MeetingRoom> findByNameIgnoreCase(String name);
	List<MeetingRoom> findByActiveTrueAndCapacityGreaterThanEqual(Integer minCapacity);
}
