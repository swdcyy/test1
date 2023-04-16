package og.i;
import erd.a;
import og.a$e;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.String;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Looper;
import og.i$a;
import java.lang.Runnable;

public final class i implements a	// class@0027ab
{
    public final a$e b;

    public void i(a$e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (a.g(this.b.c.get(), this.b.d.mFilePath) ^ 0x01) {
          new Handler(Looper.getMainLooper()).postDelayed(new i$a(this), 200);
       }
       return;
    }
}
