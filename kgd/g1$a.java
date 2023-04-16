package kgd.g1$a;
import java.lang.Object;
import kgd.g1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import xgc.b;
import android.view.View$OnClickListener;

public class g1$a	// class@00178f
{
    public g1 a;

    public void g1$a(){
       super();
       this.a = new g1();
    }
    public g1 a(){
       return this.a;
    }
    public g1$a b(boolean p0){
       this.a.e = p0;
       return this;
    }
    public g1$a c(int p0,String p1,String p2,String p3,int p4){
       g1$a uoa = g1$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,null,null,Integer.valueOf(p4)};
          uoa = PatchProxy.apply(objArray, this, uoa, "1");
          if (uoa != PatchProxyResult.class) {
             return uoa;
          }
       }
       b uob = new b();
       uoa.b = uob;
       uob.b = p0;
       uob.c = p1;
       uob.d = null;
       uob.e = null;
       uob.f = p4;
       return this;
    }
    public g1$a d(View$OnClickListener p0){
       this.a.a = p0;
       return this;
    }
}
