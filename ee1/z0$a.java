package ee1.z0$a;
import xv4.e;
import ee1.z0;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ee1.x0;
import java.util.Set;
import z1.a;
import java.lang.Integer;
import ee1.q0;
import ee1.y0;
import ee1.p0;
import java.nio.ByteBuffer;
import ee1.w0;
import yv4.a;
import ee1.r0;
import ee1.v0;
import ee1.u0;
import java.lang.Long;
import ee1.o0;
import ee1.s0;
import ee1.n0;
import ee1.t0;

public class z0$a implements e	// class@00212c
{
    public final z0 a;

    public void z0$a(z0 p0){
       this.a = p0;
       super();
    }
    public void d(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z0$a.class, "3")) {
          return;
       }
       z0$a ta = this.a;
       ta.c(ta.a, new x0(p0, p1));
       return;
    }
    public void e(int p0,String p1){
       z0$a uoa = z0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "10")) {
          return;
       }
       uoa = this.a;
       uoa.c(uoa.a, new q0(p0, p1));
       return;
    }
    public void f(String p0,String[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z0$a.class, "4")) {
          return;
       }
       z0$a ta = this.a;
       ta.c(ta.a, new y0(p0, p1));
       return;
    }
    public void g(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0$a.class, "9")) {
          return;
       }
       z0$a ta = this.a;
       ta.c(ta.a, new p0(p0));
       return;
    }
    public void j(String p0,ByteBuffer p1,int p2,int p3,int p4,int p5){
       z0$a uoa = this;
       z0$a uoa1 = z0$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "7")) {
             return;
          }
       }
       uoa1 = uoa.a;
       w0 ow0 = new w0(p0, p1, p2, p3, p4, p5);
       uoa1.c(uoa1.a, v3);
       return;
    }
    public void m(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0$a.class, "12")) {
          return;
       }
       z0$a ta = this.a;
       ta.c(ta.a, new r0(p0));
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0$a.class, "6")) {
          return;
       }
       z0$a ta = this.a;
       ta.c(ta.a, new v0(p0));
       return;
    }
    public void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0$a.class, "5")) {
          return;
       }
       z0$a ta = this.a;
       ta.c(ta.a, new u0(p0));
       return;
    }
    public void onAudioMixPcmData(ByteBuffer p0,int p1,int p2,long p3){
       if (PatchProxy.isSupport(z0$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Long.valueOf(p3), this, z0$a.class, "11")) {
          return;
       }
       z0$a ta = this.a;
       o0 oo0 = new o0(p0, p1, p2, p3);
       ta.c(ta.a, v8);
       return;
    }
    public void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0$a.class, "1")) {
          return;
       }
       z0$a ta = this.a;
       ta.c(ta.a, new s0(p0));
       return;
    }
    public void q(String p0,ByteBuffer p1,int p2,int p3){
       if (PatchProxy.isSupport(z0$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, z0$a.class, "8")) {
          return;
       }
       z0$a ta = this.a;
       ta.c(ta.a, new n0(p0, p1, p2, p3));
       return;
    }
    public void r(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0$a.class, "2")) {
          return;
       }
       z0$a ta = this.a;
       ta.c(ta.a, new t0(p0));
       return;
    }
}
