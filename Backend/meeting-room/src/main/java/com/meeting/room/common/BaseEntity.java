package com.meeting.room.common;

import java.time.OffsetDateTime;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "created_at", nullable = false, updatable = false)
	private OffsetDateTime createdTime;
	
	@Column(name = "updated_at")
	private OffsetDateTime updatedTime;
	
	@PrePersist
	protected void onCreate() {
		this.createdTime = OffsetDateTime.now();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedTime = OffsetDateTime.now();
	}
	
}
