package com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import gi2.d;
import im8.g;
import k51.c;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import hi2.b;
import java.util.List;
import hi2.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import gi2.f;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import android.view.View;
import va1.n0;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelValueInfoView;
import hi2.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import u52.t;
import com.kuaishou.live.common.core.component.follow.cache.c;
import p91.m;
import brd.t;
import b62.j;
import b62.i;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import b62.k;
import j62.a;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import gi2.c;
import gi2.e;
import mkc.b;
import mkc.c;
import i62.t$c;
import b62.l;
import b62.m;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView;
import lnc.a1;
import k2b.e0;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import tw1.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import ekd.m1;
import android.widget.ImageView;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i$b;
import b62.q;
import java.util.Map;
import java.util.HashMap;
import dx1.b;
import u52.y;

public abstract class i extends c implements d, g	// class@000a8b
{
    public View A;
    public View B;
    public m C;
    public LiveConditionRedPacketInfo D;
    public boolean E;
    public t p;
    public a q;
    public c r;
    public View s;
    public KwaiImageView t;
    public KwaiImageView u;
    public LiveConditionRedPacketPanelOwnerInfoView v;
    public TextView w;
    public LiveConditionRedPacketPanelValueInfoView x;
    public View y;
    public View z;
    public static String sLivePresenterClassName = "LiveConditionRedPacketBaseCurrentInfoTopLayoutPresenter";

