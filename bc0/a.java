package bc0.a;
import f66.i;
import java.lang.String;
import bc0.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q87.c;
import java.lang.Throwable;

public final class a extends i	// class@000276
{

    public void a(){
       super("PendantApi", false);
    }
    public void a(a$a p0){
       super("PendantApi", false);
    }
    public void C(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       super.w("KemPendantV2", p0, p1);
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "4")) {
          return;
       }
       super.e(p0, p1, p2);
       return;
    }
    public void w(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       super.w(p0, p1, p2);
       return;
    }
}
