package it.polito.tdp.emergency;

public enum EventType {
	
	ARRIVA, // arriva nuovo paziente all'ingresso (NEW)
	TRIAGE, // al paziente viene assegnato un codice (COLORE)
	CHIAMATA, // il paziente entra dal medico (TREATING)
	USCITA, // paziente esce dallo studio medico (OUT)
	
	TIMEOUT_WHITE,
	TIMEOUT_YELLOW,
	TIMEOUT_RED,
	
	POLLING, // periodicamente verifica se ci sono studi liberi e pazienti in attesa
	
	
}
