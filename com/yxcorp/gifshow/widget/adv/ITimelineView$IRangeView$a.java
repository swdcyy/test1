package com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a$a;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$AbsorbStatus;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$RangeHandler;
import java.lang.Number;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import com.kuaishou.edit.draft.TimeRange;

public abstract class ITimelineView$IRangeView$a	// class@001904
{
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public Object j;
    public ITimelineView$IRangeView$RangeHandler k;
    public ITimelineView$IRangeView$a$a l;
    public TimeLineGestureProcessor$AbsorbStatus m;
    public List n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;

    public void ITimelineView$IRangeView$a(Object p0){
       super();
       this.b = true;
       this.d = false;
       this.f = true;
       this.h = true;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = -1;
       this.j = p0;
    }
    public ITimelineView$IRangeView$a A(boolean p0){
       this.b = p0;
       return this;
    }
    public ITimelineView$IRangeView$a B(boolean p0){
       this.c = p0;
       return this;
    }
    public abstract void C(double p0);
    public void D(ITimelineView$IRangeView$a$a p0){
       this.l = p0;
    }
    public abstract void E(double p0);
    public boolean a(){
       ITimelineView$IRangeView$a tm = this.m;
       boolean b = (tm != null && (tm == TimeLineGestureProcessor$AbsorbStatus.ABSORBED || tm == TimeLineGestureProcessor$AbsorbStatus.BLOCKED_TUNING))? true: false;
       return b;
    }
    public abstract ITimelineView$IRangeView$a$a b();
    public List c(){
       return null;
    }
    public Object d(){
       return this.j;
    }
    public int e(){
       return this.i;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ITimelineView$IRangeView$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof ITimelineView$IRangeView$a) {
          return b;
       }
       if (this.b == p0.b && (this.c == p0.c && (this.e == p0.e && (this.i == p0.i && (Math.abs((this.h() - p0.h())) - 0x3eb0c6f7a0b5ed8d < 0 && Math.abs((this.g() - p0.g())) - 0x3eb0c6f7a0b5ed8d < 0))))) {
          b = true;
       }
    label_005b :
       return b;
    }
    public ITimelineView$IRangeView$RangeHandler f(){
       ITimelineView$IRangeView$a tk = this.k;
       if (tk == null) {
          tk = ITimelineView$IRangeView$RangeHandler.NONE;
       }
       return tk;
    }
    public double g(){
       Object obj = PatchProxy.apply(null, this, ITimelineView$IRangeView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (this.h() + this.j());
    }
    public abstract double h();
    public ITimelineView$IRangeView$a$a i(){
       Object obj = PatchProxy.apply(null, this, ITimelineView$IRangeView$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = this.b();
       }
       return this.l;
    }
    public abstract double j();
    public abstract Action$Type k();
    public TimeRange l(){
       Object obj = PatchProxy.apply(null, this, ITimelineView$IRangeView$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.getDefaultInstance();
    }
    public boolean m(){
       return this.h;
    }
    public boolean n(){
       Object obj = PatchProxy.apply(null, this, ITimelineView$IRangeView$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.f() != ITimelineView$IRangeView$RangeHandler.NONE && this.g != null)? true: false;
       return b;
    }
    public boolean o(){
       return this.d;
    }
    public boolean p(){
       return this.e;
    }
    public boolean q(){
       return this.f;
    }
    public boolean r(){
       return this.b;
    }
    public boolean s(){
       return this.c;
    }
    public void t(TimeLineGestureProcessor$AbsorbStatus p0){
       this.m = p0;
    }
    public void u(boolean p0){
       this.g = p0;
    }
    public void v(int p0){
       this.i = p0;
    }
    public void w(ITimelineView$IRangeView$RangeHandler p0){
       this.k = p0;
    }
    public ITimelineView$IRangeView$a x(boolean p0){
       this.d = p0;
       return this;
    }
    public ITimelineView$IRangeView$a y(boolean p0){
       this.e = p0;
       return this;
    }
    public ITimelineView$IRangeView$a z(boolean p0){
       this.f = p0;
       return this;
    }
}
