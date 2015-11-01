package simulator;

import org.joda.time.DateTime;


public class Manager {

  private EventScheduler es;

  public Manager() {
    //es = EventScheduler.getInstance();
  }

  /**
   * add event to event scheduler.
   * @param dt the time of the event occur.
   * @param cg the related customer group.
   */

  public void add( DateTime dt , CustomerGroup cg) {
    es = EventScheduler.getInstance();
    DateTime dtNew = dt.plusMinutes(5);
    //new CustomerWaitFoodEvent(dtNew , cg).addEvent(es);
    new CustomerWaitFoodEvent(dtNew , cg).addToScheduler();
  }

}
