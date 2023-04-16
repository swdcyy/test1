package cd6.c$b;
import com.kwai.plugin.dva.work.c$c;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import cd6.a;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import sj7.d;

public final class c$b implements c$c	// class@0006a1
{
    public final int a;
    public final String b;
    public final Map c;
    public final Set d;
    public final boolean e;
    public final a f;

    public void c$b(int p0,String p1,Map p2,Set p3,boolean p4,a p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$b.class, "2")) {
          return;
       }
       c$b tf = this.f;
       if (tf != null) {
          c$b tb = this.b;
          a.o(tb, "pluginName");
          tf.b(tb, this.a, p0);
       }
       PatchProxy.onMethodExit(c$b.class, "2");
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$b.class, "1")) {
       }else {
          p0 = this.f;
          if (p0 != null) {
             c$b tb = this.b;
             a.o(tb, "pluginName");
             p0.a(tb, this.a);
          }
          PatchProxy.onMethodExit(c$b.class, "1");
       }
       return;
    }
}
