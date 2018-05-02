package com.anexa.io.core.stage.repository;

import java.util.List;

import com.anexa.core.data.jpa.repository.IdentifiedDomainObjectRepository;
import com.anexa.io.core.stage.domain.StageError;

public interface StageErrorRepository extends IdentifiedDomainObjectRepository<StageError, Long> {
	List<StageError> findAllByIdAndIntegracion(Long id, String integracion);
	
	List<StageError> findAllByIdInAndIntegracion(List<Long> ids, String integracion);
}
