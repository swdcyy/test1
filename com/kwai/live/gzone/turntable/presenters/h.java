package com.kwai.live.gzone.turntable.presenters.h;
import n77.f$a;
import com.kwai.live.gzone.turntable.presenters.f;
import java.lang.Object;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize$TurntableType;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.live.gzone.turntable.presenters.h$a;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class h implements f$a	// class@000e69
{
    public final f a;

    public void h(f p0){
       this.a = p0;
       super();
    }
    public void a(LiveGzoneTurntablePrize p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       h ta = this.a;
       Objects.requireNonNull(ta);
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, f.class, "19")) {
          f t = ta.t;
          Objects.requireNonNull(t);
          if (!PatchProxy.applyVoidOneRefs(p0, t, LiveGzoneTurntableLogger.class, "3")) {
             ClientEvent$ElementPackage uElementPack = t.a("CLICK_LIVE_TURNTABLE_PRIZE");
             uElementPack.params = t.b(p0);
             u1.u(1, uElementPack, t.g());
          }
          ta.B.setVisibility(i);
          if (p0.mType == LiveGzoneTurntablePrize$TurntableType.EMPTY) {
             ta.E.setVisibility(8);
          }else {
             ta.E.setText(p0.mTips);
             ta.E.setVisibility(i);
          }
          ta.C.U(p0.mPicUrls);
          ta.D.setText(p0.mName);
       }
       String[] stringArray = new String[]{"id",p0.mPrizeId,"prize",p0.mName};
       LiveGzoneTurntableLogger.f("onPrizeItemTipClick", stringArray);
       return;
    }
    public void b(LiveGzoneTurntablePrize p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       h ta = this.a;
       f w = ta.w;
       if (w != null) {
          ta.X7(w.subscribe(new h$a(this, p0)));
       }else {
          ta.t.o(p0);
       }
       return;
    }
}
