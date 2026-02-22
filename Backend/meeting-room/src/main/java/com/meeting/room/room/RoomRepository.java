package com.meeting.room.room;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<MeetingRoom, Long>{
	
	Optional<MeetingRoom> findByName(String name);
	List<MeetingRoom> findByActiveTrue();
}
