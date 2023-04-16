package o75.d;
import com.kwai.chat.kwailink.client.c0$c;
import com.kwai.chat.kwailink.i;
import java.lang.Object;
import java.lang.Exception;
import o75.x;
import com.kwai.chat.kwailink.client.c0;
import com.kwai.chat.kwailink.f;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;

public final class d implements c0$c	// class@001fb8
{
    public final i a;

    public void d(i p0){
       this.a = p0;
    }
    public void onException(Exception p0){
       x.a(this, p0);
    }
    public final void run(){
       d ta = this.a;
       if (ta != null) {
          e m = c0.m;
          ta.s1(m);
          a.e("KwaiLinkClient", "setPushNotifierCallBack succeeded, clientPushNotifierCallback="+m);
          c0.r = true;
       }else {
          a.e("KwaiLinkClient", "setPushNotifierCallBack failed, service is null");
       }
       return;
    }
}
