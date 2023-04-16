package w77.b;
import h3.a;
import androidx.fragment.app.c;
import androidx.collection.ArraySet;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.util.Set;
import androidx.fragment.app.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.StringBuilder;
import w77.a;
import androidx.fragment.app.c$b;
import androidx.lifecycle.Lifecycle$State;
import android.view.View;
import java.lang.Boolean;
import android.os.Parcelable;
import java.lang.ClassLoader;
import java.lang.IllegalStateException;

public abstract class b extends a	// class@003bb0
{
    public Set d;
    public final c e;
    public final int f;
    public e g;
    public Fragment h;
    public static final int i;

    public void b(c p0){
       super(p0, 0);
    }
    public void b(c p0,int p1){
       super();
       this.d = new ArraySet();
       this.g = null;
       this.h = null;
       this.e = p0;
       this.f = p1;
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "5")) {
          return;
       }
       this.d.remove(p2.getTag());
       if (this.g == null) {
          this.g = this.e.beginTransaction();
       }
       this.g.p(p2);
       if (p2 == this.h) {
          this.h = null;
       }
       return;
    }
    public void i(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       b tg = this.g;
       if (tg != null) {
          tg.o();
          this.g = null;
       }
       return;
    }
    public Object o(ViewGroup p0,int p1){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.g == null) {
          this.g = this.e.beginTransaction();
       }
       long l = (long)p1;
       int id = p0.getId();
       if (PatchProxy.isSupport(uob)) {
          str = PatchProxy.applyTwoRefs(Integer.valueOf(id), Long.valueOf(l), null, uob, "9");
          if (str != patchProxyRe) {
          label_005b :
             Fragment uFragment = this.e.findFragmentByTag(str);
             if (uFragment != null) {
                this.g.k(uFragment);
             }else {
                uFragment = this.z(p1);
                this.g.h(uFragment, str);
                if (!PatchProxy.applyVoidTwoRefs(p0, str, this, uob, "3")) {
                   this.d.add(str);
                   this.e.registerFragmentLifecycleCallbacks(new a(this, str, p0), false);
                }
             }
             if (uFragment != this.h) {
                uFragment.setMenuVisibility(false);
                if (this.f == 1) {
                   this.g.A(uFragment, Lifecycle$State.STARTED);
                }else {
                   uFragment.setUserVisibleHint(false);
                }
             }
             return uFragment;
          }
       }
       str = "android:switcher:gzone"+id+":"+l;
       goto label_005b ;
    }
    public boolean p(View p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (p1.getView() == p0)? true: false;
       return b;
    }
    public void s(Parcelable p0,ClassLoader p1){
    }
    public Parcelable u(){
       return null;
    }
    public void v(ViewGroup p0,int p1,Object p2){
       boolean b;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "6")) {
          return;
       }
       b th = this.h;
       if (p2 != th) {
          b = true;
          if (th != null) {
             boolean b1 = false;
             th.setMenuVisibility(b1);
             if (this.f == b) {
                if (this.g == null) {
                   this.g = this.e.beginTransaction();
                }
                this.g.A(this.h, Lifecycle$State.STARTED);
             }else {
                this.h.setUserVisibleHint(b1);
             }
          }
          p2.setMenuVisibility(b);
          if (this.f == b) {
             if (this.g == null) {
                this.g = this.e.beginTransaction();
             }
             this.g.A(p2, Lifecycle$State.RESUMED);
          }else {
             p2.setUserVisibleHint(b);
          }
          this.h = p2;
       }
       return;
    }
    public void x(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0.getId() != -1) {
          return;
       }
       throw new IllegalStateException("ViewPager with adapter "+this+" requires a view id");
    }
    public abstract Fragment z(int p0);
}
