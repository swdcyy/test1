package o75.c;
import com.kwai.chat.kwailink.client.c0$c;
import com.kwai.chat.kwailink.i;
import java.lang.Object;
import java.lang.Exception;
import o75.x;
import com.kwai.chat.kwailink.client.c0;
import com.kwai.chat.kwailink.b;
import com.kwai.chat.kwailink.g;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;

public final class c implements c0$c	// class@001fb6
{
    public final i a;

    public void c(i p0){
       this.a = p0;
    }
    public void onException(Exception p0){
       x.a(this, p0);
    }
    public final void run(){
       c ta = this.a;
       if (ta != null) {
          b l = c0.l;
          ta.z0(l);
          ta.s0(c0.n);
          a.e("KwaiLinkClient", "setLinkEventCallBack succeeded, clientLinkEventCallback="+l);
          c0.q = true;
       }else {
          a.e("KwaiLinkClient", "setLinkEventCallBack failed, service is null");
       }
       return;
    }
}
