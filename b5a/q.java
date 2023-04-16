package b5a.q;
import b5a.l;
import mkc.b;
import android.app.Activity;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import b5a.k;
import java.lang.Object;
import android.view.View;
import android.view.ViewStub;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.b0;
import uw9.z;
import lnc.c3$a;
import lnc.c3;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;
import bld.b;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import b5a.n;
import android.view.View$OnClickListener;
import android.content.Context;
import uw9.m3;
import ekd.i;
import ekd.l1;
import j2a.b;
import uh5.e;
import e0a.j;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import sd5.k;
import lnc.a1;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.Integer;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.ColorDrawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.graphics.BitmapFactory;
import lnc.d2;
import com.yxcorp.gifshow.util.BitmapUtil$BitmapCropMode;
import mkc.c;
import b5a.o;
import android.animation.ValueAnimator;
import b5a.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b5a.p;
import android.animation.Animator$AnimatorListener;

public class q implements l	// class@000376
{
    public ViewStub a;
    public View b;
    public KwaiImageView c;
    public ImageView d;
    public View e;
    public View f;
    public View g;
    public ViewGroup h;
    public ViewStub i;
    public DetailToolBarButtonView j;
    public Activity k;
    public DetailCoverInfo l;
    public k m;
    public static final b n;

    static {
       q.n = new b(0x7f0d0276);
    }
    public void q(Activity p0,DetailCoverInfo p1,k p2){
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.a = p0.findViewById(0x7f0a4464);
    }
    public void a(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "5")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       q tl = this.l;
       if (tl != null && tl.isValid()) {
          tl = this.b;
          q tk = this.k;
          boolean b = p0.booleanValue();
          boolean b1 = this.l.isLongPhoto();
          b0 uob0 = b0.class;
          if (PatchProxy.isSupport(uob0)) {
             Object[] objArray = new Object[]{tl,tk,Boolean.valueOf(b),Boolean.valueOf(b1),Boolean.FALSE};
             if (!PatchProxy.applyVoid(objArray, null, uob0, "7")) {
             }
          }else {
          }
       }
    label_005f :
       return;
    }
    public void b(){
       boolean b;
       Bitmap uBitmap;
       int i4;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, oq, str)) {
          return;
       }
       if (this.h == null) {
          q ta = this.a;
          if (ta != null) {
             ViewGroup viewGroup = ta.inflate();
             this.h = viewGroup;
             this.b = viewGroup.findViewById(0x7f0a0a0a);
             this.e = this.h.findViewById(0x7f0a09fb);
             this.c = this.h.findViewById(0x7f0a09f2);
             this.d = this.h.findViewById(0x7f0a09dc);
             this.g = this.h.findViewById(0x7f0a09eb);
             this.i = this.h.findViewById(0x7f0a446a);
             DetailToolBarButtonView uDetailToolB = this.h.findViewById(R.id.cover_back_btn);
             this.j = uDetailToolB;
             if (uDetailToolB != null) {
                b uob = new b();
                uob.o(this.k.getResources().getDrawable(R.drawable.arg_RES_7f080713));
                uob.z(this.k.getResources().getDrawable(R.drawable.arg_RES_7f080713));
                uob.h(this.k.getResources().getDrawable(R.drawable.arg_RES_7f080712));
                uDetailToolB.setBottomDrawable(uob.a());
                this.j.setOnClickListener(new n(this));
             }
             Context applicationC = this.k.getApplicationContext();
             q tl = this.l;
             m3 om3 = m3.class;
             Object obj = PatchProxy.applyTwoRefs(applicationC, tl, objArray, om3, "4");
             int i = 1;
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(i.c()){
                obj = PatchProxy.applyTwoRefs(applicationC, tl, objArray, om3, "3");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(!l1.a(applicationC)){
                   Object obj2 = PatchProxy.applyOneRefs(tl, objArray, om3, "7");
                   if (obj2 != patchProxyRe) {
                      b = obj2.booleanValue();
                   }else if(b.d(tl) && tl.getCoverAspectRatio() - 0x3f400000 <= 0){
                      b = true;
                   }else {
                      b = false;
                   }
                   if (b) {
                   label_0111 :
                      if (!e.b()) {
                         obj2 = PatchProxy.applyOneRefs(tl, objArray, om3, "14");
                         if (obj2 != patchProxyRe) {
                            b = obj2.booleanValue();
                         }else if(tl == null || (j.i() && (tl.isLongPhoto() || tl.getCoverAspectRatio() - 0x3f100000 < 0))){
                            b = true;
                         }else {
                            b = false;
                         }
                         if (!b) {
                            b = true;
                         }
                      }
                   }
                }else {
                   goto label_0111 ;
                }
             label_0147 :
                b = false;
                if (b) {
                   b = true;
                }
             }
             b = false;
             if (b) {
                this.e.getLayoutParams().height = n.A(this.k);
                this.e.setVisibility(0);
             }
             this.m.b();
             if (PatchProxy.applyVoid(objArray, this, oq, "6") || (this.b == null || (this.c != null && this.d != null))) {
                ta = this.l;
                if (ta != null && ta.isValid()) {
                   k ok = new k(this.k, this.l.getCoverAspectRatio());
                   k ok1 = k.class;
                   ViewGroup$LayoutParams layoutParams = PatchProxy.apply(objArray, ok, ok1, str);
                   if (layoutParams != patchProxyRe) {
                   }else {
                      k b1 = ok.b;
                      int i3 = (int)((float)b1 / ok.a);
                      k c = ok.c;
                      if (c > i3 && (c - i3) < 100) {
                         i4 = (b1 * c) / i3;
                         i3 = c;
                      }else {
                         Object obj1 = PatchProxy.apply(objArray, objArray, ok1, "2");
                         if (obj1 != patchProxyRe) {
                            b2 = obj1.booleanValue();
                         }else if(((float)a1.g() / (float)a1.h()) - 0x3fa66666 < 0){
                            b2 = true;
                         }else {
                            b2 = false;
                         }
                         if (b2) {
                            i3 = ok.c;
                            i4 = (int)((float)i3 * ok.a);
                         }else {
                            i4 = -1;
                         }
                      }
                      layoutParams = new ViewGroup$LayoutParams(i4, i3);
                   }
                   this.b.getLayoutParams().height = layoutParams.height;
                   this.b.getLayoutParams().width = layoutParams.width;
                   this.b.getLayoutParams().addRule(14);
                   q tc = this.c;
                   ViewGroup$LayoutParams height = layoutParams.height;
                   if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(height), objArray, oq, "7")) {
                      FrameLayout$LayoutParams layoutParams1 = tc.getLayoutParams();
                      layoutParams1.width = -1;
                      layoutParams1.height = height;
                      layoutParams1.leftMargin = 0;
                      layoutParams1.topMargin = 0;
                      tc.setLayoutParams(layoutParams1);
                   }
                   this.c.setPlaceHolderImage(new ColorDrawable(this.l.getFinalCoverPlaceHoldColorInt(this.k.getApplicationContext())));
                   if (!TextUtils.x(this.l.getCoverBase64String())) {
                      uBitmap = BitmapUtil.c(this.l.getCoverBase64String());
                      if (uBitmap != null && !uBitmap.isRecycled()) {
                         this.c.setImageBitmap(uBitmap);
                         i = 0;
                      }
                   }
                   if (i && !TextUtils.x(this.l.getCoverUrl())) {
                      this.c.L(this.l.getCoverUrl());
                   }
                   uBitmap = BitmapFactory.decodeResource(this.k.getResources(), R.drawable.arg_RES_7f0806af);
                   int i1 = d2.b(this.k);
                   int i2 = d2.a(this.k) - layoutParams.height;
                   if (i1 > 0 && i2 > 0) {
                      this.d.setImageBitmap(BitmapUtil.p(uBitmap, i1, i2, BitmapUtil$BitmapCropMode.TOP));
                   }
                }
             }
          }
       }
    label_02b5 :
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       q tf = this.f;
       if (tf == null) {
          return;
       }
       b[] uobArray = new b[]{q.n};
       c.d(tf, uobArray);
       this.f.setVisibility(8);
       this.g.setVisibility(0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       q th = this.h;
       if (th != null && !th.getVisibility()) {
          th = this.i;
          if (th == null) {
             return;
          }else if(this.f == null){
             th.inflate();
             this.f = this.h.findViewById(0x7f0a3f11);
          }
          c.h(this.f, q.n).findViewById(R.id.retry_btn).setOnClickListener(new o(this));
          this.f.setVisibility(0);
          this.g.setVisibility(8);
       }
       return;
    }
    public void e(){
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "2")) {
          return;
       }
       q th = this.h;
       if (th == null || (!th.getVisibility() && !PatchProxy.applyVoid(objArray, this, oq, "8"))) {
          oq = this.h;
          if (oq != null && (this.d != null && !oq.getVisibility())) {
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
             valueAnimato.setDuration(500);
             valueAnimato.addUpdateListener(new m(this));
             valueAnimato.addListener(new p(this));
             valueAnimato.start();
          }
       }
    label_0051 :
       return;
    }
}
