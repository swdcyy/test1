package com.kuaishou.live.core.show.conditionredpacket.grab.normal.b;
import gi2.d;
import k51.c;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import u52.t;
import t45.d;
import brd.z;
import brd.t;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.a;
import e62.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e62.b;
import e62.c;
import ok.x;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.c;
import e62.e;
import android.widget.TextView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import gi2.c;
import java.util.List;
import gi2.f;
import gi2.e;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import lnc.b9;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import hi2.b;
import android.os.Message;
import p91.m;
import j62.a;
import u52.y;
import java.lang.CharSequence;
import java.lang.Boolean;
import e62.a;
import brd.y;
import nt5.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.Enum;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketGrabButtonType;
import h62.d;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import u52.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import k2b.u1;
import e62.g;
import android.view.View$OnClickListener;
import ekd.m1;
import android.widget.ImageView;
import dx1.b;
import mrd.c;

public abstract class b extends c implements d	// class@000a9a
{
    public ImageView A;
    public TextView B;
    public MutableLiveData C;
    public Observer D;
    public b E;
    public LiveConditionRedPacketInfo F;
    public final c G;
    public t p;
    public a q;
    public c r;
    public t s;
    public m t;
    public KwaiImageView u;
    public KwaiImageView v;
    public View w;
    public TextView x;
    public KwaiImageView y;
    public TextView z;
    public static String sLivePresenterClassName = "LiveConditionRedPacketNormalBaseCurrentInfoBottomLayoutPresenter";

