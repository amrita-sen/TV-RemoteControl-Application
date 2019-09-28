import java.util.Scanner;

/**
 * The TVApplication class implements a method that demonstrates the functionality of Television 
 * and the Remote Control through a simple menu via an interactive console.
 * The user may repeatedly press any button on the remote, from the options provided, until
 * he/she decides to stop watching TV.
 * 
 * @author amrita
 */
public class TVApplication 
{
	//Main method to instantiate Remote Control object.
	
	/**
	 * This method creates a new instance of the Television and RemoteControl object and
	 * implements the working of the Remote Control.
	 * 
	 * @param myTv. 
	 */
	public static void main(String[] args) 
	{
		Television myTv = new Television();
		RemoteControl myRemote = new RemoteControl(myTv);		
	
		//Demonstrates the Remote Control and Television functionality.
		
		/**
		 * This displays a string representation of the default status of the Television object. 
		 * 
		 */
		System.out.println(myTv);
		
		/**
		 * This declares a new variable of name optionButton of type integer.
		 * This will be used as a switch expression when demonstrating the functionality of remote
		 * control buttons.
		 * 
		 */
		int optionButton;	
		
		/**
		 * New instance of scanner object created.
		 * This will be used to take in user input via keyboard.
		 * 
		 */
		Scanner keyboard = new Scanner(System.in);
		
		/**
		 * This demonstrates the working of a television remote control through an interactive console.
		 * The user may repeatedly press any number on the keyboard, corresponding to the options provided, 
		 * until he/she decides to stop watching the television.
		 * If the user inputs a number other than the options available, the user will be prompted to press
		 * a button again and the options will be redisplayed.
		 * 
		 */		
		do {
			/** 
			 * This displays text to prompt a user to press a button on the Remote Control. 
			 *  
			 */
			System.out.println("Press a Button on the Remote Control");
			/** 
			 * This displays the options available on the remote control that the user can choose from.
			 *  
			 */
			System.out.println("1. Power 2. Volume Up by 50% 3. Volume Down by 50%  4. Channel Up 5. Channel Down 6. Go outside");
			
			/** 
			 * This tells the computer to read the user input of type integer.
			 *  
			 */
			optionButton = keyboard.nextInt();
						
			/** 
			 * This demonstrates the functionality of the buttons on the remote control numbered 1 to 6
			 * using the switch-case-break statements. 
			 * Variable optionButton, of type integer, is used as the switch expression.
			 * Each case corresponds to a button option on the remote.
			 * Based on the user input, the button option pressed will be displayed, the corresponding 
			 * Remote Control function is invoked and a string representation of the resulting status of 
			 * the Television object will be displayed.
			 * Option 6 will display button option pressed and will end the program.
			 *  
			 */
			switch(optionButton) 
			{
				case 1:
					System.out.println("Power Button Pressed\n");					
					myRemote.powerButton();
					System.out.println(myTv);
					break;
				case 2:
					System.out.println("Volume Up by 50% Button Pressed\n");
					myRemote.volumeUpByHalf();
					System.out.println(myTv);
					break;
				case 3:
					System.out.println("Volume Down by 50% Button Pressed\n");
					myRemote.volumeDownByHalf();
					System.out.println(myTv);
					break;
				case 4:
					System.out.println("Channel Up Button Pressed\n");
					myRemote.channelUpButton();
					System.out.println(myTv);
					break;
				case 5:
					System.out.println("Channel Down Button Pressed\n");
					myRemote.channelDownButton();
					System.out.println(myTv);
					break;
				case 6:
					System.out.println("Go outside Button Pressed");
					return;	
				}			
			} while (optionButton >= 1 || optionButton <= 6);
		}
}


		



