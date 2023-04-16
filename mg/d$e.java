package mg.d$e;
import erd.o;
import com.kwai.feature.post.api.feature.bridge.JsEditDraftParams;
import android.app.Activity;
import java.lang.Object;
import om6.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.io.File;
import com.kuaishou.android.post.PostArguments;
import qrd.l1;

public final class d$e implements o	// class@0025df
{
    public final JsEditDraftParams b;
    public final Activity c;

    public void d$e(JsEditDraftParams p0,Activity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object obj = p0;
       a.p(obj, "it");
       p0 = this.b;
       obj.f50(p0.mIdentifier, this.c, null, (p0.mIsReturnToWeb ^ 0x01), 2, "toEditDraft: WeeklyReportFromWeb", null, null);
       return l1.a;
    }
}
