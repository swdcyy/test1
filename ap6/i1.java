package ap6.i1;
import erd.r;
import qo6.m;
import java.lang.Object;
import hp6.b;
import xp6.x;
import java.lang.String;

public final class i1 implements r	// class@00033c
{
    public final m b;

    public void i1(m p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       boolean b;
       i1 tb = this.b;
       if (x.b(p0)) {
          b = true;
       }else if(tb != null){
          if (p0 == null) {
             tb.onError(1007, "ImSendProtoResult is empty");
          }else {
             tb.onError(p0.c(), p0.a());
          }
       }
       b = false;
       return b;
    }
}
