package com.meeting.room.booking;

import com.meeting.room.common.BaseEntity;
import com.meeting.room.room.MeetingRoom;
import com.meeting.room.user.User;

import java.time.OffsetDateTime;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bookings", indexes = {
	    @Index(name = "idx_bookings_user", columnList = "user_id"),
	    @Index(name = "idx_bookings_room", columnList = "room_id"),
	    @Index(name = "idx_bookings_time", columnList = "start_time, end_time")
	})
@Getter
@Setter
public class Booking extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable = false)
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="room_id", nullable = false)
	private MeetingRoom room;
	
	@Column(name="start_time", nullable = false)
	private OffsetDateTime startTime;
	
	@Column(name="end_time", nullable = false)
	private OffsetDateTime endTime;
	
	@Enumerated(EnumType.STRING)
	@JdbcTypeCode(SqlTypes.NAMED_ENUM) 
	@Column(nullable = false)
	private BookingStatus status;
	
	private String purpose;
}
