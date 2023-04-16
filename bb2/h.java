package bb2.h;
import qvb.q;
import bb2.g;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;

public class h implements q	// class@0003ca
{
    public final g b;

    public void h(g p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oh, "1")) {
          return;
       }
       b.a0(LiveLogTag.LIVE_END_FILTER, "onFinishLoading", c.k("firstPage: ", Boolean.valueOf(p0), ", isCache:", Boolean.valueOf(p1)));
       this.b.R8();
       return;
    }
}
