package com.kuaishou.snow.SnowException$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class SnowException$a	// class@000f39
{
    public final String a;
    public final String b;

    public void SnowException$a(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SnowException$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SnowExceptionContext: "+"mBizKey = "+this.a+"mDetail = "+this.b;
    }
}
