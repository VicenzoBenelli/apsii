package Exercicio01;

import java.util.Objects;

public class DataAniversario {

	private int dia;
	private int mes;

	public DataAniversario(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}


	@Override
	public boolean equals(Object o) {
		if (!(o instanceof DataAniversario)) return false;
		DataAniversario that = (DataAniversario) o;
		return dia == that.dia && mes == that.mes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dia, mes);
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes;
	}
}
