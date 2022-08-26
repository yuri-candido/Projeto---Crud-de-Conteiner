package porto.entidade;

import java.util.Date;

public class Conteiner {

	private String cliente;
	private String numeroConteiner;
	private int tipo;
	private String status;
	private String categoria;
	private String tipoMovimentacao;
	private Date dataCadastro;
	private double horaInicio;
	private double horaFim;
	private int id;
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNumeroConteiner() {
		return numeroConteiner;
	}
	public void setNumeroConteiner(String numeroConteiner) {
		this.numeroConteiner = numeroConteiner;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	public void setTipoMovimentacao(String tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public double getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(double horaInicio) {
		this.horaInicio = horaInicio;
	}
	public double getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(double horaFim) {
		this.horaFim = horaFim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
