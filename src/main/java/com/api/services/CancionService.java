package com.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.api.entities.CancionEntity;
import com.api.repositories.IcancionRepository;


@Service
public class CancionService implements IcancionService {
	
	@Autowired
	private IcancionRepository cancionRepository;

	@Override
	public CancionEntity createCancion(CancionEntity cancion) {
		return cancionRepository.save(cancion);
	}

	@Override
	public CancionEntity updateCancion(CancionEntity cancion) {
		
		Optional<CancionEntity> cancionB = this.cancionRepository.findById(cancion.getCancionId());
		
		if(cancionB.isPresent()) {
			
			CancionEntity cancionUpdate = cancionB.get();
			
			cancionUpdate.setCancionId(cancion.getCancionId());
			cancionUpdate.setNombre(cancion.getNombre());
			cancionUpdate.setArtista(cancion.getArtista());
			cancionUpdate.setGenero(cancion.getGenero());
			cancionUpdate.setCompositor(cancion.getCompositor());
			cancionUpdate.setAlbum(cancion.getAlbum());
			cancionUpdate.setDate(cancion.getDate());
			
			cancionRepository.save(cancionUpdate);
			
			return cancionUpdate;
			
				
		}else {
			throw new ResourceNotFoundException("Cancion con id" + cancion.getCancionId() + "no encontrada");	
		}
		
	}

	@Override
	public List<CancionEntity> getAllCancion() {
		return cancionRepository.findAll();
	}

	@Override
	public CancionEntity getCancionById(long idCancion) {
		
        Optional<CancionEntity> cancionB = this.cancionRepository.findById(idCancion);
		
		if(cancionB.isPresent()) {
			return cancionB.get();
			
			
		}else {
			throw new ResourceNotFoundException("Cancion con id" + idCancion + "no encontrada");
			
		}
	}

	@Override
	public void deleteCancion(int idCancion) {
		
		 Optional<CancionEntity> cancionB = this.cancionRepository.findById((long) idCancion);
			
		 if(cancionB.isPresent()) {
			 this.cancionRepository.delete(cancionB.get());
				
				
		 }else {
			 throw new ResourceNotFoundException("Cancion con id" + idCancion + "no encontrada");
				
		 }
	}

}
