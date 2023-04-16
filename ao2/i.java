package ao2.i;
import erd.g;
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

public final class i implements g	// class@0002a0
{
    public final g b;
    public final SubscribeLiveParams c;

    public void i(g p0,SubscribeLiveParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       if (p0.booleanValue()) {
          tb.onSuccess(new JsSuccessResult());
          if (!TextUtils.x(tc.mSubscribeId)) {
             d.a(-1694791652).k9(tc.mSubscribeId, 1, 2, 1);
          }
       }
       return;
    }
}
