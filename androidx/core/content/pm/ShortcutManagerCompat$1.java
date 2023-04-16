package androidx.core.content.pm.ShortcutManagerCompat$1;
import android.content.BroadcastReceiver;
import android.content.IntentSender;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender$OnFinished;
import android.os.Handler;

public class ShortcutManagerCompat$1 extends BroadcastReceiver	// class@00070f
{
    public final IntentSender a;

    public void ShortcutManagerCompat$1(IntentSender p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       try{
          this.a.sendIntent(p0, 0, null, null, null);
          return;
       }catch(android.content.IntentSender$SendIntentException e0){
       }
    }
}
