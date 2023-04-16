package hi1.l;
import ok.h;
import java.lang.Object;
import java.lang.String;
import hi1.u;
import fg6.a;
import hi1.u$a;
import java.lang.Class;
import com.google.gson.Gson;
import java.util.List;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class l implements h	// class@0026de
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       List b = u.b;
       try{
          Gson a = a.a;
          p0 = a.q(a.h(p0, u$a.class).mOrderNo);
       }catch(java.lang.Exception e3){
          b.y(u.b, "[reportInteractiveComboTask] toJson fail.", e3);
          p0 = null;
       }
       return p0;
    }
}
