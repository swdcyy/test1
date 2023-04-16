package lqd.g;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class g	// class@001c9a
{
    public final boolean a;
    public final int b;

    public void g(boolean p0){
       super(p0, 1);
    }
    public void g(boolean p0,int p1){
       super();
       if (p1 <= 0) {
          throw new IllegalArgumentException("defaultMaxMessagesPerRead: "+p1+" \(expected > 0\)");
       }
       this.a = p0;
       this.b = p1;
       return;
    }
}
