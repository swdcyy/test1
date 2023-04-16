package b4d.v0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import io.reactivex.subjects.PublishSubject;
import b4d.v0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b4d.p0;
import android.view.View$OnClickListener;
import android.view.View;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import xb.t$b;
import com.yxcorp.gifshow.models.QMedia;
import lnc.c3$a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import jl5.i;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Runnable;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import o07.d$a;
import o07.d;
import b4d.s0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import b4d.u0;
import b4d.r0;
import com.yxcorp.gifshow.util.rx.RxBus;
import ky5.p;
import b4d.t0;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.ViewParent;
import android.view.ViewGroup;
import b4d.a1;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import ub.b;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import b4d.v0$e;
import android.widget.ImageView;
import b4d.v0$f;
import android.graphics.Bitmap;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import b4d.b1;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import java.util.concurrent.ExecutorService;
import t45.c;
import kb.e;
import java.util.concurrent.Executor;
import k2b.e0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import android.widget.EditText;
import wkd.b;
import b4d.q0;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$k;
import n3d.a;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import lnc.e9;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import b4d.o0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b4d.v0$d;
import android.animation.Animator$AnimatorListener;
import b4d.v0$b;
import b4d.v0$c;
import jd.c;
import wb5.h;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import b4d.e1;
import java.util.Map;
import java.util.HashMap;
import a4d.s;

public class v0 extends PresenterV2 implements g	// class@00039a
{
    public KwaiImageView A;
    public View B;
    public View C;
    public EmojiEditText D;
    public KwaiImageView E;
    public final int[] F;
    public ObjectAnimator G;
    public boolean H;
    public boolean I;
    public final d$a J;
    public PublishSubject p;
    public c3$a q;
    public c3$a r;
    public c3$a s;
    public PublishSubject t;
    public BaseEditorFragment$Arguments u;
    public EmotionFloatEditorFragment v;
    public PublishSubject w;
    public s x;
    public boolean y;
    public View z;
    public static final int K;
    public static final int L;

