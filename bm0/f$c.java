package bm0.f$c;
import lm9.a$b;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bm0.f;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import lm9.b;

public class f$c implements a$b	// class@0003c0
{
    public final WeakReference a;

    public void f$c(WeakReference p0){
       super();
       this.a = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "2")) {
          return;
       }
       f uof = this.c();
       if (uof != null) {
          uof.P8();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_TVC_AD, "onResponse");
       f uof = this.c();
       if (uof != null) {
          uof.R8();
       }
       return;
    }
    public final f c(){
       f$c obj = PatchProxy.apply(null, this, f$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.get();
       }
       return null;
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "4")) {
          return;
       }
       if (this.c() != null) {
          this.a.get().P8();
       }
       return;
    }
    public void onFinish(){
       b.b(this);
    }
}
