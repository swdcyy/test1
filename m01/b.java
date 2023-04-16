package m01.b;
import im8.g;
import k51.c;
import io.reactivex.subjects.PublishSubject;
import m01.b$a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import m01.n;
import m01.c;
import com.yxcorp.gifshow.widget.m;
import m01.d;
import m01.e;
import m01.f;
import m01.g;
import mk1.b;
import android.view.View;
import e93.f;
import tk1.b;
import d01.a;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ql1.d$b;
import mk1.h;
import wk1.b;
import android.widget.LinearLayout;
import xk1.a;
import t02.a0;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import ry1.b;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView;
import hl1.a;
import com.yxcorp.gifshow.models.Gift;
import cl1.c;
import com.kwai.framework.model.user.QCurrentUser;
import brd.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Integer;
import lp3.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import oy1.a;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTitleView;
import d01.n;
import p91.m;
import mk1.a0;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$a;
import va1.b0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import m01.b$b;
import java.lang.Enum;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ik1.a0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.yxcorp.utility.n;
import java.lang.Math;
import ekd.m1;
import m01.l;
import java.util.Map;
import lp3.c;

public class b extends c implements g	// class@00309b
{
    public c A;
    public final m B;
    public LinearLayout C;
    public View D;
    public View E;
    public LiveGiftTitleView F;
    public LiveGiftSortType G;
    public a0 H;
    public final HashMap I;
    public a0 p;
    public h q;
    public a r;
    public b s;
    public a t;
    public i u;
    public a v;
    public d$b w;
    public n x;
    public a y;
    public c z;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxTabChangePresenter";

