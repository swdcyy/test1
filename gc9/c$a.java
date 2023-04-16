package gc9.c$a;
import hc.c;
import gc9.c;
import hc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.s6;
import gc9.d;
import gc9.a;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class c$a extends c	// class@002472
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$a.class, "1")) {
          return;
       }
       a.p(p0, "drawable");
       if (s6.m()) {
          p0 = this.a.b.b.p;
          if (p0 != null) {
             p0.setImageResource(R.drawable.arg_RES_7f081dfe);
          }
       }else {
          p0 = this.a.b.b.p;
          if (p0 != null) {
             p0.setImageResource(R.drawable.arg_RES_7f081dfd);
          }
       }
       PatchProxy.onMethodExit(c$a.class, "1");
       return;
    }
}
