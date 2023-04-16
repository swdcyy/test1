package co3.h;
import ut7.g;
import nm3.b;
import eo3.b0;
import java.lang.Object;
import ut7.e;
import com.kwai.statechart.a;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import android.util.Log;
import ut7.h;
import ut7.n;

public class h implements g	// class@0005b1
{
    public final b a;
    public final b0 b;

    public void h(b p0,b0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(e p0){
    }
    public void b(a p0,e p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "3")) {
          return;
       }
       this.j("logEnterStateError event = "+p1.getClass().getSimpleName()+" throwable = "+Log.getStackTraceString(p2));
       return;
    }
    public void c(a p0,e p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "4")) {
          return;
       }
       this.j("logExitStateError event = "+p1.getClass().getSimpleName()+" throwable = "+Log.getStackTraceString(p2));
       return;
    }
    public void d(e p0,a p1,boolean p2){
    }
    public void e(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.j("logSendEvent event = "+p0.getClass().getSimpleName());
       return;
    }
    public void f(h p0,Throwable p1){
    }
    public void g(e p0,a p1){
    }
    public void h(e p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "5")) {
          return;
       }
       this.j("logTransition event = "+p0.getClass().getSimpleName()+" throwable = "+Log.getStackTraceString(p1));
       return;
    }
    public void i(e p0,n p1){
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oh, "2")) {
          return;
       }
       String str = "logTransition event = "+p0.getClass().getSimpleName()+" from = "+p1.a().b()+" to = "+p1.c().b();
       if (!PatchProxy.applyVoidOneRefs(str, this, oh, "6")) {
          this.a.i("RedPacketStateChart", str+" key = "+this.b);
       }
       return;
    }
    public final void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "7")) {
          return;
       }
       this.a.e("RedPacketStateChart", p0+" key = "+this.b);
       return;
    }
}
