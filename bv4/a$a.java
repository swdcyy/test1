package bv4.a$a;
import java.lang.Runnable;
import com.kuaishou.bowl.event.utils.StageName;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pv.b;
import java.lang.Enum;
import java.lang.Exception;

public final class a$a implements Runnable	// class@0003d2
{
    public final StageName b;
    public final Map c;
    public final String d;

    public void a$a(StageName p0,Map p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       try{
          b.a().c(this.b.name(), this.c, this.d);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
