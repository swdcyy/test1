package com.kuaishou.live.core.show.conditionredpacket.grab.share.c;
import gi2.d;
import k51.c;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import hi2.b;
import hi2.c;
import java.lang.Integer;
import android.widget.TextView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiImageView;
import gi2.f;
import u52.t;
import t45.d;
import brd.z;
import brd.t;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import gi2.c;
import gi2.e;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import p91.m;
import java.lang.Boolean;
import z52.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import tw1.d;
import android.widget.ImageView;
import android.graphics.Typeface;
import f62.d;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import l12.d;
import va1.f0;
import dx1.b;
import mrd.c;
import j62.a;
import u52.y;

public class c extends c implements d	// class@000aa6
{
    public View A;
    public KwaiImageView B;
    public RecyclerView C;
    public h D;
    public MutableLiveData E;
    public Observer F;
    public LiveConditionRedPacketInfo G;
    public int H;
    public boolean I;
    public c p;
    public a q;
    public t r;
    public m s;
    public TextView t;
    public TextView u;
    public TextView v;
    public ImageView w;
    public TextView x;
    public TextView y;
    public KwaiImageView z;
    public static final int J = 0;
    public static String sLivePresenterClassName = "LiveConditionRedPacketShareCurrentInfoPresenter";

    static {
       c.J = a1.e(156.00f);
    }
    public void c(){
       super();
       this.H = Integer.MIN_VALUE;
       this.I = true;
    }
    public void B3(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       LiveConditionRedPacketInfo liveConditio = this.n6();
       if (liveConditio != null && liveConditio.z != null) {
          b uob = this.W0(liveConditio);
          if (uob != null && uob.e() != null) {
             Integer integer = uob.e().b();
             if (integer != null) {
                this.y.setTextColor(integer.intValue());
             }
             List list = uob.e().a();
             if (!q.f(list)) {
                this.y4(this.z, list);
             }
          }
       }
    label_0048 :
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.s = this.r.a;
       this.X7(this.p.observeOn(d.a).subscribe(new b(this)));
       return;
    }
    public void H7(KwaiImageView p0,TextView p1,LiveRedPacketResourcePathConstant p2){
       c.b(this, p0, p1, p2);
    }
    public void I4(KwaiImageView p0,List p1){
       e.d(this, p0, p1);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tE = this.E;
       if (tE != null) {
          c tF = this.F;
          if (tF != null) {
             tE.removeObserver(tF);
          }
       }
       return;
    }
    public void N4(KwaiImageView p0,KwaiImageView p1){
       c.a(this, p0, p1);
    }
    public final String P8(){
       String str1;
       Object[] objArray;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       c obj = PatchProxy.apply(null, this, uoc, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.G;
       String str = "";
       if (obj == null) {
          return str;
       }
       if (this.H == Integer.MIN_VALUE) {
          this.H = (int)TimeUnit.MILLISECONDS.toSeconds((obj.d - this.s.s()));
       }
       if (this.H < null) {
          return str;
       }else if(this.s.e()){
          obj = this.H;
          if (PatchProxy.isSupport(uoc)) {
             str1 = PatchProxy.applyOneRefs(Integer.valueOf(obj), this, uoc, "19");
             if (str1 != patchProxyRe) {
             }else if(obj < 60){
                objArray = new Object[]{this.R8(obj)};
                str1 = String.format(a1.p(R.string.arg_RES_7f1025dd), objArray);
             }else {
                objArray = new Object[]{this.R8(obj)};
                str1 = String.format(a1.p(R.string.arg_RES_7f1025f2), objArray);
             }
          }else {
             goto label_0057 ;
          }
          return str1;
       }else if(this.G.q.getValue().booleanValue()){
          obj = this.H;
          if (PatchProxy.isSupport(uoc)) {
             str1 = PatchProxy.applyOneRefs(Integer.valueOf(obj), this, uoc, "20");
             if (str1 != patchProxyRe) {
             }else if(obj <= null){
                obj = null;
             }
             if (obj < 60) {
                objArray = new Object[]{this.R8(obj)};
                str1 = String.format(a1.p(R.string.arg_RES_7f1025de), objArray);
             }else {
                objArray = new Object[]{this.R8(obj)};
                str1 = String.format(a1.p(R.string.arg_RES_7f1025e1), objArray);
             }
          }else {
             goto label_00a8 ;
          }
          return str1;
       }else {
          String value = this.G.t.getValue();
          c tH = this.H;
          if (PatchProxy.isSupport(uoc)) {
             str1 = PatchProxy.applyTwoRefs(value, Integer.valueOf(tH), this, uoc, "21");
             if (str1 != patchProxyRe) {
             }else {
             label_00f6 :
                int i = 2;
                if (tH < 60) {
                   objArray1 = new Object[i];
                   objArray1[0] = value;
                   objArray1[1] = Integer.valueOf(tH);
                   str1 = String.format(a1.p(R.string.arg_RES_7f101fdd), objArray1);
                }else {
                   objArray1 = new Object[i];
                   objArray1[0] = value;
                   objArray1[1] = Integer.valueOf((tH / 60));
                   str1 = String.format(a1.p(R.string.arg_RES_7f101fdc), objArray1);
                }
             }
          }else {
             goto label_00f6 ;
          }
          return str1;
       }
    }
    public void R5(KwaiImageView p0,List p1){
       e.e(this, p0, p1);
    }
    public void R7(KwaiImageView p0,List p1,int p2){
       e.c(this, p0, p1, p2);
    }
    public final String R8(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < 60) {
          return String.valueOf(p0);
       }else {
          return String.valueOf((p0 / 60));
       }
    }
    public void S4(KwaiImageView p0,List p1){
       e.a(this, p0, p1);
    }
    public final void S8(LiveConditionRedPacketInfo p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "7")) {
          return;
       }
       if (a.a(p0)) {
          if (this.I != null) {
             this.I = false;
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "26")) {
                d.i(this.s.a(), p0.c, 2);
             }
          }
          this.v.setVisibility(false);
          this.w.setVisibility(false);
          this.v.setText(R.string.arg_RES_7f1040c4);
          this.v.setTypeface(Typeface.defaultFromStyle(1));
          this.v.setOnClickListener(new d(this, p0));
       }else {
          this.v.setVisibility(8);
          this.w.setVisibility(8);
       }
       return;
    }
    public final void V8(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       if (p0.q.getValue().booleanValue()) {
          this.X8();
       }else {
          this.u.setVisibility(8);
       }
       return;
    }
    public b W0(LiveConditionRedPacketInfo p0){
       return c.c(this, p0);
    }
    public final void W8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "14")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uoc, "17");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(this.G == null){
          if (this.s.e()) {
             objArray = this.y;
          }else if(this.G.q.getValue().booleanValue()){
             objArray = this.t;
          }
       }
       if (objArray != null) {
          objArray.setVisibility(0);
          objArray.setText(this.P8());
       }
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       Object[] objArray = new Object[]{this.G.t.getValue()};
       this.u.setText(String.format(a1.p(R.string.arg_RES_7f1025f3), objArray)+" £ü "+this.G.m);
       return;
    }
    public final void Y8(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "16")) {
          return;
       }
       String str = this.P8();
       if (!PatchProxy.applyVoidOneRefs(str, this, uoc, "23")) {
          if (TextUtils.x(str)) {
             this.x.setVisibility(8);
          }else {
             this.x.setVisibility(0);
             this.x.setText(str);
          }
       }
       return;
    }
    public final void Z8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "8")) {
          return;
       }
       if (this.s.e()) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "10")) {
             if (!PatchProxy.applyVoid(objArray, this, uoc, "12")) {
                if (this.s.e()) {
                   this.v.setMaxWidth(c.J);
                }else {
                   this.v.setMaxWidth(Integer.MAX_VALUE);
                }
             }
             this.x.setText(this.G.m);
          }
       }else if(this.G.q.getValue().booleanValue()){
          this.X8();
       }else {
          this.Y8();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a1b84);
       this.u = m1.f(p0, 0x7f0a1b6f);
       this.v = m1.f(p0, 0x7f0a1b71);
       this.w = m1.f(p0, 0x7f0a1b70);
       this.x = m1.f(p0, 0x7f0a1b72);
       this.y = m1.f(p0, 0x7f0a1b81);
       this.z = m1.f(p0, 0x7f0a1b82);
       this.C = m1.f(p0, 0x7f0a1b7e);
       this.A = m1.f(p0, 0x7f0a1b67);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_condition_red_packet_invite_user_container_image_view);
       this.B = kwaiImageVie;
       f0.a(kwaiImageVie, LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_CURRENT_INFO_INVITE_USER);
       return;
    }
    public b getRedPacketSimpleExtra(){
       return c.d(this);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("CONDITION_RED_PACKET_FETCH_CURRENT_INFO_ID");
       this.q = this.q8(a.class);
       this.r = this.q8(t.class);
       return;
    }
    public LiveConditionRedPacketInfo n6(){
       Object obj = PatchProxy.apply(null, this, c.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.d(this.r, this.q);
    }
    public void y2(LiveConditionRedPacketInfo p0,m p1,String p2){
       c.e(this, p0, p1, p2);
    }
    public void y4(KwaiImageView p0,List p1){
       e.b(this, p0, p1);
    }
}
