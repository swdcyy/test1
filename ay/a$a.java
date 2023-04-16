package ay.a$a;
import f66.i;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q87.c;
import lnc.i4;

public final class a$a extends i	// class@00021e
{
    public static final a$a c;

    static {
       a$a.c = new a$a();
    }
    public void a$a(){
       super("Commercial", false);
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "1")) {
          return;
       }
       super.e(p0, p1, p2);
       Object[] objArray = new Object[0];
       i4.a(p0, "ad_client_current_e_log", p1, p2, objArray);
       return;
    }
    public void t(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "3")) {
          return;
       }
       super.t(p0, p1, p2);
       i4.a(p0, "ad_client_current_e_log", p1, null, p2);
       return;
    }
    public void u(String p0,Throwable p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "2")) {
          return;
       }
       super.u(p0, p1, p2);
       i4.a(p0, "ad_client_current_e_log", null, p1, p2);
       return;
    }
}
