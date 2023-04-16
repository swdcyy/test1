package com.kuaishou.tachikoma.api.exception.TKException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.util.ArrayList;
import java.lang.StackTraceElement;

public class TKException extends RuntimeException	// class@000f80
{

    public void TKException(String p0){
       super(p0, null);
    }
    public void TKException(String p0,Throwable p1){
       StringBuilder str = PatchProxy.applyTwoRefs(p0, p1, null, TKException.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = "##";
          if (!TextUtils.isEmpty(p0)) {
             str = str+p0+"_";
          }
          str = (p1 != null)? str+p1.getMessage(): str+"TACHIKOMAÒì³£ÁË";
          str = str+"##"+"\n";
       }
       super(str, p1);
       return;
    }
    public void TKException(Throwable p0){
       super(null, p0);
    }
    public List getStackTraceList(){
       ArrayList obj = PatchProxy.apply(null, this, TKException.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       StackTraceElement[] stackTrace = this.getStackTrace();
       if (stackTrace != null && stackTrace.length >= 1) {
          int len = stackTrace.length;
          for (int i = 0; i < len; i = i + 1) {
             obj.add(stackTrace[i].toString());
          }
       }
       return obj;
    }
}
