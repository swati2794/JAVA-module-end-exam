class Car {
private int year;
private String make;
private double speed;

Car(int year, String make, double speed)
{
this.year=year;
this.make=make;
this.speed=speed;
}

int getYear(){
return this.year;
}
void setYear(int year)
{
this.year=year;
}


String getMake(){
return this.make;
}
void setMake(String make)
{
this.make=make;
}


double getSpeed(){
return this.speed;
}
void setYear(double speed)
{
this.speed=speed;
}


void accelerate(){
	this.speed=this.speed+1;
}

}



