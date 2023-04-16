package ec9.h1;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.util.List;
import cc9.h;
import cc9.n;
import java.lang.Integer;
import cc9.k;
import cc9.p;
import cc9.j;

public final class h1 extends k	// class@002179
{
    public final f1 b;

    public void h1(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       int i;
       h1 oh1 = h1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh1, "1")) {
       }else {
          a.p(p0, "action");
          q oq = this.a().j();
          this.a().h(q.a(oq, null, 0, 0, null, false, false, false, false, 239, null));
          h oh = oq.c();
          if (oh instanceof n) {
             if (!oq.g()) {
                this.a().h(q.a(this.a().j(), null, 0, 0, null, false, true, false, false, 223, null));
             }
             i = oq.b();
             if (!PatchProxy.isSupport(oh1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, oh1, "2")) {
                this.b.w0(new k(13, i));
             }
          }else if(oh instanceof p){
             if (!oq.g()) {
                this.a().h(q.a(this.a().j(), null, 0, 0, null, false, true, false, false, 223, null));
             }
             i = oq.b();
             if (!PatchProxy.isSupport(oh1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, oh1, "3")) {
                this.b.w0(new k(22, i));
             }
          }else if(oh instanceof j){
             i = oq.b();
             if (!PatchProxy.isSupport(oh1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, oh1, "4")) {
                this.b.w0(new k(31, i));
             }
          }
       }
       return;
    }
}
