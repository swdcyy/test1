package com.kuaishou.live.gzone.v2.profile.e$h;
import u2.f;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.gzone.v2.profile.j;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class e$h implements f	// class@001ce7
{
    public final e a;

    public void e$h(e p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       e$h oh = e$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oh, "2")) {
          return;
       }
       e z = this.a.Z;
       z.p0((p0 + z.u1()), p1);
       return;
    }
    public void b(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(e$h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, e$h.class, "4")) {
          return;
       }
       e z = this.a.Z;
       z.q0((p0 + z.u1()), p1, p2);
       return;
    }
    public void c(int p0,int p1){
       e$h oh = e$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oh, "1")) {
          return;
       }
       e z = this.a.Z;
       z.p0((p0 + z.u1()), p1);
       return;
    }
    public void d(int p0,int p1){
       e$h oh = e$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oh, "3")) {
          return;
       }
       e z = this.a.Z;
       z.o0((p0 + z.u1()), (p1 + this.a.Z.u1()));
       return;
    }
}
