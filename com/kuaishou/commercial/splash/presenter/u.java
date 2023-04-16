package com.kuaishou.commercial.splash.presenter.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import gz.u2;
import gz.s;
import yx.j0;
import android.widget.ImageView;
import android.content.Context;
import ekd.l1;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.yxcorp.utility.n;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import com.kuaishou.commercial.splash.presenter.t;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.kuaishou.commercial.splash.presenter.r;
import erd.g;
import crd.b;
import brd.t;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewStub;
import mrd.c;

public class u extends PresenterV2	// class@00160c
{
    public ViewStub A;
    public View B;
    public View C;
    public u2 D;
    public boolean E;
    public Bitmap F;
    public int G;
    public int H;
    public f p;
    public f q;
    public c r;
    public f s;
    public View t;
    public View u;
    public View v;
    public TextView w;
    public KwaiImageView x;
    public TextView y;
    public ViewStub z;

    public void u(){
       super();
       this.y = null;
    }
    public void E8(){
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "3")) {
          return;
       }
       u2 ou2 = this.p.get();
       this.D = ou2;
       if (ou2 != null && ou2.W == 2) {
          s n = ou2.n;
          if (n > null) {
             s o = ou2.o;
             if (o > null) {
                this.G = n;
                this.H = o;
             label_0034 :
                if (!PatchProxy.applyVoid(objArray, this, ou, "4")) {
                   int i = 0;
                   Object[] objArray1 = new Object[i];
                   j0.f("SplashImageFullScreelCoverPresenter", "init", objArray1);
                   if (this.E == null) {
                      this.E = true;
                      u tD = this.D;
                      if (tD.m != null) {
                         this.x.setVisibility(8);
                         if (!PatchProxy.applyVoid(objArray, this, ou, "13")) {
                            int i1 = (l1.a(this.getContext()))? 16: 0;
                            ConstraintLayout$LayoutParams layoutParams = this.u.getLayoutParams();
                            layoutParams.h = i;
                            layoutParams.k = -1;
                            layoutParams.topMargin = n.c(this.getContext(), ((float)i1 + 23.50f));
                            this.u.setLayoutParams(layoutParams);
                            layoutParams = this.v.getLayoutParams();
                            layoutParams.h = i;
                            layoutParams.k = -1;
                            layoutParams.topMargin = n.c(this.getContext(), (float)(i1 + 16));
                            this.v.setLayoutParams(layoutParams);
                            layoutParams = this.w.getLayoutParams();
                            layoutParams.h = i;
                            layoutParams.k = -1;
                            layoutParams.topMargin = n.c(this.getContext(), (float)(i1 + 31));
                            this.w.setLayoutParams(layoutParams);
                         }
                      }else if(tD.l != null){
                         c.k(new t(this));
                      }
                      if (!PatchProxy.applyVoid(objArray, this, ou, "5")) {
                         Object[] objArray2 = new Object[i];
                         j0.f("SplashImageFullScreelCoverPresenter", "onInitMakeupView", objArray2);
                         ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.t, View.ALPHA, new float[2]{0,0x3f800000});
                         objectAnimat.setDuration(300);
                         objectAnimat.start();
                         this.X7(this.r.subscribe(new r(this)));
                      }
                   }
                }
             }
          }
          this.G = 111;
          this.H = 45;
          goto label_0034 ;
       }
    label_0112 :
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, u.class, "9")) {
          return;
       }
       if (this.D.m != null) {
          this.x.setVisibility(8);
          return;
       }else {
          u tF = this.F;
          if (tF != null) {
             this.x.setImageBitmap(tF);
          }else {
             this.x.setImageResource(R.drawable.arg_RES_7f082377);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.t = p0.findViewById(0x7f0a137d);
       this.u = p0.findViewById(0x7f0a3aff);
       this.v = p0.findViewById(0x7f0a3996);
       this.w = p0.findViewById(0x7f0a3add);
       this.x = p0.findViewById(0x7f0a172b);
       this.z = p0.findViewById(0x7f0a3ad9);
       this.A = p0.findViewById(0x7f0a3aeb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.p = this.x8("SPLASH_IMAGE_TYPE_PARAM");
       this.q = this.x8("SPLASH_AD_LOG");
       this.r = this.r8("SPLASH_VIEW_SHOW_EVENT");
       this.s = this.x8("SPLASH_BUTTON_WIDTH");
       return;
    }
}
