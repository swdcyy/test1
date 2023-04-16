package fwa.d;
import fwa.b;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import java.lang.Object;
import fwa.c;
import fwa.d$a;
import fwa.d$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import g9c.d;
import java.lang.Math;
import g9c.a;
import java.util.Objects;
import s2b.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;

public class d	// class@002a47
{
    public final RecyclerView a;
    public final g b;
    public Runnable c;
    public b d;
    public int e;
    public RecyclerView$o f;
    public q g;

    public void d(b p0,RecyclerView p1,g p2){
       super();
       this.c = new c(this);
       this.e = -1;
       this.f = new d$a(this);
       this.g = new d$b(this);
       this.d = p0;
       this.a = p1;
       this.b = p2;
    }
    public void a(){
       d obj;
       int i2;
       int i3;
       b uob = b.class;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
          obj = this.a;
          if (obj != null && obj.getAdapter() != null) {
             RecyclerView$LayoutManager layoutManage = this.a.getLayoutManager();
             int i1 = -1;
             if (layoutManage instanceof GridLayoutManager) {
                i2 = layoutManage.c();
             }else if(layoutManage instanceof LinearLayoutManager){
                i2 = layoutManage.c();
             }else if(layoutManage instanceof StaggeredGridLayoutManager){
                int[] ointArray = layoutManage.findLastVisibleItemPositions(objArray);
                i3 = ointArray.length;
                d uod1 = -1;
                int i5 = 0;
                while (i5 < i3) {
                   int i6 = ointArray[i5];
                   if (i6 > uod1) {
                      uod1 = i6;
                   }
                   i5 = i5 + 1;
                }
                i2 = uod1;
             }else {
                i2 = -1;
             }
             i3 = (this.a.getAdapter() instanceof d)? this.a.getAdapter().b1(): 0;
             int i4 = Math.max(i2, this.e);
             this.e = i4;
             i3 = Math.min((i4 - i3), (this.b.getItemCount() + i1));
             this.e = i3;
             i2 = Math.max(i2, i3);
             this.e = i2;
             this.e = Math.min(i2, (this.b.getItemCount() + i1));
          }
       }
       if (PatchProxy.applyVoid(objArray, this, uod, "5") || (this.e < null || (this.a != null && this.b != null))) {
          while (i <= this.e) {
             obj = this.b.O0(i);
             if (!PatchProxy.applyVoidOneRefs(obj, this, uod, "6")) {
                d td = this.d;
                Objects.requireNonNull(td);
                if (!PatchProxy.applyVoidOneRefs(obj, td, uob, "1") && td.b(obj)) {
                   td.a.add(obj);
                }
             }
             i = i + 1;
          }
       }
    label_00e2 :
       uod = this.d;
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoid(objArray, uod, uob, "2")) {
          uob = uod.a;
          _monitor_enter(uob);
          if (!q.f(uod.a)) {
             uod.a(new ArrayList(uod.a));
             uod.a.clear();
          }
          _monitor_exit(uob);
       }
       return;
    }
}
