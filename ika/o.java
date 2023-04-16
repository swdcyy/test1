package ika.o;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import ika.o$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import ika.o$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$i;

public abstract class o extends RecyclerView$Adapter	// class@002ebf
{
    public final Set e;
    public final RecyclerView$i f;
    public final RecyclerView$Adapter g;
    public static final o$a h;

    static {
       o.h = new o$a(null);
    }
    public void o(RecyclerView$Adapter p0){
       a.p(p0, "contentAdapter");
       super();
       this.g = p0;
       this.e = new LinkedHashSet();
       this.f = new o$b(this);
    }
    public void B0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "6")) {
          return;
       }
       a.p(p0, "holder");
       if (this.e.contains(Integer.valueOf(p0.getItemViewType()))) {
          this.g.B0(p0);
       }
       return;
    }
    public void D0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "7")) {
          return;
       }
       a.p(p0, "holder");
       if (this.e.contains(Integer.valueOf(p0.getItemViewType()))) {
          this.g.D0(p0);
       }
       return;
    }
    public void E0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "5")) {
          return;
       }
       a.p(p0, "holder");
       if (this.e.contains(Integer.valueOf(p0.getItemViewType()))) {
          this.g.E0(p0);
       }
       return;
    }
    public abstract Set J0();
    public abstract int K0(int p0,int p1);
    public abstract int L0(int p0);
    public final RecyclerView$Adapter M0(){
       return this.g;
    }
    public int N0(int p0){
       return -1;
    }
    public abstract void O0();
    public final void P0(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.e.clear();
       this.O0();
       return;
    }
    public abstract int Q0(int p0);
    public long d0(int p0){
       Integer obj;
       long l;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "4");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       obj = Integer.valueOf(this.Q0(p0));
       int i = (obj.intValue() >= 0)? 1: 0;
       if (!i) {
          obj = null;
       }
       if (obj != null) {
          obj.intValue();
          l = this.g.d0(p0);
       }else {
          l = -1;
       }
       return l;
    }
    public final int f0(int p0){
       Integer obj;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.e.isEmpty()) {
          this.e.addAll(this.J0());
       }
       obj = Integer.valueOf(this.Q0(p0));
       o oo1 = (obj.intValue() >= 0)? 1: null;
       Integer integer = null;
       if (!oo1) {
          obj = integer;
       }
       if (obj != null) {
          integer = Integer.valueOf(this.g.f0(obj.intValue()));
       }
       if (integer != null) {
          p0 = integer.intValue();
       }else {
          Integer integer1 = Integer.valueOf(this.N0(p0));
          int i = integer1.intValue();
          if (!this.e.contains(Integer.valueOf(i))) {
             integer1 = integer1.intValue();
          }else {
             throw new IllegalArgumentException("wrapper\'s type is same with contentAdapter "+i);
          }
       }
       return p0;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "8")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.g.F0(this.f);
       return;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "9")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.g.I0(this.f);
       return;
    }
}
