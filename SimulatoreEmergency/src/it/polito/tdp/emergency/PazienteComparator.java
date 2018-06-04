package it.polito.tdp.emergency;

import java.util.Comparator;

public class PazienteComparator implements Comparator<Paziente> {

	@Override
	public int compare(Paziente paz1, Paziente paz2) {

		if (paz1.getStato() == paz2.getStato()) { // stesso colore
			return paz1.getOraArrivo().compareTo(paz2.getOraArrivo()); // ordino in base all'ordine di arrivo
		}
		if (paz1.getStato() == StatoPaziente.RED) {
			return -1;
		}
		if (paz2.getStato() == StatoPaziente.RED) {
			return +1;
		}
		if (paz1.getStato() == StatoPaziente.YELLOW) {
			return -1;
		}
		if (paz2.getStato() == StatoPaziente.YELLOW) {
			return +1;
		}

		throw new IllegalArgumentException("Stato paziente non accettabile: " + paz1.getStato() + "-" + paz2.getStato());

	}

}
