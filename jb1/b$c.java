package jb1.b$c;
import ml8.d;
import y8c.r;
import jb1.b;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Boolean;
import jb1.b$a;
import java.lang.Enum;
import cb1.c;
import cb1.b;
import brd.t;
import jb1.h;
import erd.g;
import crd.b;
import jb1.g;
import jb1.f;
import jb1.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.c;
import u07.t$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import jb1.o;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import jb1.m;
import jb1.p;
import jb1.n;
import java.lang.Integer;
import cjd.e;
import erd.o;
import jb1.d;
import sfc.a;
import android.content.Context;
import jb1.q;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorFilter;
import b61.b;
import java.lang.CharSequence;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import android.view.View$OnClickListener;
import jb1.i;
import com.kwai.framework.model.user.UserExtraInfo;
import lnc.a1;
import java.util.List;
import nf1.c;
import com.yxcorp.utility.TextUtils;

public class b$c extends r implements d	// class@002b0a
{
    public KwaiImageView i;
    public TextView j;
    public ImageView k;
    public View l;
    public TextView m;
    public TextView n;
    public final a o;
    public final b p;
    public static String q = "LiveAdminListAdapter$LiveAdminPresenter";

    public void b$c(b p0){
       this.p = p0;
       super();
       this.o = new a();
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "2")) {
          return;
       }
       this.doBindView(this.y());
       return;
    }
    public final void H(UserInfo p0,boolean p1,LiveAdminPrivilege$PrivilegeType p2){
       if (PatchProxy.isSupport(b$c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, b$c.class, "15")) {
          return;
       }
       int i = b$a.a[p2.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   this.o.c(b.b().j(this.p.A, p0.mId, p1).subscribe(new h(this, p0, p1, p2)));
                }
             }else {
                this.o.c(b.b().e(this.p.A, p0.mId, p1).subscribe(new g(this, p0, p1, p2)));
             }
          }else {
             this.o.c(b.b().h(this.p.A, p0.mId, p1).subscribe(new f(this, p0, p1, p2)));
          }
       }else {
          this.o.c(b.b().g(this.p.A, p0.mId, p1).subscribe(new e(this, p0, p1, p2)));
       }
       return;
    }
    public final void I(UserInfo p0,boolean p1,LiveAdminPrivilege$PrivilegeType p2){
       if (PatchProxy.isSupport(b$c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, b$c.class, "16")) {
          return;
       }
       this.p.k0();
       RxBus.f.b(new c(p0.mId, p2, p1));
       return;
    }
    public final void J(UserInfo p0,boolean p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "13")) {
          return;
       }
       t$a uoa = new t$a(this.C());
       int i = (p1)? 0x7f102098: 0x7f10206f;
       uoa.W0(i);
       uoa.S0(R.string.arg_RES_7f101ff5);
       uoa.Q0(R.string.arg_RES_7f101f00);
       uoa.u0(new o(this, p1, p0));
       uoa.v(true);
       j.d(uoa);
       return;
    }
    public final void K(UserInfo p0,boolean p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "11")) {
          return;
       }
       t$a uoa = new t$a(this.C());
       int i = (p1)? 0x7f10209a: 0x7f102071;
       uoa.W0(i);
       uoa.S0(R.string.arg_RES_7f101ff5);
       uoa.Q0(R.string.arg_RES_7f101f00);
       uoa.u0(new m(this, p1, p0));
       uoa.v(true);
       j.d(uoa);
       return;
    }
    public final void L(UserInfo p0,boolean p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "14")) {
          return;
       }
       t$a uoa = new t$a(this.C());
       int i = (p1)? 0x7f10209f: 0x7f102076;
       uoa.W0(i);
       uoa.S0(R.string.arg_RES_7f101ff5);
       uoa.Q0(R.string.arg_RES_7f101f00);
       uoa.u0(new p(this, p1, p0));
       uoa.v(true);
       j.d(uoa);
       return;
    }
    public final void M(UserInfo p0,boolean p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "12")) {
          return;
       }
       t$a uoa = new t$a(this.C());
       int i = (p1)? 0x7f10209c: 0x7f102073;
       uoa.W0(i);
       uoa.S0(R.string.arg_RES_7f101ff5);
       uoa.Q0(R.string.arg_RES_7f101f00);
       uoa.u0(new n(this, p1, p0));
       uoa.v(true);
       j.d(uoa);
       return;
    }
    public final void O(UserInfo p0,int p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "6")) {
          return;
       }
       this.o.c(b.b().d(p0.mId, this.p.A, p0.isWatching()).map(new e()).subscribe(new d(this, p0), new a(this.C())));
       return;
    }
    public final void P(UserInfo p0,int p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "10")) {
          return;
       }
       this.o.c(b.b().f(p0.mId, p1, this.p.A, p0.isWatching()).map(new e()).subscribe(new q(this, p1, p0), new a(this.C())));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       this.l = m1.f(p0, 0x7f0a35a2);
       this.n = m1.f(p0, 0x7f0a019f);
       this.i = m1.f(p0, 0x7f0a0333);
       this.m = m1.f(p0, 0x7f0a019e);
       this.j = m1.f(p0, 0x7f0a2d10);
       this.k = m1.f(p0, 0x7f0a4479);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "4")) {
          return;
       }
       this.o.dispose();
       return;
    }
    public void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$c.class, "3")) {
          return;
       }
       UserInfo userInfo = this.t();
       g.d(this.i, userInfo, HeadImageSize.MIDDLE);
       int i = 1;
       if (this.F() >= (this.p.y + i)) {
          ColorMatrix uColorMatrix = new ColorMatrix();
          uColorMatrix.setSaturation(0);
          this.i.setColorFilter(new ColorMatrixColorFilter(uColorMatrix));
       }else {
          this.i.setColorFilter(objArray);
       }
       this.j.setText(b.c(userInfo));
       if (userInfo.isVerified != null) {
          this.k.setVisibility(0);
          if (userInfo.isBlueVerifiedType()) {
             this.k.setImageResource(R.drawable.arg_RES_7f0824a3);
          }else {
             this.k.setImageResource(R.drawable.arg_RES_7f0814c4);
          }
       }else {
          this.k.setVisibility(8);
       }
       if (userInfo.getAssistantType() == i && this.p.B != LiveApiParams$AssistantType.PUSHER) {
          this.y().setOnClickListener(objArray);
       }else {
          this.y().setOnClickListener(new i(this));
       }
       UserInfo mExtraInfo = userInfo.mExtraInfo;
       if (mExtraInfo != null) {
          this.m.setText(c.d(mExtraInfo.mIconSegments, a1.d(R.dimen.arg_RES_7f070283)));
       }
       if (userInfo.isWatching() || TextUtils.x(userInfo.mExtraInfo.mAdminLastVisitDisplay)) {
          this.n.setVisibility(8);
       }else {
          this.n.setVisibility(0);
          this.n.setText(userInfo.mExtraInfo.mAdminLastVisitDisplay);
       }
       return;
    }
}
