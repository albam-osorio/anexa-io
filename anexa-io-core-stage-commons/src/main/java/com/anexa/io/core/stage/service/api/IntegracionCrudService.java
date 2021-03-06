package com.anexa.io.core.stage.service.api;

import org.springframework.transaction.annotation.Transactional;

import com.anexa.core.services.crud.api.CrudService;
import com.anexa.core.services.crud.api.QueryByCodigoService;
import com.anexa.io.core.stage.dto.IntegracionDto;

@Transactional(readOnly = true)
public interface IntegracionCrudService extends CrudService<IntegracionDto, Long>, QueryByCodigoService<IntegracionDto, Long> {

	IntegracionDto findOneByCodigo(String codigo);

}
