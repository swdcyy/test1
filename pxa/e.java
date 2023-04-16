package pxa.e;
import f66.i;
import java.lang.String;
import pxa.e$a;
import pxa.e$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import q87.c;

public final class e extends i	// class@002215
{

    public void e(){
       super("KwaiInit", false);
    }
    public void e(e$a p0){
       super("KwaiInit", false);
    }
    public static e C(){
       return e$b.a;
    }
    public void D(String p0,String p1,String p2,Object[] p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, e.class, "1")) {
          return;
       }
       this.t(p0, p1+p2, p3);
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
