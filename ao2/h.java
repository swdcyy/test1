package ao2.h;
import ps5.b;
import f55.g;
import com.kuaishou.live.core.show.yoda.model.SubscribeLiveParams;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import nl9.u;
import java.lang.String;
import ps5.a;

public final class h implements b	// class@00029f
{
    public final g b;
    public final SubscribeLiveParams c;

    public void h(g p0,SubscribeLiveParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Boolean p0){
       h tb = this.b;
       h tc = this.c;
       if (p0.booleanValue()) {
          tb.onSuccess(new JsSuccessResult());
          if (!TextUtils.x(tc.mSubscribeId)) {
             d.a(-1694791652).k9(tc.mSubscribeId, 1, 1, 1);
          }
       }
       return;
    }
    public void accept(Object p0){
       a.a(this, p0);
    }
}
