package ai7.a$a;
import android.bluetooth.BluetoothProfile$ServiceListener;
import ai7.a;
import java.lang.Object;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothHeadset;

public class a$a implements BluetoothProfile$ServiceListener	// class@0000ce
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onServiceConnected(int p0,BluetoothProfile p1){
       a b = this.b.b;
       _monitor_enter(b);
       if (p0 == 2) {
          p0.f = p1;
       }else if(p0 == 1){
          p0.e = p1;
       }
       _monitor_exit(b);
       return;
    }
    public void onServiceDisconnected(int p0){
       a b = this.b.b;
       _monitor_enter(b);
       if (p0 == 2) {
          p0.f = null;
       }else if(p0 == 1){
          p0.e = null;
       }
       _monitor_exit(b);
       return;
    }
}
