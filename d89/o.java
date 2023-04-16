package d89.o;
import erd.o;
import d89.q;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import brd.t;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import d89.p;
import cxd.b;

public final class o implements o	// class@002093
{
    public final q b;

    public void o(q p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 instanceof KwaiException) {
          KwaiException mResponse = p0.mResponse;
          if (mResponse.b() != 705) {
             p0 = t.error(p0);
          }else {
             String str = mResponse.d();
             if (TextUtils.isEmpty(str)) {
                p0 = t.error(p0);
             }else {
                Activity uActivity = ActivityContext.g().e();
                p0 = (!uActivity instanceof GifshowActivity)? t.error(p0): t.fromPublisher(new p(tb, uActivity, KwaiWebViewActivity.N3(uActivity, str).o("ks://webview/antispam").a()));
             }
          }
       }else {
          p0 = t.error(p0);
       }
       return p0;
    }
}
