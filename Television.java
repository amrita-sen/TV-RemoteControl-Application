/**
 * This is a description of the Television class.
 * This objects in this class are all used when operating a basic Television and include:
 * power that can be on or off, channel that is set between 1 and 10 and volume that is set
 * between 0 and 100.
 * Get and set methods for the variables, Volume Up and Volume Down methods and a toString method to output  
 * a string representation of the television object to the console, are defined in this class.
 * 
 * @author amrita
 */
public class Television 
{
	private boolean power; 			// Variable to store a boolean value of true or false for television power.
	private int channel;   			// Variable to store a whole number value for television channel
	private final int maxChannel; 	// Variable to store a whole number value for television maxChannel and is final.
	private int volume;				// Variable to store a whole number value for television volume.
	
	//Default constructor for Television class.
	
	/**
	 * This initializes variables of television object by assigning default values to them.
	 * 
	 */
	public Television()
	{
		this.maxChannel = 10;
		this.volume = 0;
		this.channel = 1;
	}
	
	//Constructor for Television (int max).
	
	/**
	 * This initializes variable maxChannel of television object by assigning them conditional values.
	 *  
	 * @param integer value for max
	 */
	public Television(int max)
	{
		if (max < 2) 
		{
			maxChannel = 10;
		} else 
		{
			maxChannel = max;
		}
		
		this.volume = 0;
		this.channel = 1;		
	}
	
	// Get/set methods for volume.
	
	/**
	 * This provides access to the boolean value, variable power holds.
	 * 
	 * @return boolean value for power.
	 */
	public boolean getPower()
	{
		return power;
	}
	
	/**
	 * This assigns boolean values to the variable channel.
	 * 
	 * @param boolean power
	 */
	public void setPower(boolean power)
	{
		this.power = power;
	}		

	// Get and set methods for channel.
	
	/**
	 * This provides access to the integer value, variable channel holds
	 *
	 * @return integer value of channel.
	 */
	public int getChannel()
	{
		return channel;
	}
		
	/**
	 * This assigns integer values to the variable channel.
	 * Channel value is set to stay between 1 and maxChannel at all times.
	 * 
	 * @param integer value of channel
	 */
	public void setChannel(int channel) 
	{
		if (channel >= 1 && channel <= maxChannel) 
		{
			this.channel = channel;
		}
		else  
		{
			return;
		}
	}
	
	// Get and private set method for volume.
	
	/**
	 * The provides access to the integer value, variable volume holds
	 * 
	 * @return integer value of volume.
	 */
	public int getVolume()
	{
		return volume;
	}
	
	/**
	 * This assigns integer values to the variable volume.
	 * The volume is set to stay between 0 and 100 at all times.
	 * This is a private method and can only be accessed from within this class.
	 * 
	 * @param integer value of volume.
	 */
	private void setVolume(int volume) 
	{
		if (getVolume() >= 0 && getVolume() <= 100) 
		{
			this.volume = getVolume();
		}
		else if (getVolume() > 100) 
		{
			this.volume = 100;
		}
		else if (getVolume() <= 0) 
		{
			this.volume = 0;
		}
	}
	
	//Methods for volumeDown() and volumeUp().
	
	/**
	 * This will decrease the volume by 1.
	 * 
	 */
	public void volumeDown()
	{
		setVolume(this.volume--);		
	}
	
	/**
	 * This will increase the volume by 1.
	 * 
	 */
	public void volumeUp()
	{
		setVolume(this.volume++);
	}
	
	//Get method for maxChannel.
	
	/**
	 * The method provides access to the integer value, variable maxChannel holds
	 * 
	 * @return integer value of maxChannel.
	 */
	public int getMaxChannel()
	{
		return maxChannel;
	}
	
	// String representation of the object using toString() method.	
	
	/**
	 * Returns a string representation of a TV object.
	 */
	public String toString()
	{
		//String variable declared to display string YES or NO for boolean power with if/else statement.
		
		/**
		 * String variable declared so that string values can be displayed instead of boolean values
		 * for power.
		 * Will display YES when power value is true and NO when false.
		 * 	
		 */
		String powerOn;	
		
			if (power)
			{
				powerOn = "YES";
			}
			else 
			{	
				powerOn = "NO";
			}
		
		//New string variable for volume status declared.

 		/**
		 * String variable declared.
		 * When television volume is zero, the word "(muted)" will be added to the toString
		 * return statement.
		 * 	
		 */
		String volumeStatus;
						
			if (getVolume()==0)
			{
				volumeStatus = " (muted)";
			} else 
			{
				volumeStatus = "";
			}	
					
		//toString return statement.
			
		/**
		 * The string representation of the Television object to display the status of the variables of the 
		 * Television object on the console via the TVApplication class.
		 * 	
		 */
		return "[Television is: on? " + powerOn + ". CHANNEL: " + this.channel+ "/" + this.maxChannel +". VOLUME: " + this.volume + "%" + volumeStatus + "]\n";
	}
}



