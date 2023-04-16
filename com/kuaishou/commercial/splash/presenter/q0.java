package com.kuaishou.commercial.splash.presenter.q0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.kuaishou.commercial.splash.presenter.r0;
import yx.j0;
import wkd.b;
import tjc.c;
import gz.s;
import android.widget.ImageView;
import android.content.Context;
import ekd.l1;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.yxcorp.utility.n;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import com.kuaishou.commercial.splash.presenter.p0;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.kwai.framework.player.core.b;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.CheckBox;
import gz.m4;
import android.widget.CompoundButton$OnCheckedChangeListener;
import tkd.b;
import tkd.d;
import nl9.h0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.app.Activity;
import com.kuaishou.commercial.splash.presenter.o0;
import erd.g;
import crd.b;
import brd.t;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import android.view.ViewStub;
import mrd.c;

public class q0 extends PresenterV2	// class@001602
{
    public View A;
    public View B;
    public c C;
    public f D;
    public r0 E;
    public boolean F;
    public b G;
    public Bitmap H;
    public int I;
    public int J;
    public f p;
    public f q;
    public AppCompatCheckBox r;
    public KwaiImageView s;
    public TextView t;
    public View u;
    public View v;
    public View w;
    public f x;
    public ViewStub y;
    public ViewStub z;

    public void q0(){
       super();
    }
    public void E8(){
       int b;
       q0 oq0 = q0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq0, "3")) {
          return;
       }
       r0 or0 = this.p.get();
       this.E = or0;
       if (or0 == null) {
          return;
       }
       String str = "SplashVideoCoverPresenter";
       int i = 0;
       if (this.u == null) {
          Object[] objArray1 = new Object[i];
          j0.c(str, "mMakeup is null", objArray1);
          return;
       }else if(!b.a(-1608526086).S()){
          return;
       }else {
          q0 tE = this.E;
          s n = tE.n;
          if (n > null) {
             s o = tE.o;
             if (o > null) {
                this.I = n;
                this.J = o;
             label_004f :
                if (tE.m != null) {
                   this.s.setVisibility(8);
                   if (!PatchProxy.applyVoid(objArray, this, oq0, "11")) {
                      b = (l1.a(this.getContext()))? 16: 0;
                      ConstraintLayout$LayoutParams layoutParams = this.v.getLayoutParams();
                      layoutParams.h = i;
                      layoutParams.k = -1;
                      layoutParams.topMargin = n.c(this.getContext(), ((float)b + 23.50f));
                      this.v.setLayoutParams(layoutParams);
                      layoutParams = this.w.getLayoutParams();
                      layoutParams.h = i;
                      layoutParams.k = -1;
                      layoutParams.topMargin = n.c(this.getContext(), (float)(b + 16));
                      this.w.setLayoutParams(layoutParams);
                      layoutParams = this.t.getLayoutParams();
                      layoutParams.h = i;
                      layoutParams.k = -1;
                      layoutParams.topMargin = n.c(this.getContext(), (float)(b + 31));
                      this.t.setLayoutParams(layoutParams);
                   }
                }else if(tE.l != null){
                   c.k(new p0(this));
                }
                if (!PatchProxy.applyVoid(objArray, this, oq0, "4")) {
                   Object[] objArray2 = new Object[i];
                   j0.f(str, "init", objArray2);
                   if (this.F == null) {
                      b = true;
                      this.F = b;
                      q0 tq = this.q;
                      if (tq != null) {
                         this.G = tq.get();
                      }
                      if (!PatchProxy.applyVoid(objArray, this, oq0, "5")) {
                         this.u.setVisibility(i);
                         Object[] objArray3 = new Object[i];
                         j0.f(str, "onInitMakeupView", objArray3);
                         ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.u, View.ALPHA, new float[2]{0,0x3f800000});
                         objectAnimat.setDuration(300);
                         objectAnimat.start();
                         if (this.E.S != null) {
                            r0 obj = PatchProxy.apply(objArray, this, oq0, "6");
                            if (obj != PatchProxyResult.class) {
                               i = obj.booleanValue();
                            }else {
                               q0 tx = this.x;
                               if (tx != null && tx.get().booleanValue()) {
                                  i = true;
                               }
                            }
                            if (!i) {
                               this.r.setClickable(b);
                               this.r.setOnCheckedChangeListener(new m4(this));
                            label_016c :
                               if (this.E.l == null) {
                                  this.P8();
                               }
                               if (!PatchProxy.applyVoid(objArray, this, oq0, "10")) {
                                  s h = this.E.h;
                                  obj = (!d.a(-536296199).hV() && !TextUtils.x(this.E.U))? this.E.U: "";
                                  if (TextUtils.x(h+obj)) {
                                     this.t.setVisibility(8);
                                  }else if(!TextUtils.x(h) && !TextUtils.x(obj)){
                                     this.t.setText(h+" | "+obj);
                                  }else {
                                     this.t.setText(h+obj);
                                  }
                               }
                               if (!PatchProxy.applyVoid(objArray, this, oq0, "7") && l1.a(this.getActivity())) {
                                  this.s.getLayoutParams().topMargin = n.c(this.getContext(), 32.00f);
                               }
                               this.X7(this.C.subscribe(new o0(this)));
                            }
                         }
                         this.r.setVisibility(8);
                         goto label_016c ;
                      }
                   }
                }
                return;
             }
          }
          this.I = 111;
          this.J = 45;
          goto label_004f ;
       }
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "8")) {
          return;
       }
       if (this.E.m != null) {
          this.s.setVisibility(8);
          return;
       }else {
          q0 tH = this.H;
          if (tH != null) {
             this.s.setImageBitmap(tH);
          }else {
             this.s.setImageResource(R.drawable.arg_RES_7f082377);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a3b08);
       this.s = p0.findViewById(0x7f0a172b);
       this.t = p0.findViewById(0x7f0a3adc);
       this.u = p0.findViewById(0x7f0a3b07);
       this.v = p0.findViewById(0x7f0a3aff);
       this.w = p0.findViewById(0x7f0a3996);
       this.y = p0.findViewById(0x7f0a3ad9);
       this.z = p0.findViewById(0x7f0a3aeb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "1")) {
          return;
       }
       this.p = this.x8("SPLASH_VIDEO_TYPE_PARAM");
       this.q = this.w8("SPLASH_VIDEO_PLAYER");
       this.x = this.w8("SPLASH_EYEMAX");
       this.C = this.r8("SPLASH_VIEW_SHOW_EVENT");
       this.D = this.x8("SPLASH_BUTTON_WIDTH");
       return;
    }
}
