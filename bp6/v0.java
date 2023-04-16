package bp6.v0;
import java.lang.Runnable;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.util.Objects;
import com.kwai.chat.sdk.signal.f;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import k85.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.imsdk.internal.client.t;

public final class v0 implements Runnable	// class@000554
{
    public final v b;

    public void v0(v p0){
       super();
       this.b = p0;
    }
    public final void run(){
       v0 tb = this.b;
       Objects.requireNonNull(tb);
       if (v.w != null) {
          int i = tb.j();
          SharedPreferences sharedPrefer = c.a(f.e().a(), "IMSDK_CONFIG", 0);
          if (sharedPrefer.getInt("currentEnv", -1) != i) {
             g.a(sharedPrefer.edit().putInt("currentEnv", i));
             t.i();
          }
       }
       return;
    }
}
