package com.kuaishou.live.core.show.profilecard.photo.j$d;
import u2.f;
import com.kuaishou.live.core.show.profilecard.photo.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.core.show.profilecard.photo.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class j$d implements f	// class@000ded
{
    public final j a;

    public void j$d(j p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       j$d uod = j$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "2")) {
          return;
       }
       j f = this.a.F;
       f.p0((p0 + f.u1()), p1);
       return;
    }
    public void b(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(j$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, j$d.class, "4")) {
          return;
       }
       j f = this.a.F;
       f.q0((p0 + f.u1()), p1, p2);
       return;
    }
    public void c(int p0,int p1){
       j$d uod = j$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       j f = this.a.F;
       f.p0((p0 + f.u1()), p1);
       return;
    }
    public void d(int p0,int p1){
       j$d uod = j$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "3")) {
          return;
       }
       j f = this.a.F;
       f.o0((p0 + f.u1()), (p1 + this.a.F.u1()));
       return;
    }
}
