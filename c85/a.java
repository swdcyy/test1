package c85.a;
import java.lang.Runnable;
import com.kwai.chat.kwailink.service.d;
import android.content.Intent;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;

public final class a implements Runnable	// class@000429
{
    public final d b;
    public final Intent c;

    public void a(d p0,Intent p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       a.g("KwaiLinkServiceInternal", "KwaiLinkService onRebind");
       tb.a(this.c);
    }
}
