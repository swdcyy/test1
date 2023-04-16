package com.kwai.sdk.eve.d;
import sm7.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public final class d implements o	// class@00144c
{

    public void d(){
       super();
    }
    public Object getValue(){
       Boolean uBoolean = PatchProxy.apply(null, this, d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.valueOf(a.t().d("enable_eve_task_package_utility_priority", false));
       }
       return uBoolean;
    }
}
