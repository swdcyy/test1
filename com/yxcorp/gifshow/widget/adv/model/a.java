package com.yxcorp.gifshow.widget.adv.model.a;
import java.lang.Cloneable;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.Action;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$RangeHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.widget.adv.MultiPartColorView$a;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.lang.Number;
import com.yxcorp.gifshow.widget.adv.c;
import com.yxcorp.gifshow.widget.adv.Action$Type;

public class a extends ITimelineView$IRangeView$a implements Cloneable	// class@001929
{
    public int s;

    public void a(Action p0){
       super(p0);
       this.s = -1;
    }
    public void a(Action p0,int p1){
       super(p0);
       this.s = p1;
    }
    public void C(double p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, a.class, "4")) {
          return;
       }
       if (this.d() != null) {
          this.d().g(p0);
       }
       return;
    }
    public void E(double p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, a.class, "5")) {
          return;
       }
       if (this.d() != null) {
          this.d().h(p0);
       }
       return;
    }
    public a F(){
       a obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.d().i());
       obj.A(this.r());
       obj.B(this.s());
       obj.z(this.q());
       obj.D(this.i().a());
       obj.v(this.e());
       obj.w(this.f());
       obj.u(this.n());
       if (this.n != null) {
          obj.n = new ArrayList();
          Iterator iterator = this.n.iterator();
          while (iterator.hasNext()) {
             obj.n.add(iterator.next().a());
          }
       }
       return obj;
    }
    public ITimelineView$IRangeView$a$a b(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.s.a();
    }
    public Object clone(){
       return this.F();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.d() != null)? this.d().l(): 0;
       return i;
    }
    public double h(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = (this.d() != null)? this.d().c(): 0;
       return d;
    }
    public double j(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = (this.d() != null)? this.d().d(): 0;
       return d;
    }
    public Action$Type k(){
       Action$Type obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.d() != null)? this.d().e(): Action$Type.NONE;
       return obj;
    }
}
