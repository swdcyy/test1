package c6a.b$d;
import qvb.q;
import c6a.b;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import sy6.a;
import com.yxcorp.gifshow.detail.school.SchoolSquareResponse;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;

public final class b$d implements q	// class@00055f
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       b$d uod = b$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "1")) {
          return;
       }
       p.b(this, p0, p1);
       if (p0) {
          b t = this.b.t;
          SchoolSquareResponse schoolSquare = null;
          SchoolSquareResponse schoolSquare1 = (t != null)? t.h0(): schoolSquare;
          if (schoolSquare1 instanceof SchoolSquareResponse) {
             schoolSquare = schoolSquare1;
          }
          if (schoolSquare != null) {
             List filterItems = schoolSquare.getFilterItems();
             if (filterItems != null) {
                filterItems = CollectionsKt___CollectionsKt.d2(filterItems);
                if (filterItems != null && filterItems.size() > this.b.u.size()) {
                   this.b.u.clear();
                   this.b.u.addAll(filterItems);
                   filterItems.r = true;
                }
             }
          }
       }
    label_0062 :
       return;
    }
}
