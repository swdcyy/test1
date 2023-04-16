package p75.f;
import java.lang.Runnable;
import o75.c0;
import java.lang.Object;
import p75.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;

public final class f implements Runnable	// class@002174
{
    public final c0 b;

    public void f(c0 p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       if (!TextUtils.isEmpty(g.d)) {
          a.e("ClientSelfCallback", "onPushTokenReady, listener="+tb+", linkPushToken="+g.d);
          tb.onLinkPushToken(g.d);
       }
       return;
    }
}
