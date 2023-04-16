package do4.g;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import su.g;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import po4.f;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.collections.ArraysKt___ArraysKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import yz7.e;
import java.lang.StringBuilder;
import nv.c;

public abstract class g extends RecyclerView$r	// class@001f49
{
    public final RecyclerView$r a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public boolean g;

    public void g(String p0,String p1,String p2,boolean p3){
       RecyclerView$r or;
       a.p(p0, "pageCode");
       a.p(p1, "pageHashCode");
       a.p(p2, "activityName");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       g og = g.a(p1);
       og = (og != null)? og.I: null;
       this.a = og;
       return;
    }
    public void a(RecyclerView p0,int p1){
       g c;
       g e;
       int i2;
       Object obj = this;
       Object obj1 = p0;
       int i = p1;
       g og = g.class;
       String str = "1";
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, og, str)) {
          return;
       }
       a.p(obj1, "recyclerView");
       String str1 = "data";
       if (!i) {
          f uof = f.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, og, "4")) {
             RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
             if (layoutManage != null) {
                int i1 = -1;
                if (layoutManage instanceof StaggeredGridLayoutManager) {
                   int[] ointArray = layoutManage.findLastVisibleItemPositions(null);
                   a.o(ointArray, "layoutManager.findLastVisibleItemPositions\(null\)");
                   Integer integer = ArraysKt___ArraysKt.tk(ointArray);
                   if (integer != null) {
                      i1 = integer.intValue();
                   }
                }else if(layoutManage instanceof LinearLayoutManager){
                   i1 = layoutManage.c();
                }
                c = obj.c;
                if (obj.g != null) {
                   e = obj.e;
                   if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(e, Integer.valueOf(c), null, uof, "2")) {
                      f.a.put(e, Integer.valueOf(c));
                   }
                }else {
                   g e1 = obj.e;
                   Object obj2 = PatchProxy.applyOneRefs(e1, null, uof, str);
                   if (obj2 != PatchProxyResult.class) {
                      i2 = obj2.intValue();
                   }else if(f.a.containsKey(e1)){
                      i2 = f.a.get(e1).intValue();
                   }else {
                      i2 = 0;
                   }
                   c = c + i2;
                }
                Pair[] pairArray1 = new Pair[]{r0.a("pageCode", obj.d),r0.a("pageName", obj.f),r0.a("pageInstance", obj.e),r0.a("offsetX", Integer.valueOf(obj.b)),r0.a("offsetY", Integer.valueOf(c)),r0.a("lastVisiblePosition", Integer.valueOf(i1))};
                str = e.f(t0.j0(pairArray1));
                c.f("publish LIST_SCROLL_END_EVENT data = "+str);
                a.o(str, str1);
                obj.c("MERCHANT_LIST_SCROLL_EVENT", str);
             }
          }
       }
       if (i == 1 && !PatchProxy.applyVoid(null, obj, og, "3")) {
          Pair[] pairArray = new Pair[]{r0.a("pageCode", obj.d),r0.a("pageName", obj.f),r0.a("pageInstance", obj.e)};
          String str2 = e.f(t0.j0(pairArray));
          c.f("publish LIST_SCROLL_START_EVENT data = "+str2);
          a.o(str2, str1);
          obj.c("MERCHANT_LIST_SCROLL_START_EVENT", str2);
       }
       og = obj.a;
       if (og != null) {
          og.a(obj1, i);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "2")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.b = this.b + p1;
       this.c = this.c + p2;
       g ta = this.a;
       if (ta != null) {
          ta.b(p0, p1, p2);
       }
       return;
    }
    public abstract void c(String p0,String p1);
}
