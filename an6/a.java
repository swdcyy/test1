package an6.a;
import an6.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import cw9.b;
import lnc.s6;
import java.lang.Math;
import bn6.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kuaishou.ax2c.PreLoader;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import brd.t;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import an6.a$a;
import io.reactivex.g;
import t45.d;
import brd.z;
import java.lang.Boolean;
import jd.a;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.yxcorp.utility.n;
import an6.a$b;
import android.view.View$OnClickListener;
import android.widget.ImageView$ScaleType;

public abstract class a implements i	// class@0000e3
{
    public final float a;
    public ViewGroup b;
    public View c;
    public ImageView d;

    public void a(){
       float f;
       super();
       Object obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          f = obj.floatValue();
       }else {
          float f1 = 0x3f800000;
          if (b.g()) {
             f = b.b() / b.e();
             if (s6.J() - (float)0 > 0) {
                f = Math.max(f1, (f * s6.J()));
             }else if(s6.l()){
             }
          }else {
          }
       }
       Objects.requireNonNull(a.l);
       this.a = ((f * 144.00f) * a.k) + 0x3f000000;
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       if (this.d != null) {
          a tc = this.c;
          if (tc == null) {
             a.S("targetView");
          }
          tc.setAlpha(0x3f800000);
       }
       int[] ointArray = new int[]{this.k()};
       PreLoader.getInstance().clear(ointArray);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       if (this.d != null) {
          a tc = this.c;
          if (tc == null) {
             a.S("targetView");
          }
          tc.setAlpha(0);
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a.p(p0, "anchorView");
       this.c = p0;
       return;
    }
    public void d(){
    }
    public View f(LayoutInflater p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       a.p(p1, "container");
       View orWait = PreLoader.getInstance().getOrWait(p1.getContext(), this.k(), p1, false, false);
       Objects.requireNonNull(orWait, "null cannot be cast to non-null type android.view.ViewGroup");
       this.b = orWait;
       orWait.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       this.o(p1);
       a tb = this.b;
       if (tb == null) {
          a.S("rootView");
       }
       return tb;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       int[] ointArray = new int[]{this.k()};
       PreLoader.getInstance().clear(ointArray);
       return;
    }
    public t i(){
       t ot;
       ActivityContext obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ActivityContext.g();
       a.o(obj, "ActivityContext.getInstance\(\)");
       Activity uActivity = obj.e();
       if (uActivity != null) {
          ot = t.create(new a$a(this, uActivity)).subscribeOn(d.c);
          a.o(ot, "Observable.create<Boolea¡­eOn\(KwaiSchedulers.ASYNC\)");
          return ot;
       }else {
          ot = t.just(Boolean.FALSE);
          a.o(ot, "Observable.just\(false\)");
          return ot;
       }
    }
    public a j(){
       return null;
    }
    public abstract int k();
    public final ImageView l(){
       return this.d;
    }
    public final ViewGroup m(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("rootView");
       }
       return obj;
    }
    public final View n(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("targetView");
       }
       return obj;
    }
    public abstract void o(ViewGroup p0);
    public final void p(ViewGroup p0,Drawable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "12")) {
          return;
       }
       a.p(p0, "container");
       if (p1 == null) {
          return;
       }
       a tc = this.c;
       String str = "targetView";
       if (tc == null) {
          a.S(str);
       }
       ImageView imageView = new ImageView(tc.getContext());
       if (p1 instanceof BitmapDrawable) {
          BitmapDrawable uBitmapDrawa = p1;
          if (uBitmapDrawa.getBitmap() != null) {
             Bitmap bitmap = uBitmapDrawa.getBitmap();
             a.o(bitmap, "operateDrawable.bitmap");
             uBitmapDrawa.setTargetDensity(bitmap.getDensity());
          }
       }
       this.d = imageView;
       int i = 0;
       p0.addView(imageView, i);
       ViewGroup$LayoutParams layoutParams = imageView.getLayoutParams();
       a.o(layoutParams, "it.layoutParams");
       a tc1 = this.c;
       if (tc1 == null) {
          a.S(str);
       }
       layoutParams.width = tc1.getHeight();
       tc1 = this.c;
       if (tc1 == null) {
          a.S(str);
       }
       layoutParams.height = tc1.getHeight();
       imageView.setLayoutParams(layoutParams);
       a tc2 = this.c;
       if (tc2 == null) {
          a.S(str);
       }
       int[] ointArray = n.o(tc2);
       tc1 = this.b;
       if (tc1 == null) {
          a.S("rootView");
       }
       imageView.setTranslationY(((float)ointArray[1] - (float)n.o(tc1)[1]));
       float f = (float)ointArray[i];
       tc2 = this.c;
       if (tc2 == null) {
          a.S(str);
       }
       int width = tc2.getWidth();
       tc1 = this.c;
       if (tc1 == null) {
          a.S(str);
       }
       imageView.setTranslationX((f + (float)((width - tc1.getHeight()) / 2)));
       imageView.setOnClickListener(new a$b(this, p1, p0));
       f = (float)2;
       int i1 = (int)(this.a - f);
       if (p1.getIntrinsicHeight() < i1) {
          imageView.setScaleType(ImageView$ScaleType.FIT_CENTER);
          float f1 = ((p1.getIntrinsicHeight() * 2) > i1 && (float)(p1.getIntrinsicHeight() * 2) - (this.a + f) < 0)? (float)p1.getIntrinsicHeight() * 2.00f: this.a;
          tc2 = this.c;
          if (tc2 == null) {
             a.S(str);
          }
          imageView.setPadding((int)(((float)tc2.getHeight() - f1) / f), (int)(((float)tc2.getHeight() - f1) / f), (int)(((float)tc2.getHeight() - f1) / f), (int)(((float)tc2.getHeight() - f1) / f));
       }else {
          imageView.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       }
       imageView.setImageDrawable(p1);
       return;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a.p(p0, "bubbleClickListener");
       a tb = this.b;
       if (tb == null) {
          a.S("rootView");
       }
       tb.setOnClickListener(p0);
       return;
    }
}
