package br.ufrn.imd.model;

public class Musica {
	private String titulo;
	private String tamanho;
	private int tamanhoSegundos;
	private Boolean tocando;
	private Boolean selecionado;
	private String local;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getTamanhoSegundos() {
		return tamanhoSegundos;
	}
	
	public void setTamanhoSegundos(int tamanhoSegundos) {
		this.tamanhoSegundos = tamanhoSegundos;
	}
	
	public Boolean getTocando() {
		return tocando;
	}
	
	public void setTocando(Boolean tocando) {
		this.tocando = tocando;
	}
	
	public Boolean getSelecionado() {
		return selecionado;
	}
	
	public void setSelecionado(Boolean selecionado) {
		this.selecionado = selecionado;
	}
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public void pausarMusica() {
	
	}
	
	public void tocarMusica() {
	
	}

}