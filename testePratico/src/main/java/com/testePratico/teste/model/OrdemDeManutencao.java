package com.testePratico.teste.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class OrdemDeManutencao implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="FK_OrdemManutencao_Equipamento")
	private Equipamento equipamento;
	
	@Column
	private Date dataManutencao;
	
	@Column
	private String descricaoServico;
	
	public OrdemDeManutencao() {
		super();
	}
	
	public OrdemDeManutencao(Long id, Equipamento equipamento, 
			Date dataManutencao, String descricaoServico) {
		super();
		this.id = id;
		this.equipamento = equipamento;
		this.dataManutencao = dataManutencao;
		this.descricaoServico = descricaoServico;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	public Date getDataManutencao() {
		return dataManutencao;
	}
	public void setDataManutencao(Date dataManutencao) {
		this.dataManutencao = dataManutencao;
	}
	public String getDescricaoServico() {
		return descricaoServico;
	}
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	
	@Override
	public String toString() {
		return "OrdemDeManutencao: [ id = " + id + ", equipamento = " + equipamento 
				+ ", data = " + dataManutencao + ", descricao = " + descricaoServico;
	}
}
