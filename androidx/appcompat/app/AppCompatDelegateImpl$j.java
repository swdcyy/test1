package androidx.appcompat.app.AppCompatDelegateImpl$j;
import androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager;
import androidx.appcompat.app.AppCompatDelegateImpl;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.os.PowerManager;
import android.content.IntentFilter;

public class AppCompatDelegateImpl$j extends AppCompatDelegateImpl$AutoNightModeManager	// class@00057b
{
    public final PowerManager c;
    public final AppCompatDelegateImpl d;

    public void AppCompatDelegateImpl$j(AppCompatDelegateImpl p0,Context p1){
       this.d = p0;
       super(p0);
       this.c = p1.getApplicationContext().getSystemService("power");
    }
    public IntentFilter b(){
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
       return intentFilter;
    }
    public int c(){
       int i = (this.c.isPowerSaveMode())? 2: 1;
       return i;
    }
    public void d(){
       this.d.e();
    }
}
