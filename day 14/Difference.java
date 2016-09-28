class Difference {
  	private int[] elements;
  	public int maximumDifference;
	
	// Add your code here    
    Difference(int[] array){
        elements = array;
    }


    public void computeDifference(){
        
        int max=elements[0];
        int min=elements[0];

        for(int i : elements){
            if(i < min) min = i;
            else if(i>max) max =i;
        }
        
        maximumDifference = max - min;
        
    }
}