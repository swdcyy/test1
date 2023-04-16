package o75.u;
import com.kwai.chat.kwailink.client.c0$c;
import com.kwai.chat.kwailink.i;
import java.lang.Object;
import java.lang.Exception;
import o75.x;
import com.kwai.chat.kwailink.client.c0;
import com.kwai.chat.kwailink.d;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;

public final class u implements c0$c	// class@001fc3
{
    public final i a;

    public void u(i p0){
       this.a = p0;
    }
    public void onException(Exception p0){
       x.a(this, p0);
    }
    public final void run(){
       u ta = this.a;
       if (ta != null) {
          c k = c0.k;
          ta.b1(k);
          a.e("KwaiLinkClient", "setPacketReceiveCallBack succeeded, clientPacketCallback="+k);
          c0.p = true;
       }else {
          a.e("KwaiLinkClient", "setPacketReceiveCallBack failed, service is null");
       }
       return;
    }
}
