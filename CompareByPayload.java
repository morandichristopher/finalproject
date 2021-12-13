package labproject.fin;

import java.util.Comparator;

public class CompareByPayload implements Comparator<Truck>{

	@Override
	public int compare(Truck o1, Truck o2) {
		if(o1.getPayloadCapacity() > o2.getPayloadCapacity()) {
			return 1;
		}
		else {
			return -1;
		}
		
	}

}
