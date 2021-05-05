package com.Generics;

public class FindMaximum {
	
	public static int getMax_IntegerValue(int[] numbers){
         int maxValue = numbers[0];
         for(int i=1;i < numbers.length;i++){
		   if(numbers[i] > maxValue){
              maxValue = numbers[i];
		   }
		 }
		 return maxValue;
	}
	
	public static float getMax_FloatValue(float[] numbers){
		 float maxValue = numbers[0];
		 for(int i=1; i < numbers.length; i++){
		  if(numbers[i] > maxValue){
		    maxValue = numbers[i];
		  }
		 }
		 return maxValue;
	}
	
	public static String getMax_StringValue(String[] string){
		 int index = 0; 
		 int elementLength = string[0].length();
		 for(int i=1; i< string.length; i++) {
		     if(string[i].length() > elementLength) {
		        index = i; elementLength =string[i].length();
		    }
		}
		return string[index];
	}

}
