package c.t.m.g.x$1;
import java.lang.Runnable;
import c.t.m.g.x;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import c.t.m.g.w;
import c.t.m.g.x$a;
import c.t.m.g.y;
import c.t.m.g.ad;
import c.t.m.g.ac;
import c.t.m.g.ag;
import java.lang.StringBuilder;
import c.t.m.g.bt;

public class x$1 implements Runnable	// class@000cb2
{
    public final String a;
    public final Context b;
    public final x c;

    public void x$1(x p0,String p1,Context p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       try{
          if (("ASUS").equals(this.a)) {
             new w(this.b).a(x.a(this.c));
          }else if(("HUAWEI").equals(this.a)){
             new y(this.b).a(x.a(this.c));
          }else if(("OPPO").equals(this.a)){
             new ad(this.b).a(x.a(this.c));
          }else if(("ONEPLUS").equals(this.a)){
             new ac(this.b).a(x.a(this.c));
          }else if(("ZTE").equals(this.a)){
             new ag(this.b).a(x.a(this.c));
          }else if(("FERRMEOS").equals(this.a) || this.c.a()){
             new ag(this.b).a(x.a(this.c));
          }else if(("SSUI").equals(this.a) || this.c.b()){
             new ag(this.b).a(x.a(this.c));
          }
       }catch(java.lang.Exception e0){
          bt.b("DevicesIDsHelper", "getIDFromNewThead error: "+e0);
       }
       return;
    }
}
