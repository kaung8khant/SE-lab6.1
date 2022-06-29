package edu.mum.cs.cs425.demos.pratices;

public class Practice {
    public static void main(String[] args){
        int[] inputs = {5,7,35};
        printHelloWorld(inputs);

        int[] arr = {1,2,3,4,5};
        findSecondBiggest(arr);
    }
    public static void printHelloWorld(int[] inputs){
        for (int i=0;i<inputs.length;i++){
            if(inputs[i]%5==0){
                System.out.print("Hello");
            }
            if((inputs[i]%7)==0){
                System.out.print("World");
            }
            System.out.print("\n");
        }
    }
    public static void findSecondBiggest(int[] inputs){
        int secondBiggest = 0;
        int biggest = 0;
        for(int i =0;i<inputs.length;i++){
            if(i==0){
                secondBiggest = inputs[i];
                biggest = inputs[i];
            }
            if(biggest<inputs[i]){
                secondBiggest = biggest;
                biggest = inputs[i];
            }
        }
        System.out.println(secondBiggest);
    }
}
