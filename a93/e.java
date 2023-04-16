package a93.e;
import java.lang.Runnable;
import com.kuaishou.live.lite.background.a$a;
import java.lang.Object;
import com.kuaishou.live.lite.background.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.LivePlayerController;
import ga1.e;
import android.view.View;
import z81.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import xp5.g;
import xp5.a;
import u53.b;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class e implements Runnable	// class@000086
{
    public final a$a b;

    public void e(a$a p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       a$a b = tb.b;
       boolean b1 = true;
       b.w = b1;
       boolean b2 = false;
       if (b.v == null || !b.V2()) {
          tb.b.W2(b2);
       }
       a$a b3 = tb.b;
       Objects.requireNonNull(b3);
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, b3, uoa, "1")) {
          int videoWidth = b3.o.Vc().getVideoWidth();
          int videoHeight = b3.o.Vc().getVideoHeight();
          if (!PatchProxy.applyVoid(objArray, b3, uoa, "5")) {
             int i = 8;
             b3.k.setVisibility(i);
             b3.m.setVisibility(i);
             a u1 = b3.u;
             if (u1 != null) {
                u1.b();
             }
          }
          if (videoWidth > videoHeight) {
             if (!PatchProxy.applyVoid(objArray, b3, uoa, "2")) {
                a u = b3.u;
                if (u != null && u.c()) {
                   b3.u.e();
                }else if(PatchProxy.applyVoid(objArray, b3, uoa, "4")){
                   b3.k.setVisibility(b2);
                   Object obj = PatchProxy.apply(objArray, b3, uoa, "9");
                   if (obj != PatchProxyResult.class) {
                      b1 = obj.booleanValue();
                   }else {
                      uoa = b.b(b3.p.r5().getLivePlayConfig(), b3.p.d());
                      if (uoa.c() && (!uoa.e() && !uoa.f())) {
                         b1 = false;
                      }
                   }
                   int d = (b1)? a.D: a.C;
                   b3.k.setBackgroundColor(d);
                   b.e0(LiveLiteLogTag.LITE_BACKGROUND, "LiveLiteBackgroundViewControllershowLandscapeBackground", "isGameLive", Boolean.valueOf(b1), "background Color", Integer.valueOf(d), "mLandscapeBackgroundView visibility", Integer.valueOf(b3.k.getVisibility()));
                }
             }
          }else if(PatchProxy.applyVoid(objArray, b3, uoa, "3")){
             b3.m.setVisibility(b2);
          }
       }
    label_00f8 :
       return;
    }
}
