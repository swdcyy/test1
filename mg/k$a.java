package mg.k$a;
import erd.g;
import com.kwai.feature.post.api.feature.bridge.JsAddRecommendPhotoBlackListParams;
import f55.g;
import java.lang.Object;
import om6.d;
import java.util.Iterator;
import java.util.List;
import java.lang.String;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;

public final class k$a implements g	// class@002619
{
    public final JsAddRecommendPhotoBlackListParams b;
    public final g c;

    public void k$a(JsAddRecommendPhotoBlackListParams p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Iterator iterator = this.b.mIdentifiers.iterator();
       while (iterator.hasNext()) {
          p0.at(iterator.next());
       }
       this.c.onSuccess(new JsErrorResult(1, null));
       return;
    }
}