    public void b(){
       super();
       this.z = PublishSubject.g();
       this.A = PublishSubject.g();
       this.B = new b$a(this);
       HashMap hashMap = new HashMap();
       this.I = hashMap;
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
       }else {
          hashMap.put(GiftTab.NormalGift, new n(R.id.drawing_gift_title, 0x7f0a10ac, new c(this)));
          hashMap.put(GiftTab.PacketGift, new n(R.id.live_gift_packet_title_container, 0x7f0a2f62, new d(this)));
          hashMap.put(GiftTab.PrivilegeGift, new n(R.id.live_privilege_gift_title_container, 0x7f0a322f, new e(this)));
          hashMap.put(GiftTab.FansGroupGift, new n(R.id.live_fans_group_gift_title_container, 0x7f0a1c79, new f(this)));
          hashMap.put(GiftTab.PropsPanel, new n(R.id.live_props_title_container, 0x7f0a23e5, new g(this)));
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.R8(this.s.d()).c().performClick();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       f.g(this);
       return;
    }
    public void P8(GiftTab p0,b p1){
       b tw;
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "13")) {
          return;
       }
       GiftPanelItem giftPanelIte = null;
       int i = 0;
       if (this.X8()) {
          this.V8();
          this.t.a(p0);
          this.s.m(p0);
          tw = this.w;
          if (tw != null) {
             tw.g(p0, giftPanelIte, i, giftPanelIte);
          }
       }else {
          tw = this.w;
          if (tw != null) {
             tw.g(p0, giftPanelIte, i, giftPanelIte);
          }
          this.V8();
          this.t.a(p0);
          this.s.m(p0);
       }
       this.W8(p0);
       p1.h(i);
       p1.i();
       this.q.A.d("[LiveAudienceGiftBoxTabChangePresenter][changeGiftTab]");
       this.C.setVisibility(i);
       this.Y8(p0);
       this.q.p.b(8);
       b = true;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "14")) {
          LiveUserStatusResponse liveUserStat = this.p.b3.D1();
          uob = (p0 == GiftTab.PacketGift && (liveUserStat != null && liveUserStat.mEnableSendMagicBoxToGuest != null))? 1: null;
          if (p0 == GiftTab.NormalGift || uob) {
             this.y.d();
          }else {
             uob = this.y;
             if (!this.r.f().getVisibility()) {
                i = true;
             }
             uob.c(i);
          }
       }
       if (this.r.f().isEnabled()) {
          this.r.g(b);
       }
       this.q.K = p1.b();
       this.Z8();
       this.q.t.c(this.R8(p0).a());
       this.D.setVisibility(8);
       if (!QCurrentUser.me().isLogined()) {
          p1.d();
       }
       this.A.onNext(p0);
       return;
    }
    public n R8(GiftTab p0){
       n obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I.get(p0);
       if (obj != null) {
          return obj;
       }
       throw new RuntimeException("giftTab[ "+p0+"] is not register");
    }
    public void S8(b p0,GiftTab p1,String p2,String p3,int p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "20")) {
             return;
          }
       }
       if (!this.u.b()) {
          LiveSendGiftTraceInfo liveSendGift = this.v.o6().D(p0);
          liveSendGift.q(a.b(p1));
          this.v.yk(liveSendGift).d(p2).f("PRE_SEND_GIFT").g(p4).e(p3).a();
       }else {
          b.P(b.a, "[LiveAudienceGiftBoxSimpleGiftPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, b.class, "16")) {
          return;
       }
       this.R8(this.s.d()).d = this.q.t.g();
       return;
    }
    public final void W8(GiftTab p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "9")) {
          return;
       }
       View view = this.R8(p0).c();
       if (view instanceof LiveGiftTitleView) {
          view.a();
       }
       if (this.H != null && this.x.a(p0)) {
          this.H.a(this.p.Z2.getLiveStreamId());
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, view, this, uob, "10")) {
          String str = "LiveAudienceGiftBoxTabChangePresenter";
          if (!LiveGiftBoxConfig.m.a().a(b0.a())) {
             b.P(LiveLogTag.GIFT_BOX.appendTag(str), "handleGiftSort, enableSort == false");
          }else if(y.d(this.getActivity())){
             b.P(LiveLogTag.GIFT_BOX.appendTag(str), "handleGiftSort, isLandscape");
          }else if(p0 == GiftTab.NormalGift){
             if (this.G == null) {
                b.P(LiveLogTag.GIFT_BOX.appendTag(str), "selectNormalGift, mCurrentSortType == null");
                this.G = LiveGiftSortType.DEFAULT;
             }else if(view.isSelected()){
                b.P(LiveLogTag.GIFT_BOX.appendTag(str), "selectNormalGift, from self");
                if (!PatchProxy.applyVoid(null, this, uob, "11")) {
                   int i = b$b.a[this.G.ordinal()];
                   if (i != 1) {
                      if (i != 2) {
                         if (i == 3) {
                            this.G = LiveGiftSortType.DEFAULT;
                         }
                      }else {
                         this.G = LiveGiftSortType.ASC;
                      }
                   }else {
                      this.G = LiveGiftSortType.DESC;
                   }
                }
                this.z.onNext(this.G);
                BaseFragment uBaseFragmen = this.p.Z2.b();
                ClientContent$LiveStreamPackage liveStreamPa = this.p.Z2.a();
                int type = this.G.getType();
                if (!PatchProxy.isSupport(a0.class) || !PatchProxy.applyVoidThreeRefs(uBaseFragmen, liveStreamPa, Integer.valueOf(type), null, a0.class, "44")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "GIFT_PANEL_SORT_BUTTON";
                   i3 oi3 = i3.f();
                   oi3.c("type", Integer.valueOf(type));
                   uElementPack.params = oi3.e();
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   u1.L("", uBaseFragmen, 1, uElementPack, uContentPack);
                }
             }else {
                b.P(LiveLogTag.GIFT_BOX.appendTag(str), "selectNormalGift, from other tab");
             }
             this.a9(this.G);
          }else {
             this.a9(LiveGiftSortType.DEFAULT);
          }
       }
       if (view.isSelected()) {
          return;
       }else {
          Iterator iterator = this.I.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             View view1 = uEntry.getValue().c();
             b = (uEntry.getKey() == p0)? true: false;
             view1.setSelected(b);
          }
          return;
       }
    }
    public final boolean X8(){
       Object obj = PatchProxy.apply(null, this, b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableFixGiftSelect", false);
    }
    public final void Y8(GiftTab p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       Iterator iterator = this.I.entrySet().iterator();
       while (iterator.hasNext()) {
          View[] viewArray = new View[]{iterator.next().getValue().b()};
          n.Z(8, viewArray);
       }
       this.R8(p0).b().setVisibility(0);
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, b.class, "18")) {
          return;
       }
       b tq = this.q;
       h k = tq.K;
       if (k != null) {
          tq.t.c(Math.min(k.mMaxBatchCount, 1));
          this.q.t.d();
       }
       return;
    }
    public final void a9(LiveGiftSortType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       int i = b$b.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                this.F.setTitleSortIcon(R.string.arg_RES_7f1025ce);
             }else {
                this.F.setTitleSortIcon(R.string.arg_RES_7f1025c5);
             }
          }else {
             this.F.setTitleSortIcon(R.string.arg_RES_7f1025cb);
          }
       }else {
          this.F.setTitleSortIcon(R.string.arg_RES_7f1025ce);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a2be6);
       this.D = m1.f(p0, 0x7f0a0c43);
       this.E = m1.f(p0, 0x7f0a0c4e);
       this.F = m1.f(p0, 0x7f0a0c4f);
       Iterator iterator = this.I.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().doBindView(p0);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new l());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.q8(h.class);
       this.r = this.q8(a.class);
       this.s = this.q8(b.class);
       this.t = this.q8(a.class);
       this.w = this.t8("LIVE_GIFT_PANEL_EVENT_SERVICE");
       this.y = this.r8("LIVE_AUDIENCE_GIFT_BOX_RECEIVER_SERVICE");
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.u = oi;
       this.v = oi.a(a.class);
       this.x = this.q8(n.class);
       this.H = this.s8(a0.class);
       return;
    }
}
