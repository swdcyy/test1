package com.kwai.framework.deviceid.DeviceIdWrapper;
import java.lang.Object;
import java.util.regex.Pattern;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.deviceid.DeviceIdWrapper$d;
import com.kwai.framework.deviceid.DeviceIdWrapper$f;
import java.lang.Boolean;
import e66.c;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.deviceid.DeviceIdWrapper$DeviceIDStatus;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.kwai.framework.deviceid.k;
import com.kwai.framework.deviceid.n;
import com.kwai.framework.deviceid.l;
import com.kwai.framework.deviceid.m;

public class DeviceIdWrapper	// class@000b34
{

    public void DeviceIdWrapper(){
       super();
    }
    public static Pattern a(){
       Object obj = PatchProxy.apply(null, null, DeviceIdWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Pattern.compile("^[0-9a-fA-F]{16}$");
    }
    public static boolean b(DeviceIdWrapper$d p0,String p1,DeviceIdWrapper$f p2){
       DeviceIdWrapper$DeviceIDStatus obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, DeviceIdWrapper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       c.C().w("DeviceIdWrapper", "getIdStatus  androidId "+p1, objArray);
       obj = p0.getStatus();
       int i1 = 1;
       if (obj != null && TextUtils.n(obj.id, p1)) {
          obj = obj.status;
          Object[] objArray1 = new Object[i];
          c.C().w("DeviceIdWrapper", "getIdStatus  equals checkstatus "+obj, objArray1);
          if (obj != null) {
             if (obj == i1) {
                i = true;
             }
             return i;
          }
       }
       boolean b = p2.a(p1);
       Object[] objArray2 = new Object[i];
       c.C().w("DeviceIdWrapper", "getIdStatus  equals isValid "+b, objArray2);
       if (!b) {
          i1 = 2;
       }
       p0.a(p1, i1);
       return b;
    }
    public static DeviceIdWrapper$f c(int p0){
       DeviceIdWrapper uDeviceIdWra = DeviceIdWrapper.class;
       if (PatchProxy.isSupport(uDeviceIdWra)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uDeviceIdWra, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                return k.a;
             }else {
                return n.a;
             }
          }else {
             return l.a;
          }
       }else {
          return m.a;
       }
    }
}
