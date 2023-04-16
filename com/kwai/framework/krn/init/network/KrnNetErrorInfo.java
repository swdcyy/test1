package com.kwai.framework.krn.init.network.KrnNetErrorInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import java.util.ArrayList;
import java.lang.StackTraceElement;
import java.util.List;

public class KrnNetErrorInfo implements Serializable	// class@0015e5
{
    public KrnNetErrorInfo$SubErrorInfo apiErrorInfo;
    public int code;
    public String message;
    public List nativeStackAndroid;

    public void KrnNetErrorInfo(int p0,String p1){
       super(p0, p1, null);
    }
    public void KrnNetErrorInfo(int p0,String p1,Throwable p2){
       boolean b;
       super();
       this.code = p0;
       this.message = p1;
       if (p2 != null) {
          StackTraceElement[] obj = PatchProxy.apply(null, this, KrnNetErrorInfo.class, "1");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(SystemUtil.I() || a.a().c()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             this.nativeStackAndroid = new ArrayList();
             obj = p2.getStackTrace();
             for (; i < obj.length && i < 50; i = i + 1) {
                this.nativeStackAndroid.add(obj[i].toString());
             }
          }
       }
       return;
    }
}
