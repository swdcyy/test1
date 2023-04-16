package nx1.h;
import tx4.r;
import nx1.j;
import cxd.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;

public class h implements r	// class@003411
{
    public final c a;
    public final j b;

    public void h(j p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,Throwable p1){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, h.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "on load failed");
       this.a.onNext(Boolean.FALSE);
       this.a.onComplete();
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "on load success");
       this.a.onNext(Boolean.TRUE);
       this.a.onComplete();
       return;
    }
}
