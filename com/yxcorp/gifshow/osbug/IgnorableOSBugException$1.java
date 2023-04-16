package com.yxcorp.gifshow.osbug.IgnorableOSBugException$1;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException;
import java.lang.String;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;

public final class IgnorableOSBugException$1 extends IgnorableOSBugException	// class@0021d2
{

    public void IgnorableOSBugException$1(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean matches(Exception p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IgnorableOSBugException$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof IllegalArgumentException) {
          String localizedMes = p0.getLocalizedMessage();
          if (localizedMes != null && localizedMes.startsWith("pointerIndex out of range")) {
             return true;
          }
       }
       return false;
    }
}
