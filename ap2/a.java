package ap2.a;
import xv4.i;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import ap2.a$a;
import java.lang.Runnable;
import t45.c;

public final class a extends i	// class@0002a5
{

    public void a(){
       super();
    }
    public void e(int p0,String p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (p0 == 1 && p1 != null) {
          c.a(new a$a(p1));
       }
       return;
    }
}
