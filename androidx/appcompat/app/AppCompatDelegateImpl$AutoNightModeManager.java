package androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.lang.Object;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1;
import android.content.Intent;

public abstract class AppCompatDelegateImpl$AutoNightModeManager	// class@00056b
{
    public BroadcastReceiver a;
    public final AppCompatDelegateImpl b;

    public void AppCompatDelegateImpl$AutoNightModeManager(AppCompatDelegateImpl p0){
       this.b = p0;
       super();
    }
    public void a(){
       AppCompatDelegateImpl$AutoNightModeManager ta = this.a;
       if (ta != null) {
          try{
             this.b.h.unregisterReceiver(ta);
             this.a = null;
          }catch(java.lang.IllegalArgumentException e0){
          }
       }
    }
    public abstract IntentFilter b();
    public abstract int c();
    public abstract void d();
    public void e(){
       this.a();
       IntentFilter intentFilter = this.b();
       if (intentFilter != null && intentFilter.countActions()) {
          if (this.a == null) {
             this.a = new AppCompatDelegateImpl$AutoNightModeManager$1(this);
          }
          this.b.h.registerReceiver(this.a, intentFilter);
       }
       return;
    }
}
