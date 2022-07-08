package com.api.services;

import java.util.List;

import com.api.entities.CancionEntity;

public interface IcancionService {
	
	CancionEntity createCancion(CancionEntity cancion);
	
	CancionEntity updateCancion(CancionEntity cancion);
	
	List<CancionEntity> getAllCancion();
	
	CancionEntity getCancionById(long idCancion);
	
	void deleteCancion(int idCancion);

}
