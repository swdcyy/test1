package com.kuaishou.live.core.show.conditionredpacket.grab.base.e;
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
import com.kuaishou.live.core.show.conditionredpacket.grab.base.d;
import b62.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b62.c;
import b62.d;
import ok.x;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.c;
import b62.f;
import android.widget.TextView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import gi2.c;
import java.util.List;
import gi2.f;
import gi2.e;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import android.os.Message;
import p91.m;
import j62.a;
import u52.y;
import java.lang.CharSequence;
import java.lang.Boolean;
import brd.y;
import nt5.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.Enum;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketGrabButtonType;
import h62.d;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.e$a;
import android.view.View$OnClickListener;
import hi2.b;
import com.yxcorp.utility.TextUtils;
import java.util.Locale;
import java.lang.Long;
import ekd.m1;
import android.widget.ImageView;
import dx1.b;
import mrd.c;
import com.kwai.robust.PatchProxyResult;

public abstract class e extends c implements d	// class@000a85
{
    public TextView A;
    public TextView B;
    public ImageView C;
    public TextView D;
    public MutableLiveData E;
    public Observer F;
    public LiveConditionRedPacketInfo G;
    public b H;
    public t p;
    public a q;
    public c r;
    public t s;
    public final c t;
    public m u;
    public KwaiImageView v;
    public KwaiImageView w;
    public View x;
    public TextView y;
    public KwaiImageView z;
    public static String sLivePresenterClassName = "LiveConditionRedPacketBaseCurrentInfoBottomLayoutPresenter";

    public void e(){
       super();
       this.t = PublishSubject.g();
    }
    public void B3(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.N4(this.v, this.w);
       return;
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "2")) {
          return;
       }
       this.u = this.p.a;
       if (!PatchProxy.applyVoid(objArray, this, uoe, "7")) {
          this.X7(this.r.observeOn(d.a).subscribe(new d(this), new e(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "8")) {
          this.X7(c.a(this.s, this.t, new c(this), new d(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          this.N4(this.v, this.w);
       }
       this.X7(this.p.l.subscribe(new f(this)));
       return;
    }
    public void H7(KwaiImageView p0,TextView p1,LiveRedPacketResourcePathConstant p2){
       c.b(this, p0, p1, p2);
    }
    public void I4(KwaiImageView p0,List p1){
       e.d(this, p0, p1);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tE = this.E;
       if (tE != null) {
          e tF = this.F;
          if (tF != null) {
             tE.removeObserver(tF);
          }
       }
       return;
    }
    public void N4(KwaiImageView p0,KwaiImageView p1){
       c.a(this, p0, p1);
    }
    public final void P8(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "12")) {
          return;
       }
       if (this.x.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          this.x.getLayoutParams().bottomMargin = a1.e((float)p0);
          e tx = this.x;
          tx.setLayoutParams(tx.getLayoutParams());
       }
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
    public final void S8(LiveConditionRedPacketInfo p0,Message p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "11")) {
          return;
       }
       if (this.u.e()) {
          this.P8(81);
          this.y.setText(y.b(this.u, this.q, p0, p1));
       }
       return;
    }
    public final void V8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       if (this.u.e()) {
          return;
       }
       if (p0.q.getValue() != null && p0.q.getValue().booleanValue()) {
          this.x.setVisibility(8);
       }else {
          this.x.setVisibility(0);
          this.t.onNext(p0);
          d.i(p0.x.a(), p0.c, RedPacketType.RED_PACKET_TYPE_CONDITION, a.a(p0.b), e.a(this.p, p0.c, p0.b, LiveRedPacketAction.RED_PACK_POPUP_GRAB_SHOW.name()), LiveRedPacketGrabButtonType.JOIN_BUTTON);
          this.x.setClickable(true);
          this.H7(this.z, this.y, LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_CURRENT_INFO_TIP_ICON_LARGE);
          this.P8(81);
          this.y.setText(this.R8());
          this.x.setOnClickListener(new e$a(this, p0));
       }
       return;
    }
    public b W0(LiveConditionRedPacketInfo p0){
       return c.c(this, p0);
    }
    public final void W8(LiveConditionRedPacketInfo p0,Message p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "13")) {
          return;
       }
       if (p0.q.getValue() == null) {
          return;
       }
       boolean b = p0.q.getValue().booleanValue();
       int i = 8;
       if (this.u.e()) {
          this.A.setVisibility(i);
       }else {
          e tA = this.A;
          if (b) {
             i = 0;
          }
          tA.setVisibility(i);
          tA = this.A;
          String str = (b)? y.c(this.u, this.q, p0, p1): "";
          tA.setText(str);
       }
       return;
    }
    public void X8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "14")) {
          return;
       }
       LiveConditionRedPacketInfo k = p0.k;
       if (p0.q.getValue() == null) {
          this.B.setVisibility(8);
          return;
       }else {
          boolean b = p0.q.getValue().booleanValue();
          if (TextUtils.x(k) || b) {
             this.B.setVisibility(8);
             return;
          }else {
             this.B.setVisibility(0);
             this.B.setText(k);
             return;
          }
       }
    }
    public void Y8(LiveConditionRedPacketInfo p0,Message p1){
       String str;
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "15")) {
          return;
       }
       int i = 0;
       this.D.setVisibility(i);
       if (p0.s.getValue() == null) {
          return;
       }
       int i1 = p0.s.getValue().intValue();
       int i2 = 0x7f1025f3;
       if (this.u.e()) {
          this.D.setText(a1.q(i2, i1));
       }else if(p0.q.getValue() == null){
          return;
       }else {
          long l = y.e(this.u, this.q, p0, p1);
          if (l - 60 < 0) {
             str = a1.p(R.string.arg_RES_7f101fdd);
          }else {
             l = l / 60;
             str = a1.p(R.string.arg_RES_7f101fdc);
          }
          e tD = this.D;
          if (p0.q.getValue().booleanValue()) {
             str1 = a1.q(i2, i1);
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(i1),Long.valueOf(l)};
             str1 = String.format(Locale.US, str, objArray);
          }
          tD.setText(str1);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a1b6e);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_condition_red_packet_atmosphere_bottom_image_view);
       this.w = kwaiImageVie;
       kwaiImageVie.setVisibility(8);
       this.x = m1.f(p0, 0x7f0a1b80);
       this.y = m1.f(p0, 0x7f0a1b81);
       this.z = m1.f(p0, 0x7f0a1b82);
       this.A = m1.f(p0, 0x7f0a1b76);
       this.B = m1.f(p0, 0x7f0a1b7d);
       this.C = m1.f(p0, 0x7f0a1b7c);
       this.D = m1.f(p0, 0x7f0a1b7f);
       return;
    }
    public b getRedPacketSimpleExtra(){
       return c.d(this);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(t.class);
       this.q = this.q8(a.class);
       this.r = this.r8("CONDITION_RED_PACKET_FETCH_CURRENT_INFO_ID");
       this.s = this.r8("first-select-observable");
       return;
    }
    public LiveConditionRedPacketInfo n6(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
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
