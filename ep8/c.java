package ep8.c;
import androidx.recyclerview.widget.RecyclerView$i;
import ep8.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;

public class c extends RecyclerView$i	// class@002222
{
    public final d a;

    public void c(d p0){
       this.a = p0;
       super();
    }
    public void g(){
       d p;
       int i;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "1")) {
          return;
       }
       c ta = this.a;
       if (ta.q != null) {
          ta.k0();
          return;
       }else {
          c uoc1 = -1;
          if (ta.t != null) {
             try{
                int itemCount = ta.h.getItemCount();
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(itemCount), this, uoc, "2")) {
                   uoc = this.a;
                   p = uoc.p;
                   i = uoc.M0();
                   if (p == uoc1) {
                      this.a.k0();
                   }else if(itemCount == p){
                      this.a.p0(i, itemCount);
                   }else if(itemCount > p){
                      this.a.p0(i, p);
                      this.a.r0((i + p), (itemCount - p));
                   }else {
                      this.a.p0(i, itemCount);
                      this.a.s0((i + itemCount), (p - itemCount));
                   }
                   this.a.p = itemCount;
                }
             }catch(java.lang.Exception e0){
             }
             return;
          }else {
             try{
                i = ta.h.getItemCount();
                ta = this.a;
                p = ta.p;
                if (p == uoc1 || (i && i == p)) {
                   ta.p0(ta.M0(), i);
                }else {
                   ta.k0();
                }
                this.a.p = i;
                return;
             }catch(java.lang.Exception e0){
             }
          }
       }
    }
    public void h(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       uoc = this.a;
       int itemCount = uoc.h.getItemCount();
       try{
          uoc.p = itemCount;
          uoc = this.a;
          uoc.p0((p0 + uoc.M0()), p1);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void i(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c.class, "4")) {
          return;
       }
       c ta = this.a;
       int itemCount = ta.h.getItemCount();
       try{
          ta.p = itemCount;
          ta = this.a;
          ta.q0((p0 + ta.M0()), p1, p2);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void j(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "5")) {
          return;
       }
       uoc = this.a;
       int itemCount = uoc.h.getItemCount();
       try{
          uoc.p = itemCount;
          uoc = this.a;
          uoc.r0((p0 + uoc.M0()), p1);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void k(int p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "7")) {
          return;
       }
       try{
          c ta = this.a;
          ta.o0((p0 + ta.M0()), (p1 + this.a.M0()));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void l(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "6")) {
          return;
       }
       try{
          uoc = this.a;
          uoc.s0((p0 + uoc.M0()), p1);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
