package gc9.a;
import in6.b;
import ui9.b;
import oc9.d0;
import gc9.a$c;
import nsd.u;
import android.content.res.Resources;
import lnc.a1;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.d;
import gc9.a$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import oh9.a;
import gc9.a$b;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import hd9.n;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import in6.a;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.gifshow.widget.PressedImageView;
import vf9.g0;
import gc9.a$d;
import erd.g;
import crd.b;
import zg9.x;
import gc9.a$e;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import lnc.s6;
import com.yxcorp.gifshow.image.KwaiImageView;
import ug9.c;
import gc9.a$f;
import android.view.View$OnClickListener;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import xi9.n;
import od9.c;
import e17.i;
import ed9.i;
import android.widget.ImageView;
import gc9.b;
import java.lang.Runnable;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import s0d.f;
import android.net.Uri;
import xkd.b;
import s0d.a;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import gc9.d;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import k2b.e0;
import com.yxcorp.gifshow.camera.record.CameraLogger;

public final class a extends d0 implements b, b	// class@00246f
{
    public View o;
    public PressedImageView p;
    public KwaiLottieAnimationView q;
    public Runnable r;
    public boolean s;
    public boolean t;
    public static final long u;
    public static int v;
    public static final a$c w;

    static {
       a.w = new a$c(null);
       a.u = (long)a1.m().getInteger(0x7f0b0040);
    }
    public void a(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.d.n(b.class, new a$a(this));
       this.d.n(a.class, new a$b(this));
    }
    public static void l2(a p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.k2(p1);
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a0.j(this);
       this.i2();
       return;
    }
    public boolean Kc(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h2();
    }
    public int O0(){
       Object obj = PatchProxy.apply(null, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.d(n.j).a;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a0.h(this);
       this.i2();
       return;
    }
    public int R(){
       return 0x7f0d00df;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public int T(){
       return a.a(this);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, a.class, "3")) {
          return;
       }
       a.l2(this, false, 1, null);
       return;
    }
    public int Y0(){
       return 500;
    }
    public int a1(){
       return a.b(this);
    }
    public void d5(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       super.d5(p0);
       a.l2(this, false, 1, null);
       return;
    }
    public final boolean g2(){
       a obj = PatchProxy.apply(null, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final boolean h2(){
       a obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.g2()) {
          obj = this.o;
          if (obj != null && obj.isSelected() == b) {
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       a to = this.o;
       if (to != null) {
          boolean b = (to.getVisibility() || !this.a2())? true: false;
          to.setEnabled(b);
          a tp = this.p;
          if (tp != null) {
             tp.setEnabled(to.isEnabled());
          }
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.k(p0);
       this.Y1(this.d.l(g0.class, new a$d(this)));
       this.Y1(this.d.l(x.class, new a$e(this)));
       PressedImageView pressedImage = null;
       View view = (p0 != null)? p0.findViewById(R.id.record_audio_btn): pressedImage;
       this.o = view;
       KwaiLottieAnimationView kwaiLottieAn = (p0 != null)? p0.findViewById(R.id.record_audio_icon_anim_view): pressedImage;
       this.q = kwaiLottieAn;
       a to = this.o;
       if (to != null) {
          pressedImage = to.findViewById(0x7f0a34a1);
       }
       this.p = pressedImage;
       if (s6.m()) {
          to = this.p;
          if (to != null) {
             to.setImageResource(R.drawable.arg_RES_7f081dfe);
          }
          to = this.q;
          if (to != null) {
             to.D(R.string.arg_RES_7f103d9f);
          }
       }else {
          to = this.p;
          if (to != null) {
             to.setImageResource(R.drawable.arg_RES_7f081dfd);
          }
       }
       if (this.d.d(c.c).a == null) {
          to = this.o;
          if (to != null) {
             to.setOnClickListener(new a$f(this));
          }
       }
       return;
    }
    public final void k2(boolean p0){
       a to2;
       int i;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecordAudioController", "updateAudioBtnVisibility, anim:"+p0, objArray);
       if (this.d.d(c.c).a != null) {
          return;
       }
       if (this.f2() && this.d.d(a.f).b != null) {
          d tg = this.g;
          a.o(tg, "mImageHelper");
          if (!tg.p0()) {
             a to = this.o;
             if (to != null && !to.getVisibility()) {
                return;
             }else {
                to = this.o;
                if (to != null) {
                   to.setVisibility(0);
                }
                Object[] objArray1 = null;
                if (!PatchProxy.applyVoid(objArray1, this, uoa, "13")) {
                   if (this.d.d(c.b).a != null) {
                      to2 = this.o;
                      if (to2 != null) {
                         to2.setSelected(1);
                      }
                   }else {
                      to2 = this.o;
                      if (to2 != null) {
                         to2.setSelected(0);
                      }
                      if (this.s == null) {
                         i.a(R.style.arg_RES_7f11066a, 0x7f100482);
                         this.s = true;
                      }
                   }
                }
                this.i2();
                this.d.m(new i(1, p0, this.o));
                if (p0) {
                   a to1 = this.o;
                   if (to1 != null && !to1.isSelected()) {
                      if (s6.m()) {
                         if (!PatchProxy.applyVoid(objArray1, this, uoa, "15")) {
                            to1 = this.q;
                            if (to1 != null) {
                               uoa = this.p;
                               if (uoa != null) {
                                  uoa.setVisibility(4);
                               }
                               uoa = this.q;
                               if (uoa != null) {
                                  uoa.setVisibility(0);
                               }
                               b uob = new b(to1, this);
                               this.r = uob;
                               to1 = this.o;
                               if (to1 != null) {
                                  to1.postDelayed(uob, a.u);
                               }
                            }
                         }
                      }else if(PatchProxy.applyVoid(objArray1, this, uoa, "14")){
                         to1 = this.p;
                         if (to1 != null) {
                            uoa = to1.getHierarchy();
                            if (uoa != null) {
                               uoa.x(0);
                            }
                            tg = Fresco.newDraweeControllerBuilder();
                            tg.q(0);
                            tg.y(to1.getController());
                            tg.v(f.x().s(b.c(R.drawable.arg_RES_7f081b06)).o(to1.getWidth(), to1.getHeight()).w(), 0);
                            tg.s(new d(this));
                            AbstractDraweeController uAbstractDra = tg.e();
                            a.o(uAbstractDra, "Fresco.newDraweeControll¡­      }\)\n        .build\(\)");
                            to1.setController(uAbstractDra);
                         }
                      }
                   }
                }
                CameraLogger.s(this.f, this.h2());
             label_0185 :
                return;
             }
          }
       }
       uoa = this.o;
       if (uoa != null) {
          uoa.setSelected(0);
       }
       uoa = this.o;
       i = 8;
       if (uoa != null) {
          uoa.setVisibility(i);
       }
       uoa = this.q;
       if (uoa != null) {
          uoa.setVisibility(i);
       }
       this.d.m(new i(0, p0, this.o));
       goto label_0185 ;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       super.onDestroyView();
       a tr = this.r;
       if (tr != null) {
          a to = this.o;
          if (to != null) {
             to.removeCallbacks(tr);
          }
       }
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public final void onSideBarVisibilityChangeEvent(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       if (p0.a != null) {
          a tr = this.r;
          if (tr != null) {
             a.m(tr);
             a to = this.o;
             if (to != null) {
                x b = (this.t == null)? p0.b: 0;
                to.postDelayed(tr, b);
             }
             this.r = null;
          }
       }
       return;
    }
}
