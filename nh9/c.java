package nh9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.bluetooth.BluetoothAdapter;
import x8c.a;
import q87.c;
import android.content.Context;
import android.media.AudioManager;

public final class c	// class@003185
{

    public void c(){
       super();
    }
    public static boolean a(){
       Object[] objArray;
       BluetoothAdapter obj = PatchProxy.apply(null, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = BluetoothAdapter.getDefaultAdapter();
       String str = "ktv_log";
       int i = 0;
       if (obj == null || !obj.isEnabled()) {
          objArray = new Object[i];
          a.D().w(str, "Bluetooth Disable", objArray);
          return i;
       }else if(obj.getState() != 12){
          objArray = new Object[i];
          a.D().w(str, "STATE_OFF", objArray);
          return i;
       }else if(obj.getProfileConnectionState(2) != 2 && (obj.getProfileConnectionState(1) == 2 || obj.getProfileConnectionState(3) == 2)){
          i = true;
       }
       return i;
    }
    public static boolean b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (c.c(p0) || c.a())? true: false;
       return b;
    }
    public static boolean c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       AudioManager systemServic = p0.getSystemService("audio");
       if (systemServic != null && systemServic.isWiredHeadsetOn()) {
          b = true;
       }
       return b;
    }
}
