package o75.k;
import java.lang.Runnable;
import com.kwai.chat.kwailink.i;
import java.lang.Object;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;
import com.kwai.chat.kwailink.client.c0;

public final class k implements Runnable	// class@001fbf
{
    public final i b;

    public void k(i p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       a.e("KwaiLinkClient", "onServiceUp");
       c0.o = false;
       c0.B(tb);
       c0.y(tb);
       c0.D(tb);
       c0.p(tb);
       c0.F(tb);
       c0.E(tb);
    }
}
