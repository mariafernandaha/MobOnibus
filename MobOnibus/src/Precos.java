import java.util.ArrayList;

public class Precos {

	private String InteiraMeia;
	private int id_preco;
	private String Distancia;
	private ArrayList<Precos>Rodoviaria;

	public String getInteiraMeia() {
		return InteiraMeia;
	}

	public void setInteiraMeia(String inteiraMeia) {
		InteiraMeia = inteiraMeia;
	}

	public int getId_preco() {
		return id_preco;
	}

	public void setId_preco(int id_preco) {
		this.id_preco = id_preco;
	}

	public String getDistancia() {
		return Distancia;
	}

	public void setDistancia(String distancia) {
		Distancia = distancia;
	}

	public ArrayList<Precos> getOnibus() {
		return Rodoviaria;
	}

	public void setOnibus(ArrayList<Precos> onibus) {
		Rodoviaria = onibus;
	}

	@Override
	public String toString() {
		return "Precos [InteiraMeia=" + InteiraMeia + ", id_preco=" + id_preco + ", Distancia=" + Distancia
				+ ", Onibus=" + Rodoviaria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Distancia == null) ? 0 : Distancia.hashCode());
		result = prime * result + ((InteiraMeia == null) ? 0 : InteiraMeia.hashCode());
		result = prime * result + ((Rodoviaria == null) ? 0 :Rodoviaria.hashCode());
		result = prime * result + id_preco;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Precos other = (Precos) obj;
		if (Distancia == null) {
			if (other.Distancia != null)
				return false;
		} else if (!Distancia.equals(other.Distancia))
			return false;
		if (InteiraMeia == null) {
			if (other.InteiraMeia != null)
				return false;
		} else if (!InteiraMeia.equals(other.InteiraMeia))
			return false;
		if (Rodoviaria == null) {
			if (other.Rodoviaria != null)
				return false;
		} else if (!Rodoviaria.equals(other.Rodoviaria))
			return false;
		if (id_preco != other.id_preco)
			return false;
		return true;
	}

	public Precos(String inteiraMeia, int id_preco, String distancia, ArrayList<Precos> onibus) {
		super();
		InteiraMeia = inteiraMeia;
		this.id_preco = id_preco;
		Distancia = distancia;
		Rodoviaria = onibus;
	}
}
