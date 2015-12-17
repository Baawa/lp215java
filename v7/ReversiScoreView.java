package orig2011.v7;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ReversiScoreView implements PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getSource().getClass() == ReversiModel.class &&
				evt.getPropertyName().equals("nextTurn")){
				ReversiModel rm = (ReversiModel)evt.getSource();
				System.out.println("Turn: " + evt.getNewValue() + "\n ---SCORE--- \nBlack: \t" +
				rm.getBlackScore() + "\nWhite: \t" + rm.getWhiteScore());
			}
		
	}

}
