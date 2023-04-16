package bo8.a;
import androidx.recyclerview.widget.p;
import bo8.a$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.s;
import java.lang.Math;
import java.lang.Number;
import bo8.a$b;

public class a extends p	// class@000439
{
    public a$b f;
    public boolean g;
    public boolean h;
    public int i;
    public s j;
    public s k;
    public RecyclerView l;
    public final RecyclerView$r m;

    public void a(){
       super();
       this.m = new a$a(this);
    }
    public void b(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.b(p0);
       this.l = p0;
       if (p0 != null) {
          p0.removeOnScrollListener(this.m);
          this.l.addOnScrollListener(this.m);
       }
       return;
    }
    public int[] c(RecyclerView$LayoutManager p0,View p1){
       int[] obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2];
       obj[0] = (p0.canScrollHorizontally())? this.s(p0, p1, this.q(p0)): 0;
       obj[1] = (p0.canScrollVertically())? this.s(p0, p1, this.r(p0)): 0;
       return obj;
    }
    public View h(RecyclerView$LayoutManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = (p0.canScrollHorizontally())? this.p(p0, this.q(p0)): this.p(p0, this.r(p0));
       boolean b = (view != null)? true: false;
       this.g = b;
       return view;
    }
    public View p(RecyclerView$LayoutManager p0,s p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int childCount = p0.getChildCount();
       View view = null;
       if (!childCount) {
          return view;
       }
       int i = p1.n() + (p1.o() / 2);
       int i1 = Integer.MAX_VALUE;
       int i2 = 0;
       while (i2 < childCount) {
          View childAt = p0.getChildAt(i2);
          int i3 = p1.e(childAt) / 2;
          int i4 = p1.g(childAt) + i3;
          i4 = i4 - i;
          i4 = Math.abs(i4);
          if (i4 < i1) {
             view = childAt;
             i1 = i4;
          }
          i2 = i2 + 1;
       }
       return view;
    }
    public s q(RecyclerView$LayoutManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k == null) {
          this.k = s.a(p0);
       }
       return this.k;
    }
    public s r(RecyclerView$LayoutManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.j == null) {
          this.j = s.c(p0);
       }
       return this.j;
    }
    public final int s(RecyclerView$LayoutManager p0,View p1,s p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = p2.g(p1) + (p2.e(p1) / 2);
       int i1 = (p0.canScrollHorizontally())? (p0.getLeftDecorationWidth(p1) - p0.getRightDecorationWidth(p1)) / 2: (p0.getTopDecorationHeight(p1) - p0.getBottomDecorationHeight(p1)) / 2;
       return ((i - (p2.n() + (p2.o() / 2))) + i1);
    }
    public void t(a$b p0){
       this.f = p0;
    }
}
