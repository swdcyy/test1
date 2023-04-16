package mg.k$k;
import erd.g;
import com.kwai.feature.post.api.feature.bridge.JsGetPhotoCoverPathParams;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import w46.b;
import android.os.Bundle;

public final class k$k implements g	// class@002623
{
    public final JsGetPhotoCoverPathParams b;
    public final g c;

    public void k$k(JsGetPhotoCoverPathParams p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       l.D().e("JsGetWorkDataFun", "getPhotoCoverPathById\(\) failed, id="+this.b.mIdentifier, p0);
       this.c.a(0x4e21, p0.getMessage(), new Bundle());
    }
}
