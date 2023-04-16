package jc9.s;
import erd.a;
import jc9.b0;
import lc9.b;
import java.lang.Object;
import java.util.Objects;
import hc9.e;

public final class s implements a	// class@00294b
{
    public final b0 b;
    public final b c;
    public final Object d;

    public void s(b0 p0,b p1,Object p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       s tb = this.b;
       s td = this.d;
       Objects.requireNonNull(tb);
       if (this.c.h(td)) {
          tb.e.d(4, td);
       }else {
          tb.e.d(5, td);
       }
       return;
    }
}
