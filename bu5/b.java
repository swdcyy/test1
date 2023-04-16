package bu5.b;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.feature.api.platform.antispam.AntispamInitModule;
import java.lang.Object;
import java.lang.Exception;
import sj7.d;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import du5.d;

public class b implements c$c	// class@000604
{
    public final AntispamInitModule a;

    public void b(AntispamInitModule p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          d.a(-1094585357).XL();
       }
       return;
    }
}
