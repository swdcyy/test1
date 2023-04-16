package com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder$a;
import java.lang.NullPointerException;
import java.lang.String;
import java.util.concurrent.atomic.AtomicLong;
import android.content.Context;
import java.util.Set;
import java.lang.Object;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeController;
import ab.e;
import kd.b;
import ub.c;
import tb.c;
import zb.a;
import java.util.Iterator;
import ub.b;
import com.facebook.fresco.ui.common.b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel;
import kb.c;
import ab.h;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder$b;
import java.util.ArrayList;
import java.util.List;
import kb.f;
import kb.g;
import kb.d;
import java.lang.Throwable;

public abstract class AbstractDraweeControllerBuilder implements d	// class@001089
{
    public final Context a;
    public final Set b;
    public final Set c;
    public Object d;
    public Object e;
    public Object f;
    public Object[] g;
    public boolean h;
    public h i;
    public b j;
    public b k;
    public c l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public a q;
    public static final b r;
    public static final NullPointerException s;
    public static final AtomicLong t;

    static {
       AbstractDraweeControllerBuilder.r = new AbstractDraweeControllerBuilder$a();
       AbstractDraweeControllerBuilder.s = new NullPointerException("No image request was specified!");
       AbstractDraweeControllerBuilder.t = new AtomicLong();
    }
    public void AbstractDraweeControllerBuilder(Context p0,Set p1,Set p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.m();
    }
    public d b(Object p0){
       return this.r(p0);
    }
    public a build(){
       return this.e();
    }
    public d d(a p0){
       this.y(p0);
       return this;
    }
    public AbstractDraweeController e(){
       Iterator iterator;
       boolean b = true;
       boolean b1 = (this.g == null || this.e == null)? true: false;
       e.g(b1, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
       if (this.i != null && (this.g != null || (this.e != null || this.f != null))) {
          b = false;
       }
       e.g(b, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
       if (this.e == null && this.g == null) {
          AbstractDraweeControllerBuilder tf = this.f;
          if (tf != null) {
             this.e = tf;
             this.f = null;
          }
       }
       if (b.d()) {
          b.a("AbstractDraweeControllerBuilder#buildController");
       }
       AbstractDraweeController uAbstractDra = this.n();
       uAbstractDra.setRetainImageOnFailure(this.o);
       uAbstractDra.setContentDescription(this.p);
       uAbstractDra.setControllerViewportVisibilityListener(this.l);
       if (this.m != null) {
          uAbstractDra.getRetryManager().a = this.m;
          if (uAbstractDra.getGestureDetector() == null) {
             uAbstractDra.setGestureDetector(new a(this.a));
          }
       }
       AbstractDraweeControllerBuilder tb = this.b;
       if (tb != null) {
          iterator = tb.iterator();
          while (iterator.hasNext()) {
             uAbstractDra.addControllerListener(iterator.next());
          }
       }
       tb = this.c;
       if (tb != null) {
          iterator = tb.iterator();
          while (iterator.hasNext()) {
             uAbstractDra.addControllerListener2(iterator.next());
          }
       }
       tb = this.j;
       if (tb != null) {
          uAbstractDra.addControllerListener(tb);
       }
       if (this.n != null) {
          uAbstractDra.addControllerListener(AbstractDraweeControllerBuilder.r);
       }
       if (b.d()) {
          b.b();
       }
       return uAbstractDra;
    }
    public Object f(){
       return this.d;
    }
    public abstract c g(a p0,String p1,Object p2,Object p3,AbstractDraweeControllerBuilder$CacheLevel p4);
    public h h(a p0,String p1,Object p2){
       return this.i(p0, p1, p2, AbstractDraweeControllerBuilder$CacheLevel.FULL_FETCH);
    }
    public h i(a p0,String p1,Object p2,AbstractDraweeControllerBuilder$CacheLevel p3){
       AbstractDraweeControllerBuilder$b uob = new AbstractDraweeControllerBuilder$b(this, p0, p1, p2, this.f(), p3);
       return v7;
    }
    public Object[] j(){
       return this.g;
    }
    public Object k(){
       return this.e;
    }
    public Object l(){
       return this.f;
    }
    public final void m(){
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = null;
       this.h = true;
       this.j = null;
       this.k = null;
       this.l = null;
       this.m = false;
       this.n = false;
       this.q = null;
       this.p = null;
    }
    public abstract AbstractDraweeController n();
    public h o(a p0,String p1){
       int i;
       AbstractDraweeControllerBuilder ti = this.i;
       if (ti != null) {
          return ti;
       }
       h oh = null;
       AbstractDraweeControllerBuilder te = this.e;
       if (te != null) {
          oh = this.h(p0, p1, te);
       }else {
          te = this.g;
          if (te != null) {
             ArrayList uArrayList1 = new ArrayList((te.length * 2));
             if (this.h != null) {
                for (i = 0; i < te.length; i = i + 1) {
                   uArrayList1.add(this.i(p0, p1, te[i], AbstractDraweeControllerBuilder$CacheLevel.BITMAP_MEMORY_CACHE));
                }
             }
             for (i = 0; i < te.length; i = i + 1) {
                uArrayList1.add(this.h(p0, p1, te[i]));
             }
             oh = f.b(uArrayList1);
          }
       }
       if (oh != null && this.f != null) {
          ArrayList uArrayList = new ArrayList(2);
          uArrayList.add(oh);
          uArrayList.add(this.h(p0, p1, this.f));
          oh = g.b(uArrayList, false);
       }
       if (oh == null) {
          oh = new d(AbstractDraweeControllerBuilder.s);
       }
       return oh;
    }
    public AbstractDraweeControllerBuilder p(){
       this.m();
       return this;
    }
    public AbstractDraweeControllerBuilder q(boolean p0){
       this.n = p0;
       return this;
    }
    public AbstractDraweeControllerBuilder r(Object p0){
       this.d = p0;
       return this;
    }
    public AbstractDraweeControllerBuilder s(b p0){
       this.j = p0;
       return this;
    }
    public AbstractDraweeControllerBuilder t(h p0){
       this.i = p0;
       return this;
    }
    public AbstractDraweeControllerBuilder u(Object[] p0){
       this.v(p0, true);
       return this;
    }
    public AbstractDraweeControllerBuilder v(Object[] p0,boolean p1){
       boolean b = (p0 == null || p0.length > 0)? true: false;
       e.b(b, "No requests specified!");
       this.g = p0;
       this.h = p1;
       return this;
    }
    public AbstractDraweeControllerBuilder w(Object p0){
       this.e = p0;
       return this;
    }
    public AbstractDraweeControllerBuilder x(Object p0){
       this.f = p0;
       return this;
    }
    public AbstractDraweeControllerBuilder y(a p0){
       this.q = p0;
       return this;
    }
    public AbstractDraweeControllerBuilder z(boolean p0){
       this.m = p0;
       return this;
    }
}
