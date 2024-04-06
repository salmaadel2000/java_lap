class task3{
	public static void main(String args[]){
		String sentence = "ITI develops people and ITI house of developers and ITI for people";
		String word = "ITI";
		int count=0;
		String[] split_arr = sentence.split(" ");
		for(int i=0;i<split_arr.length;i++){
			System.out.println(split_arr[i]);
			if(split_arr[i].equals("ITI")){
				count++;
			}
		}
		if(count==0){
				System.out.println(" no matching word");	
		}
		else{
			System.out.println("count is: "+count);		
		}
	}
}