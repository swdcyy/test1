package c.t.m.g.cp$a;
import android.os.Handler;
import c.t.m.g.cp;
import android.os.Looper;
import android.os.Message;
import android.bluetooth.le.ScanResult;
import c.t.m.g.ed;
import java.lang.String;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;

public class cp$a extends Handler	// class@000c1a
{
    public final cp a;

    public void cp$a(cp p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void a(Message p0){
       switch (p0.what){
           case 0x182b9:
             if (ed.a) {
                ed.a("TxBluetoothProvider", "start ble scan");
             }
             cp$a ta = this.a;
             BluetoothAdapter uBluetoothAd = (cp.a(ta) == null)? null: cp.a(this.a).getAdapter();
             cp.a(ta, uBluetoothAd);
             if (cp.b(this.a) != null) {
                ta = this.a;
                cp.a(ta, cp.b(ta).getBluetoothLeScanner());
             }
             cp.c(this.a);
             break;
           case 0x182ba:
             if (cp.d(this.a)) {
                if (ed.a) {
                   ed.a("TxBluetoothProvider", "stop ble scan");
                }
                cp.e(this.a);
             }
             break;
           case 0x182bb:
             cp.a(this.a, p0.obj);
             break;
           default:
       }
       return;
    }
    public void handleMessage(Message p0){
       super.handleMessage(p0);
       this.a(p0);
    }
}
