package androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1;
import android.content.BroadcastReceiver;
import androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager;
import android.content.Context;
import android.content.Intent;

public class AppCompatDelegateImpl$AutoNightModeManager$1 extends BroadcastReceiver	// class@00056a
{
    public final AppCompatDelegateImpl$AutoNightModeManager a;

    public void AppCompatDelegateImpl$AutoNightModeManager$1(AppCompatDelegateImpl$AutoNightModeManager p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       this.a.d();
    }
}
