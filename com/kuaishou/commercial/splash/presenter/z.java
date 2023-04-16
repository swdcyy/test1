package com.kuaishou.commercial.splash.presenter.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import gz.u2;
import gz.s;
import android.widget.ImageView;
import com.kuaishou.commercial.splash.presenter.y;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.kuaishou.commercial.splash.presenter.v;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import android.widget.TextView;
import android.view.ViewStub;
import mrd.c;
import io.reactivex.subjects.PublishSubject;

public class z extends PresenterV2	// class@001617
{
    public u2 A;
    public Bitmap B;
    public int C;
    public int D;
    public f p;
    public f q;
    public c r;
    public PublishSubject s;
    public ViewGroup t;
    public TextView u;
    public ViewStub v;
    public TextView w;
    public View x;
    public KwaiImageView y;
    public View z;

    public void z(){
       super();
       this.C = 166;
       this.D = 55;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       u2 ou2 = this.p.get();
       this.A = ou2;
       if (ou2 != null && ou2.W != 2) {
          s n = ou2.n;
          if (n > null) {
             s o = ou2.o;
             if (o > null) {
                this.C = n;
                this.D = o;
             }
          }
          if (ou2.m != null) {
             this.y.setVisibility(8);
          }else if(ou2.l != null){
             c.k(new y(this));
          }
          this.X7(this.r.subscribe(new v(this)));
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, z.class, "5")) {
          return;
       }
       ImageView imageView = this.t.findViewById(R.id.bottom_logo_text);
       int i = 8;
       if (this.A.m != null) {
          this.y.setVisibility(i);
          return;
       }else {
          z tB = this.B;
          if (tB != null) {
             this.y.setImageBitmap(tB);
             imageView.setVisibility(i);
             ConstraintLayout$LayoutParams layoutParams = this.y.getLayoutParams();
             layoutParams.h = 0x7f0a3ae0;
             layoutParams.bottomMargin = 0;
             layoutParams.height = this.B.getHeight();
             layoutParams.A = 0x3f000000;
             layoutParams.z = 0x3f000000;
             layoutParams.width = n.c(this.getContext(), (float)this.C);
             this.y.setLayoutParams(layoutParams);
          }else {
             imageView.setVisibility(0);
             this.y.setImageResource(R.drawable.arg_RES_7f082372);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       this.t = p0.findViewById(0x7f0a137d);
       this.u = p0.findViewById(0x7f0a3add);
       this.v = p0.findViewById(0x7f0a3ad9);
       this.w = p0.findViewById(0x7f0a3aff);
       this.x = p0.findViewById(0x7f0a3996);
       this.y = p0.findViewById(0x7f0a3adf);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.p = this.x8("SPLASH_IMAGE_TYPE_PARAM");
       this.q = this.x8("SPLASH_AD_LOG");
       this.r = this.r8("SPLASH_VIEW_SHOW_EVENT");
       this.s = this.r8("SPLASH_ACTION_BAR_SHOW_EVENT");
       return;
    }
}
