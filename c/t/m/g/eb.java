package c.t.m.g.eb;
import java.lang.String;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.util.Objects;

public class eb	// class@000c64
{
    public final String a;

    public void eb(String p0){
       super();
       this.a = this.b(p0);
    }
    public static eb a(String p0){
       return new eb(p0);
    }
    public final String a(Iterable p0){
       return this.a(p0.iterator());
    }
    public final String a(Iterator p0){
       return this.a("", p0);
    }
    public final StringBuilder a(StringBuilder p0,Iterator p1){
       Object obj;
       if (p1.hasNext()) {
          obj = p1.next();
          if (obj != null) {
             p0 = p0+obj.toString();
          }
       }
       while (p1.hasNext()) {
          obj = p1.next();
          if (obj != null) {
             p0 = p0+this.a+obj.toString();
          }
       }
       return p0;
    }
    public final String b(String p0){
       Objects.requireNonNull(p0);
       return p0;
    }
}
