package py.edu.facitec.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Post extends General {
	private String titulo;
	private String autor;
	private LocalDate fecha;
	
	@OneToMany(mappedBy = "post")
	private List<Comentario> comentarios2;
	
	public List<Comentario> getComentarios() {
		return comentarios2;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios2 = comentarios;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	

}
