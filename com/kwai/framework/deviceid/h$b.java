package com.kwai.framework.deviceid.h$b;
import h30.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import e66.c;
import java.lang.StringBuilder;
import q87.c;

public class h$b implements b	// class@00152a
{

    public void h$b(){
       super();
    }
    public void onFailed(int p0,String p1){
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("CloudUtil", "cloud sendIdMappingData failure£¬error message = "+p1+"   error code = "+p0, objArray);
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("CloudUtil", "cloud sendIdMappingData success£º"+p0, objArray);
       return;
    }
}
