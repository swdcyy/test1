package com.yxcorp.gifshow.camera.record.h;
import android.content.Context;
import com.yxcorp.gifshow.camera.record.h$b;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.TreeRangeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.camera.record.h$a;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Comparable;
import qk.k0;
import com.google.common.collect.Range;
import java.util.Iterator;
import android.view.View;
import uzc.a;
import uzc.b;
import com.yxcorp.gifshow.camera.record.h$c;
import android.util.Property;
import android.animation.ObjectAnimator;
import java.lang.Boolean;
import qb9.v;
import java.lang.Runnable;
import t45.c;

public class h	// class@001d47
{
    public final List a;
    public final List b;
    public final List c;
    public OrientationEventListener d;
    public final List e;
    public int f;
    public int g;
    public int h;
    public k0 i;
    public final Context j;
    public final AtomicBoolean k;
    public final h$a l;

    public void h(Context p0){
       super(p0, null);
    }
    public void h(Context p0,h$b p1){
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.c = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       this.e = uArrayList;
       this.g = 0;
       this.h = -1;
       this.i = TreeRangeSet.create();
       this.k = new AtomicBoolean();
       this.l = new h$a(this);
       this.j = p0.getApplicationContext();
       if (p1 != null) {
          uArrayList.add(p1);
       }
       this.h(true);
       return;
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "9")) {
          return;
       }
       this.a.addAll(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h.class, "17")) {
          return;
       }
       this.a.clear();
       this.b.clear();
       this.c.clear();
       return;
    }
    public final int c(int p0){
       return ((p0 + 360) % 360);
    }
    public int d(){
       return this.g;
    }
    public void e(int p0){
       int i;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "1")) {
          return;
       }
       if (p0 == -1) {
          return;
       }
       h oh1 = 360;
       this.f = this.c((p0 - 360));
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, oh, "2");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(this.i.contains(Integer.valueOf(this.f))){
          i = this.g;
       }else {
          int i1 = this.c((((this.f + 45) / 90) * 90));
          int i2 = i1 - 60;
          int i3 = i1 + 60;
          if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), Integer.valueOf(i3), this, oh, "3")) {
             this.i.clear();
             i = this.c(i2);
             i2 = this.c(i3);
             if (i < i2) {
                this.i.add(Range.closed(Integer.valueOf(i), Integer.valueOf(i2)));
             }else if(i > i2){
                this.i.add(Range.closed(Integer.valueOf(i), Integer.valueOf(oh1)));
                this.i.add(Range.closed(Integer.valueOf(0), Integer.valueOf(i2)));
             }
          }
          i = i1;
       }
       this.g = i;
       if (i == this.h) {
          return;
       }else {
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             this.g(iterator.next());
          }
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             View view = (uoa.a.b())? uoa.a.a(uoa.b): objArray;
             this.g(view);
          }
          Iterator iterator1 = this.c.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().a(this.f(), this.h, this.g);
          }
          this.h = this.g;
          return;
       }
    }
    public boolean f(){
       h tg = this.g;
       boolean b = (tg == null || tg == 180)? true: false;
       return b;
    }
    public final void g(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       h th = this.h;
       h tg = this.g;
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().x(p0, this.f(), tg, 250);
       }
       Property property = 270;
       if (th == null && tg == property) {
          tg = -90;
       }
       if (th == property && tg == null) {
          tg = 360;
       }
       float[] uofloatArray = new float[]{(float)th,(float)tg};
       ObjectAnimator.ofFloat(p0, View.ROTATION, uofloatArray).setDuration(250).start();
       return;
    }
    public void h(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "5")) {
          return;
       }
       this.i(p0, false);
       return;
    }
    public void i(boolean p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oh, "6")) {
          return;
       }
       if (this.k.get() == p0) {
          return;
       }
       this.k.set(p0);
       if (p0) {
          if (p1) {
             this.e((this.g - 360));
          }
       }else if(p1){
          this.e(0);
       }
       c.a(new v(this));
       return;
    }
}
