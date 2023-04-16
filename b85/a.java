package b85.a;
import java.lang.Runnable;
import com.kwai.chat.kwailink.receiver.AlarmReceiver;
import android.content.Intent;
import android.content.Context;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import q75.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.base.b;
import android.app.AlarmManager;
import android.app.PendingIntent;
import java.lang.Throwable;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;
import com.kwai.chat.kwailink.service.a;

public final class a implements Runnable	// class@000362
{
    public final AlarmReceiver b;
    public final Intent c;
    public final Context d;

    public void a(AlarmReceiver p0,Intent p1,Context p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       Intent intent;
       String str;
       a tb = this.b;
       a td = this.d;
       Objects.requireNonNull(tb);
       a.e("AlarmReceiver", "onReceive, action="+this.c.getAction());
       Object[] objArray = null;
       if (b.a()) {
          if (!PatchProxy.applyVoid(objArray, tb, AlarmReceiver.class, "5")) {
             a.e("AlarmReceiver", "unregister");
             intent = new Intent("com.kwai.chat.kwailink.heartbeat");
             intent.setClassName(b.b().getPackageName(), AlarmReceiver.class.getName());
             intent.setPackage(b.b().getPackageName());
             b.b().getSystemService("alarm").cancel(PendingIntent.getBroadcast(b.b(), 0, intent, 0x8000000));
          }
       }else if(PatchProxy.applyVoidOneRefs(td, tb, AlarmReceiver.class, "3")){
          String str1 = "startService";
          try{
             a.e("AlarmReceiver", str1);
             intent = new Intent();
             intent.setComponent(new ComponentName(td, "com.kwai.chat.kwailink.service.NewKwaiLinkService"));
             intent.setPackage(td.getPackageName());
             a.e(td, intent);
          }catch(java.lang.Exception e1){
             a.g("AlarmReceiver", "startService, exception="+e1.getMessage());
          }
       }
    label_010e :
       return;
    }
}
