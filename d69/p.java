package d69.p;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.aggregate.model.UserRelationAggregateResponse;
import qvb.n0;
import wkd.b;
import z59.a;
import com.yxcorp.gifshow.aggregate.relation.a;
import erd.o;
import java.util.List;
import la6.b;
import qvb.a;
import java.util.Iterator;
import com.kwai.framework.model.user.User;

public class p extends f	// class@00207a
{
    public String p;

    public void p(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       UserRelationAggregateResponse obj = PatchProxy.apply(objArray, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.p)) {
          return t.just(new UserRelationAggregateResponse());
       }
       obj = this.L0();
       a uoa = b.a(0x53352bb2);
       p tp = this.p;
       if (!this.K() && obj != null) {
          objArray = obj.getCursor();
       }
       return uoa.b(tp, objArray).map(a.b);
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(UserRelationAggregateResponse p0,List p1){
       p op = p.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, op, "2")) {
          return;
       }
       super.d2(p0, p1);
       if (!PatchProxy.applyVoid(null, this, op, "3")) {
          int i = 0;
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             int i1 = i + 1;
             iterator.next().mPosition = i;
             i = i1;
          }
       }
       return;
    }
    public boolean i(){
       return false;
    }
}
