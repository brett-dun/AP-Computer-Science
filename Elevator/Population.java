import java.util.ArrayList;
import java.util.Scanner;

public class Population {
	
	protected ArrayList<Species> females;
	protected ArrayList<Species> males;
	
	public Population() {
		this.females = new ArrayList<Species>(); //An ArrayList of Species that will hold females
		this.males = new ArrayList<Species>(); //An ArrayList of Species that will hold males
		this.females.add(new Species());
		this.males.add(new Species());
	}
	
	/**
	 * 
	 * @param female
	 * @param male
	 */
	public Population(Species female, Species male) {
		this.females = new ArrayList<Species>(); //An ArrayList of Species that will hold females
		this.males = new ArrayList<Species>(); //An ArrayList of Species that will hold males
		this.females.add(female); //Adds the first female to the ArrayList
		this.males.add(male); //Adds the first male to the ArrayList
	
	}

	
	/**
	 * 
	 * @param min :: minimum age to reproduce (exclusive)
	 * @param max :: minimum age to reproduce (exclusive)
	 */
	public void reproduce(int min, int max) {
		for(int i = 0; i < females.size(); i++) {
			if(females.get(i).getAge() > min && females.get(i).getAge() < max) { //females will reproduce between ages 5 and 15 (both exclusive)
				int num = (int) (Math.random() * 4); //Generates the number of offspring
				for(int k = 0; k <= num; k++) {
					Species temp = new Species(females.get(i),males.get((int)(Math.random()*males.size()))); //Creates a new object of Species
					if(temp.isFemale()) {
						females.add(temp); //Adds this temp object to females if it is a female
					} else {
						males.add(temp); //otherwise it adds it to male
					}
				}
			}
		}
	}
	
	/**
	 * ages the population by one year
	 */
	public void age() {
		for(int i = 0; i < females.size(); i++) {
			females.get(i).age();
		}
		for(int i = 0; i < males.size(); i++) {
			males.get(i).age();
		}
	}
	
	/**
	 * 
	 * @param age
	 */
	public void die(int age) {
		for(int i = 0; i < females.size(); i++) {
			if(females.get(i).getAge() >= age) { //20 || (temp.getPhenotype().getHeight() == 2 && temp.getAge() >= 5)
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			if(males.get(i).getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	
	/**
	 * 
	 * @param hairColor
	 * @param num
	 * @param age
	 */
	public void naturalSelection(HairColor hairColor, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getHairColor() == num && temp.getAge() >= age) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getHairColor() == num && temp.getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	/**
	 * 
	 * @param bloodType
	 * @param num
	 * @param age
	 */
	public void naturalSelection(BloodType bloodType, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getBloodType() == num && temp.getAge() >= age) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getBloodType() == num && temp.getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	/**
	 * 
	 * @param height
	 * @param num
	 * @param age
	 */
	public void naturalSelection(Height height, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getHeight() == num && temp.getAge() >= age) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getHeight() == num && temp.getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	/**
	 * 
	 * @param hearing
	 * @param var
	 * @param age
	 */
	public void naturalSelection(Hearing hearing, boolean var, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if((temp.getPhenotype().isHearing() == var) && temp.getAge() >= age) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if((temp.getPhenotype().isHearing() == var) && temp.getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	/**
	 * 
	 * @param colorVision
	 * @param var
	 * @param age
	 */
	public void naturalSelection(ColorVision colorVision, boolean var, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if((temp.getPhenotype().isColorVision() == var) && temp.getAge() >= age) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if((temp.getPhenotype().isColorVision() == var) && temp.getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	/**
	 * 
	 * @param qualityOfVision
	 * @param num
	 * @param age
	 */
	public void naturalSelection(QualityOfVision qualityOfVision, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getQualityOfVision() == num && temp.getAge() >= age) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getQualityOfVision() == num && temp.getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	/**
	 * 
	 * @param eyeColor
	 * @param num
	 * @param age
	 */
	public void naturalSelection(EyeColor eyeColor, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getEyeColor() == num && temp.getAge() >= age) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getEyeColor() == num && temp.getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	/**
	 * 
	 * @param skinColor
	 * @param num
	 * @param age
	 */
	public void naturalSelection(SkinColor skinColor, int num, int age) {
		for(int i = 0; i < females.size(); i++) {
			Species temp = females.get(i);
			if(temp.getPhenotype().getSkinColor() == num && temp.getAge() >= age) {
				females.remove(i);
				i--;
			}
		}
		for(int i = 0; i < males.size(); i++) {
			Species temp = males.get(i);
			if(temp.getPhenotype().getSkinColor() == num && temp.getAge() >= age) {
				males.remove(i);
				i--;
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Population [females=" + females + ", males=" + males + "]";
	}
	
	
	//For testing only
	public static void main(String args[]) {
		//Creates genotypes
		UI ui = new UI();
		ui.setYear();
		
		Population animals = new Population();
		
		for(int i = 0; i < ui.getYear(); i++) {
			//System.out.println(people.toString());
			System.out.println("year " + i + ": " + (animals.females.size()+animals.males.size()));
			//Cycles through the ArrayList females
			/*for(Species j: animals.females) {
				//System.out.println("[" + j.getPhenotype().isFemale() + "," + j.getPhenotype().getBloodType() + "]");
				//System.out.println(j.getPhenotype().toString());
			}
			//Cycles through the ArrayList males
			for(Species j: animals.males){
				//System.out.println("[" + j.getPhenotype().isFemale() + "," + j.getPhenotype().getBloodType() + "]");
				//System.out.println(j.getPhenotype().toString());
			}*/
			int sum = 0;
			for(Species j: animals.females) {
				if(j.getPhenotype().getBloodType()==3) {
					sum++;
				}
			}
			for(Species j: animals.males) {
				if(j.getPhenotype().getBloodType()==3) {
					sum++;
				}
			}
			System.out.println(((double) sum / (animals.females.size()+animals.males.size())));
			
			//sum = 0;
			System.out.println();
			animals.age();
			animals.reproduce(25,27);
			animals.die(80);// life length is controlled by this
		animals.naturalSelection(new BloodType(null), 3, 40);
		}
		
	}
	
}

