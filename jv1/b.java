package jv1.b;
import oq5.a;
import android.app.Activity;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import d61.y;
import oq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.lang.Boolean;
import android.content.res.Resources;
import android.content.res.Configuration;
import lp3.e;
import lp3.c;
import lp3.b;
import java.util.Iterator;

public class b implements a	// class@002c15
{
    public Set b;
    public boolean c;
    public boolean d;
    public Activity e;

    public void b(Activity p0){
       super(p0, false);
    }
    public void b(Activity p0,boolean p1){
       super();
       this.b = new CopyOnWriteArraySet();
       this.e = p0;
       this.c = p1;
       this.d = (p1)? y.c(p0): y.d(p0);
       return;
    }
    public boolean H2(){
       return this.d;
    }
    public void H6(c p0){
       this.W0(p0, false);
    }
    public void Q0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.b.remove(p0);
       }
       return;
    }
    public void W0(c p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "2")) {
          return;
       }
       if (p0 != null) {
          this.b.add(p0);
          if (p1 && this.e.getResources().getConfiguration().orientation == 2) {
             p0.onConfigurationChanged(this.e.getResources().getConfiguration());
          }
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void r(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.d = (this.c != null)? y.c(this.e): y.d(this.e);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onConfigurationChanged(p0);
       }
       return;
    }
}
