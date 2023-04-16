package i91.e;
import com.kwai.plugin.dva.work.c$c;
import com.kuaishou.live.common.core.basic.arya.b;
import brd.v;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import brd.g;
import java.lang.Float;
import sj7.d;

public class e implements c$c	// class@00285f
{
    public final v a;
    public final b b;

    public void e(b p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       LiveLogTag lIVE_ARYA_SO = LiveLogTag.LIVE_ARYA_SO_LOAD;
       StringBuilder str = "TaskListener onFailed: ";
       String str1 = (p0 != null)? p0.toString(): "null";
       b.B(lIVE_ARYA_SO, str+str1);
       this.a.onNext(Boolean.FALSE);
       this.a.onComplete();
       return;
    }
    public void onProgress(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ARYA_SO_LOAD, "TaskListener onProgress: "+p0);
       return;
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
       }else {
          b.c0(LiveLogTag.LIVE_ARYA_SO_LOAD, "TaskListener onSucceed", "data", p0);
          this.a.onNext(Boolean.TRUE);
          this.a.onComplete();
       }
       return;
    }
}
