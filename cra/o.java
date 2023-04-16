package cra.o;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;

public final class o	// class@002387
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public static final void a(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, o.class, "2")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("kwai_url", p0);
       oi3.d("result", p1);
       oi3.d("errMsg", p2);
       oi3.c("isAgreePrivacy", Integer.valueOf(p3));
       u1.R("NATIVE_RECIEVE_SERVER_MATCH_SIGNAL", oi3.e(), 9);
       return;
    }
}
