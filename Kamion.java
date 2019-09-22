package domaci;

import java.util.ArrayList;

public class Kamion {
	
	private String regBr;
	private double nosivost;
	private double teret;
	private ArrayList<Tovar> tovar;
	
	public Kamion(String regBr, double nosivost) {
		this.regBr = regBr;
		this.nosivost = nosivost;
		tovar = new ArrayList<Tovar>();
	}
	
	public boolean stavi (Tovar t) {
		if ( teret + t.tezina() > nosivost) {
			System.out.println("Kamion nema toliku nosivost.");
			return false;
		} else {
			teret += t.tezina();
			tovar.add(t);
			return true;
			}
	}
	
	public void skini () {
		teret -= tovar.get(tovar.size()-1).tezina();
		tovar.remove(tovar.size()-1);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(regBr);
		sb.append(" (");
		sb.append(teret);
		sb.append("/");
		sb.append(nosivost);
		sb.append(")\n");
		for ( int i = 0; i < tovar.size(); i++) {
			sb.append(tovar.get(i).toString());
		}
		return sb.toString();
	}
	
	

}
