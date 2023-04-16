package ae5.b;
import android.content.ServiceConnection;
import com.kwai.component.photo.detail.core.media.a;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.Intent;
import com.kwai.component.photo.detail.core.media.MediaButtonService;
import android.content.Context;
import com.kwai.plugin.dva.feature.core.hook.a;

public class b implements ServiceConnection	// class@000080
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
    }
    public void onServiceDisconnected(ComponentName p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       if (tb.c == null) {
          a a = tb.a;
          if (a != null && !a.isFinishing()) {
             a.c = true;
             b tb1 = this.b;
             a.a(tb1.a, new Intent(this.b.a, MediaButtonService.class), tb1.b, true);
          }
       }
       return;
    }
}
