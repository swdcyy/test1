package btb.i;
import vvb.a;
import qvb.n0;
import java.util.List;
import qvb.a;
import java.util.Collection;
import com.yxcorp.gifshow.feed.response.PhotoResponse;
import java.lang.Object;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import ekd.q;
import btb.g;
import ok.h;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.feed.g;
import btb.h;
import erd.g;
import java.lang.Boolean;
import java.util.Collections;

public class i extends n0 implements a	// class@000470
{
    public int m;
    public final List n;
    public static final int o;

    public void i(int p0,List p1,List p2){
       super();
       this.m = p0;
       this.n = p2;
       this.b.addAll(p1);
       this.R1(this.V1(null));
    }
    public boolean B1(Object p0){
       return this.V1(p0);
    }
    public t I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, oi, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       List list = PatchProxy.apply(objArray, this, oi, "2");
       if (list != patchProxyRe) {
       }else {
          list = this.n.subList(this.m, Math.min((this.m + 20), this.n.size()));
       }
       t ot = PatchProxy.applyOneRefs(list, this, oi, "3");
       if (ot != patchProxyRe) {
       }else if(q.f(list)){
          ot = t.empty();
       }else {
          ot = g.g(Lists.h(list, g.b));
       }
       return ot.doOnNext(new h(this, list));
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "5")) {
       }else {
          p1.addAll(p0.getItems());
       }
       return;
    }
    public boolean V1(PhotoResponse p0){
       p0 = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.m < this.n.size())? true: false;
       return b;
    }
    public boolean i(){
       return true;
    }
    public List z0(){
       Object obj = PatchProxy.apply(null, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.L0() == null) {
          return Collections.emptyList();
       }
       return this.L0().getItems();
    }
}
