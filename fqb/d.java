package fqb.d;
import android.content.ServiceConnection;
import fqb.c;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.music.radio.notification.MusicRadioForegroundService$a;
import com.yxcorp.gifshow.music.radio.notification.MusicRadioForegroundService;
import com.yxcorp.gifshow.music.radio.notification.MusicNotificationHelper;
import fqb.c$a;
import rm9.a;

public final class d implements ServiceConnection	// class@0029c2
{
    public final c b;

    public void d(c p0){
       this.b = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "service");
       d tb = this.b;
       tb.b = p1;
       c c = tb.c;
       if (c != null) {
          MusicRadioForegroundService b = (p1 != null)? p1.a.b: null;
          c.a(b);
       }
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "name");
       c b = this.b.b;
       if (b != null && !PatchProxy.applyVoid(null, b, MusicRadioForegroundService$a.class, "1")) {
          MusicRadioForegroundService b1 = b.a.b;
          if (b1 != null) {
             b1.c(true);
          }
       }
       return;
    }
}
