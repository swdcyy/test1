package kp8.d;
import android.view.View;
import java.lang.Object;
import com.tachikoma.core.component.view.TKViewBackgroundDrawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import kp8.b;
import android.graphics.drawable.LayerDrawable;
import java.lang.Float;

public class d	// class@002c0b
{
    public TKViewBackgroundDrawable a;
    public View b;
    public StateListDrawable c;
    public Map d;
    public int e;
    public float[] f;
    public float g;
    public boolean h;
    public Drawable i;

    public void d(View p0){
       super();
       this.e = -1;
       float[] uofloatArray = new float[8];
       this.f = uofloatArray;
       this.b = p0;
    }
    public final TKViewBackgroundDrawable a(){
       Object[] objArray = null;
       TKViewBackgroundDrawable obj = PatchProxy.apply(objArray, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h != null) {
          return objArray;
       }
       if (this.a == null) {
          obj = new TKViewBackgroundDrawable(this.b.getContext());
          this.a = obj;
          obj.mDebugText = this.b.getClass().getName();
          d tc = this.c;
          if (tc != null) {
             this.c(tc);
          }else {
             this.c(this.a);
          }
       }
       return this.a;
    }
    public void b(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "6")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       if (p0 || this.a != null) {
          this.e = p0;
          TKViewBackgroundDrawable tKViewBackgr = this.a();
          if (tKViewBackgr != null) {
             tKViewBackgr.setColor(p0);
          }
       }
       return;
    }
    public final void c(Drawable p0){
       Drawable[] uDrawableArr2;
       LayerDrawable layerDrawabl;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       if (this.h == null && p0 != null) {
          Drawable uDrawable = null;
          b.b(this.b, uDrawable);
          Drawable background = this.b.getBackground();
          int i = 2;
          if (background == null) {
             d ti = this.i;
             if (ti == null) {
                b.b(this.b, p0);
             }else if(ti == p0){
                d tc = this.c;
                if (tc == null) {
                   tc = this.a;
                   if (tc == null) {
                   label_003c :
                      if (uDrawable == null) {
                         b.b(this.b, ti);
                      }else {
                         Drawable[] uDrawableArr = new Drawable[i];
                         uDrawableArr[0] = uDrawable;
                         uDrawableArr[1] = this.i;
                         b.b(this.b, new LayerDrawable(uDrawableArr));
                      }
                   }
                }
                uDrawable = tc;
                goto label_003c ;
             }else {
                Drawable[] uDrawableArr1 = new Drawable[i];
                uDrawableArr1[0] = p0;
                uDrawableArr1[1] = this.i;
                b.b(this.b, new LayerDrawable(uDrawableArr1));
             }
          }else {
             d ti1 = this.i;
             if (ti1 == null) {
                uDrawableArr2 = new Drawable[i];
                uDrawableArr2[0] = background;
                uDrawableArr2[1] = p0;
                layerDrawabl = new LayerDrawable(uDrawableArr2);
             }else if(ti1 == p0){
                uDrawableArr2 = new Drawable[i];
                uDrawableArr2[0] = background;
                uDrawableArr2[1] = p0;
                layerDrawabl = new LayerDrawable(uDrawableArr2);
             }else {
                Drawable[] uDrawableArr3 = new Drawable[]{background,p0,this.i};
                layerDrawabl = new LayerDrawable(uDrawableArr3);
             }
             b.b(this.b, layerDrawabl);
          }
       }
       return;
    }
    public void d(int p0,int[] p1,float[] p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, d.class, "8")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       TKViewBackgroundDrawable tKViewBackgr = this.a();
       if (tKViewBackgr != null) {
          tKViewBackgr.setBackgroundGradientColor(p0, p1, p2);
       }
       return;
    }
    public void e(int p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "11")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       TKViewBackgroundDrawable tKViewBackgr = this.a();
       if (tKViewBackgr != null) {
          tKViewBackgr.setBorderColor(p0, p1);
       }
       return;
    }
    public void f(float p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "12")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       TKViewBackgroundDrawable tKViewBackgr = this.a();
       if (tKViewBackgr != null) {
          tKViewBackgr.setRadius(p0);
          this.g = p0;
       }
       return;
    }
    public void g(float p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, uod, "13")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       TKViewBackgroundDrawable tKViewBackgr = this.a();
       if (tKViewBackgr != null) {
          tKViewBackgr.setRadius(p0, p1);
          uod = this.f;
          p1 = (p1 % 4) * 2;
          uod[p1] = p0;
          p1++;
          uod[p1] = p0;
       }
       return;
    }
    public void h(int p0,String p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "14")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       TKViewBackgroundDrawable tKViewBackgr = this.a();
       if (tKViewBackgr != null) {
          tKViewBackgr.setBorderStyle(p0, p1);
       }
       return;
    }
    public void i(int p0,float p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, uod, "10")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       TKViewBackgroundDrawable tKViewBackgr = this.a();
       if (tKViewBackgr != null) {
          tKViewBackgr.setBorderWidth(p0, p1);
       }
       return;
    }
}
