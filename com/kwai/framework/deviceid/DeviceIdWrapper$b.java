package com.kwai.framework.deviceid.DeviceIdWrapper$b;
import com.kwai.framework.deviceid.DeviceIdWrapper$d;
import java.lang.Object;
import com.kwai.framework.deviceid.DeviceIdWrapper$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.deviceid.DeviceIdWrapper$DeviceIDStatus;
import e66.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;

public class DeviceIdWrapper$b implements DeviceIdWrapper$d	// class@000b2f
{

    public void DeviceIdWrapper$b(){
       super();
    }
    public void DeviceIdWrapper$b(DeviceIdWrapper$a p0){
       super();
    }
    public void a(String p0,int p1){
       DeviceIdWrapper$b uob = DeviceIdWrapper$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("last_android_id_check_status", b.e(new DeviceIdWrapper$DeviceIDStatus(p0, p1)));
       g.a(uEditor);
       return;
    }
    public DeviceIdWrapper$DeviceIDStatus getStatus(){
       Object[] objArray = null;
       DeviceIdWrapper$DeviceIDStatus obj = PatchProxy.apply(objArray, this, DeviceIdWrapper$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DeviceIdWrapper$DeviceIDStatus.class;
       String str = a.a.getString("last_android_id_check_status", "null");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
}
