public class Schrift{
	
	
	
	public static void main(String args[]){
		
		Vulpen vulpen = new Vulpen(10, "rood", 5);
		
		vulpen.write();
		vulpen.write();
		vulpen.write();
		vulpen.write();
		vulpen.write();
		vulpen.write();
		vulpen.write();
		vulpen.write();
		vulpen.write();
		vulpen.write();
		vulpen.write();
		vulpen.insertNewCapsule(1);
		vulpen.write();
		vulpen.write();
	}
	
}

class Vulpen{
	
	int currentCapsule = 0;
	Capsule[] capsules;
	
	public Vulpen (int sterkte, String kleur, int aantalCapsules){
		Capsule capsule = new Capsule(sterkte, kleur);
		capsules = new Capsule[aantalCapsules];
		refillCapsules(sterkte, kleur);
		System.out.println("You are currently using capsule " + currentCapsule);
		
	}
	
	public void write(){
		
		int inktNiveau = capsules[currentCapsule].inktNiveau;
		if(inktNiveau == 0){
			System.out.println("This capsule doesn't have anymore inkt");
		}else{
			System.out.println("You wrote. Your ink level is now at " + --capsules[currentCapsule].inktNiveau);
		}
	}
	
	private void refillCapsules(int sterkte, String kleur){
		for(int i = 0; i < capsules.length; i++){
			capsules[i] = new Capsule(sterkte, kleur);
		}
	}
	
	public void insertNewCapsule(int capsuleNumber){
		if(capsuleNumber < capsules.length){
			currentCapsule = capsuleNumber;
			System.out.println("You are currently using capsule " + currentCapsule);
		}else{
			System.out.println("You don't have this many capsules");
		}
	}
	
	
	
	class Capsule{
		
		int sterkte;
		String kleur;
		int inktNiveau = 10;
		
		public Capsule(int sterkte, String kleur){
			this.sterkte = sterkte;
			this.kleur = kleur;
		} 
		
		
	}

}

