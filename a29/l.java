package a29.l;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import xq7.d;
import rp7.a;
import jh5.a;
import qp7.a;
import w19.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import vp7.d;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.j;
import qp7.b;
import qp7.d;
import lr7.d0;
import qp7.c;
import vp7.c;

public final class l extends DispatchBaseElement	// class@00003a
{
    public QPhoto t;

    public void l(){
       super(d.o, null);
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
       }else {
          a.p(p0, "callerContext");
          this.t = p0.j;
       }
       return;
    }
    public a f0(a p0){
       d uod = PatchProxy.applyOneRefs(p0, this, l.class, "3");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(p0);
       }
       return uod;
    }
    public void j0(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "5")) {
          return;
       }
       if (!j.f(this.t, 128)) {
          this.b0();
       }
       return;
    }
    public d q(){
       d0 uod0 = PatchProxy.apply(null, this, l.class, "1");
       if (uod0 != PatchProxyResult.class) {
       }else {
          uod0 = new d0();
       }
       return uod0;
    }
    public c r(){
       c uoc = PatchProxy.apply(null, this, l.class, "2");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
       }
       return uoc;
    }
}
