package jg5.d;
import jg5.b;
import nsd.u;
import java.lang.Object;

public abstract class d implements b	// class@002c17
{
    public final boolean a;

    public void d(){
       super(false, 1, null);
    }
    public void d(boolean p0){
       super();
       this.a = p0;
    }
    public void d(boolean p0,int p1,u p2){
       if (p1 & 1) {
          p0 = true;
       }
       super(p0);
       return;
    }
}
