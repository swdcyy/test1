package o3a.b$b;
import mx6.d;
import o3a.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import gm5.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import m3a.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import px6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import mx6.a;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class b$b implements d	// class@003275
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(long p0,long p1){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uob, "1")) {
          return;
       }
       b$b ta = this.a;
       Objects.requireNonNull(ta);
       b uob1 = b.class;
       if (PatchProxy.isSupport(uob1) && (!PatchProxy.applyVoidOneRefs(Long.valueOf(p0), ta, uob1, "5") && p0 - 0x57e40 > 0)) {
          b q = ta.q;
          if (q == null) {
             a.S("mPlayController");
          }
          if (b.t(q.a()) && !b.r()) {
             Object[] objArray = null;
             Object[] objArray1 = PatchProxy.apply(objArray, ta, uob1, "6");
             if (objArray1 != PatchProxyResult.class) {
             }else {
                b r = ta.r;
                if (r == null) {
                   a.S("mKwaiPlayerKitView");
                }
                a uoa = r.getPlayerKitContext().e(a.class);
                if (uoa != null) {
                   objArray = uoa.getPlayer();
                }
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                objArray1.seekTo(0);
             }
          }
       }
    label_0086 :
       return;
    }
}
