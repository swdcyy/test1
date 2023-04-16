package ena.j;
import ena.j$a;
import nsd.u;
import java.util.LinkedHashMap;
import android.view.View;
import java.lang.Object;
import ekd.m1;
import android.widget.TextView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public final class j	// class@002781
{
    public final View a;
    public final TextView b;
    public final TextView c;
    public final ViewGroup d;
    public final ViewGroup e;
    public GrowthCleanerCircle f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final View k;
    public final View l;
    public final ViewGroup m;
    public final TextView n;
    public final ViewGroup o;
    public final ViewGroup p;
    public final ViewGroup q;
    public final View r;
    public final RecyclerView s;
    public final ViewGroup t;
    public final View u;
    public final TextView v;
    public final LinearLayout w;
    public static final Map x;
    public static final j$a y;

    static {
       j.y = new j$a(null);
       j.x = new LinkedHashMap();
    }
    public void j(View p0){
       super();
       this.a = m1.f(p0, 0x7f0a1716);
       this.b = m1.f(p0, 0x7f0a3f7b);
       this.c = m1.f(p0, 0x7f0a3643);
       this.d = m1.f(p0, 0x7f0a0736);
       this.e = m1.f(p0, 0x7f0a0726);
       this.g = m1.f(p0, 0x7f0a072e);
       this.h = m1.f(p0, 0x7f0a0719);
       this.i = m1.f(p0, 0x7f0a0722);
       this.j = m1.f(p0, 0x7f0a072f);
       this.k = m1.f(p0, 0x7f0a0737);
       this.l = m1.f(p0, 0x7f0a0738);
       this.m = m1.f(p0, 0x7f0a071a);
       this.n = m1.f(p0, 0x7f0a071e);
       this.o = m1.f(p0, 0x7f0a0728);
       this.p = m1.f(p0, 0x7f0a0729);
       this.q = m1.f(p0, 0x7f0a072b);
       this.r = m1.f(p0, 0x7f0a072a);
       this.s = m1.f(p0, 0x7f0a0727);
       this.t = m1.f(p0, 0x7f0a071b);
       this.u = m1.f(p0, 0x7f0a071c);
       this.v = m1.f(p0, 0x7f0a072c);
       this.w = m1.f(p0, 0x7f0a0724);
    }
    public final void a(boolean p0){
       int i1;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "4")) {
          return;
       }
       oj = this.e;
       int i = 0;
       if (oj != null) {
          i1 = (p0)? 0: 8;
          oj.setVisibility(i1);
       }
       oj = this.m;
       if (oj != null) {
          i1 = (p0)? 0: 8;
          oj.setVisibility(i1);
       }
       oj = this.k;
       if (oj != null) {
          i1 = (!p0)? 0: 8;
          oj.setVisibility(i1);
       }
       oj = this.t;
       if (oj != null) {
          if (p0) {
             i = 8;
          }
          oj.setVisibility(i);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.a(true);
       return;
    }
}