    static {
       int i = a1.e(56.00f);
       i.K = i;
       i = a1.e(160.00f);
       i.L = i;
    }
    public void v0(){
       super();
       this.p = PublishSubject.g();
       int[] ointArray = new int[2];
       this.F = ointArray;
       this.J = new v0$a(this);
    }
    public void E8(){
       v0 ov0 = v0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov0, "3")) {
          return;
       }
       boolean b = PatchProxy.applyVoid(objArray, this, ov0, "6");
       if (!b) {
          ov0 = this.B;
          ov0.setOnClickListener(new p0(this));
          ov0 = this.B;
          ov0.setAlpha(0);
          a hierarchy = this.A.getHierarchy();
          t$b i = (this.u.mForceNewEditorStyle != null)? t$b.i: t$b.e;
          hierarchy.u(i);
          hierarchy = this.A.getHierarchy();
          int i1 = 0;
          hierarchy.x(i1);
          b = this.u;
          BaseEditorFragment$Arguments mQMedia = b.mQMedia;
          if (mQMedia != null) {
             this.Z8(mQMedia);
          }else {
             b = b.mEmotionInfo;
             if (b != null) {
                ov0 = this.r;
                ov0.apply(objArray);
                ov0 = this.q;
                ov0.apply(this.u.mEmotionInfo);
                b = i.a(this.u.mEmotionInfo);
                if (b != null) {
                   this.z.setVisibility(i1);
                   this.B.setAlpha(0x3f800000);
                   this.R8(this.u.mEmotionInfo, this.A, b, objArray);
                }
             }
          }
       }
    label_0083 :
       Dialog dialog = this.v.getDialog();
       if (dialog != null) {
          dialog = this.v.getDialog().getWindow();
          if (dialog != null) {
             dialog = this.v.getDialog().getWindow();
             d.b(dialog, this.J);
          }
       }
       b uob = this.w.subscribe(new s0(this), Functions.d());
       this.X7(uob);
       uob = this.p.subscribe(new u0(this));
       this.X7(uob);
       this.X7(this.t.subscribe(new r0(this)));
       this.X7(RxBus.f.f(p.class).subscribe(new t0(this)));
       return;
    }
    public void J8(){
       v0 ov0 = v0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov0, "14")) {
          return;
       }
       boolean b = PatchProxy.applyVoid(objArray, this, ov0, "13");
       if (!b) {
          ov0 = this.G;
          if (ov0 != null) {
             b = ov0.isRunning();
             if (b) {
                this.G.cancel();
             }
          }
          b = this.getActivity();
          if (b != null) {
             b = this.E;
             if (b != null) {
                b = this.m8().getParent();
                b.removeView(this.E);
             }
          }
       }
    label_003e :
       Dialog dialog = this.v.getDialog();
       if (dialog != null) {
          Window window = this.v.getDialog().getWindow();
          if (window != null) {
             window = this.v.getDialog().getWindow();
             d.c(window, this.J);
          }
       }
       return;
    }
    public void P8(KwaiImageView p0,CDNUrl[] p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, v0.class, "16")) {
          return;
       }
       boolean b = PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, v0.class, "17");
       if (!b) {
          b = new a1(this, p2);
          AbstractDraweeController uAbstractDra = null;
          d uod = p0.g0(b, uAbstractDra, d.b(p1));
          if (uod != null) {
             uod.q(true);
             uAbstractDra = uod.e();
          }
          p0.setController(uAbstractDra);
       }
       a hierarchy = p0.getHierarchy();
       t$b i = (this.u.mForceNewEditorStyle != null)? t$b.i: t$b.e;
       hierarchy.u(i);
       p0.getHierarchy().x(0);
       return;
    }
    public void R8(EmotionInfo p0,KwaiImageView p1,CDNUrl[] p2,Runnable p3){
       boolean b = PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, v0.class, "15");
       if (b) {
          return;
       }
       BaseEditorFragment$Arguments mEnableSendP = this.u.mEnableSendPicture;
       if (mEnableSendP != null) {
          mEnableSendP = this.A;
          mEnableSendP.setOnClickListener(new v0$e(this, p0));
       }else {
          this.A.setOnClickListener(null);
       }
       if (this.u.mForceNewEditorStyle != null && (p2 != null && p2.length > 0)) {
          this.X8(p1);
          v0$f uof = new v0$f(this, p1, p3, p2);
          if (!PatchProxy.applyVoidTwoRefs(p2, uof, null, v0.class, "20")) {
             if (!p2.length) {
                uof.onCompletedBitmap(null);
             }else {
                object oobject = p2[0];
                if (oobject == null) {
                   uof.onCompletedBitmap(null);
                }else {
                   CDNUrl mUrl = oobject.mUrl;
                   if (TextUtils.isEmpty(mUrl)) {
                      uof.onCompletedBitmap(null);
                   }else {
                      Fresco.getImagePipeline().fetchDecodedImage(ImageRequest.c(mUrl), null).f(new b1(uof), c.c());
                   }
                }
             }
          }
       }else {
          this.P8(p1, p2, p3);
       }
       return;
    }
    public e0 S8(){
       Activity obj = PatchProxy.apply(null, this, v0.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       if (obj instanceof GifshowActivity) {
          return obj;
       }
       return null;
    }
    public final void V8(boolean p0){
       v0 ov0 = v0.class;
       if (PatchProxy.isSupport(ov0)) {
          ov0 = PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov0, "8");
          if (ov0) {
             return;
          }
       }
       ov0 = this.z;
       ov0.setVisibility(8);
       ov0 = this.A;
       ov0.setPlaceHolderImage(null);
       ov0 = this.A;
       ov0.setController(null);
       ov0 = this.q;
       ov0.apply(null);
       if (p0) {
          this.r.apply(null);
       }else {
          this.s.apply(null);
       }
       v0 tG = this.G;
       if (tG != null && tG.isRunning()) {
          this.G.cancel();
       }
       tG = this.E;
       if (tG != null) {
          tG.setVisibility(8);
       }
       return;
    }
    public void W8(QMedia p0,EmotionInfo p1){
       int b = PatchProxy.applyVoidTwoRefs(p0, p1, this, v0.class, "7");
       if (b) {
          return;
       }
       if (p0 == null && p1 == null) {
          return;
       }
       v0 tv = this.v;
       tv.t1 = true;
       EmotionFloatEditorFragment w0 = tv.W0;
       w0.setPressed(true);
       tv = this.D;
       boolean b1 = false;
       if (tv != null) {
          tv.clearFocus();
          tv = this.D;
          tv.setSelected(b1);
       }
       this.v.Ui(b1);
       b = -762074120;
       if (b.a(b) != null) {
          Object obj = b.a(b);
          obj.a(this.getActivity(), p0, p1, this.A, n.n(this.getContext()), 1, new q0(this));
       }
       return;
    }
    public final void X8(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0.class, "18")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       int k = layoutParams.K;
       layoutParams.height = k;
       layoutParams.width = k;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void Y8(int[] p0,int p1,int p2,Drawable p3,EmotionInfo p4){
       KwaiImageView kwaiImageVie = this;
       object oobject = p3;
       object oobject1 = p4;
       v0 ov0 = v0.class;
       int i = 4;
       int i1 = 3;
       if (PatchProxy.isSupport(ov0)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),oobject,oobject1};
          if (PatchProxy.applyVoid(objArray, kwaiImageVie, ov0, "11")) {
             return;
          }
       }
       CDNUrl[] uCDNUrlArray = i.a(p4);
       if (uCDNUrlArray == null) {
          return;
       }else {
          v0 g = kwaiImageVie.G;
          if (g != null && g.isRunning()) {
             kwaiImageVie.G.cancel();
          }
          Object[] objArray1 = null;
          if (kwaiImageVie.E == null && (!PatchProxy.applyVoid(objArray1, kwaiImageVie, ov0, "12") && this.getActivity() != null)) {
             kwaiImageVie.E = new KwaiImageView(this.getContext());
             this.m8().getParent().addView(kwaiImageVie.E, new ViewGroup$LayoutParams(a1.d(R.dimen.arg_RES_7f070319), a1.d(R.dimen.arg_RES_7f070319)));
          }
       label_0082 :
          int i2 = p0[0];
          int i3 = p0[1];
          kwaiImageVie.z.getLocationInWindow(kwaiImageVie.F);
          v0 f = kwaiImageVie.F;
          float f1 = (float)f[1];
          int i4 = (kwaiImageVie.H != null)? kwaiImageVie.v.Hi(): 0;
          f[1] = (int)(f1 + ((float)i4 - kwaiImageVie.C.getTranslationY()));
          if (oobject != null) {
             kwaiImageVie.E.setImageDrawable(oobject);
          }else {
             kwaiImageVie.R8(oobject1, kwaiImageVie.E, uCDNUrlArray, objArray1);
          }
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
          float[] uofloatArray = new float[]{(float)i2,(float)kwaiImageVie.F[0]};
          propertyValu[0] = PropertyValuesHolder.ofFloat(View.X, uofloatArray);
          uofloatArray = new float[]{(float)i3,(float)kwaiImageVie.F[1]};
          propertyValu[1] = PropertyValuesHolder.ofFloat(View.Y, uofloatArray);
          uofloatArray = new float[]{e9.a((((float)p1 * 0x3f800000) / (float)kwaiImageVie.z.getWidth())),0x3f800000};
          propertyValu[2] = PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray);
          uofloatArray = new float[]{e9.a((((float)p2 * 0x3f800000) / (float)kwaiImageVie.z.getHeight())),0x3f800000};
          propertyValu[3] = PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray);
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(kwaiImageVie.E, propertyValu);
          kwaiImageVie.G = objectAnimat;
          objectAnimat.setDuration(300);
          kwaiImageVie.G.addUpdateListener(new o0(oobject));
          kwaiImageVie.G.addListener(new v0$d(kwaiImageVie, oobject1, uCDNUrlArray));
          kwaiImageVie.G.start();
          return;
       }
    }
    public final void Z8(QMedia p0){
       boolean b = PatchProxy.applyVoidOneRefs(p0, this, v0.class, "5");
       if (b) {
          return;
       }
       if (p0 != null) {
          v0 tz = this.z;
          if (tz != null) {
             tz = this.B;
             if (tz != null) {
                tz = this.A;
                if (tz != null) {
                   this.X8(tz);
                   this.y = true;
                   tz = this.q;
                   tz.apply(null);
                   tz = this.r;
                   tz.apply(p0);
                   tz = this.z;
                   tz.setVisibility(0);
                   tz = this.B;
                   tz.setAlpha(0x3f800000);
                   tz = this.A;
                   tz.setOnClickListener(new v0$b(this, p0));
                   int k = tz.K;
                   h.i(this.A, p0, k, k, 0, null, new v0$c(this));
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a0d01);
       this.C = m1.f(p0, 0x7f0a0953);
       this.B = m1.f(p0, 0x7f0a0d00);
       this.z = m1.f(p0, 0x7f0a0cff);
       this.D = m1.f(p0, 0x7f0a0ca8);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v0.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, v0.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(v0.class, new e1());
       }else {
          obj.put(v0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "1")) {
          return;
       }
       this.q = this.r8("mGifEmotionInfo");
       this.r = this.r8("PICTURE_ID");
       this.s = this.r8("PICTURE_DELETE_ACTION");
       this.t = this.r8("PICTURE_PREVIEW");
       this.u = this.r8("args");
       this.v = this.r8("floateditor");
       this.w = this.r8("EMOTION_SEARCH_SHOW_LISTEN");
       this.x = this.q8(s.class);
       return;
    }
}
