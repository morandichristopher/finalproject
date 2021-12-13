package labproject.fin;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class VehicleTester {

	public static void main(String[] args) throws FileNotFoundException {
		Car c1=new Car(120, 5, "4WD", 4);
		Car c2=new Car(90, 4, "FWD", 2);
		Car c3=new Car(180, 4, "RWD", 2);
		
		Truck t1=new Truck(100, 5, 1000, 5000);
		Truck t2=new Truck(95, 5, 1500, 4000);
		Truck t3=new Truck(120, 5, 2000, 6000);
		
		Motorcycle m1=new Motorcycle(220, 1, false);
		Motorcycle m2=new Motorcycle(130, 2, true);
		
		ArrayList<Vehicle> v = new ArrayList<Vehicle>();
		v.add(c1);
		v.add(c2);
		v.add(c3);
		v.add(t1);
		v.add(t2);
		v.add(t3);
		v.add(m1);
		v.add(m2);
		
		
		ArrayList<Truck> t = new ArrayList<Truck>();
		t.add(t1);
		t.add(t2);
		t.add(t3);
		
		PrintWriter output = new PrintWriter("output.txt");
		
		for(int i = 0; i < v.size(); i++) {
			output.println(v.get(i));
		}
		
		output.println("================================================================================================");
		
		Collections.sort(v);
		for(int i = 0; i < v.size(); i++) {
			output.println(v.get(i));
		}
		output.println("================================================================================================");

		for(int i = 0; i < t.size(); i++) {
			output.println(t.get(i));
		}
		
		Collections.sort(t, new CompareByPayload());
		output.println("================================================================================================");

		for(int i = 0; i < t.size(); i++) {
			output.println(t.get(i));
		}
		
		Collections.sort(t, new CompareByTow());
		output.println("================================================================================================");

		for(int i = 0; i < t.size(); i++) {
			output.println(t.get(i));
		}

		
		
		output.close();
		
		
	}
}
