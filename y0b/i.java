package y0b.i;
import b1b.a;
import com.yxcorp.gifshow.listcomponent.module.b;
import java.lang.Boolean;
import c1b.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import y0b.n;
import y0b.t;
import java.util.Objects;
import y0b.j;
import w0b.g;
import java.lang.Comparable;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import com.yxcorp.gifshow.listcomponent.layoutmanager.a;
import a9c.e;
import y0b.m;
import y0b.b;
import y0b.c;
import java.lang.Runnable;
import i1b.d;
import q87.c;
import z0b.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y0b.h;
import java.lang.Long;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e1b.q;
import e1b.a;
import z0.a;
import erd.g;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import z0b.b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Collection;

public class i extends b implements a	// class@00495d
{
    public b A;
    public b B;
    public j r;
    public t s;
    public d t;
    public c u;
    public e v;
    public Runnable w;
    public a x;
    public a y;
    public Boolean z;

    public void i(){
       super();
       this.y = this;
       this.z = Boolean.FALSE;
       this.B = new b();
    }
    public int A(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, this, i.class, "14");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.s.E();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(this, obj, n.class, "22");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          i = this.H().y().c().intValue();
          if (i == -1) {
             List list = obj.v.t1();
             int i1 = list.indexOf(this.G());
             while (true) {
                if (i1 >= 0) {
                   int i2 = list.get(i1).n().d().intValue();
                   if (i2 != -1) {
                      i = i2 + 1;
                      break ;
                   }else {
                      i1 = i1 - 1;
                   }
                }else {
                   i = 0;
                   break ;
                }
             }
          }
       }
       return i;
    }
    public e B(){
       return this.v;
    }
    public m C(){
       Object obj = PatchProxy.apply(null, this, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getCreator();
    }
    public String D(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.a(p0);
    }
    public t E(){
       return this.s;
    }
    public int F(){
       Object obj = PatchProxy.apply(null, this, i.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.K()) {
          return this.H().t();
       }
       if (this.p()) {
          return 0;
       }
       return 1;
    }
    public a G(){
       return this.x;
    }
    public final j H(){
       return this.r;
    }
    public Runnable I(){
       return this.w;
    }
    public int J(int p0){
       return 0;
    }
    public boolean K(){
       i oi = PatchProxy.apply(null, this, i.class, "4");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = this.z;
       }
       return oi.booleanValue();
    }
    public e L(){
       return null;
    }
    public a M(){
       return null;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       d.C().w("KsBaseModule", "notifyRefresh", objArray);
       this.i().k0();
       return;
    }
    public void b(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, i.class, "19")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       Object[] objArray1 = new Object[0];
       d.C().w("KsBaseModule", String.format("notifyItemRangeChanged positionStart = %d itemCount = %d", objArray), objArray1);
       this.i().q0((this.A() + p0), p1, p2);
       return;
    }
    public void c(int p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi, "18")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       Object[] objArray1 = new Object[0];
       d.C().w("KsBaseModule", String.format("notifyItemMoved fromPosition = %d toPosition = %d", objArray), objArray1);
       this.i().o0((this.A() + p0), (this.A() + p1));
       return;
    }
    public void d(int p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi, "17")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       Object[] objArray1 = new Object[0];
       d.C().w("KsBaseModule", String.format("notifyItemRangeRemoved positionStart = %d count = %d", objArray), objArray1);
       this.i().s0((this.A() + p0), p1);
       return;
    }
    public void e(int p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi, "16")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       Object[] objArray1 = new Object[0];
       d.C().w("KsBaseModule", String.format("notifyItemRangeInserted positionStart = %d count = %d", objArray), objArray1);
       this.i().r0((this.A() + p0), p1);
       return;
    }
    public h n(){
       return this.H();
    }
    public void r(){
       PatchProxy.applyVoid(null, this, i.class, "6");
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       if (this.x == null) {
          a uoa = this.M();
          this.x = uoa;
          if (uoa != null) {
             uoa.a = Long.valueOf(this.r.g());
          }
       }
       return;
    }
    public PresenterV2 w(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, i.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new q());
       obj.U7(new a(null, null));
       PatchProxy.onMethodExit(i.class, "13");
       return obj;
    }
    public void x(){
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "22")) {
          return;
       }
       super.x();
       if (this.K() && (this.l().getParent() != null && this.l().getParent() instanceof ViewGroup)) {
          this.l().getParent().removeView(this.l());
       }
    label_003c :
       i = this.A();
       int i1 = 1;
       if (i != -1) {
          a uoa = this.G();
          RecyclerView recyclerView = this.m().h0();
          int i2 = (this.K())? 1: this.F();
          uoa.t(recyclerView, i, i2);
       }
       LinkedList linkedList = new LinkedList(this.s.E().B());
       linkedList.remove(this.G());
       this.s.E().R(linkedList);
       if (!PatchProxy.applyVoid(null, this, oi, "21")) {
          Object[] objArray = new Object[0];
          d.C().w("KsBaseModule", "remove component", objArray);
          this.H().s();
          c uoc = this.i();
          i = this.A();
          if (!this.K()) {
             i1 = this.F();
          }
          uoc.s0(i, i1);
          this.E().E().O();
       }
       this.H().m = null;
       this.H().a();
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       this.f(this.k().toArray());
       return;
    }
}
