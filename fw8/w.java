package fw8.w;
import erd.g;
import com.yxcorp.gifshow.activity.PromotionRouterActivity;
import java.lang.Object;
import com.yxcorp.gifshow.service.response.PromotionRouterUriResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import android.net.Uri;
import ekd.w0;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class w implements g	// class@00236e
{
    public final PromotionRouterActivity b;

    public void w(PromotionRouterActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, PromotionRouterActivity.class, "2")) {
       }else if(TextUtils.x(p0.mRouterUri)){
          tb.v3(null);
       }else if(tb.w3(w0.f(p0.mRouterUri))){
          tb.finish();
       }else {
          tb.w3(tb.u3());
          tb.finish();
       }
       return;
    }
}
