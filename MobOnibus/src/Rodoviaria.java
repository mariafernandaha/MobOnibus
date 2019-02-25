
public class Rodoviaria {

	private String Localiza��o;
	private String Cronograma;
	private int id_rodoviaria;

	public String getLocaldepartida() {
		return Localiza��o;
	}

	public void setLocaldepartida(String localdepartida) {
		Localiza��o = localdepartida;
	}

	public String getCronograma() {
		return Cronograma;
	}

	public void setCronograma(String cronograma) {
		Cronograma = cronograma;
	}

	public int getId_rodoviaria() {
		return id_rodoviaria;
	}

	public void setId_rodoviaria(int id_rodoviaria) {
		this.id_rodoviaria = id_rodoviaria;
	}

	@Override
	public String toString() {
		return "Rodoviaria [Localiza��o=" + Localiza��o + ", Cronograma=" + Cronograma + ", id_rodoviaria="
				+ id_rodoviaria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cronograma == null) ? 0 : Cronograma.hashCode());
		result = prime * result + ((Localiza��o == null) ? 0 : Localiza��o.hashCode());
		result = prime * result + id_rodoviaria;
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
		Rodoviaria other = (Rodoviaria) obj;
		if (Cronograma == null) {
			if (other.Cronograma != null)
				return false;
		} else if (!Cronograma.equals(other.Cronograma))
			return false;
		if (Localiza��o == null) {
			if (other.Localiza��o != null)
				return false;
		} else if (!Localiza��o.equals(other.Localiza��o))
			return false;
		if (id_rodoviaria != other.id_rodoviaria)
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public Rodoviaria(String localiza��o, String cronograma, int id_rodoviaria) {
		super();
		Localiza��o = localiza��o;
		Cronograma = cronograma;
		this.id_rodoviaria = id_rodoviaria;
	}

}
