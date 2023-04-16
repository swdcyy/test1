package f1a.a;
import yw6.f;
import java.util.List;
import qvb.i;
import ok.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import f1a.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.d;
import java.lang.Boolean;
import yw6.g;
import fw6.b;
import gw6.b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.robust.PatchProxyResult;

public final class a extends f	// class@00226f
{
    public c k;

    public void a(List p0,i p1,o p2){
       a.p(p0, "dataList");
       a.p(p1, "pageList");
       super(p0, p1, null);
       if (p1 instanceof c) {
          this.k = p1;
       }
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tk = this.k;
       if (tk != null) {
          tk.B1();
       }
       return;
    }
    public void G0(boolean p0,boolean p1){
       c p;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       super.G0(p0, p1);
       if (p0) {
          g tg = this.g;
          if (tg != null) {
             List items = tg.getItems();
             if (items != null) {
                this.u0(items);
                this.e.c(this.c, 0, this.f());
             }
          }
       }else {
          a tk = this.k;
          if (tk != null) {
             p = tk.p;
             if (p != null) {
             label_0045 :
                uoa = this.k;
                if (uoa != null && uoa.x1() == 1) {
                   this.e(0, p);
                }else {
                   this.b(p);
                }
             }
          }
          p = CollectionsKt__CollectionsKt.E();
          goto label_0045 ;
       }
       return;
    }
    public boolean T(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       boolean b = (obj != null)? obj.r0(): false;
       return b;
    }
    public boolean hasMore(){
       a obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       boolean b = (obj != null)? obj.Q0(): false;
       return b;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tk = this.k;
       if (tk != null) {
          tk.B0();
       }
       return;
    }
}
