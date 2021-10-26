package com.refresher;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Car{
    public String Make;
    public String Manufacturer;
    public int horsepower;
    public int mileage;
    public int passenger_capacity;

    public Car(String make , String Manufacturer , int horsepower , int mileage , int capacity){
        this.Make=make;
        this.Manufacturer=Manufacturer;
        this.horsepower=horsepower;
        this.mileage=mileage;
        this.passenger_capacity=capacity;
    }

    public void display(){
        System.out.println(" make -> "+Make+", manufacturer -> "+Manufacturer+", horse power -> "+horsepower+
                ", mileage ->"+mileage+", passegen ->"+passenger_capacity);
    }

}
public class main {

    public static void storedata(Car car[]){
        try {
            FileWriter writer= new FileWriter("cars.txt");
            for(Car c:car)
            {
                writer.write(c.Make+" "+c.Manufacturer+" "+c.horsepower+" "+c.mileage+" "+c.passenger_capacity);
                writer.write('\n');
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
	// write your code here
        int capacitylist[]={2,4,6,8,10};
        String manufacturerList[]={ "ford", "hyundai", "tata", "Maruti"};
        String makeList[]={"Tata","Maruti","Suzuki","Honda","BMW","Hyundai"};
        int numcars=100;
        Car car[]=new Car[numcars];

        for(int i=0;i<numcars;i++){
            String make=makeList[(int)(Math.random()*makeList.length)];
            String manufacture=manufacturerList[(int)(Math.random()*manufacturerList.length)];
            int capacity=capacitylist[(int)(Math.random()*capacitylist.length)];
            int mileage=(int)(Math.random()*(30-1+1)+1);
            int horsepower=(int)(Math.random()*(10-1+1)+1);
            car[i]=new Car(make , manufacture , horsepower , mileage , capacity);
        }
//        for(Car c:car){
//           c.display();
//           }
        storedata(car);

        File file = new File("cars.txt");
        if(file.exists()){

            try (Scanner scn = new Scanner(file)) {
                HashMap<String, ArrayList<Integer>> map = new HashMap<>();
                while (scn.hasNextLine()) {
                    String line = scn.nextLine();
                    String arr[] = line.split(" ");

                    int mileage = Integer.parseInt(arr[3]);

                    if (map.containsKey(arr[1])) {
                        ArrayList<Integer> arrlist = new ArrayList<>();
                        arrlist.add(map.get(arr[1]).get(0) + 1);
                        arrlist.add(map.get(arr[1]).get(1) + mileage);
                        map.put(arr[1], arrlist);
                    } else {
                        ArrayList<Integer> arrlist = new ArrayList<>();
                        arrlist.add(1);
                        arrlist.add(mileage);
                        map.put(arr[1], arrlist);
                    }
                }
                for (String manufacture : map.keySet()) {
                    double avg = (double) map.get(manufacture).get(1) / map.get(manufacture).get(0);
                    System.out.println("average of " + manufacture + " " + avg);
                }
                scn.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
