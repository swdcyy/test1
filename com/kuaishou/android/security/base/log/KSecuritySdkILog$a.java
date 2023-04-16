package com.kuaishou.android.security.base.log.KSecuritySdkILog$a;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.Integer;
import java.lang.Exception;

public final class KSecuritySdkILog$a implements KSecuritySdkILog	// class@000ed9
{

    public void KSecuritySdkILog$a(){
       super();
    }
    public void onSecuriySuccess(){
       if (PatchProxy.applyVoid(null, this, KSecuritySdkILog$a.class, "2")) {
          return;
       }
       KSecurityTrack.i("kguard_tracker_key", "KSecuritySdkILog DEFAULT onSecuriySuccess");
       return;
    }
    public void onSeucrityError(KSException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSecuritySdkILog$a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0.getErrorCode()),p0.getMessage()};
       KSecurityTrack.i("kguard_tracker_key", String.format("KSecuritySdkILog DEFAULT [%d-%s]", objArray));
       return;
    }
    public void report(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSecuritySdkILog$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[]{p1};
       KSecurityTrack.i(p0, String.format("KSecuritySdkILog DEFAULT report [%s]", objArray));
       return;
    }
}
