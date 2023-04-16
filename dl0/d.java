package dl0.d;
import com.kwai.plugin.dva.work.c$c;
import dl0.a;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sj7.d;

public class d implements c$c	// class@001fb4
{
    public final a a;

    public void d(a p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.a.a(p0);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          this.a.onSuccess();
       }
       return;
    }
}
