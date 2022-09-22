
public class Resultado {
	private String torneo;
	private int año;
	private String lugar;
	private Tenista ganador_a;
	private int ranking_ganador_a;
	private Tenista sub_ganador_a;
	private int sub_ranking_ganador_a;
	private String resultado_final;
	
	public Resultado(String torneo, int año, String lugar, Tenista ganador_a, int ranking_ganador_a,
			Tenista sub_ganador_a, int sub_ranking_ganador_a, String resultado_final) {
		super();
		this.torneo = torneo;
		this.año = año;
		this.lugar = lugar;
		this.ganador_a = ganador_a;
		this.ranking_ganador_a = ranking_ganador_a;
		this.sub_ganador_a = sub_ganador_a;
		this.sub_ranking_ganador_a = sub_ranking_ganador_a;
		this.resultado_final = resultado_final;
	}
	
	
	public Tenista getSub_ganador_a() {
		return sub_ganador_a;
	}


	public void setSub_ganador_a(Tenista sub_ganador_a) {
		this.sub_ganador_a = sub_ganador_a;
	}


	public int getSub_ranking_ganador_a() {
		return sub_ranking_ganador_a;
	}


	public void setSub_ranking_ganador_a(int sub_ranking_ganador_a) {
		this.sub_ranking_ganador_a = sub_ranking_ganador_a;
	}


	public void setGanador_a(Tenista ganador_a) {
		this.ganador_a = ganador_a;
	}


	public String getTorneo() {
		return torneo;
	}
	public void setTorneo(String torneo) {
		this.torneo = torneo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public int getRanking_ganador_a() {
		return ranking_ganador_a;
	}
	public void setRanking_ganador_a(int ranking_ganador_a) {
		this.ranking_ganador_a = ranking_ganador_a;
	}
	public String getResultado_final() {
		return resultado_final;
	}
	public void setResultado_final(String resultado_final) {
		this.resultado_final = resultado_final;
	}


	@Override
	public String toString() {
		return "Resultado [torneo=" + torneo + ", año=" + año + ", lugar=" + lugar + ", ganador_a=" + ganador_a
				+ ", ranking_ganador_a=" + ranking_ganador_a + ", sub_ganador_a=" + sub_ganador_a
				+ ", sub_ranking_ganador_a=" + sub_ranking_ganador_a + ", resultado_final=" + resultado_final + "]";
	}
		
}
