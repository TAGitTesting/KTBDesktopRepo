Class Car {

private String color;
private String model;
private String etype; //engine type - ex: standard/hybrid
private int releaseYear;



//constructor
Car(String color,String model,int releaseYear){
this.color =color;
this.model=model;
this.releaseYear=releaseYear;
System.out.println("consutructor done. just added so I can sync to master and compare to car changes made in dev bracnh");

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
System.out.println("added this to check out merging when file changed by 2 diff users");
}

public setEType(string type){
	this.etype = type;
	System.out.println("engine type added");
}

public getEType() {
	return etype;
}
