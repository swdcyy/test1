package com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$a$a$a;
import k57.d$a;
import k57.d;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import oq5.a;
import oq5.c;
import k67.h;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneSpreadGold;
import java.util.Objects;
import java.lang.ref.WeakReference;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import j47.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.os.Handler;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import android.graphics.PointF;

public final class LiveGzoneGiftMessageBarPresenter$a$a$a implements d$a	// class@000d07
{
    public final d a;
    public final LiveGzoneGiftMessageBarPresenter b;
    public final LiveGzoneGiftMessageBarPresenter$a$a c;
    public final LiveGzoneGiftMessageBarPresenter d;

    public void LiveGzoneGiftMessageBarPresenter$a$a$a(d p0,LiveGzoneGiftMessageBarPresenter p1,LiveGzoneGiftMessageBarPresenter$a$a p2,LiveGzoneGiftMessageBarPresenter p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(boolean p0,boolean p1){
       LiveGzoneGiftMessageBarPresenter$a$a$a tc;
       SCGzoneSpreadGold activityId;
       if (PatchProxy.isSupport2(LiveGzoneGiftMessageBarPresenter$a$a$a.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveGzoneGiftMessageBarPresenter$a$a$a.class, "1")) {
          return;
       }
       LiveGzoneGiftMessageBarPresenter.S8(this.d).Q0(this.a);
       if (!p1) {
          LiveGzoneGiftMessageBarPresenter.R8(this.d).a();
       }
       if (p0) {
          tc = this.c;
          LiveGzoneGiftMessageBarPresenter z = this.b.z;
          String str = "";
          if (z != null) {
             activityId = z.activityId;
             if (activityId != null) {
             label_0041 :
                if (z != null) {
                   SCGzoneSpreadGold goldId = z.goldId;
                   if (goldId != null) {
                      str = goldId;
                   }
                }
                Objects.requireNonNull(tc);
                if (!PatchProxy.applyVoidTwoRefs(activityId, str, tc, LiveGzoneGiftMessageBarPresenter$a$a.class, "3")) {
                   LiveGzoneGiftMessageBarPresenter$a$a b = tc.b;
                   z = (b != null)? b.get(): null;
                   if (z != null) {
                      ClientEvent$ElementPackage uElementPack = tc.a(activityId, str);
                      uElementPack.action2 = "DROP_TREASURE_CLAIM_BANNER_CLOSE_BUTTON";
                      u1.u(6, uElementPack, LiveGzoneGiftMessageBarPresenter.P8(z).h3());
                   }
                }
             }
          }
          activityId = str;
          goto label_0041 ;
       }
    label_0078 :
       tc = this.c;
       tc.a = false;
       tc.sendEmptyMessage(1);
       PatchProxy.onMethodExit(LiveGzoneGiftMessageBarPresenter$a$a$a.class, "1");
       return;
    }
    public int b(){
       LiveGzoneGiftMessageBarPresenter$a$a$a uoa$a$a = LiveGzoneGiftMessageBarPresenter$a$a$a.class;
       Object obj = PatchProxy.applyWithListener(null, this, uoa$a$a, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       PatchProxy.onMethodExit(uoa$a$a, "3");
       return LiveGzoneGiftMessageBarPresenter.R8(this.d).H().getMeasuredHeight();
    }
    public PointF c(){
       Object obj = PatchProxy.applyWithListener(null, this, LiveGzoneGiftMessageBarPresenter$a$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LiveGzoneGiftMessageBarPresenter$a$a$a.class, "2");
       return LiveGzoneGiftMessageBarPresenter.R8(this.d).h();
    }
}
