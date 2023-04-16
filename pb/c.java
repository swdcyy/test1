package pb.c;
import com.facebook.drawee.controller.AbstractDraweeController;
import android.content.res.Resources;
import tb.a;
import zc.a;
import java.util.concurrent.Executor;
import tc.v;
import com.facebook.common.internal.ImmutableList;
import java.lang.String;
import java.lang.Object;
import pb.a;
import ac.a;
import ab.d;
import rb.c;
import rb.a;
import java.util.List;
import ab.h;
import android.graphics.drawable.Drawable;
import com.facebook.common.references.a;
import kd.b;
import ab.e;
import com.facebook.imagepipeline.image.a;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import dd.d;
import rb.d;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import java.util.Set;
import com.facebook.cache.common.CacheKey;
import rb.g;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import rb.h;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import hb.b;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import com.facebook.imagepipeline.request.ImageRequest;
import rb.j;
import java.util.Iterator;
import java.util.ArrayList;
import bd.h;
import kb.c;
import cb.a;
import java.lang.System;
import java.lang.Integer;
import java.lang.Class;
import com.facebook.common.references.SharedReference;
import bd.f;
import android.net.Uri;
import ab.c;
import vb.a;
import wb.a;
import wb.b;
import qb.b;
import ub.b;
import ac.b;
import xb.s;
import xb.t;
import xb.t$b;
import rb.e;
import qb.a;
import android.util.SparseIntArray;
import java.util.Map;
import bd.e;
import ob.a;
import ab.d$b;

public class c extends AbstractDraweeController	// class@002906
{
    public final Resources a;
    public final a b;
    public final ImmutableList c;
    public final v d;
    public CacheKey e;
    public h f;
    public boolean g;
    public ImmutableList h;
    public h i;
    public Set j;
    public c k;
    public b l;
    public ImageRequest m;
    public ImageRequest[] n;
    public ImageRequest o;
    public static final Class p;

