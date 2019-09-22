package domaci;

import java.util.ArrayList;

public class Paket extends Tovar {
	
	private ArrayList<Tovar> tovar;
	
	public Paket() {
		tovar = new ArrayList<Tovar>();
	}

	public void dodaj (Tovar t) {
		tovar.add(t);
	}

	@Override
	public String vrsta() {
		StringBuilder sb = new StringBuilder();
		sb.append("paket [");
		for ( int i = 0; i < tovar.size(); i++) {
			sb.append(tovar.get(i).vrsta());
			if (i < tovar.size()-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public double tezina() {
		double tezina = 0;
		for ( int i = 0; i < tovar.size(); i++) {
			tezina += tovar.get(i).tezina();
		}
		return tezina;
	}

}
