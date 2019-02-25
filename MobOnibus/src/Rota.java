import java.util.ArrayList;

public class Rota {

	private String Linhas;
	private String Paradas;
	private int id_rota;
	private ArrayList<Rota> Onibus;

	public String getLinhas() {
		return Linhas;
	}

	public void setLinhas(String linhas) {
		Linhas = linhas;
	}

	public String getParadas() {
		return Paradas;
	}

	public void setParadas(String paradas) {
		Paradas = paradas;
	}

	public int getId_rota() {
		return id_rota;
	}

	public void setId_rota(int id_rota) {
		this.id_rota = id_rota;
	}

	public ArrayList<Rota> getOnibus() {
		return Onibus;
	}

	public void setOnibus(ArrayList<Rota> onibus) {
		Onibus = onibus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Linhas == null) ? 0 : Linhas.hashCode());
		result = prime * result + ((Onibus == null) ? 0 : Onibus.hashCode());
		result = prime * result + ((Paradas == null) ? 0 : Paradas.hashCode());
		result = prime * result + id_rota;
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
		Rota other = (Rota) obj;
		if (Linhas == null) {
			if (other.Linhas != null)
				return false;
		} else if (!Linhas.equals(other.Linhas))
			return false;
		if (Onibus == null) {
			if (other.Onibus != null)
				return false;
		} else if (!Onibus.equals(other.Onibus))
			return false;
		if (Paradas == null) {
			if (other.Paradas != null)
				return false;
		} else if (!Paradas.equals(other.Paradas))
			return false;
		if (id_rota != other.id_rota)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rota [Linhas=" + Linhas + ", Paradas=" + Paradas + ", id_rota=" + id_rota + ", Onibus=" + Onibus + "]";
	}

	public Rota(String linhas, String paradas, int id_rota, ArrayList<Rota> onibus) {
		super();
		Linhas = linhas;
		Paradas = paradas;
		this.id_rota = id_rota;
		Onibus = onibus;
	}

}
