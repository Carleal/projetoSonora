package com.sonora.apiRest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="produtos")
public class Produtos implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private String Nome_produto;
	private BigDecimal Valor_Produto;
	private Integer Estoque;
	private Integer Cidade;
	public Integer getId() {
		return Id;
	}
	public void setCod_Produto(Integer id) {
		Id = id;
	}
	public String getNome_produto() {
		return Nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		Nome_produto = nome_produto;
	}
	public BigDecimal getValor_Produto() {
		return Valor_Produto;
	}
	public void setValor_Produto(BigDecimal valor_Produto) {
		Valor_Produto = valor_Produto;
	}
	public Integer getEstoque() {
		return Estoque;
	}
	public void setEstoque(Integer estoque) {
		Estoque = estoque;
	}
	public Integer getCidade() {
		return Cidade;
	}
	public void setCidade(Integer cidade) {
		Cidade = cidade;
	}
	
}
