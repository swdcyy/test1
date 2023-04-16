package lb1.d;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import rfc.a;
import qvb.n0;
import com.yxcorp.gifshow.model.response.BlockUserResponse;
import cjd.e;
import erd.o;
import la6.b;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import lb1.c;
import ok.o;
import com.google.common.collect.ImmutableList;

public class d extends f	// class@002eb5
{
    public static final int p;

    public void d(){
       super();
    }
    public t I1(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x4a533fa);
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.i(objArray).map(new e());
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "2");
       if (list != PatchProxyResult.class) {
       }else {
          List list1 = super.W1(p0, p1);
          if (!q.f(list1)) {
             list1 = m.s(list1).p(c.b).B();
          }
          list = list1;
       }
       return list;
    }
}
