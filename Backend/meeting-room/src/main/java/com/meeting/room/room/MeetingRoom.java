package com.meeting.room.room;

import com.meeting.room.common.BaseEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="rooms")
@Getter
@Setter
public class MeetingRoom extends BaseEntity{
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false)
	private Integer capacity;
	
	private String location;
	
	@Column(nullable = false)
	private Boolean active = true;

}
