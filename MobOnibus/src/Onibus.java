import java.util.ArrayList;

public class Onibus {

	private String Destino;
	private String Viacao;
	private String Horario;
	private float QntPassageiros;
	private int id_onibus;
	private ArrayList<Onibus> Precos;

	public ArrayList<Onibus> getPrecos() {
		return Precos;
	}

	public void setPrecos(ArrayList<Onibus> precos) {
		this.Precos = precos;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public String getViacao() {
		return Viacao;
	}

	public void setViacao(String viacao) {
		Viacao = viacao;
	}

	public String getHorario() {
		return Horario;
	}

	public void setHorario(String horario) {
		Horario = horario;
	}

	public float getQntPassageiros() {
		return QntPassageiros;
	}

	public void setQntPassageiros(float qntPassageiros) {
		QntPassageiros = qntPassageiros;
	}

	public int getId_onibus() {
		return id_onibus;
	}

	public void setId_onibus(int id_onibus) {
		this.id_onibus = id_onibus;
	}

	@Override
	public String toString() {
		return "Onibus [Destino=" + Destino + ", Viacao=" + Viacao + ", Horario=" + Horario + ", QntPassageiros="
				+ QntPassageiros + ", id_onibus=" + id_onibus + ", precos=" + Precos + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Onibus other = (Onibus) obj;
		if (Destino == null) {
			if (other.Destino != null)
				return false;
		} else if (!Destino.equals(other.Destino))
			return false;
		if (Horario == null) {
			if (other.Horario != null)
				return false;
		} else if (!Horario.equals(other.Horario))
			return false;
		if (Float.floatToIntBits(QntPassageiros) != Float.floatToIntBits(other.QntPassageiros))
			return false;
		if (Viacao == null) {
			if (other.Viacao != null)
				return false;
		} else if (!Viacao.equals(other.Viacao))
			return false;
		if (id_onibus != other.id_onibus)
			return false;
		if (Precos == null) {
			if (other.Precos != null)
				return false;
		} else if (!Precos.equals(other.Precos))
			return false;
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Destino == null) ? 0 : Destino.hashCode());
		result = prime * result + ((Horario == null) ? 0 : Horario.hashCode());
		result = prime * result + Float.floatToIntBits(QntPassageiros);
		result = prime * result + ((Viacao == null) ? 0 : Viacao.hashCode());
		result = prime * result + id_onibus;
		result = prime * result + ((Precos == null) ? 0 : Precos.hashCode());
		return result;
	}

	public Onibus(String destino, String viacao, String horario, float qntPassageiros, int id_onibus,
			ArrayList<Onibus> precos) {
		super();
		Destino = destino;
		Viacao = viacao;
		Horario = horario;
		QntPassageiros = qntPassageiros;
		this.id_onibus = id_onibus;
		this.Precos = precos;
	}
}