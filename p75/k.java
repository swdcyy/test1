package p75.k;
import java.lang.Runnable;
import p75.l;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.chat.kwailink.i;
import com.kwai.chat.kwailink.log.a;
import p75.i;
import android.os.IBinder;
import android.os.IInterface;
import android.os.IBinder$DeathRecipient;
import o75.y;

public final class k implements Runnable	// class@002178
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void run(){
       try{
          k tb = this.b;
          if (tb.b()) {
             a.g("KwaiLinkServiceConnector", "onServiceConnected, got an available binder servicePid="+tb.c.u());
             i oi = new i(tb);
             tb.c.asBinder().linkToDeath(oi, 0);
             a.e("KwaiLinkServiceConnector", "onServiceConnected, linkToDeath deathRecipient="+oi);
             l e = tb.e;
             if (e != null) {
                e.a();
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
