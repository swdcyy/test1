package bz2.a$b;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bz2.a;
import sj7.d;

public final class a$b implements c$c	// class@00047e
{
    public final long a;

    public void a$b(long p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       a.c(false, this.a, p0);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          a.c(true, this.a, null);
       }
       return;
    }
}