    public void b(){
       super();
       this.G = PublishSubject.g();
    }
    public void B3(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.N4(this.u, this.v);
       return;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       this.t = this.p.a;
       if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
          this.X7(this.r.observeOn(d.a).subscribe(new a(this), new d(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "10")) {
          this.X7(c.a(this.s, this.G, new b(this), new c(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          this.N4(this.u, this.v);
       }
       this.E = this.p.l.subscribe(new e(this));
       return;
    }
    public void H7(KwaiImageView p0,TextView p1,LiveRedPacketResourcePathConstant p2){
       c.b(this, p0, p1, p2);
    }
    public void I4(KwaiImageView p0,List p1){
       e.d(this, p0, p1);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tC = this.C;
       if (tC != null) {
          b tD = this.D;
          if (tD != null) {
             tC.removeObserver(tD);
          }
       }
       b9.a(this.E);
       return;
    }
    public void N4(KwaiImageView p0,KwaiImageView p1){
       c.a(this, p0, p1);
    }
    public final void P8(View p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "18")) {
          return;
       }
       if (p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          p0.getLayoutParams().bottomMargin = a1.e((float)p1);
          p0.setLayoutParams(p0.getLayoutParams());
       }
       return;
    }
    public void R5(KwaiImageView p0,List p1){
       e.e(this, p0, p1);
    }
    public void R7(KwaiImageView p0,List p1,int p2){
       e.c(this, p0, p1, p2);
    }
    public abstract boolean R8(LiveConditionRedPacketInfo p0);
    public void S4(KwaiImageView p0,List p1){
       e.a(this, p0, p1);
    }
    public void S8(long p0){
    }
    public void V8(LiveConditionRedPacketInfo p0){
    }
    public b W0(LiveConditionRedPacketInfo p0){
       return c.c(this, p0);
    }
    public final void W8(LiveConditionRedPacketInfo p0,Message p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "13")) {
          return;
       }
       if (this.R8(p0)) {
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "16")) {
             this.P8(this.w, 81);
             this.x.setText(y.b(this.t, this.q, p0, p1));
          }
       }else if(PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "17")){
          uob = (p0.q.getValue() == null)? null: p0.q.getValue().booleanValue();
          if (uob) {
             this.z.setText(y.c(this.t, this.q, p0, p1));
          }else {
             this.z.setText(y.b(this.t, this.q, p0, p1));
          }
       }
       return;
    }
    public void X8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       this.B.setText(a1.p(R.string.arg_RES_7f101e67));
       return;
    }
    public void Y8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       this.B.setVisibility(0);
       if (p0.s.getValue() == null) {
          return;
       }
       this.B.setText(a1.q(R.string.arg_RES_7f1025f3, p0.s.getValue().intValue()));
       return;
    }
    public final void Z8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       this.B.setVisibility(0);
       if (this.R8(p0)) {
          a uoa = new a(this, p0);
          this.D = uoa;
          p0 = p0.t;
          this.C = p0;
          p0.observeForever(uoa);
       }else {
          this.X8(p0);
       }
       return;
    }
    public final void a9(LiveConditionRedPacketInfo p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "11")) {
          return;
       }
       int i = 0;
       if (this.R8(p0)) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "14") && this.R8(p0)) {
             this.w.setVisibility(i);
             this.w.setClickable(i);
             this.H7(this.y, this.x, LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_CURRENT_INFO_TIP_ICON_LARGE);
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, this, uob, "15") || this.R8(p0)){
          if (p0.q.getValue() != null && p0.q.getValue().booleanValue()) {
             this.w.setVisibility(8);
          }else {
             this.w.setVisibility(i);
             this.G.onNext(p0);
             d.i(p0.x.a(), p0.c, RedPacketType.RED_PACKET_TYPE_CONDITION, a.a(p0.b), e.a(this.p, p0.c, p0.b, LiveRedPacketAction.RED_PACK_POPUP_GRAB_SHOW.name()), LiveRedPacketGrabButtonType.JOIN_BUTTON);
             this.w.setClickable(true);
             this.H7(this.y, this.x, LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_CURRENT_INFO_TIP_ICON_LARGE);
             this.P8(this.w, 81);
             b tx = this.x;
             String str = PatchProxy.apply(null, this, uob, "19");
             if (str != PatchProxyResult.class) {
             }else {
                str = a1.p(R.string.arg_RES_7f1028a2);
             }
             tx.setText(str);
             e0 page = this.p.h.getPage();
             ClientContent$LiveStreamPackage liveStreamPa = this.p.h.a();
             LiveConditionRedPacketInfo c = p0.c;
             if (!PatchProxy.applyVoidThreeRefs(page, liveStreamPa, c, null, u.class, "20")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "COMMON_RED_PACKET_JOIN_BUTTON";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                ClientContent$RedPackPackage redPackPacka = new ClientContent$RedPackPackage();
                uContentPack.redPackage = redPackPacka;
                redPackPacka.redPackId = c;
                u1.C0("", page, 9, uElementPack, uContentPack);
             }
             this.w.setOnClickListener(new g(this, p0));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a1b6e);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_condition_red_packet_atmosphere_bottom_image_view);
       this.v = kwaiImageVie;
       kwaiImageVie.setVisibility(8);
       this.w = m1.f(p0, 0x7f0a1b80);
       this.x = m1.f(p0, 0x7f0a1b81);
       this.y = m1.f(p0, 0x7f0a1b82);
       m1.f(p0, R.id.live_condition_red_packet_panel_current_info_first_description_text_view).setVisibility(8);
       this.z = m1.f(p0, 0x7f0a1b7d);
       this.A = m1.f(p0, 0x7f0a1b7c);
       this.B = m1.f(p0, 0x7f0a1b7f);
       this.P8(this.z, a1.e(0));
       return;
    }
    public b getRedPacketSimpleExtra(){
       return c.d(this);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(t.class);
       this.q = this.q8(a.class);
       this.r = this.r8("CONDITION_RED_PACKET_FETCH_CURRENT_INFO_ID");
       this.s = this.r8("first-select-observable");
       return;
    }
    public LiveConditionRedPacketInfo n6(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.d(this.p, this.q);
    }
    public void y2(LiveConditionRedPacketInfo p0,m p1,String p2){
       c.e(this, p0, p1, p2);
    }
    public void y4(KwaiImageView p0,List p1){
       e.b(this, p0, p1);
    }
}
