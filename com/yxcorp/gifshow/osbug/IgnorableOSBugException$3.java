package com.yxcorp.gifshow.osbug.IgnorableOSBugException$3;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException;
import java.lang.String;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException$1;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.NullPointerException;
import java.lang.CharSequence;

public final class IgnorableOSBugException$3 extends IgnorableOSBugException	// class@0021d4
{

    public void IgnorableOSBugException$3(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean matches(Exception p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IgnorableOSBugException$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof NullPointerException) {
          String localizedMes = p0.getLocalizedMessage();
          if (localizedMes != null && localizedMes.contains("mPrivateFlags")) {
             return true;
          }
       }
       return false;
    }
}
