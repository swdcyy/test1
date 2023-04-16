package co7.a;
import grd.c;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public class a extends c	// class@000583
{

    public void a(){
       super();
    }
    public void onComplete(){
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "e");
       if (!this.isDisposed()) {
          this.dispose();
       }
       return;
    }
    public void onNext(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (!this.isDisposed()) {
          this.dispose();
       }
       return;
    }
}
