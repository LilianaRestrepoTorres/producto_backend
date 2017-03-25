package org.udea.proint1.ms.producto_backend.dto;
// find folder original
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import org.apache.log4j.Logger;



@Entity
@Table(name = "product")
public class Product {
	static Logger logger = Logger.getLogger(Product.class);
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequence")
	@SequenceGenerator(name="sequence",sequenceName="sequence")
	@Column(name="id")
	private long id;
	
	@NotNull
	private String code;
	
	@NotNull
	private String description;
	
	public Product(){
		
	}
	
	
	public Product(long id, String code, String description) {
		super();
		logger.info("Creando producto... con id" + id +" código" + code + " descripción"+ description);
		this.id = id;
		this.code = code;
		this.description = description;
	}


	public long getId() {
		logger.info("Retornando id " + id);
		return id;
	}

	public void setId(long id) {
		logger.info("Obtiene este id: " + id );
		this.id = id;
	}

	public String getCode() {
		logger.info("Retornando código" + code);
		return code;
	}

	public void setCode(String code) {
		logger.info("Obtiene este código: " + code);
		this.code = code;
	}

	public String getDescription() {
		logger.info("Retornando descripción" + description);
		return description;
	}

	public void setDescription(String description) {
		logger.info("Retornando esta descripción" + description);
		this.description = description;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", description=" + description + "]";
	}	

	
}
