package com.anexa.io.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.anexa.core.domain.IdentifiedDomainObject;
import com.anexa.core.domain.ObjectAuditableByTime;
import com.anexa.core.domain.VersionableObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
abstract public class EntityDto<ID extends Serializable>
		implements IdentifiedDomainObject<ID>, VersionableObject, ObjectAuditableByTime {

	private static final long serialVersionUID = 1L;

	private ID id;

	private int version;

	@DateTimeFormat(style = "M-")
	private LocalDateTime fechaCreacion;

	@DateTimeFormat(style = "M-")
	private LocalDateTime fechaModificacion;
}
