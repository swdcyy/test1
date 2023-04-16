package com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$b;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$d;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$y;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$c;
import androidx.recyclerview.widget.RecyclerView$t;
import android.view.View;
import a2.i0;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$e;
import cac.b;
import java.util.Collection;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.os.Handler;
import android.os.Looper;
import cac.a;
import java.lang.Runnable;
import java.lang.StrictMath;
import java.lang.Boolean;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$CarouselSavedState;
import android.os.Parcelable;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public class CarouselLayoutManager extends RecyclerView$LayoutManager implements RecyclerView$x$b	// class@0017f5
{
    public boolean b;
    public Integer c;
    public Integer d;
    public final int e;
    public boolean f;
    public int g;
    public final CarouselLayoutManager$b h;
    public CarouselLayoutManager$e i;
    public final List j;
    public int k;
    public int l;
    public CarouselLayoutManager$CarouselSavedState m;
    public static float n = 0.000000;
    public static float o = 0.000000;

    public void CarouselLayoutManager(int p0){
       super(p0, false);
    }
    public void CarouselLayoutManager(int p0,boolean p1){
       super();
       this.h = new CarouselLayoutManager$b(3);
       this.j = new ArrayList();
       this.k = -1;
       if (p0 && 1 != p0) {
          throw new IllegalArgumentException("orientation should be HORIZONTAL or VERTICAL");
       }
       this.e = p0;
       this.f = p1;
       this.g = -1;
       return;
    }
    public static float Z(float p0,int p1){
       CarouselLayoutManager uCarouselLay = CarouselLayoutManager.class;
       if (PatchProxy.isSupport(uCarouselLay)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), null, uCarouselLay, "40");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       while (0 - p0 > 0) {
          p0 = p0 + (float)p1;
       }
       while (Math.round(p0) >= p1) {
          p0 = p0 - (float)p1;
       }
       return p0;
    }
    public void N(CarouselLayoutManager$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CarouselLayoutManager.class, "7")) {
          return;
       }
       this.j.add(p0);
       return;
    }
    public final int O(int p0,RecyclerView$y p1){
       CarouselLayoutManager uCarouselLay = CarouselLayoutManager.class;
       if (PatchProxy.isSupport(uCarouselLay)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uCarouselLay, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == -1) {
          return 0;
       }else if(p0 < p1.c()){
          p0 = p1.c() - 1;
       }
       CarouselLayoutManager td = (1 == this.e)? this.d: this.c;
       return (p0 * td.intValue());
    }
    public final void P(int p0,int p1,int p2,int p3,CarouselLayoutManager$c p4,RecyclerView$t p5,int p6){
       View view;
       b uob;
       Object obj = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       int i3 = p3;
       object oobject = p4;
       object oobject1 = p5;
       CarouselLayoutManager uCarouselLay = CarouselLayoutManager.class;
       int i4 = 0;
       if (PatchProxy.isSupport(uCarouselLay)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),oobject,oobject1,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, obj, uCarouselLay, "25")) {
             return;
          }
       }
       CarouselLayoutManager$c a = oobject.a;
       if (PatchProxy.isSupport(uCarouselLay)) {
          view = PatchProxy.applyTwoRefs(Integer.valueOf(a), oobject1, obj, uCarouselLay, "31");
          if (view != PatchProxyResult.class) {
          label_006e :
             i0.A0(view, (float)p6);
             CarouselLayoutManager$c uoc = null;
             CarouselLayoutManager i5 = obj.i;
             if (i5 != null) {
                uoc = oobject.b;
                CarouselLayoutManager e = obj.e;
                CarouselLayoutManager$c a1 = oobject.a;
                if (PatchProxy.isSupport(CarouselLayoutManager$e.class)) {
                   uob = PatchProxy.applyFourRefs(view, Float.valueOf(uoc), Integer.valueOf(e), Integer.valueOf(a1), i5, CarouselLayoutManager$e.class, "1");
                   if (uob != PatchProxyResult.class) {
                   label_00a6 :
                      uoc = uob;
                   }
                }
                uob = i5.a(view, uoc, e);
                goto label_00a6 ;
             }
             if (uoc == null) {
                view.layout(i, i1, i2, i3);
             }else {
                view.layout(Math.round(((float)i + uoc.c)), Math.round(((float)i1 + uoc.d)), Math.round(((float)i2 + uoc.c)), Math.round(((float)i3 + uoc.d)));
                view.setScaleX(uoc.a);
                view.setScaleY(uoc.b);
             }
             return;
          }
       }
       view = oobject1.o(a);
       obj.addView(view);
       obj.measureChildWithMargins(view, i4, i4);
       goto label_006e ;
    }
    public final void Q(RecyclerView$t p0,RecyclerView$y p1){
       int i1;
       int i2;
       int i3;
       int i5;
       int i6;
       object oobject;
       int i8;
       int i9;
       int this;
       int i11;
       float f2;
       float f3;
       float f5;
       int i = this;
       Object obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, i, CarouselLayoutManager.class, "20")) {
          return;
       }
       float f = this.S();
       List list = 1;
       if (!PatchProxy.isSupport(CarouselLayoutManager.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), obj1, i, CarouselLayoutManager.class, "28")) {
          int i4 = p1.c();
          i.l = i4;
          float f1 = CarouselLayoutManager.Z(f, i4);
          int i7 = Math.round(f1);
          if (i.f != null) {
             CarouselLayoutManager l = i.l;
             if (list < l) {
                this = Math.min(((i.h.a * 2) + list), l);
                i.h.c(this);
                i8 = this / 2;
                for (i11 = 1; i11 <= i8; i11 = i11 + 1) {
                   f2 = (float)i11;
                   f3 = f1 - f2;
                   f3 = f3 + (float)i.l;
                   i3 = Math.round(f3) % i.l;
                   i6 = i8 - i11;
                   float f4 = (float)i7 - f1;
                   f4 = f4 - f2;
                   i.h.d(i6, i3, f4);
                }
                i11 = this - 1;
                i1 = i11;
                i2 = i8 + 1;
                while (i1 >= i2) {
                   f2 = (float)i1;
                   f3 = f1 - f2;
                   f5 = (float)this;
                   f3 = f3 + f5;
                   i3 = Math.round(f3) % i.l;
                   i1 = i1 - 1;
                   float f6 = (float)i7 - f1;
                   f6 = f6 + f5;
                   f6 = f6 - f2;
                   i.h.d(i1, i3, f6);
                   CarouselLayoutManager uCarouselLay = 1;
                }
                i.h.d(i11, i7, ((float)i7 - f1));
             }
          }
          i1 = 0;
          int i10 = Math.max((i7 - i.h.a), i1);
          this = Math.min((i.h.a + i7), (i.l - 1));
          i8 = (this - i10) + 1;
          i.h.c(i8);
          i11 = i10;
          while (i11 <= this) {
             if (i11 == i7) {
                i3 = i8 - 1;
                f5 = (float)i11 - f1;
                i.h.d(i3, i11, f5);
             }else if(i11 < i7){
                i3 = i11 - i10;
                f5 = (float)i11 - f1;
                i.h.d(i3, i11, f5);
             }else {
                i3 = i11 - i7;
                i3 = i8 - i3;
                i3 = i3 - 1;
                f5 = (float)i11 - f1;
                i.h.d(i3, i11, f5);
             }
             i11 = i11 + 1;
          }
          this.detachAndScrapAttachedViews(p0);
          if (!PatchProxy.applyVoidOneRefs(obj, i, CarouselLayoutManager.class, "32")) {
             Iterator iterator = new ArrayList(p0.k()).iterator();
             while (iterator.hasNext()) {
                RecyclerView$ViewHolder viewHolder = iterator.next();
                i7 = viewHolder.getAdapterPosition();
                CarouselLayoutManager$b c = i.h.c;
                i8 = c.length;
                i11 = 0;
                while (true) {
                   if (i11 < i8) {
                      if (c[i11].a == i7) {
                         i11 = 1;
                      label_0120 :
                         if (!i11) {
                            obj.B(viewHolder.itemView);
                         }else {
                            continue ;
                         }
                      }else {
                         i11 = i11 + 1;
                      }
                   }else {
                      i11 = 0;
                      goto label_0120 ;
                   }
                }
             }
          }
          i2 = this.Y();
          i3 = this.T();
          if (1 == i.e) {
             if (!PatchProxy.isSupport(CarouselLayoutManager.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i2), Integer.valueOf(i3), this, CarouselLayoutManager.class, "23")) {
                i5 = (i2 - i.c.intValue()) / 2;
                i6 = i5 + i.c.intValue();
                i3 = (i3 - i.d.intValue()) / 2;
                i2 = i.h.c.length;
                for (; i1 < i2; i2 = i2) {
                   oobject = i.h.c[i1];
                   i7 = i3 + i.R(oobject.b);
                   i8 = i7 + i.d.intValue();
                   i9 = i1;
                   this.P(i5, i7, i6, i8, oobject, p0, i9);
                   i1 = i9 + 1;
                }
             }
          }else if(PatchProxy.isSupport(CarouselLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i2), Integer.valueOf(i3), this, CarouselLayoutManager.class, "24")){
             i3 = (i3 - i.d.intValue()) / 2;
             i5 = i3 + i.d.intValue();
             i6 = (i2 - i.c.intValue()) / 2;
             i2 = i.h.c.length;
             for (; i1 < i2; i2 = i2) {
                oobject = i.h.c[i1];
                i10 = i6 + i.R(oobject.b);
                this = i10 + i.c.intValue();
                i9 = i1;
                this.P(i10, i3, this, i5, oobject, p0, i9);
                i1 = i9 + 1;
             }
          }
          p0.c();
          if (!PatchProxy.isSupport(CarouselLayoutManager.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), obj1, i, CarouselLayoutManager.class, "21")) {
             i4 = Math.round(CarouselLayoutManager.Z(f, p1.c()));
             if (i.k != i4) {
                i.k = i4;
                new Handler(Looper.getMainLooper()).post(new a(i, i4));
             }
          }
          return;
       }
       i1 = 0;
       goto label_00e3 ;
    }
    public int R(float p0){
       double d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CarouselLayoutManager uCarouselLay = CarouselLayoutManager.class;
       if (PatchProxy.isSupport(uCarouselLay)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uCarouselLay, "33");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (PatchProxy.isSupport(uCarouselLay)) {
          Object obj1 = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uCarouselLay, "34");
          if (obj1 != patchProxyRe) {
             d = obj1.doubleValue();
          }else {
          label_0036 :
             float f = Math.abs(p0);
             double d1 = (double)f;
             d = (d1 - StrictMath.pow((double)(0x3f800000 / (float)this.h.a), 0x3fd5555560000000) > 0)? StrictMath.pow((double)(f / (float)this.h.a), 0x3fe0000000000000): StrictMath.pow(d1, 2.00f);
          }
       }else {
          goto label_0036 ;
       }
       int i = (1 == this.e)? (this.T() - this.d.intValue()) / 2: (this.Y() - this.c.intValue()) / 2;
       return (int)Math.round(((double)(Math.signum(p0) * (float)i) * d));
    }
    public float S(){
       Object obj = PatchProxy.apply(null, this, CarouselLayoutManager.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (!this.U()) {
          return 0;
       }
       return (((float)this.h.b * 0x3f800000) / (float)this.X());
    }
    public int T(){
       Object obj = PatchProxy.apply(null, this, CarouselLayoutManager.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.getHeight() - this.getPaddingEnd()) - this.getPaddingStart());
    }
    public final int U(){
       Object obj = PatchProxy.apply(null, this, CarouselLayoutManager.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.X() * (this.l - 1));
    }
    public int V(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CarouselLayoutManager.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.round((this.W(this.getPosition(p0)) * (float)this.X()));
    }
    public final float W(int p0){
       CarouselLayoutManager uCarouselLay = CarouselLayoutManager.class;
       if (PatchProxy.isSupport(uCarouselLay)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uCarouselLay, "12");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = CarouselLayoutManager.Z(this.S(), this.l);
       if (this.f != null) {
          f = f - (float)p0;
          float f1 = Math.abs(f) - (float)this.l;
          if (Math.abs(f) - Math.abs(f1) > 0) {
             f = Math.signum(f) * f1;
          }
          return f;
       }else {
          return (f - (float)p0);
       }
    }
    public int X(){
       Object obj = PatchProxy.apply(null, this, CarouselLayoutManager.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (1 == this.e) {
          return this.d.intValue();
       }
       return this.c.intValue();
    }
    public int Y(){
       Object obj = PatchProxy.apply(null, this, CarouselLayoutManager.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.getWidth() - this.getPaddingStart()) - this.getPaddingEnd());
    }
    public void a0(int p0){
       CarouselLayoutManager uCarouselLay = CarouselLayoutManager.class;
       if (PatchProxy.isSupport(uCarouselLay) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCarouselLay, "22")) {
          return;
       }
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void b0(int p0){
       CarouselLayoutManager uCarouselLay = CarouselLayoutManager.class;
       if (PatchProxy.isSupport(uCarouselLay) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCarouselLay, "3")) {
          return;
       }
       if (p0 < 0) {
          throw new IllegalArgumentException("maxVisibleItems can\'t be less then 0");
       }
       this.h.a = p0;
       this.requestLayout();
       return;
    }
    public void c0(CarouselLayoutManager$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CarouselLayoutManager.class, "2")) {
          return;
       }
       this.i = p0;
       this.requestLayout();
       return;
    }
    public boolean canScrollHorizontally(){
       Object obj = PatchProxy.apply(null, this, CarouselLayoutManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getChildCount() && this.e == null)? true: false;
       return b;
    }
    public boolean canScrollVertically(){
       Object obj = PatchProxy.apply(null, this, CarouselLayoutManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.getChildCount() || b != this.e) {
          b = false;
       }
       return b;
    }
    public PointF computeScrollVectorForPosition(int p0){
       CarouselLayoutManager uCarouselLay = CarouselLayoutManager.class;
       if (PatchProxy.isSupport(uCarouselLay)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uCarouselLay, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.getChildCount()) {
          return null;
       }else {
          p0 = (int)(- Math.signum(this.W(p0)));
          if (this.e == null) {
             return new PointF((float)p0, 0);
          }else {
             return new PointF(0, (float)p0);
          }
       }
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, CarouselLayoutManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-2, -2);
    }
    public void onAdapterChanged(RecyclerView$Adapter p0,RecyclerView$Adapter p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CarouselLayoutManager.class, "17")) {
          return;
       }
       super.onAdapterChanged(p0, p1);
       this.removeAllViews();
       return;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       int i3;
       CarouselLayoutManager tg;
       View view;
       CarouselLayoutManager tc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CarouselLayoutManager.class, "18")) {
          return;
       }
       int i = -1;
       if (!p1.c()) {
          this.removeAndRecycleAllViews(p0);
          this.a0(i);
          return;
       }else {
          this.detachAndScrapAttachedViews(p0);
          int i1 = 1;
          int i2 = 0;
          if (this.c == null || this.b != null) {
             List list = p0.k();
             if (list.isEmpty()) {
                i3 = p1.c();
                tg = this.g;
                i3 = (tg == i)? 0: Math.max(i2, Math.min((i3 - i1), tg));
                view = p0.o(i3);
                this.addView(view);
                tg = 1;
             }else {
                view = list.get(i2).itemView;
                tg = 0;
             }
             this.measureChildWithMargins(view, i2, i2);
             int decoratedMea = this.getDecoratedMeasuredWidth(view);
             int decoratedMea1 = this.getDecoratedMeasuredHeight(view);
             if (tg) {
                this.detachAndScrapView(view, p0);
             }
             tc = this.c;
             if (tc != null && (tc.intValue() != decoratedMea || (this.d.intValue() != decoratedMea1 && (i == this.g && this.m == null)))) {
                this.g = this.k;
             }
          label_0083 :
             this.c = Integer.valueOf(decoratedMea);
             this.d = Integer.valueOf(decoratedMea1);
             this.b = i2;
          }
          if (i != this.g) {
             i3 = p1.c();
             i3 = (!i3)? -1: Math.max(i2, Math.min((i3 - i1), this.g));
             this.g = i3;
          }
          tc = this.g;
          if (i != tc) {
             this.h.b = this.O(tc, p1);
             this.g = i;
             this.m = null;
          }else {
             tc = this.m;
             if (tc != null) {
                this.h.b = this.O(tc.c, p1);
                this.m = null;
             }else if(p1.b()){
                tc = this.k;
                if (i != tc) {
                   this.h.b = this.O(tc, p1);
                }
             }
          }
          this.Q(p0, p1);
          return;
       }
    }
    public void onMeasure(RecyclerView$t p0,RecyclerView$y p1,int p2,int p3){
       if (PatchProxy.isSupport(CarouselLayoutManager.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, CarouselLayoutManager.class, "16")) {
          return;
       }
       this.b = true;
       super.onMeasure(p0, p1, p2, p3);
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CarouselLayoutManager.class, "37")) {
          return;
       }
       if (p0 instanceof CarouselLayoutManager$CarouselSavedState) {
          this.m = p0;
          super.onRestoreInstanceState(p0.b);
       }else {
          super.onRestoreInstanceState(p0);
       }
       return;
    }
    public Parcelable onSaveInstanceState(){
       CarouselLayoutManager obj = PatchProxy.apply(null, this, CarouselLayoutManager.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj != null) {
          return new CarouselLayoutManager$CarouselSavedState(obj);
       }
       CarouselLayoutManager$CarouselSavedState uCarouselSav = new CarouselLayoutManager$CarouselSavedState(super.onSaveInstanceState());
       uCarouselSav.c = this.k;
       return uCarouselSav;
    }
    public int scrollBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       int i1;
       if (PatchProxy.isSupport(CarouselLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, CarouselLayoutManager.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (this.c == null || (this.d != null && (!this.getChildCount() || !p0))) {
          return i;
       }else if(this.f != null){
          CarouselLayoutManager$b.a(this.h, p0);
          i1 = this.X() * this.l;
          CarouselLayoutManager th = this.h;
          while (th.b < null) {
             CarouselLayoutManager$b.a(th, i1);
          }
          th = this.h;
          while (th.b > i1) {
             CarouselLayoutManager$b.b(th, i1);
          }
          CarouselLayoutManager$b.b(th, p0);
       }else {
          i1 = this.U();
          CarouselLayoutManager$b b = this.h.b;
          if ((b + p0) < 0) {
             p0 = - b;
          }else if((b + p0) > i1){
             p0 = i1 - b;
          }
       }
       if (p0) {
          CarouselLayoutManager$b.a(this.h, p0);
          this.Q(p1, p2);
       }
       return p0;
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(CarouselLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, CarouselLayoutManager.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (Float.MIN_VALUE == this.e) {
          return 0;
       }else {
          float f = (float)p0;
          int i = this.scrollBy((int)(CarouselLayoutManager.n * f), p1, p2);
          if (!(float)i - (f * CarouselLayoutManager.n)) {
             return p0;
          }else {
             return i;
          }
       }
    }
    public void scrollToPosition(int p0){
       CarouselLayoutManager uCarouselLay = CarouselLayoutManager.class;
       if (PatchProxy.isSupport(uCarouselLay) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCarouselLay, "9")) {
          return;
       }
       if (p0 < 0) {
          throw new IllegalArgumentException("position can\'t be less then 0. position is : "+p0);
       }
       this.g = p0;
       this.requestLayout();
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(CarouselLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, CarouselLayoutManager.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.e == null) {
          return 0;
       }else {
          return this.scrollBy(p0, p1, p2);
       }
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(CarouselLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CarouselLayoutManager.class, "10")) {
          return;
       }
       CarouselLayoutManager$a uoa = new CarouselLayoutManager$a(this, p0.getContext());
       uoa.p(p2);
       this.startSmoothScroll(uoa);
       return;
    }
}
