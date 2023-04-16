package lz9.b0$g;
import qp7.b1;
import lz9.b0;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import im8.f;
import qp7.x0;
import qp7.b;
import ks7.h0;
import java.util.Objects;
import pp7.b;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.a1;
import java.lang.Float;
import ks7.h0$d;

public class b0$g implements b1	// class@002ed1
{
    public final b0 a;

    public void b0$g(b0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       a1.a(this);
    }
    public void b(){
       a1.g(this);
    }
    public void c(boolean p0){
    }
    public void d(boolean p0){
    }
    public void e(boolean p0){
       b0$g og = b0$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "2")) {
          return;
       }
       b0$g ta = this.a;
       ta.H = false;
       ta.W.set(Boolean.FALSE);
       ta = this.a;
       ta.U = 0;
       h0 oh0 = ta.E();
       Objects.requireNonNull(oh0);
       h0 oh01 = h0.class;
       if (!PatchProxy.isSupport(oh01) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, oh0, oh01, "7")) {
          oh0.i.f(Boolean.TRUE);
       }
       return;
    }
    public void f(boolean p0){
       b0$g og = b0$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "1")) {
          return;
       }
       b0$g ta = this.a;
       ta.H = true;
       if (ta.t.hasGodCommentShow() && this.a.t.isNeedShowGodComment()) {
          h0 oh0 = this.a.E();
          float f = (float)(- a1.e(4.00f));
          Objects.requireNonNull(oh0);
          h0 oh01 = h0.class;
          if (!PatchProxy.isSupport(oh01) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(0x3f800000), Float.valueOf(f), oh0, oh01, "13")) {
             h0$d uod = new h0$d();
             uod.a = 0x3f800000;
             uod.b = f;
             oh0.e.f(uod);
          }
       }
       return;
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       a1.c(this);
    }
}