    public void i(){
       super();
       this.r = PublishSubject.g();
    }
    public void B3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "9")) {
          return;
       }
       LiveConditionRedPacketInfo liveConditio = this.n6();
       if (liveConditio != null && liveConditio.z != null) {
          b uob = this.W0(liveConditio);
          i tt = this.t;
          if (uob != null) {
             objArray = uob.d();
          }
          this.R5(tt, objArray);
          b.Z(LiveLogTag.LIVE_RED_PACKET_SKIN, "bindAtmosphereWithCDNUrls height:"+n0.h(this.t)+"->width:"+n0.i(this.t));
          if (uob != null) {
             this.S4(this.u, uob.b());
             i tx = this.x;
             b h = uob.h;
             Objects.requireNonNull(tx);
             if (!PatchProxy.applyVoidOneRefs(h, tx, LiveConditionRedPacketPanelValueInfoView.class, "6") && (h != null && !TextUtils.x(h.a))) {
                Integer integer = h.a();
                if (integer != null) {
                   Drawable background = tx.C.getBackground();
                   if (background instanceof GradientDrawable) {
                      background.setColor(integer.intValue());
                   }
                   Drawable background1 = tx.D.getBackground();
                   if (background1 instanceof GradientDrawable) {
                      background1.setColor(integer.intValue());
                   }
                }
             }
          label_00a2 :
             if (this.B instanceof TextView && uob.f() != null) {
                this.B.setTextColor(uob.f().intValue());
             }
          }
       }
    label_00bd :
       return;
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "2")) {
          return;
       }
       this.C = this.p.a;
       this.Y8();
       if (!PatchProxy.applyVoid(objArray, this, oi, "5")) {
          this.Z8(false, true);
          this.X7(c.b().d(this.C.d()).take(1).subscribe(new j(this), new i(this)));
          this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new k(this)));
       }
       this.P8();
       if (!PatchProxy.applyVoid(objArray, this, oi, "9")) {
          LiveConditionRedPacketInfo liveConditio = this.n6();
          if (liveConditio != null && liveConditio.z != null) {
             b uob = this.W0(liveConditio);
             i tt = this.t;
             if (uob != null) {
                objArray = uob.d();
             }
             this.R5(tt, objArray);
             b.Z(LiveLogTag.LIVE_RED_PACKET_SKIN, "bindAtmosphereWithCDNUrls height:"+n0.h(this.t)+"->width:"+n0.i(this.t));
             if (uob != null) {
                this.S4(this.u, uob.b());
                i tx = this.x;
                b h = uob.h;
                Objects.requireNonNull(tx);
                if (!PatchProxy.applyVoidOneRefs(h, tx, LiveConditionRedPacketPanelValueInfoView.class, "6") && (h != null && !TextUtils.x(h.a))) {
                   Integer integer = h.a();
                   if (integer != null) {
                      Drawable background = tx.C.getBackground();
                      if (background instanceof GradientDrawable) {
                         background.setColor(integer.intValue());
                      }
                      Drawable background1 = tx.D.getBackground();
                      if (background1 instanceof GradientDrawable) {
                         background1.setColor(integer.intValue());
                      }
                   }
                }
             label_0105 :
                if (this.B instanceof TextView && uob.f() != null) {
                   this.B.setTextColor(uob.f().intValue());
                }
             }
          }
       }
    label_0120 :
       oi = this.q;
       b.d0(LiveLogTag.LIVE_CONDITION_RED_PACKET, "show current dialog", "redPackId", oi.b, "redPackType", Integer.valueOf(oi.a));
       return;
    }
    public void H7(KwaiImageView p0,TextView p1,LiveRedPacketResourcePathConstant p2){
       c.b(this, p0, p1, p2);
    }
    public void I4(KwaiImageView p0,List p1){
       e.d(this, p0, p1);
    }
    public void N4(KwaiImageView p0,KwaiImageView p1){
       c.a(this, p0, p1);
    }
    public void P8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "15")) {
          this.a9(false);
          this.A.setVisibility(8);
          this.y.setVisibility(8);
          c.h(this.z, b.d);
       }
       i tq = this.q;
       this.X7(this.p.c.d(tq.a, tq.b).subscribeOn(d.b).observeOn(d.a).subscribe(new l(this), new m(this)));
       return;
    }
    public void R5(KwaiImageView p0,List p1){
       e.e(this, p0, p1);
    }
    public void R7(KwaiImageView p0,List p1,int p2){
       e.c(this, p0, p1, p2);
    }
    public abstract String R8();
    public void S4(KwaiImageView p0,List p1){
       e.a(this, p0, p1);
    }
    public abstract int S8();
    public abstract User V8();
    public b W0(LiveConditionRedPacketInfo p0){
       return c.c(this, p0);
    }
    public LiveConditionRedPacketInfo W8(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i tq = this.q;
       return this.p.c.l(tq.a, tq.b);
    }
    public boolean X8(){
       Object obj = PatchProxy.apply(null, this, i.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.C.e() ^ 0x01);
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       User user = this.V8();
       if (user != null) {
          this.v.a(user);
       }
       this.v.b(this.R8());
       return;
    }
    public void Z8(boolean p0,boolean p1){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oi, "11")) {
          return;
       }
       if (!this.X8()) {
          this.w.setVisibility(8);
          return;
       }else {
          i = 0;
          this.w.setVisibility(i);
          Drawable uDrawable = (p0)? a1.f(R.drawable.arg_RES_7f081434): a1.f(R.drawable.arg_RES_7f081481);
          i tw = this.w;
          String str = (p0)? a1.p(R.string.arg_RES_7f101021): a1.p(R.string.arg_RES_7f100f8f);
          tw.setText(str);
          this.w.setClickable((p0 ^ 0x01));
          this.w.setEnabled((p0 ^ 0x01));
          tw = this.w;
          float f = (p0)? 0.30f: 0x3f800000;
          tw.setAlpha(f);
          uDrawable.setBounds(i, i, a1.e(10.00f), a1.e(10.00f));
          this.w.setCompoundDrawables(uDrawable, null, null, null);
          this.s.requestLayout();
          this.s.invalidate();
          if (!p1 && (!p0 && (this.E == null && this.q.a == 39))) {
             e0 page = this.p.h.getPage();
             ClientContent$LiveStreamPackage liveStreamPa = this.p.h.a();
             oi = this.q;
             a b = oi.b;
             a a = oi.a;
             if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(page, liveStreamPa, b, Integer.valueOf(a), null, d.class, "14")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "RED_PACK_PANEL_FOLLOW_BUTTON";
                u1.C0("", page, 9, uElementPack, d.a(liveStreamPa, b, a));
             }
             this.E = true;
          }
       label_00e4 :
          return;
       }
    }
    public void a9(boolean p0){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "16")) {
          return;
       }
       oi = this.w;
       i = 0;
       int i1 = (this.X8() && p0)? 0: 8;
       oi.setVisibility(i1);
       oi = this.x;
       if (!p0) {
          i = 8;
       }
       oi.setVisibility(i);
       return;
    }
    public void b9(LiveConditionRedPacketInfo p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "12")) {
          return;
       }
       if (p0.u.getValue() != null && p0.v.getValue() != null) {
          i tx = this.x;
          i = p0.u.getValue().intValue();
          Objects.requireNonNull(tx);
          if (!PatchProxy.isSupport(LiveConditionRedPacketPanelValueInfoView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tx, LiveConditionRedPacketPanelValueInfoView.class, "3")) {
             if (i < 0) {
                tx.B.setVisibility(8);
             }else {
                tx.B.setVisibility(0);
                tx.B.setText(String.valueOf(i));
             }
          }
          tx = this.x;
          int i1 = p0.v.getValue().intValue();
          Objects.requireNonNull(tx);
          if (!PatchProxy.isSupport(LiveConditionRedPacketPanelValueInfoView.class) || !PatchProxy.applyVoidTwoRefs("x", Integer.valueOf(i1), tx, LiveConditionRedPacketPanelValueInfoView.class, "4")) {
             if (i1 < 0) {
                tx.D.setVisibility(8);
             }else {
                tx.D.setVisibility(0);
                tx.C.setText("x"+i1);
             }
          }
       }
    label_00a9 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1b73);
       this.t = m1.f(p0, 0x7f0a1b83);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_condition_red_packet_atmosphere_top_image_view);
       this.u = kwaiImageVie;
       kwaiImageVie.setVisibility(8);
       this.v = m1.f(p0, 0x7f0a1b7a);
       this.w = m1.f(p0, 0x7f0a1b77);
       this.x = m1.f(p0, 0x7f0a1b85);
       this.y = m1.f(p0, 0x7f0a1b80);
       this.z = m1.f(p0, 0x7f0a1b79);
       this.A = m1.f(p0, 0x7f0a1b78);
       this.B = m1.f(p0, 0x7f0a1b7b);
       this.w.setOnClickListener(new i$a(this));
       this.B.setOnClickListener(new i$b(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new q());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public b getRedPacketSimpleExtra(){
       return c.d(this);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.q8(t.class);
       this.q = this.q8(a.class);
       return;
    }
    public LiveConditionRedPacketInfo n6(){
       Object obj = PatchProxy.apply(null, this, i.class, "8");
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
