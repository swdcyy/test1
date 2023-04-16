package htd.j;
import htd.i;
import htd.g;
import java.lang.IllegalArgumentException;
import java.lang.String;
import htd.q;
import htd.l;
import htd.l$b;

public final class j	// class@000fcf
{

    public static final i a(int p0){
       g og;
       if (p0 != -2) {
          if (p0 != -1) {
             if (p0) {
                if (p0 != Integer.MAX_VALUE) {
                   og = new g(p0);
                }else {
                   throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                }
             }else {
                throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
             }
          }else {
             og = new q();
          }
       }else {
          og = new g(l.q0.a());
       }
       return og;
    }
}
