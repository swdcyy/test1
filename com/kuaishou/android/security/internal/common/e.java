package com.kuaishou.android.security.internal.common.e;
import java.lang.reflect.InvocationHandler;
import com.kuaishou.android.security.internal.plugin.ISecurityDfpCallback;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;
import java.lang.Integer;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.internal.common.KSecurityContext;

public class e implements InvocationHandler	// class@000f46
{
    public ISecurityDfpCallback a;

    public void e(ISecurityDfpCallback p0){
       this.a = p0;
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       System.out.println("method"+p1.getName());
       System.out.println("params"+p2.length);
       if ((p1.getName()).equals("onFailed") && p2.length == 2) {
          System.out.println("invoke on failed");
          this.a.onFailed(p2[0].intValue(), p2[1]);
       }else if((p1.getName()).equals("onSuccess") && p2.length == 1){
          System.out.println("invoke onSuccess");
          if (b.i().j() != null) {
             b.i().h().setEgid(p2[0]);
          }
          this.a.onSuccess(p2[0]);
       }
       return null;
    }
}