    static {
       c.p = c.class;
    }
    public void c(Resources p0,a p1,a p2,Executor p3,v p4,ImmutableList p5){
       super(p1, p3, null, null);
       this.a = p0;
       this.b = new a(p0, p2);
       this.c = p5;
       this.d = p4;
    }
    public boolean a(a p0){
       c te = this.e;
       if (te != null && p0 instanceof c) {
          return d.a(te, p0.e);
       }
       return false;
    }
    public synchronized void b(c p0){
       c tk = this.k;
       if (tk instanceof a) {
          _monitor_enter(tk);
          tk.a.add(p0);
          _monitor_exit(tk);
       }else if(tk != null){
          c[] uocArray = new c[]{tk,p0};
          this.k = new a(uocArray);
       }else {
          this.k = p0;
       }
       return;
    }
    public h c(){
       return this.f;
    }
    public Drawable createDrawable(Object p0){
       if (b.d()) {
          b.a("PipelineDraweeController#createDrawable");
       }
       e.f(a.l(p0));
       p0 = p0.j();
       this.h(p0);
       Drawable uDrawable = this.g(this.h, p0);
       if (uDrawable != null) {
          if (b.d()) {
          label_002b :
             b.b();
          }
       }else {
          uDrawable = this.g(this.c, p0);
          if (uDrawable != null) {
             if (b.d()) {
                goto label_002b ;
             }
          }else {
             uDrawable = this.b.a(p0);
             if (uDrawable != null) {
                if (b.d()) {
                   goto label_002b ;
                }
             }else {
                throw new UnsupportedOperationException("Unrecognized image class: "+p0);
             }
          }
       }
       return uDrawable;
    }
    public synchronized d d(){
       d uod = null;
       if (this.k != null) {
          uod = new d(this.getId(), this.k);
       }
       c tj = this.j;
       if (tj != null) {
          ForwardingRequestListener uForwardingR = new ForwardingRequestListener(tj);
          if (uod != null) {
             uForwardingR.addRequestListener(uod);
          }
          return uForwardingR;
       }else {
          return uod;
       }
    }
    public void e(h p0,String p1,CacheKey p2,Object p3,ImmutableList p4,c p5){
       if (b.d()) {
          b.a("PipelineDraweeController#initialize");
       }
       super.initialize(p1, p3);
       this.f = p0;
       this.h(null);
       this.e = p2;
       this.i(p4);
       _monitor_enter(this);
       this.k = null;
       _monitor_exit(this);
       this.h(null);
       this.b(p5);
       if (b.d()) {
          b.b();
       }
       return;
    }
    public synchronized void f(g p0,AbstractDraweeControllerBuilder p1,h p2){
       c ti = this.i;
       if (ti != null) {
          ti.c();
       }
       if (p0 != null) {
          if (this.i == null) {
             this.i = new h(AwakeTimeSinceBootClock.get(), this, p2);
          }
          c ti1 = this.i;
          Objects.requireNonNull(ti1);
          if (ti1.j == null) {
             ti1.j = new CopyOnWriteArrayList();
          }
          ti1.j.add(p0);
          this.i.d(true);
          h c = this.i.c;
          c.f = p1.k();
          c.g = p1.l();
          c.h = p1.j();
       }
       this.m = p1.k();
       this.n = p1.j();
       this.o = p1.l();
       return;
    }
    public final Drawable g(ImmutableList p0,a p1){
       Drawable uDrawable;
       if (p0 == null) {
          return null;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          a uoa = iterator.next();
          if (uoa.b(p1)) {
             uDrawable = uoa.a(p1);
             if (uDrawable != null) {
                break ;
             }
          }
       }
       return uDrawable;
    }
    public Object getCachedImage(){
       if (b.d()) {
          b.a("PipelineDraweeController#getCachedImage");
       }
       c td = this.d;
       a uoa = null;
       if (td != null) {
          c te = this.e;
          if (te == null) {
          label_0043 :
             if (b.d()) {
             label_0034 :
                b.b();
             }
          }else {
             a uoa1 = td.get(te);
             if (uoa1 != null && !uoa1.j().a().a()) {
                uoa1.close();
                if (b.d()) {
                   goto label_0034 ;
                }
             }else if(b.d()){
                b.b();
             }
             uoa = uoa1;
          }
       }else {
          goto label_0043 ;
       }
       return uoa;
    }
    public c getDataSource(){
       if (b.d()) {
          b.a("PipelineDraweeController#getDataSource");
       }
       if (a.l(2)) {
          a.n(c.p, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
       }
       c uoc = this.f.get();
       if (b.d()) {
          b.b();
       }
       return uoc;
    }
    public int getImageHash(Object p0){
       int i = 0;
       if (p0 != null && p0.k()) {
          i = System.identityHashCode(p0.c.c());
       }
       return i;
    }
    public Object getImageInfo(Object p0){
       e.f(a.l(p0));
       return p0.j();
    }
    public Uri getMainUri(){
       Uri uri;
       c tm = this.m;
       c to = this.o;
       c tn = this.n;
       c w = ImageRequest.w;
       if (tm != null) {
          uri = w.apply(tm);
          if (uri == null) {
          label_0013 :
             if (tn != null && tn.length > 0) {
                int i = 0;
                if (tn[i] != null) {
                   uri = w.apply(tn[i]);
                   if (uri == null) {
                   }
                }else if(to != null){
                   uri = w.apply(to);
                }else {
                   uri = null;
                }
             }else {
                goto label_0028 ;
             }
          }
       }else {
          goto label_0013 ;
       }
       return uri;
    }
    public final void h(a p0){
       if (this.g == null) {
          return;
       }
       if (this.getControllerOverlay() == null) {
          a uoa = new a();
          this.l = new b();
          this.addControllerListener(new a(uoa));
          this.setControllerOverlay(uoa);
       }
       if (this.k == null) {
          this.b(this.l);
       }
       if (this.getControllerOverlay() instanceof a) {
          this.j(p0, this.getControllerOverlay());
       }
       return;
    }
    public void i(ImmutableList p0){
       this.h = p0;
    }
    public void j(a p0,a p1){
       p1.f(this.getId());
       b hierarchy = this.getHierarchy();
       t$b uob = null;
       if (hierarchy != null) {
          s os = t.a(hierarchy.c());
          if (os != null) {
             uob = os.y();
          }
       }
       p1.h = uob;
       hierarchy = this.l.a;
       String str = e.b(hierarchy);
       p1.w = str;
       p1.x = a.a.get(hierarchy, -1);
       p1.invalidateSelf();
       if (p0 != null) {
          p1.d = p0.getWidth();
          p1.e = p0.getHeight();
          p1.invalidateSelf();
          p1.f = p0.c();
       }else {
          p1.e();
       }
       return;
    }
    public Map obtainExtrasFromImage(Object p0){
       p0 = (p0 == null)? null: p0.getExtras();
       return p0;
    }
    public void onImageLoadedFromCacheImmediately(String p0,Object p1){
       super.onImageLoadedFromCacheImmediately(p0, p1);
       _monitor_enter(this);
       p1 = this.k;
       if (p1 != null) {
          p1.a(p0, 6, true, "PipelineDraweeController");
       }
       _monitor_exit(this);
       return;
    }
    public void releaseDrawable(Drawable p0){
       if (p0 instanceof a) {
          p0.a();
       }
       return;
    }
    public void releaseImage(Object p0){
       a.f(p0);
    }
    public void setHierarchy(b p0){
       super.setHierarchy(p0);
       this.h(null);
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.b("super", super.toString());
       uob.b("dataSourceSupplier", this.f);
       return uob.toString();
    }
}
