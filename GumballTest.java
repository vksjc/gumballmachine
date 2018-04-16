public class GumballTest {

	
	public static void main(String[] arqs){
			GumballMachine gumballMachine = new GumballMachine(5);
			System.out.println (gumballMachine);
			
			gumballMachine.insertQuarter();
			gumballMachine.ejectQuarter();
			gumballMachine.turnCrank ();
		
	}
	}
	
