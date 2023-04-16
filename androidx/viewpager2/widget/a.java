package androidx.viewpager2.widget.a;
import androidx.viewpager2.widget.ViewPager2$h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import java.util.ConcurrentModificationException;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;

public final class a extends ViewPager2$h	// class@000a3e
{
    public final List a;

    public void a(int p0){
       super();
       this.a = new ArrayList(p0);
    }
    public void a(int p0){
       try{
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
          return;
       }catch(java.util.ConcurrentModificationException e3){
          this.f(e3);
          throw null;
       }
    }
    public void b(int p0,float p1,int p2){
       try{
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p0, p1, p2);
          }
          return;
       }catch(java.util.ConcurrentModificationException e3){
          this.f(e3);
          throw null;
       }
    }
    public void c(int p0){
       try{
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().c(p0);
          }
          return;
       }catch(java.util.ConcurrentModificationException e3){
          this.f(e3);
          throw null;
       }
    }
    public void d(ViewPager2$h p0){
       this.a.add(p0);
    }
    public void e(ViewPager2$h p0){
       this.a.remove(p0);
    }
    public final void f(ConcurrentModificationException p0){
       throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", p0);
    }
}
