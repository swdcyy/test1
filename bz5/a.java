package bz5.a;
import lnc.a1;
import bz5.b;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import bz5.a$c;
import bz5.a$a;
import android.view.animation.LinearInterpolator;
import java.lang.Integer;
import lnc.ja;
import bz5.a$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.List;
import android.content.res.Resources;
import android.content.res.Configuration;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import th0.m;

public final class a	// class@000632
{
    public final b a;
    public final ViewGroup b;
    public final ViewGroup c;
    public boolean d;
    public final RecyclerView e;
    public AnimatorSet f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;

    static {
       float f = (float)a1.d(0x7f070b94);
       a.g = f;
       float f1 = (float)a1.d(0x7f070b95);
       a.h = f1;
       a.i = (float)a1.d(0x7f070b96);
       f = f - f1;
       a.j = f / 2.00f;
       a.k = (float)a1.d(0x7f0702b8);
    }
    public void a(b p0,ViewGroup p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p1.findViewById(0x7f0a2c14);
       this.e = p1.findViewById(0x7f0a2c16);
    }
    public final void a(float p0,float p1,Animator$AnimatorListener p2,TimeInterpolator p3,long p4){
       a uoa = a.class;
       int i = 3;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),p2,p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             return;
          }
       }
       uoa = this.f;
       if (uoa != null) {
          uoa.cancel();
          this.f.removeAllListeners();
       }else {
          this.f = new AnimatorSet();
       }
       uoa = this.c;
       float[] uofloatArray = new float[]{uoa.getTranslationY(),p0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uoa, "translationY", uofloatArray);
       uoa = this.c;
       uofloatArray = new float[]{uoa.getAlpha(),p1};
       a tb = this.b;
       float[] uofloatArray1 = new float[]{tb.getAlpha(),p1};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(tb, "alpha", uofloatArray1);
       Animator[] uAnimatorArr = new Animator[i];
       uAnimatorArr[0] = objectAnimat;
       uAnimatorArr[1] = ObjectAnimator.ofFloat(uoa, "alpha", uofloatArray);
       uAnimatorArr[2] = objectAnimat1;
       this.f.playTogether(uAnimatorArr);
       this.f.setDuration(p4);
       this.f.setInterpolator(p3);
       if (p2 != null) {
          this.f.addListener(p2);
       }
       this.f.start();
       return;
    }
    public void b(a$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.a(0, 0, new a$a(this, p0), new LinearInterpolator(), 200);
       return;
    }
    public void c(float p0,int p1,int p2,int p3){
       int i1;
       int i2;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "1")) {
          return;
       }
       ja.a();
       int i = 0;
       if (this.b.getVisibility()) {
          this.b.setVisibility(i);
       }
       if (this.c.getVisibility()) {
          this.c.setVisibility(i);
       }
       if (this.d == null) {
          this.d = true;
          this.e.setAdapter(new a$b(this.a));
          this.e.setLayoutManager(new LinearLayoutManager(this.b.getContext(), i, i));
          if (this.a.a.size() <= 3) {
             i1 = 0x7f07032a;
          }else if(this.b.getContext().getResources().getConfiguration().screenWidthDp <= 375){
             i1 = 0x7f0702e8;
          }else {
             i1 = 0x7f070307;
          }
          if (this.e.getItemDecorationCount() > 0) {
             this.e.removeItemDecorationAt(i);
          }
          this.e.addItemDecoration(new b(i, a1.d(i1)));
       }else {
          this.e.getAdapter().k0();
       }
       FrameLayout$LayoutParams layoutParams = this.c.getLayoutParams();
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             i2 = obj.intValue();
          }else {
          label_00e6 :
             float f = (float)(p1 - p3);
             if (((0x3f800000 * f) / (float)p2) - 0x3f100000 <= 0) {
                i2 = (int)(((f - a.h) / 2.00f) - a.i);
             }else if(p0 - (a.g + (float)p3) < 0){
                p0 = a.j;
                float i3 = a.i;
                i2 = (int)Math.max((((((float)p1 - p0) - a.h) - p0) - i3), (p0 - i3));
             }else {
                i2 = Math.max((int)(((((float)p1 - p0) + a.j) + a.k) - a.i), i);
             }
          }
       }else {
          goto label_00e6 ;
       }
       layoutParams.bottomMargin = i2;
       this.a((- a.i), 0x3f800000, null, new m(), 250);
       return;
    }
}
