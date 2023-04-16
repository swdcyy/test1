package qf.a;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import qf.c;
import od.a;

public class a	// class@0029d0
{
    public Uri a;
    public String b;
    public double c;
    public boolean d;

    public void a(Context p0,String p1){
       super(p0, p1, 0, 0);
    }
    public void a(Context p0,String p1,double p2,double p3){
       super();
       this.b = p1;
       this.c = p2 * p3;
       Uri uri = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (uri != PatchProxyResult.class) {
       }else {
          try{
             uri = Uri.parse(this.b);
             if (uri.getScheme() == null) {
                uri = this.a(p0);
             }
          }catch(java.lang.Exception e0){
             uri = e0.a(p0);
          }
       }
    }
    public final Uri a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d = true;
       return c.a().d(p0, this.b);
    }
    public String b(){
       return this.b;
    }
    public Uri c(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       a.c(obj);
       return obj;
    }
    public boolean d(){
       return this.d;
    }
}
