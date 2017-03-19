package Game;

public abstract class Need {

protected float val;
protected float changeVal; //Value will be decreased each tick by changeVal
protected float incVal; //Value will be increased by incVal for each action
protected final float treshold = 30; //When the value is below the treshold the user should be reminded
	
public Need(){
	this.val = 100;
	//changeVal & incVal &treshold have to be set in the childclasses
}
//returns the Value
public float getValue(){
	return this.val;
}
//Increases Value by changeVal, returns if the Pet is alive
public boolean tick(){
	this.val -= this.changeVal;
	return this.val > 0;
}
//Increases Value by incVal, returns true
public boolean takeAction(){
	this.val += this.incVal;
	if(this.val > 100){
		this.val = 100;
	}
	return true;
}
//Returns if the Need is satisfided
public boolean isSatisfied(){
	return this.val > this.treshold;
}
//Returns if the Pet is alive
public boolean isAlive(){
	return this.val > 0;
}


}
