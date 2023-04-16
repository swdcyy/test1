package mg.k$n;
import erd.g;
import com.kwai.feature.post.api.feature.bridge.JsGetPublishedDataParams;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import w46.b;
import android.os.Bundle;

public final class k$n implements g	// class@002626
{
    public final JsGetPublishedDataParams b;
    public final g c;

    public void k$n(JsGetPublishedDataParams p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       l.D().e("JsGetWorkDataFun", "getPublishedDataWithStartTime\(\) get draftDataList failed, "+"params="+this.b, p0);
       this.c.a(0x4e21, p0.getMessage(), new Bundle());
    }
}
