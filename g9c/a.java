package g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;

public abstract class a extends RecyclerView$Adapter	// class@0026f8
{
    public List e;
    public final boolean f;

    public void a(){
       super(true);
       this.e = new ArrayList();
    }
    public void a(boolean p0){
       super();
       this.f = p0;
    }
    public a J0(int p0,Object p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.e.add(p0, p1);
       if (this.f == null) {
          return this;
       }else {
          this.n0(p0);
          return this;
       }
    }
    public a K0(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e.add(p0);
       if (this.f == null) {
          return this;
       }
       if (this.e.size() > 0) {
          this.n0((this.e.size() - 1));
       }
       return this;
    }
    public a L0(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (this.e.size() > 0)? this.e.size() - 1: 0;
       this.e.addAll(p0);
       if (this.f == null) {
          return this;
       }else if(i >= 0){
          this.r0(i, p0.size());
       }
       return this;
    }
    public a M0(){
       Object obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.e.size();
       this.e.clear();
       if (this.f == null) {
          return this;
       }
       this.s0(0, i);
       return this;
    }
    public Object N0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = (p0 < 0 || p0 >= this.e.size())? null: this.e.get(p0);
       return obj1;
    }
    public Object O0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.N0(p0);
    }
    public int P0(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.indexOf(p0);
    }
    public List Q0(){
       return this.e;
    }
    public boolean R0(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.isEmpty();
    }
    public a S0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.e.remove(p0);
       if (this.f == null) {
          return this;
       }else {
          this.t0(p0);
          return this;
       }
    }
    public a T0(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.e.indexOf(p0);
       this.e.remove(p0);
       if (this.f == null) {
          return this;
       }
       if (i != -1) {
          this.t0(i);
       }
       return this;
    }
    public a U0(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.e.subList(p0, (p0 + p1)).clear();
       if (this.f == null) {
          return this;
       }else {
          this.s0(p0, p1);
          return this;
       }
    }
    public a V0(int p0,Object p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.e.set(p0, p1);
       if (this.f == null) {
          return this;
       }else {
          this.l0(p0);
          return this;
       }
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("can not set null list");
       }
       this.e.clear();
       this.e.addAll(p0);
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
}
