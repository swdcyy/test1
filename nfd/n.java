package nfd.n;
import nfd.m;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import nfd.n$a;
import nfd.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import nfd.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Integer;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uy5.b;

public final class n implements m	// class@001de7
{
    public List a;
    public List b;
    public int[] c;
    public int[] d;
    public RecyclerView e;
    public final Fragment f;
    public final RecyclerView$r g;
    public boolean h;

    public void n(Fragment p0){
       super();
       this.g = new n$a(this);
       this.h = false;
       this.f = p0;
    }
    public void a(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "7")) {
          return;
       }
       n ta = this.a;
       if (ta != null) {
          ta.remove(p0);
       }
       return;
    }
    public void b(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "6")) {
          return;
       }
       if (this.a == null) {
          this.a = new ArrayList();
       }
       this.a.add(p0);
       return;
    }
    public void c(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "8")) {
          return;
       }
       if (this.b == null) {
          this.b = new ArrayList();
       }
       this.b.add(p0);
       return;
    }
    public void d(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.e = p0;
       p0.addOnScrollListener(this.g);
       return;
    }
    public void e(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "4")) {
          return;
       }
       List list = (this.a == null)? Collections.emptyList(): new ArrayList(this.a);
       Iterator iterator = list.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          o oo = iterator.next();
          View view = oo.f();
          n obj = PatchProxy.applyOneRefs(view, this, on, "5");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.f;
             String str = (obj == null)? null: obj.getView();
             if (str == null) {
                b.p("ItemLocationChangeProviderImpl", "fragment view is null");
             }else if(this.c == null){
                int[] ointArray = new int[2];
                this.c = ointArray;
                str.getLocationOnScreen(ointArray);
             }
             int i = this.c[1] + str.getHeight();
             if (this.d == null) {
                int[] ointArray1 = new int[2];
                this.d = ointArray1;
             }
             view.getLocationOnScreen(this.d);
             n td = this.d;
             if (td[1] > 0 && td[1] < i) {
                b = true;
             }
          }
          if (b) {
             oo.g();
          }
       }
       if (this.h != null && p0) {
          this.h = b;
          List list1 = (this.b == null)? Collections.emptyList(): new ArrayList(this.b);
          Iterator iterator1 = list1.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().a();
          }
       }
       return;
    }
    public void f(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "3")) {
          return;
       }
       this.e(p0);
       return;
    }
    public void g(){
       this.h = true;
    }
    public void h(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "9")) {
          return;
       }
       n tb = this.b;
       if (tb != null) {
          tb.remove(p0);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       n te = this.e;
       if (te != null) {
          te.removeOnScrollListener(this.g);
          this.e = null;
       }
       return;
    }
}
