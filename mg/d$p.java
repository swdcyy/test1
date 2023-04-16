package mg.d$p;
import erd.g;
import f55.g;
import java.lang.Object;
import java.util.List;
import og.l;
import java.lang.String;
import q87.c;
import com.kwai.feature.post.api.feature.bridge.JsSaveTempImagesResult;

public final class d$p implements g	// class@0025ea
{
    public final g b;

    public void d$p(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray = new Object[0];
       l.D().w("JsEditFun", "saveTempImages SUCCESS", objArray);
       this.b.onSuccess(new JsSaveTempImagesResult(1, p0));
    }
}
