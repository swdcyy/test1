package hz0.b$e;
import nn2.y1;
import hz0.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ug1.r;
import java.lang.Integer;

public class b$e implements y1	// class@0027ce
{
    public final b a;

    public void b$e(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$e.class, "2")) {
          return;
       }
       this.a.F.b("LIVE_WISH_LIST_PANEL");
       return;
    }
    public void b(int p0,int p1){
       b$e uoe = b$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       this.a.F.a("LIVE_WISH_LIST_PANEL", p1);
       return;
    }
}
