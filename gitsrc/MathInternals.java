import processing.core.*;
public class MathInternals extends PApplet{

        
        public int die1;
        public int die2;
        public int die3;
        public int die4;
        
        public MathInternals() {
          
            roll();
        }
        
        public void roll() {
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
        }
        public int die1(){
    		return die1;
    	}
    		
    	public int die2(){
    		return die2;
    	}
       
        
    }

