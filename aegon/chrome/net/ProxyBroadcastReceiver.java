package aegon.chrome.net.ProxyBroadcastReceiver;
import android.content.BroadcastReceiver;
import aegon.chrome.net.ProxyChangeListener;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import i0.g;
import java.lang.Runnable;
import android.os.Handler;

public final class ProxyBroadcastReceiver extends BroadcastReceiver	// class@000083
{
    public final ProxyChangeListener a;

    public void ProxyBroadcastReceiver(ProxyChangeListener p0){
       super();
       this.a = p0;
    }
    public void onReceive(Context p0,Intent p1){
       if ((p1.getAction()).equals("android.intent.action.PROXY_CHANGE")) {
          ProxyBroadcastReceiver ta = this.a;
          g og = new g(ta, p1);
          ta.g(og);
          ta.b.postDelayed(og, 500);
       }
       return;
    }
}
