package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.LiveAudienceDrawingGiftBoxFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pz0.a;
import android.os.SystemClock;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mz0.a;
import p01.q;
import p01.l;
import tz0.d;
import pz0.h;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.f;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.d;
import android.view.View;
import androidx.fragment.app.Fragment;
import mk1.h;
import mk1.b;
import xp5.i;
import lp3.c;
import lp3.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ik1.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import k2b.u1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceDrawingGiftBoxView;
import t02.a0;
import java.util.Objects;
import java.lang.Boolean;
import android.widget.RelativeLayout;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveGiftPanelItemView;
import android.widget.TextView;
import ez0.g;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.LiveAudienceDrawingGiftBoxFragment$a;

public class LiveAudienceDrawingGiftBoxFragment extends BaseFragment	// class@000b35
{
    public h j;
    public a0 k;
    public PresenterV2 l;
    public LiveAudienceDrawingGiftBoxFragment$a m;
    public q n;
    public static final int o;

    public void LiveAudienceDrawingGiftBoxFragment(){
       super();
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceDrawingGiftBoxFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       Object[] objArray = null;
       String str = "1";
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceDrawingGiftBoxFragment.class, "5")) {
          a uoa1 = new a();
          if (!PatchProxy.applyVoid(objArray, uoa1, a.class, str)) {
             uoa1.a = SystemClock.elapsedRealtime();
          }
          PresenterV2 presenterV2 = new PresenterV2();
          this.l = presenterV2;
          presenterV2.U7(new a(this.n));
          this.l.U7(new l(false, this.n));
          this.l.U7(new d());
          this.l.U7(new h());
          this.l.U7(new f());
          this.l.U7(new d());
          this.l.f(this.getView());
          Object[] objArray1 = new Object[]{uoa1,this.j,this.k};
          this.l.i(objArray1);
       }
       int i = this.j.e.i();
       ClientContent$LiveStreamPackage liveStreamPa = this.j.n.a(i.class).a();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), liveStreamPa, objArray, uoa, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "DRAWING_GIFT_PANEL";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
          giftPackage.sourceType = i;
          uContentPack.giftPackage = giftPackage;
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(9, uElementPack, uContentPack);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceDrawingGiftBoxFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       LiveAudienceDrawingGiftBoxView liveAudience = a.g(p0, R.layout.arg_RES_7f0d0ae5, p1, false);
       LiveAudienceDrawingGiftBoxFragment tj = this.j;
       boolean b = this.k.l();
       Objects.requireNonNull(liveAudience);
       if (!PatchProxy.isSupport(LiveAudienceDrawingGiftBoxView.class) || !PatchProxy.applyVoidTwoRefs(tj, Boolean.valueOf(b), liveAudience, LiveAudienceDrawingGiftBoxView.class, "1")) {
          liveAudience.g = tj;
          liveAudience.c = liveAudience.findViewById(0x7f0a109d);
          liveAudience.e = liveAudience.findViewById(0x7f0a109b);
          liveAudience.findViewById(R.id.packet_gift_layout).setVisibility(8);
          liveAudience.d = liveAudience.findViewById(0x7f0a1098);
          liveAudience.findViewById(R.id.drawing_gift_title).setSelected(true);
          liveAudience.b = liveAudience.findViewById(0x7f0a0c4d);
          liveAudience.e.setBackground(a1.f(g.a()));
          liveAudience.f = liveAudience.findViewById(0x7f0a0c47);
          liveAudience.h = b;
       }
       return liveAudience;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceDrawingGiftBoxFragment.class, "7")) {
          return;
       }
       super.onDestroy();
       this.l.destroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceDrawingGiftBoxFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.l.unbind();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceDrawingGiftBoxFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.m.B1();
       return;
    }
}
