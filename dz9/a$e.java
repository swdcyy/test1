package dz9.a$e;
import com.kwai.plugin.dva.work.c$c;
import dz9.a;
import java.lang.Object;
import java.lang.Exception;
import sj7.d;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class a$e implements c$c	// class@002003
{
    public final a a;

    public void a$e(a p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          this.a.a0();
       }
       return;
    }
}
