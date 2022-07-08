package com.api.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="cancion")
public class CancionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cancionId")
	private long cancionId;
	
	@Column(name = "nombre")
    private String nombre;
    
    @Column(name = "artista")
    private String artista;
    
    @Column(name = "genero")
    private String genero;
    
    @Column(name = "compositor")
    private String compositor;
    
    @Column(name = "album")
    private String album;
    
    @Column(name = "date")
    private Date date;

	public long getCancionId() {
		return cancionId;
	}
  
	public void setCancionId(long cancionId) {
		this.cancionId = cancionId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompositor() {
		return compositor;
	}

	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
