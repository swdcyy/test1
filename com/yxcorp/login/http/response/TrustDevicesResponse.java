package com.yxcorp.login.http.response.TrustDevicesResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class TrustDevicesResponse implements Serializable, b	// class@001adb
{
    public String mCursor;
    public List mDevices;

    public void TrustDevicesResponse(){
       super();
    }
    public List getItems(){
       return this.mDevices;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, TrustDevicesResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
