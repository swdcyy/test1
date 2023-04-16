package androidx.appcompat.app.AppCompatDelegateImpl$k;
import androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager;
import androidx.appcompat.app.AppCompatDelegateImpl;
import q0.j;
import android.content.IntentFilter;
import java.lang.String;

public class AppCompatDelegateImpl$k extends AppCompatDelegateImpl$AutoNightModeManager	// class@00057c
{
    public final j c;
    public final AppCompatDelegateImpl d;

    public void AppCompatDelegateImpl$k(AppCompatDelegateImpl p0,j p1){
       this.d = p0;
       super(p0);
       this.c = p1;
    }
    public IntentFilter b(){
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.TIME_SET");
       intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
       intentFilter.addAction("android.intent.action.TIME_TICK");
       return intentFilter;
    }
    public int c(){
       int i = (this.c.d())? 2: 1;
       return i;
    }
    public void d(){
       this.d.e();
    }
}
