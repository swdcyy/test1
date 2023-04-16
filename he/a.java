package he.a;
import java.lang.Runnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.blob.BlobModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.modules.blob.BlobCollector;

public final class a implements Runnable	// class@002123
{
    public final ReactContext b;
    public final BlobModule c;

    public void a(ReactContext p0,BlobModule p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       JavaScriptContextHolder javaScriptCo = this.b.getJavaScriptContextHolder();
       if (javaScriptCo.get()) {
          BlobCollector.nativeInstall(this.c, javaScriptCo.get());
       }
       return;
    }
}
