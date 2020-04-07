package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Comentario extends General{
	private String texto;
	private Integer estrellas;
	@ManyToOne
	private Suscrito suscrito;
	@ManyToOne
	private Post post;
	
	public Suscrito getSuscrito() {
		return suscrito;
	}
	public void setSuscrito(Suscrito suscrito) {
		this.suscrito = suscrito;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Integer getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
	}
	
	
	

}
