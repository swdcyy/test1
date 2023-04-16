package com.kuaishou.live.lite.recommendsidebar.panel.i$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.lite.recommendsidebar.panel.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel;
import xc3.e;
import yc3.x;
import com.kuaishou.live.lite.recommendsidebar.panel.g;
import com.kuaishou.live.lite.recommendsidebar.panel.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import xc3.a;
import yc3.r;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import k2b.u1;
import xc3.d;
import androidx.lifecycle.MutableLiveData;

public class i$a extends m	// class@000afd
{
    public final i c;

    public void i$a(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       i$a tc = this.c;
       Objects.requireNonNull(tc);
       i oi = i.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, oi, "5")) {
          b.Z(LiveLiteLogTag.LITE_RECOMMEND_PANEL, "LiveLiteRecommendPanelBackOriginPresenter -> backOriginPhoto");
          QPhoto qPhoto = tc.p.h.b();
          if (!x.c(tc.p.h.a(), qPhoto) && qPhoto != null) {
             if (!PatchProxy.applyVoid(objArray, tc, oi, "8")) {
                LiveStreamFeed liveStreamFe = k0.b(tc.p.h, g.a, h.a).orNull();
                if (liveStreamFe != null) {
                   String str = a.a(tc.p.h.d());
                   if (!PatchProxy.applyVoidTwoRefs(liveStreamFe, str, objArray, r.class, "4")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "RECO_RETURN_FIRST_LIVE_BUTTON";
                      i3 oi3 = i3.f();
                      oi3.d("biz_type", str);
                      uElementPack.params = oi3.e();
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = r.a(liveStreamFe, r1.y1(liveStreamFe));
                      u1.L("", objArray, 1, uElementPack, uContentPack);
                   }
                }
             }
             tc.p.i.e(qPhoto, "BACK_ORIGIN");
             tc.p.a.setValue(qPhoto);
             tc.p.i.a();
          }
       }
       return;
    }
}
