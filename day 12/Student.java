class Student extends Person{
	private int[] testScores;
            
    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        testScores = scores;
    }
    
    public char calculate(){
        int total =0;
        for(int i=0; i<testScores.length; i++){
            total += testScores[i];
        }
        int average = total/testScores.length;
        
        if(average<40){
            return 'T';
        }else if(average<55){
            return 'D';
        }else if(average<70){
            return 'P';
        }else if(average<80){
            return 'A';
        }else if(average<90){
            return 'E';
        }else return 'O';        
    }
   
}