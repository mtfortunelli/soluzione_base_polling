public class produttore extends Thread {
	private coda coda;

	public produttore(coda coda) {
		this.coda = coda;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			
			synchronized (this.coda) {
				if (!this.coda.isPiena()) {
					i++;
					this.coda.accoda(i);
					System.out.println("Produttore: aggiunto elemento " + i);
				} else {
					System.out.println("Produttore: coda piena");
				}
			}
		}
	}
}