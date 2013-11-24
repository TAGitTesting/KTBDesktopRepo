Class Car {

private String color;
private String model;
private int releaseYear;



//constructor
Car(String color,String model,int releaseYear){
this.color =color;
this.model=model;
this.releaseYear=releaseYear;


}

//car needs to be able to drive
public void drive() {

System.out.println("drive man!")

}


//car needs to stop
public void drive (){
System.out.println("stopping!");
}


//car needs to be able to crash
public void crash (){
System.out.println("crashing!");
}



public int getReleaseYear(){
return releaseYear;
}

public setReleaseYear(int releaseYear) {
this.releaseYear=releaseYear;
}


public String getModel(){
return model;
}

public setModel(String model) {
this.model=model;
}




}