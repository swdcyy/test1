package com.kuaishou.live.core.show.conditionredpacket.grab.share.a;
import gi2.d;
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
import u52.t;
import t45.d;
import brd.z;
import brd.t;
import f62.c;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f62.a;
import f62.b;
import ok.x;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.c;
import com.kuaishou.android.live.log.LiveLogTag;
import j62.a;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.TextView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import gi2.c;
import gi2.e;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Boolean;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.a$b;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import p91.m;
import lnc.a1;
import ekd.m1;
import android.widget.ImageView;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.a$a;
import androidx.recyclerview.widget.RecyclerView;
import d61.f0;
import dx1.b;
import mrd.c;
import u52.y;

public class a extends c implements d	// class@000aa4
{
    public KwaiImageView A;
    public KwaiImageView B;
    public KwaiImageView C;
    public KwaiImageView D;
    public KwaiImageView E;
    public m F;
    public LiveConditionRedPacketInfo G;
    public View H;
    public RecyclerView I;
    public c p;
    public t q;
    public a r;
    public t s;
    public final c t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public FrameLayout y;
    public TextView z;
    public static String sLivePresenterClassName = "LiveConditionRedPacketShareCurrentInfoBottomLayoutPresenter";

    public void a(){
       super();
       this.t = PublishSubject.g();
    }
    public void B3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       LiveConditionRedPacketInfo liveConditio = this.n6();
       if (liveConditio != null && liveConditio.z != null) {
          b uob = this.W0(liveConditio);
          a tB = this.B;
          List list = (uob != null)? uob.d(): objArray;
          this.R5(tB, list);
          tB = this.C;
          if (uob != null) {
             objArray = uob.c();
          }
          this.I4(tB, objArray);
          if (uob != null) {
             this.S4(this.D, uob.b());
             this.S4(this.E, uob.a());
          }
       }
    label_0046 :
       return;
    }
    public void E8(){
       Object[] objArray1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       this.F = this.q.a;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          LiveConditionRedPacketInfo liveConditio = this.n6();
          if (liveConditio != null && liveConditio.z != null) {
             b uob = this.W0(liveConditio);
             a tB = this.B;
             List list = (uob != null)? uob.d(): objArray;
             this.R5(tB, list);
             tB = this.C;
             list = (uob != null)? uob.c(): objArray;
             this.I4(tB, list);
             if (uob != null) {
                this.S4(this.D, uob.b());
                this.S4(this.E, uob.a());
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          this.P8(8);
          this.X7(this.p.observeOn(d.a).subscribe(new c(this), e.b));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          this.X7(c.a(this.s, this.t, new a(this), new b(this)));
       }
       uoa = this.r;
       b.d0(LiveLogTag.LIVE_CONDITION_RED_PACKET, "show share current dialog", "redPackId", uoa.b, "redPackType", Integer.valueOf(uoa.a));
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
    public final void P8(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       this.u.setVisibility(p0);
       this.v.setVisibility(p0);
       this.w.setVisibility(p0);
       this.x.setVisibility(p0);
       this.y.setVisibility(p0);
       this.H.setVisibility(p0);
       this.I.setVisibility(p0);
       return;
    }
    public void R5(KwaiImageView p0,List p1){
       e.e(this, p0, p1);
    }
    public void R7(KwaiImageView p0,List p1,int p2){
       e.c(this, p0, p1, p2);
    }
    public final void R8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "11")) {
          return;
       }
       if (p0) {
          this.y.setClickable(true);
          this.y.setOnClickListener(new a$b(this));
       }else {
          this.y.setClickable(false);
       }
       return;
    }
    public void S4(KwaiImageView p0,List p1){
       e.a(this, p0, p1);
    }
    public final void S8(){
       int i;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "13")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "14") && this.y.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = this.y.getLayoutParams();
          Object obj = PatchProxy.apply(objArray, this, uoa, "17");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             float f = 81.00f;
             if (this.G != null) {
                i = (this.F.e())? a1.e(f): a1.e(f);
             }else {
                i = a1.e(f);
             }
          }
          layoutParams.bottomMargin = i;
          uoa = this.y;
          uoa.setLayoutParams(uoa.getLayoutParams());
       }
       this.H7(this.A, this.z, LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_CURRENT_INFO_TIP_ICON_LARGE);
       return;
    }
    public b W0(LiveConditionRedPacketInfo p0){
       return c.c(this, p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a1b84);
       this.v = m1.f(p0, 0x7f0a1b6f);
       this.w = m1.f(p0, 0x7f0a1b71);
       this.x = m1.f(p0, 0x7f0a1b72);
       this.B = m1.f(p0, 0x7f0a1b83);
       this.C = m1.f(p0, 0x7f0a1b6e);
       this.D = m1.f(p0, 0x7f0a1b65);
       this.E = m1.f(p0, 0x7f0a1b64);
       this.D.setVisibility(8);
       this.E.setVisibility(8);
       this.y = m1.f(p0, 0x7f0a1b80);
       this.z = m1.f(p0, 0x7f0a1b81);
       this.A = m1.f(p0, 0x7f0a1b82);
       View view = m1.f(p0, R.id.live_condition_red_packet_invite_user_container);
       this.H = view;
       view.setOnClickListener(new a$a(this));
       RecyclerView recyclerView = m1.f(p0, R.id.live_condition_red_packet_panel_current_info_share_users_recycler_view);
       this.I = recyclerView;
       recyclerView.setOverScrollMode(2);
       this.I.setHorizontalFadingEdgeEnabled(true);
       f0.f(this.z, "sans-serif-medium");
       return;
    }
    public b getRedPacketSimpleExtra(){
       return c.d(this);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("CONDITION_RED_PACKET_FETCH_CURRENT_INFO_ID");
       this.q = this.q8(t.class);
       this.r = this.q8(a.class);
       this.s = this.r8("first-select-observable");
       return;
    }
    public LiveConditionRedPacketInfo n6(){
       Object obj = PatchProxy.apply(null, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.d(this.q, this.r);
    }
    public void y2(LiveConditionRedPacketInfo p0,m p1,String p2){
       c.e(this, p0, p1, p2);
    }
    public void y4(KwaiImageView p0,List p1){
       e.b(this, p0, p1);
    }
}
