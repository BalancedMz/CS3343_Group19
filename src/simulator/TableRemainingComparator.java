package simulator;

import java.util.Comparator;

class TableRemainingComparator implements Comparator<Table> {

  @Override
  public int compare(Table o1, Table o2) {
    Integer target = o1.getRemaining();
    return  target.compareTo(o2.getRemaining());
  }
}
