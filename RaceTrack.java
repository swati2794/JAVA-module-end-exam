class RaceTrack{
	
	public static void main (String [] args)
	{
		
		Car c = new Car(2010,"Porsche",25.0);
		System.out.println("Before calling accelerate given are parameters of car");
		System.out.println("Carmake:   "+c.getMake()+" , "+"car model year: "+c.getYear()+ "car Speed: "+c.getSpeed());
		
		System.out.println("   ");
		c.accelerate();
		System.out.println("After calling accelerate given are parameters of car");
		System.out.println("Carmake:  "+c.getMake()+" "+"car model year: "+c.getYear()+ "car Speed: "+c.getSpeed());
		
	}
}