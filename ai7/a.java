package ai7.a;
import java.lang.Object;
import android.bluetooth.BluetoothAdapter;
import ai7.a$a;

public class a	// class@0000cf
{
    public String a;
    public final Object b;
    public boolean c;
    public BluetoothAdapter d;
    public BluetoothHeadset e;
    public BluetoothA2dp f;
    public BluetoothProfile$ServiceListener g;
    public static a h;

    public void a(){
       super();
       this.a = "KwaiBluetoothDetector";
       this.b = new Object();
       this.c = false;
       this.d = BluetoothAdapter.getDefaultAdapter();
       this.e = null;
       this.f = null;
       this.g = new a$a(this);
    }
}
