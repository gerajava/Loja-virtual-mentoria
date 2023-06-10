package gerajava.mentoria.lojavirtual.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Entity
@Table(name="categoria_produto")

@SequenceGenerator(name="seq_categotia_produto",sequenceName="seq_categotia_produto",allocationSize = 1,initialValue = 1)
public class CategoriaProduto implements Serializable {
	
private static final long serialVersionUID=1L;
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "seq_categotia_produto")
private long Id;
 
 @Column(name="nome_desc_cat",nullable = false)
 private String nomeDesc;

public long getId() {
	return Id;
}

public void setId(long id) {
	Id = id;
}

public String getNomeDesc() {
	return nomeDesc;
}

public void setNomeDesc(String nomeDesc) {
	this.nomeDesc = nomeDesc;
	
	
	
}

@Override
public int hashCode() {
	return Objects.hash(Id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CategoriaProduto other = (CategoriaProduto) obj;
	return Id == other.Id;
}
 
 
 
 
}
