package mg.w1;
import erd.g;
import f55.g;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import qm6.b$a;
import android.content.Context;
import qm6.b;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.lang.String;

public final class w1 implements g	// class@002673
{
    public final g b;

    public void w1(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Activity uActivity = ActivityContext.g().e();
       p0.Um(uActivity, new b$a(uActivity, 0).f());
       this.b.onSuccess(new JsErrorResult(1, null));
    }
}
