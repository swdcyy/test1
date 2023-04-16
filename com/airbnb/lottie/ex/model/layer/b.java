package com.airbnb.lottie.ex.model.layer.b;
import com.airbnb.lottie.ex.model.layer.a;
import a5.f;
import com.airbnb.lottie.ex.model.layer.Layer;
import java.util.List;
import a5.e;
import java.util.ArrayList;
import android.graphics.RectF;
import d5.a;
import h5.b;
import d5.a$a;
import androidx.collection.LongSparseArray;
import java.lang.Object;
import com.airbnb.lottie.ex.model.layer.a$a;
import com.airbnb.lottie.ex.model.layer.Layer$LayerType;
import java.lang.Enum;
import java.lang.StringBuilder;
import java.lang.String;
import a5.d;
import j5.g;
import j5.d;
import e5.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import j5.b;
import j5.c;
import j5.f;
import j5.e;
import com.airbnb.lottie.ex.model.layer.b$a;
import com.airbnb.lottie.ex.model.layer.Layer$MatteType;
import android.graphics.Matrix;
import n5.c;
import a5.j;
import d5.p;
import android.graphics.Canvas;
import g5.d;
import java.lang.Float;

public class b extends a	// class@000dbd
{
    public Boolean A;
    public Boolean B;
    public a w;
    public final List x;
    public final RectF y;
    public final RectF z;

    public void b(f p0,Layer p1,List p2,e p3){
       e uoe;
       super(p0, p1);
       this.x = new ArrayList();
       this.y = new RectF();
       this.z = new RectF();
       p1 = p1.s;
       if (p1 != null) {
          a uoa = p1.a();
          this.w = uoa;
          this.d(uoa);
          this.w.a(this);
       }else {
          this.w = null;
       }
       LongSparseArray longSparseAr = new LongSparseArray(p3.h().size());
       int i = p2.size() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i >= 0) {
          Layer layer = p2.get(i);
          switch (a$a.a[layer.d().ordinal()]){
              case 1:
                uoe = new e(p0, layer);
                break;
              case 2:
                uoe = new b(p0, layer, p3.c.get(layer.i()), p3);
                break;
              case 3:
                uoe = new f(p0, layer);
                break;
              case 4:
                b uob = p0.h();
                if (uob != null) {
                   String str = layer.b();
                   if (!TextUtils.isEmpty(str)) {
                      boolean b = uob.a.containsKey(str);
                   label_0099 :
                      if (uob) {
                         uob = new b(p0, layer);
                      }else {
                         uoe = new c(p0, layer);
                      }
                   }
                }
                uob = null;
                goto label_0099 ;
                break;
              case 5:
                uoe = new d(p0, layer);
                break;
              case 6:
                uoe = new g(p0, layer);
                break;
              default:
                d.c("Unknown layer type "+layer.d());
                uoe = null;
          }
          if (uoe != null) {
             longSparseAr.put(uoe.k().a(), uoe);
             if (i1 != null) {
                i1.q = uoe;
                i1 = 0;
             }else {
                this.x.add(i2, uoe);
                i2 = b$a.a[layer.f().ordinal()];
                if (i2 == 1 || i2 == 2) {
                   i1 = uoe;
                }
             }
          }
          i = i - 1;
       }
       while (i2 < longSparseAr.size()) {
          a uoa1 = longSparseAr.get(longSparseAr.keyAt(i2));
          if (uoa1 != null) {
             a uoa2 = longSparseAr.get(uoa1.k().h());
             if (uoa2 != null) {
                uoa1.r = uoa2;
             }
          }
          i2 = i2 + 1;
       }
       return;
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       super.c(p0, p1, p2);
       for (int i = this.x.size() - 1; i >= 0; i--) {
          this.y.set(0, 0, 0, 0);
          this.x.get(i).c(this.y, this.m, 1);
          p0.union(this.y);
       }
       return;
    }
    public void f(Object p0,c p1){
       super.f(p0, p1);
       if (p0 == j.A) {
          if (p1 == null) {
             this.w = null;
          }else {
             p0 = new p(p1);
             this.w = p0;
             this.d(p0);
          }
       }
       return;
    }
    public void j(Canvas p0,Matrix p1,int p2){
       d.a("CompositionLayer#draw");
       p0.save();
       a to = this.o;
       this.z.set(0, 0, (float)to.o, (float)to.p);
       p1.mapRect(this.z);
       int i = this.x.size() - 1;
       while (i >= 0) {
          boolean b = (!this.z.isEmpty())? p0.clipRect(this.z): true;
          if (b) {
             this.x.get(i).a(p0, p1, p2);
          }
          i = i - 1;
       }
       p0.restore();
       d.b("CompositionLayer#draw");
       return;
    }
    public void q(d p0,int p1,List p2,d p3){
       for (int i = 0; i < this.x.size(); i = i + 1) {
          this.x.get(i).g(p0, p1, p2, p3);
       }
       return;
    }
    public void s(float p0){
       super.s(p0);
       if (this.w != null) {
          p0 = (float)(long)(this.w.h().floatValue() * 1000.00f) / this.n.g().d();
       }
       if (this.o.m() - null) {
          p0 = p0 / this.o.m();
       }
       a to = this.o;
       p0 = p0 - (to.n / to.b.e());
       for (int i = this.x.size() - 1; i >= 0; i = i - 1) {
          this.x.get(i).s(p0);
       }
       return;
    }
}
