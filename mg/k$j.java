package mg.k$j;
import erd.g;
import com.kwai.feature.post.api.feature.bridge.JsGetPhotoCoverPathParams;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import og.l;
import java.lang.StringBuilder;
import w46.b;
import android.os.Bundle;

public final class k$j implements g	// class@002622
{
    public final JsGetPhotoCoverPathParams b;
    public final g c;

    public void k$j(JsGetPhotoCoverPathParams p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       a.o(p0, "coverPath");
       int i = 0;
       StringBuilder str = (!p0.length())? 1: null;
       if (str) {
          Object[] objArray = new Object[i];
          l.D().t("JsGetWorkDataFun", "getPhotoCoverPathById\(\) failed to get cover path, id="+this.b.mIdentifier, objArray);
          this.c.a(412, "failed to get cover path, id="+this.b.mIdentifier, new Bundle());
       }else {
          this.c.onSuccess(p0);
       }
       return;
    }
}
