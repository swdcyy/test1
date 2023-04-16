package aegon.chrome.net.ProxyChangeListener$ProxyReceiver;
import android.content.BroadcastReceiver;
import aegon.chrome.net.ProxyChangeListener;
import aegon.chrome.net.ProxyChangeListener$a;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import i0.h;
import java.lang.Runnable;

public class ProxyChangeListener$ProxyReceiver extends BroadcastReceiver	// class@000084
{
    public final ProxyChangeListener a;

    public void ProxyChangeListener$ProxyReceiver(ProxyChangeListener p0){
       this.a = p0;
       super();
    }
    public void ProxyChangeListener$ProxyReceiver(ProxyChangeListener p0,ProxyChangeListener$a p1){
       super(p0);
    }
    public void onReceive(Context p0,Intent p1){
       if ((p1.getAction()).equals("android.intent.action.PROXY_CHANGE")) {
          this.a.g(new h(this, p1));
       }
       return;
    }
}
