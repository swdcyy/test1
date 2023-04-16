package gn2.f;
import z61.c;
import gn2.i;
import java.lang.Object;
import o61.b;
import gn2.l;

public final class f implements c	// class@002b52
{
    public final i a;

    public void f(i p0){
       this.a = p0;
    }
    public final b a(){
       f ta = this.a;
       _monitor_enter(ta);
       if (ta.a == null) {
          ta.a = new l();
       }
       _monitor_exit(ta);
       return ta.a;
    }
}
