package m11.k;
import m11.p$a;
import m11.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import m11.j;
import java.lang.Iterable;
import z1.a;
import qo1.a;

public class k implements p$a	// class@003104
{
    public final l a;

    public void k(l p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_LINE, "onExitLineStream");
       k ta = this.a;
       ta.f = false;
       a.b(ta.a, j.a);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_LINE, "onEnterLineStream");
       k ta = this.a;
       ta.f = true;
       ta.c();
       return;
    }
}
