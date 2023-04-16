package mg.n3;
import exc.l$a;
import com.feature.post.bridge.y;
import f55.g;
import java.lang.Object;
import exc.l$f;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import android.os.Bundle;
import exc.l$b;
import com.kwai.feature.post.api.feature.bridge.JsPublishToMiddlePlatformResult;
import com.kwai.feature.post.api.feature.bridge.JsPublishToMiddlePlatformResult$PublishData;

public class n3 implements l$a	// class@00263f
{
    public final g a;
    public final y b;

    public void n3(y p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,l$f p1){
       Object[] objArray = new Object[0];
       l.D().A("PostBridgeModuleImpl", "publishToMiddlePlatform onFailed errorCode:"+p0+",error:"+p1, objArray);
       if (p1 == null) {
          this.a.a(p0, "", null);
       }else {
          this.a.a(p0, p1.getMessage(), null);
       }
       return;
    }
    public void b(String p0){
    }
    public void c(l$b p0){
       Object[] objArray = new Object[0];
       l.D().w("PostBridgeModuleImpl", "publishToMiddlePlatform onSuccess response:"+p0, objArray);
       this.a.onSuccess(new JsPublishToMiddlePlatformResult(1, JsPublishToMiddlePlatformResult$PublishData.success(p0.a()+"")));
    }
}
