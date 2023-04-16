package mg.z;
import erd.g;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsGrowthWebDialogParam;
import f55.g;
import java.lang.Object;
import i46.b;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.Float;
import mg.y;
import com.google.gson.JsonObject;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;

public final class z implements g	// class@002686
{
    public final Activity b;
    public final JsGrowthWebDialogParam c;
    public final g d;

    public void z(Activity p0,JsGrowthWebDialogParam p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       p0 = this.b;
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       z oz = p0;
       JsGrowthWebDialogParam mUrl = this.c.mUrl;
       a.o(mUrl, "param.mUrl");
       p0 = this.c;
       p0.lA(oz, mUrl, p0.mYodaParams, a1.e(p0.mTopCornerRadius), Float.valueOf(this.c.mHeightRadioPercent), true, new y(this), null);
    }
}
