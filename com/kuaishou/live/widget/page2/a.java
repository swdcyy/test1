package com.kuaishou.live.widget.page2.a;
import com.kuaishou.live.widget.page2.ViewPager2$g;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import java.util.ConcurrentModificationException;
import java.lang.Float;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public final class a extends ViewPager2$g	// class@00103b
{
    public final List a;

    public void a(int p0){
       super();
       this.a = new ArrayList(p0);
    }
    public void a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       try{
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }catch(java.util.ConcurrentModificationException e4){
          this.e(e4);
       }
       return;
    }
    public void b(int p0,float p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, a.class, "3")) {
          return;
       }
       try{
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p0, p1, p2);
          }
       }catch(java.util.ConcurrentModificationException e8){
          this.e(e8);
       }
       return;
    }
    public void c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       try{
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().c(p0);
          }
       }catch(java.util.ConcurrentModificationException e4){
          this.e(e4);
       }
       return;
    }
    public void d(ViewPager2$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public final void e(ConcurrentModificationException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", p0);
    }
}
