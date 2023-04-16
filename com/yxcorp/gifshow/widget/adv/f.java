package com.yxcorp.gifshow.widget.adv.f;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$a;
import java.lang.Object;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$b;
import com.yxcorp.gifshow.widget.adv.e;
import android.graphics.Bitmap;
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.k;
import wyc.d;
import p16.c;
import java.util.Locale;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Comparable;
import qk.k0;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import com.google.common.collect.Range;
import java.lang.Math;

public class f implements LinearBitmapContainer$a	// class@001921
{
    public int a;
    public int b;
    public int c;
    public double d;
    public k0 e;
    public f$a f;
    public LinearBitmapContainer$b g;

    public void f(){
       super();
       if (PostExperimentUtils.c()) {
          e uoe = PatchProxy.apply(null, this, f.class, "2");
          if (uoe != PatchProxyResult.class) {
          }else {
             uoe = new e(this);
          }
          this.g = uoe;
       }
       return;
    }
    public Bitmap a(int p0){
       Object[] objArray1;
       double d;
       f a;
       Object obj = this;
       int i = p0;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uof, "6");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       uof = obj.g;
       if (uof != null) {
          return uof.a(i);
       }else {
          int i1 = this.c(p0) + i;
          Bitmap uBitmap = null;
          if (i1 > this.getCount() || !obj.b(i1)) {
             Object[] objArray = new Object[]{Integer.valueOf(p0)};
             objArray1 = new Object[0];
             a.D().s("TimelineBitmapAdapter", String.format(Locale.US, "getBitmap current index %d is not available", objArray), objArray1);
             return uBitmap;
          }else {
             d = ((double)((float)i1 + 0x3f000000) * obj.d) / (double)this.getCount();
             objArray1 = new Object[0];
             a.D().s("TimelineBitmapAdapter", "getBitmap index: "+i1, objArray1);
             k ok = k.f();
             a = obj.a;
             f b = obj.b;
             if (obj.f != null) {
                uBitmap = new d(obj);
             }
             return ok.b(d, a, b, uBitmap);
          }
       }
    }
    public boolean b(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uof = this.e;
       boolean b = (uof == null || !uof.contains(Double.valueOf((((double)((float)p0 + 0x3f000000) * this.d) / (double)this.getCount()))))? true: false;
       return b;
    }
    public int c(int p0){
       float f;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       f te = this.e;
       if (te != null) {
          Iterator iterator = te.asRanges().iterator();
          while (iterator.hasNext()) {
             Range range = iterator.next();
             if (range.hasLowerBound() && range.hasUpperBound()) {
                int i1 = p0 + i;
                f = (float)i1 + 0x3f000000;
                double d = (double)f * this.d;
                d = d / (double)this.getCount();
                if (range.contains(Double.valueOf(d)) || range.upperEndpoint().doubleValue() - d < 0) {
                   d = range.upperEndpoint().doubleValue() - range.lowerEndpoint().doubleValue();
                   d = d / this.d;
                   d = d * (double)this.getCount();
                   i = i + (int)d;
                }
             }
          }
       }
       return i;
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)Math.ceil((double)this.c);
    }
    public int getHeight(){
       f obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.g;
       if (obj != null) {
          return obj.getHeight();
       }
       return this.b;
    }
    public int getWidth(){
       f obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.g;
       if (obj != null) {
          return obj.getWidth();
       }
       return this.a;
    }
}
