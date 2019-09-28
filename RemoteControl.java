/**
 * This is a description of the RemoteControl class.
 * This maintains a Television instance variable with get and set methods.
 * Methods for the power button, channel up and down button, and the volume up and down button are
 * defined in this class.
 * 
 * @author amrita
 */
public class RemoteControl 
{
	Television tv = new Television();		
			
	//Constructor for remoteControl class	
	
	/**
	 * This initializes the tv object. 
	 * 
	 * @param myTv
	 */	
	public 	RemoteControl (Television myTv)
	{
		this.tv = myTv;			
	}
	
	//Method to switch TV power on and off.
	
	/**
	 * This method will switch the power of the Television on or off.
	 * If off, power will be turned on. If on, it'll be turned off.
	 *  		
	 */
	public void powerButton() 
	{
		if (tv.getPower() == false) 
		{
			tv.setPower(true);
		} 
		else 
		{
			tv.setPower(false);
		}
	}
	
	//Method to decrease channel by 1 when power is on.
	
	/**
	 * If the television power is on, this method will decrease the channel by 1.
	 * If at 1, the channel is changed to maxChannel, 10.
	 * 
	 */
	public void channelDownButton() 
	{
		if (tv.getPower() == true && tv.getChannel() == 1) 
		{
			tv.setChannel(tv.getMaxChannel());
		} 
		else if (tv.getPower() == true && tv.getChannel()!= 1)
		{
			tv.setChannel(tv.getChannel()-1); 
		} 
	}	
	
	//Method to increase channel by 1 when power is on.
	
	/**
	 * If the television power is on, this method will increase the channel by 1.
	 * If at maxChannel, 10, the channel is changed to 1.
	 * 
	 */	
	public void channelUpButton() 
	{
		if (tv.getPower() == true && tv.getChannel() == tv.getMaxChannel()) 
		{
			tv.setChannel(1);
		} 
		else if (tv.getPower() == true && tv.getChannel() != tv.getMaxChannel()) 
		{	
			 tv.setChannel(tv.getChannel()+1); 	
		} 
	} 
	  
	//Method to increase volume by 50% when power is on.
	
	/**
	 * If the television power is on, this method will increase the volume by 50 using a for loop till
	 * it reaches 100 as volume is set to stay between 0 and 100.
	 * 
	 */
	
	public void volumeUpByHalf() 
	{
		if (tv.getPower() == true)
		{	
			for (int i = 0; i<50; i++)
			{	
				tv.volumeUp();			
			}	
		}	
	}
	
	//Method to decrease volume by 50% when power is on.
	
	/**
	 * If the television power is on, this method will decrease the volume by 50 using a for loop till
	 * it reaches 0 as volume is set to stay between 0 and 100.
	 * 
	 */	
	public void volumeDownByHalf() 
	{
		if (tv.getPower() == true)
		{	
			for (int i = 0; i<50; i++)
			{	
				tv.volumeDown();
			}
		}	
	}	
}

 	

