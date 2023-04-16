package fqb.c;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import com.yxcorp.gifshow.music.radio.notification.MusicRadioForegroundService;
import android.content.Context;
import o56.a;
import fqb.d;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import qm9.f;
import java.lang.RuntimeException;
import q87.c;
import qrd.l1;

public final class c	// class@0029c1
{
    public ServiceConnection a;
    public MusicRadioForegroundService$a b;
    public c$a c;
    public final Activity d;

    public void c(Activity p0){
       l1 a;
       a.p(p0, "activity");
       super();
       this.d = p0;
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
       }else {
          Intent intent = new Intent(p0, MusicRadioForegroundService.class);
          intent.setPackage(a.v);
          d uod = new d(this);
          this.a = uod;
          try{
             int i = 1;
             a.a(p0, intent, uod, i);
          }catch(java.lang.RuntimeException e4){
             Object[] objArray = new Object[0];
             f.C().t("MusicRadioService", e4.toString(), objArray);
             a = l1.a;
          }
       }
    }
}
