package SimpleGame;
public class SimpleStartup {

	int[] locationCells = new int[7];
	int numOfHits=0;
	public  String checkYourSelf(int guess) {
		
		String result ="miss";
		for(int cell: locationCells) {
			if(guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits==locationCells.length) {
			result="kill";
		}
		System.out.println(result);
		return result;
	}
	
	public void setLocationCells(int[] loc) {
		locationCells = loc;
	}
}
