package bolts.AggregateException;
import java.lang.Exception;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.PrintStream;
import java.lang.CharSequence;
import java.lang.Integer;
import java.io.PrintWriter;

public class AggregateException extends Exception	// class@000b56
{
    public List innerThrowables;
    public static final long serialVersionUID = 0x1;

    public void AggregateException(String p0,List p1){
       Throwable throwable = (p1 != null && p1.size() > 0)? p1.get(0): null;
       super(p0, throwable);
       this.innerThrowables = Collections.unmodifiableList(p1);
       return;
    }
    public void AggregateException(String p0,Throwable[] p1){
       super(p0, Arrays.asList(p1));
    }
    public void AggregateException(List p0){
       super("There were multiple errors.", p0);
    }
    public Throwable[] getCauses(){
       AggregateException tinnerThrowa = this.innerThrowables;
       Throwable[] throwableArr = new Throwable[tinnerThrowa.size()];
       return tinnerThrowa.toArray(throwableArr);
    }
    public List getErrors(){
       ArrayList uArrayList = new ArrayList();
       AggregateException tinnerThrowa = this.innerThrowables;
       if (tinnerThrowa == null) {
          return uArrayList;
       }
       Iterator iterator = tinnerThrowa.iterator();
       while (iterator.hasNext()) {
          Throwable throwable = iterator.next();
          if (throwable instanceof Exception) {
             uArrayList.add(throwable);
          }else {
             uArrayList.add(new Exception(throwable));
          }
       }
       return uArrayList;
    }
    public List getInnerThrowables(){
       return this.innerThrowables;
    }
    public void printStackTrace(PrintStream p0){
       super.printStackTrace(p0);
       Iterator iterator = this.innerThrowables.iterator();
       int i = -1;
       while (iterator.hasNext()) {
          p0.append("\n");
          p0.append("  Inner throwable #");
          i = i + 1;
          p0.append(Integer.toString(i));
          p0.append(": ");
          iterator.next().printStackTrace(p0);
          p0.append("\n");
       }
       return;
    }
    public void printStackTrace(PrintWriter p0){
       super.printStackTrace(p0);
       Iterator iterator = this.innerThrowables.iterator();
       int i = -1;
       while (iterator.hasNext()) {
          p0.append("\n");
          p0.append("  Inner throwable #");
          i = i + 1;
          p0.append(Integer.toString(i));
          p0.append(": ");
          iterator.next().printStackTrace(p0);
          p0.append("\n");
       }
       return;
    }
}
