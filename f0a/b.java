package f0a.b;
import yw6.f;
import java.util.List;
import qvb.i;
import ok.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import f0a.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.d;
import java.lang.Boolean;
import yw6.g;
import fw6.b;
import gw6.b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.robust.PatchProxyResult;

public final class b extends f	// class@002268
{
    public d k;

    public void b(List p0,i p1,o p2){
       a.p(p0, "dataList");
       a.p(p1, "pageList");
       super(p0, p1, null);
       if (p1 instanceof d) {
          this.k = p1;
       }
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tk = this.k;
       if (tk != null) {
          tk.B1();
       }
       return;
    }
    public void G0(boolean p0,boolean p1){
       d l;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
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
          b tk = this.k;
          if (tk != null) {
             l = tk.l;
             if (l != null) {
             label_0045 :
                uob = this.k;
                if (uob != null && uob.x1() == 1) {
                   this.e(0, l);
                }else {
                   this.b(l);
                }
             }
          }
          l = CollectionsKt__CollectionsKt.E();
          goto label_0045 ;
       }
       return;
    }
    public boolean T(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       b = (obj != null)? obj.r0(): false;
       return b;
    }
    public boolean hasMore(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       b = (obj != null)? obj.Q0(): false;
       return b;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b tk = this.k;
       if (tk != null) {
          tk.B0();
       }
       return;
    }
}
