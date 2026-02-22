package com.meeting.room.user;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.meeting.room.common.BaseEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
public class User extends BaseEntity{
	
	@Column(name="full_name", nullable = false)
	private String fullName;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@JdbcTypeCode(SqlTypes.NAMED_ENUM)
	@Column(nullable = false)
	private UserRole role;
	
	// Keeps track of whether they clicked the link yet
	@Column(nullable = false)
	private boolean enabled = false; 
	
	// Stores the secret UUID link momentarily
	@Column(name = "verification_token")
	private String verificationToken;

}
