package p75.i;
import android.os.IBinder$DeathRecipient;
import p75.l;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Thread;
import com.kwai.chat.kwailink.log.a;
import java.util.concurrent.ScheduledExecutorService;
import p75.b;
import p75.j;
import java.lang.Runnable;

public final class i implements IBinder$DeathRecipient	// class@002176
{
    public final l a;

    public void i(l p0){
       this.a = p0;
    }
    public final void binderDied(){
       i ta = this.a;
       Objects.requireNonNull(ta);
       a.e("KwaiLinkServiceConnector", "binderDied, tid="+Thread.currentThread().getId());
       b.M1().execute(new j(ta));
    }
}
