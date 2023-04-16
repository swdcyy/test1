package gd9.a;
import k36.f;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import qr4.i;
import qr4.k$j;
import qr4.k$e;
import java.util.List;
import k36.c;
import k36.e;
import fg6.a;
import com.google.gson.Gson;

public class a implements f	// class@002462
{
    public int a;
    public String b;
    public final List mMagicFaceIds;

    public void a(){
       super();
       this.mMagicFaceIds = new ArrayList();
    }
    public static a d(int p0,VideoContext p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoa = new a();
       uoa.a = p0;
       if (p1.F() == null || (p1.F().c != null && p1.F().c.u != null)) {
          k$j u = p1.F().c.u;
          int len = u.length;
          int i = 0;
          while (i < len) {
             object oobject = u[i];
             if (oobject != null) {
                k$e b = oobject.b;
                if (b != null) {
                   uoa.mMagicFaceIds.add(b);
                }
             }
             i = i + 1;
          }
       }
       return uoa;
    }
    public static void e(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uoa, "1")) {
          return;
       }
       uoa = c.d().e("captureInfoEvent");
       if (uoa != null && uoa.a == p0) {
          c.d().b("captureInfoEvent");
       }
       return;
    }
    public String a(){
       return "captureInfoEvent";
    }
    public boolean b(){
       return e.a(this);
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = a.a.q(this);
       }
       return this.b;
    }
}
