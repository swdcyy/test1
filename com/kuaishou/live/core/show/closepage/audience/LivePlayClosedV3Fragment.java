package com.kuaishou.live.core.show.closepage.audience.LivePlayClosedV3Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.live.base.model.LiveSquareReplaceModel;
import tl8.d;
import xj2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import wkd.b;
import com.kuaishou.live.playeradapter.statistics.a;
import lnc.i3;
import dz1.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.closepage.audience.a;
import android.view.View$OnTouchListener;
import g52.e;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.a;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import h52.e;
import m52.b;
import l52.s;
import k52.b;
import f42.f;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Number;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import f42.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import im8.c;

public class LivePlayClosedV3Fragment extends BaseFragment	// class@000a2d
{
    public a0 j;
    public a k;
    public a l;
    public b m;
    public PresenterV2 n;
    public String o;
    public LivePlayLogger p;
    public static final int q;

    public void LivePlayClosedV3Fragment(){
       super();
       this.p = new LivePlayLogger();
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, LivePlayClosedV3Fragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.buildExpTagTrans(this.j.e);
    }
    public ClientEvent$ExpTagTrans K5(){
       Object[] objArray = null;
       LiveBizParam obj = PatchProxy.apply(objArray, this, LivePlayClosedV3Fragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j.p.mLiveSquareReplaceModel;
       if (obj != null) {
          LiveSquareReplaceModel mSourceFeed = obj.mSourceFeed;
          if (mSourceFeed != null) {
             return this.p.buildExpTagTrans(mSourceFeed.a(QLivePlayConfig.class));
          }
       }
       a e = this.k.e;
       if (e != null) {
          return this.p.buildExpTagTrans(e.a(QLivePlayConfig.class));
       }else {
          return objArray;
       }
    }
    public int M(){
       return 1;
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, LivePlayClosedV3Fragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.Q3();
       if (obj == null) {
          obj = new ClientContent$ContentPackage();
       }
       obj.liveStreamPackage = this.j.Z2.a();
       return obj;
    }
    public int getPage(){
       return 16;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, LivePlayClosedV3Fragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.a(0x30f594c9).b(this.o);
       obj = i3.f();
       obj.d("style", "1");
       obj.d("live_session_id", this.o);
       obj.d("exptag", this.j.Z2.i());
       obj.d("live_streamid", this.j.Z2.getLiveStreamId());
       obj.d("author_id", this.j.Z2.d());
       obj.d("gzone_live_type", a.g(this.j.l(), this.j.C0()));
       return obj.e();
    }
    public String o(){
       return "LIVE_PUSH_CLOSED";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LivePlayClosedV3Fragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0d12, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LivePlayClosedV3Fragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       LivePlayClosedV3Fragment tn = this.n;
       if (tn != null) {
          tn.unbind();
          this.n.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayClosedV3Fragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.o = b.a(0x30f594c9).a(this.o());
       p0.setOnTouchListener(a.b);
       PresenterV2 presenterV2 = new PresenterV2();
       this.n = presenterV2;
       presenterV2.U7(new e());
       this.n.U7(new n());
       this.n.U7(new a());
       this.n.U7(new k());
       this.n.U7(new e());
       this.n.U7(new b());
       this.n.U7(new s());
       this.n.U7(new b());
       int i = 4;
       int i1 = 2;
       if (f.a(this.j.l)) {
          this.n.U7(new b());
       }else {
          LiveStreamFeedWrapper mEntity = this.j.c.mEntity;
          Object obj = PatchProxy.applyOneRefs(mEntity, null, f.class, "12");
          int i2 = (obj != PatchProxyResult.class)? obj.intValue(): k0.a(mEntity.mLiveStreamModel, d.a).or(Integer.valueOf(1)).intValue();
          if (i2 != i1 && i2 != 3) {
             if (i2 == i) {
                this.n.U7(new g());
             }
          }else {
             this.n.U7(new f());
          }
       }
       this.n.f(p0);
       Object[] objArray = new Object[i];
       objArray[0] = this.j;
       objArray[1] = c.a("LIVE_PLAY_CLOSED_V2_CALLBACK", this.l);
       objArray[i1] = c.a("LIVE_PLAY_CLOSED_FRAGMENT", this);
       objArray[3] = c.a("LIVE_SIDE_BAR_OPEN_STATUS", this.m);
       this.n.i(objArray);
       return;
    }
}
