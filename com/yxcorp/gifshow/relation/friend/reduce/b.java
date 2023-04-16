package com.yxcorp.gifshow.relation.friend.reduce.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uac.m;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import uac.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import k2b.u1;
import android.widget.TextView;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import androidx.fragment.app.Fragment;
import qa9.q;
import qa9.s;
import brd.t;
import uac.u;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import lu7.f;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;
import com.kwai.library.widget.popup.common.f;
import android.graphics.drawable.Drawable;
import y17.a;
import android.text.TextPaint;
import uac.q;
import android.view.View$OnClickListener;
import z1.a;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import tac.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import uac.s;
import uac.t;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.relation.friend.reduce.b$a;
import com.yxcorp.gifshow.relation.friend.reduce.b$b;
import m01.a;
import uac.r;
import android.view.View$OnTouchListener;

public class b extends PresenterV2	// class@0018d1
{
    public KwaiImageView A;
    public Fragment p;
    public User q;
    public BaseFeed r;
    public a s;
    public boolean t;
    public boolean u;
    public boolean v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    public void b(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       b tr = this.r;
       b tt = this.t;
       String str = this.W8();
       if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(tr, Boolean.valueOf(tt), str, null, m.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          i3 oi3 = i3.f();
          String str1 = (tt != null)? "hand": "auto";
          oi3.d("show_source", str1);
          if (str != null) {
             oi3.d("popup_type", str);
          }else {
             oi3.d("has_dislike_url", (Boolean.toString(k.a(tr))).toUpperCase());
          }
          uElementPack.params = oi3.e();
          uElementPack.action2 = "MOVE_OUT_CONFIRM_POPUP";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (tr != null) {
             uContentPack.photoPackage = w1.f(tr);
          }
          u1.C0("2939907", objArray, 10, uElementPack, uContentPack);
       }
       this.V8(this.w, this.q);
       this.P8(this.x, this.q);
       this.S8(this.z, this.q);
       g.b(this.A, this.q, HeadImageSize.MIDDLE);
       this.R8();
       this.v = false;
       if (this.s != null) {
          q oq = s.a(this.p);
          if (oq != null) {
             this.X7(oq.e().subscribe(new u(this), Functions.d()));
          }
       }
       return;
    }
    public void P8(TextView p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       int i = (p1.isFemale())? 0x7f1010eb: 0x7f1010f0;
       p0.setText(a1.r(i, f.c(p1)));
       return;
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "6")) {
          return;
       }
       if (k.a(this.r)) {
          b ty = this.y;
          SpannableStringBuilder spannableStr = PatchProxy.apply(objArray, objArray, k.class, "1");
          if (spannableStr != PatchProxyResult.class) {
          }else {
             spannableStr = new SpannableStringBuilder();
             String str = f.j().getString(R.string.arg_RES_7f1010dc);
             spannableStr.append(str);
             int i = str.length();
             Drawable uDrawable = a1.f(R.drawable.arg_RES_7f08221c);
             a uoa = new a(uDrawable, "P");
             int intrinsicWid = uDrawable.getIntrinsicWidth();
             uoa.c(intrinsicWid, uDrawable.getIntrinsicHeight());
             spannableStr.append("P");
             spannableStr.setSpan(uoa, i, (i + 1), 17);
          }
          ty.setText(spannableStr);
          this.y.getPaint().setFakeBoldText(true);
          this.y.setVisibility(0);
          this.y.setOnClickListener(new q(this));
       }
       return;
    }
    public void S8(TextView p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       int i = (p1.isFemale())? 0x7f1010e9: 0x7f1010ee;
       p0.setText(i);
       return;
    }
    public void V8(TextView p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       int i = (p1.isFemale())? 0x7f1010ed: 0x7f1010f2;
       p0.setText(i);
       return;
    }
    public String W8(){
       return null;
    }
    public void X8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       b.a(-1578665399).n(this.q, this.r, this.u, this.t, false).compose(this.getActivity().E2(ActivityEvent.DESTROY)).subscribe(new s(p0), new t(p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a3f2c);
       this.x = m1.f(p0, 0x7f0a0945);
       this.y = m1.f(p0, 0x7f0a2a6a);
       this.z = m1.f(p0, 0x7f0a3188);
       this.A = m1.f(p0, 0x7f0a35a8);
       this.z.setOnClickListener(new b$a(this));
       m1.f(p0, R.id.close).setOnClickListener(new b$b(this));
       m1.a(p0, a.b, R.id.operation_layout);
       p0.setOnTouchListener(new r(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("user");
       this.r = this.t8("base_photo");
       this.t = this.r8("is_manual").booleanValue();
       this.u = this.r8("is_result_toast_enabled").booleanValue();
       this.s = this.t8("result_consumer");
       return;
    }
}
