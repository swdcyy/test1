package com.oasisfeng.condom.kit.NullDeviceIdKit;
import com.oasisfeng.condom.CondomKit;
import com.oasisfeng.condom.CondomKit$SystemServiceSupplier;
import java.lang.Object;
import com.oasisfeng.condom.CondomKit$CondomKitRegistry;
import java.lang.String;
import android.content.Context;
import com.oasisfeng.condom.kit.NullDeviceIdKit$CondomTelephonyManager;
import java.lang.UnsupportedOperationException;

public class NullDeviceIdKit implements CondomKit, CondomKit$SystemServiceSupplier	// class@000a9a
{

    public void NullDeviceIdKit(){
       super();
    }
    public void a(CondomKit$CondomKitRegistry p0){
       p0.a("android.permission.READ_PHONE_STATE");
       p0.b("phone", this);
    }
    public Object b(Context p0,String p1){
       if (("carrier_config").equals(p1)) {
          throw new UnsupportedOperationException("CarrierConfigManager is not supported");
       }
       NullDeviceIdKit$CondomTelephonyManager uCondomTelep = (("phone").equals(p1))? new NullDeviceIdKit$CondomTelephonyManager(this, p0): null;
       return uCondomTelep;
    }
}
