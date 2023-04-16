package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c;
import im8.g;
import lz0.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.o;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import android.util.SparseArray;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c$b;
import b01.a;
import vg1.c;
import z1.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import b01.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveProp;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import d61.h0;
import k2b.u1;
import mk1.h;
import java.lang.StringBuilder;
import cl1.c;
import b01.m;
import b01.l;
import brd.t;
import t45.d;
import brd.z;
import b01.e;
import erd.g;
import cjd.e;
import erd.o;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.b;
import sfc.a;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import b01.f;
import b01.d;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c$c;
import cl1.b;
import b01.h;
import vg1.m$b;
import vg1.m;
import com.kwai.robust.PatchProxyResult;
import vg1.l;
import vg1.e;
import qk1.a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import android.view.View;
import b01.k;
import java.util.Map;
import java.util.HashMap;
import gl1.b;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import b01.b;
import ok.o;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.a;
import ok.h;
import java.util.ArrayList;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import tz0.t;

public class c extends c implements g	// class@000b5e
{
    public final List Q;
    public b R;
    public List S;
    public LiveProp T;
    public final SparseArray U;
    public final m V;
    public final a W;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxPropsPresenter";

    public void c(o p0){
       super(p0);
       this.Q = LiveLogTag.GIFT.appendTag("LiveAudienceGiftBoxPropsPresenter");
       this.U = new SparseArray();
       this.V = new c$a(this);
       this.W = new c$b(this, new a(this), this.S8());
    }
    public void B9(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "8")) {
          return;
       }
       int i = 1;
       if (p0 != i && p0 != 2) {
          return;
       }
       if (this.T == null) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.w.Z2.a();
       c tT = this.T;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, tT, null, n.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GIFT_PANEL_PROP_USE_BUTTON";
          i3 oi3 = i3.f();
          String str = (tT.isUsed())? "DISUSE": "USE";
          oi3.d("btn_type", str);
          oi3.d("type", String.valueOf(tT.mPropType));
          uElementPack.params = oi3.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
          giftPackage.identity = h0.a(tT.mPropId);
          giftPackage.position = tT.mPropPosition;
          uContentPack.giftPackage = giftPackage;
          u1.u(i, uElementPack, uContentPack);
       }
       this.v.t.f("[LiveAudienceGiftBoxPropsPresenter][requestChangePropState]state = "+p0);
       uoc = this.T;
       this.X7(l.b().b(this.w.Z2.getLiveStreamId(), uoc.mPropId, uoc.mPropType, p0).observeOn(d.a).doOnError(new e(this)).map(new e()).subscribe(new b(this, p0, uoc), new a()));
       return;
    }
    public void C9(boolean p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoc, "16")) {
          return;
       }
       if (!p0) {
          b.P(this.Q, "[requestLoadGift], enableRefreshUI = false");
          return;
       }else if(this.D != null){
          b.P(this.Q, "[requestLoadGift], mIsRequestingGiftData = true");
          return;
       }else {
          this.D = true;
          this.X7(l.b().a(this.w.Z2.getLiveStreamId()).map(new e()).subscribe(new f(this), new d(this)));
          return;
       }
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       super.E8();
       this.v.t.l(new c$c(this));
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          this.V.c(new h(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       super.J8();
       this.S = null;
       return;
    }
    public c S8(){
       c obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.J == null) {
          obj = new c(this.V);
          this.J = obj;
          obj.X(false);
       }
       return this.J;
    }
    public int V8(){
       return 0x7f0a23e5;
    }
    public String W8(){
       return "PROP_LIST_PANEL";
    }
    public a X8(){
       return this.R;
    }
    public GiftTab Y8(){
       return GiftTab.PropsPanel;
    }
    public int Z8(){
       return 0x7f0a23e6;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       if (this.v.e.d() == GiftTab.PropsPanel && !this.t9()) {
          b.P(this.Q, "[loadGift], tryPrepareLoadGift = false");
          return;
       }else if(this.S != null){
          b.P(this.Q, "[loadGift], mLivePropList != null");
          this.y9();
          return;
       }else {
          this.C9(true, 2);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       super.doBindView(p0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new k());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.R = this.q8(b.class);
       return;
    }
    public void n9(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       if (!this.q.c()) {
          this.x9();
       }
       return;
    }
    public void x9(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       if (q.f(this.S)) {
          return;
       }
       int pageSize = this.q.getPageSize();
       int currentPosit = this.q.getCurrentPosition();
       int i = (currentPosit * pageSize) + 1;
       ArrayList uArrayList = new ArrayList();
       m.s(this.S).p(new b(i, ((pageSize + i) - 1))).F(a.b).n(uArrayList);
       currentPosit = currentPosit + 1;
       pageSize = 0;
       while (pageSize < uArrayList.size()) {
          Object obj = uArrayList.get(pageSize);
          if (obj != null) {
             n.a(this.w.Z2.b(), obj, this.w.Z2.a(), this.w.Z2.y(), this.B.i(), currentPosit);
          }
          pageSize = pageSize + 1;
       }
       return;
    }
    public final void y9(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       if (this.S == null) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       while (i < this.S.size()) {
          LiveProp liveProp = this.S.get(i);
          i = i + 1;
          liveProp.mPropPosition = i;
          if (liveProp.mIsWearable != null && liveProp.isUsed()) {
             this.U.put(liveProp.mPropType, liveProp.mPropId);
          }
          GiftPanelItem giftPanelIte = new GiftPanelItem(6);
          giftPanelIte.mProp = liveProp;
          uArrayList.add(giftPanelIte);
       }
       t.a(uArrayList);
       this.S8().e(uArrayList);
       if (q.f(uArrayList)) {
          this.v.t.f("[LiveAudienceGiftBoxPropsPresenter][refreshPropListView]propsPanelItemList is empty");
       }
       b.c0(LiveLogTag.LIVE_PROPS, "LiveAudienceGiftBoxPropsPresenter onLoadPropsSucceed", "propsSize", Integer.valueOf(uArrayList.size()));
       this.m9();
       return;
    }
}
