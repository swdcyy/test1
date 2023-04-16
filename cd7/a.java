package cd7.a;
import erd.g;
import com.kwai.nearby.local.pendant.NearbyPendantView;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadManager;
import com.kwai.nearby.model.NearbyPendantInfo$NearbyPendantConfig;
import com.kwai.nearby.local.pendant.PendantAnimImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Collection;
import android.os.SystemClock;
import android.widget.ImageView;

public final class a implements g	// class@000531
{
    public final NearbyPendantView b;
    public final String c;

    public void a(NearbyPendantView p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
       }else {
          this.b.d();
          this.b.c();
          DownloadManager.C("nearby_local_pendant_zip", "");
          a tb = this.b;
          NearbyPendantView b = tb.b;
          if (b != null) {
             NearbyPendantInfo$NearbyPendantConfig mAnimationCi = b.mAnimationCirculateTimes;
             PendantAnimImageView pendantAnimI = NearbyPendantView.a(tb);
             tb = this.b;
             b = tb.b;
             Integer obj = PatchProxy.applyOneRefs(b, tb, NearbyPendantView.class, "6");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else if(b != null){
                obj = Integer.valueOf(b.mAnimationFramePMs);
             }else {
                obj = null;
             }
             a.m(obj);
             if (obj.intValue() > 0) {
                i = b.mAnimationFramePMs;
             }else {
                i = 25;
             }
             long l = (long)i;
             Objects.requireNonNull(pendantAnimI);
             if (!PatchProxy.isSupport(PendantAnimImageView.class) || (PatchProxy.applyVoidFourRefs(p0, Boolean.TRUE, Long.valueOf(l), Integer.valueOf(mAnimationCi), pendantAnimI, PendantAnimImageView.class, "3") || (p0 == null || (p0.size() >= 1 && l > 0)))) {
                pendantAnimI.x.clear();
                pendantAnimI.x.addAll(p0);
                pendantAnimI.z = true;
                pendantAnimI.y = l;
                pendantAnimI.A = 0;
                pendantAnimI.C = mAnimationCi;
                pendantAnimI.B = SystemClock.elapsedRealtime();
                pendantAnimI.postInvalidate();
             }
          }
       label_00a8 :
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
}
