package com.tachikoma.core.utility.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import iq8.q;
import android.content.res.Resources;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class f	// class@000dda
{

    public void f(){
       super();
    }
    public static int a(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          if (p2 == null) {
             p2 = q.a().getPackageName();
          }
          return q.a().getResources().getIdentifier(p0, p1, p2);
       }catch(java.lang.Exception e6){
          throw new RuntimeException("Error getResourceId by TKContextUtil.getContext\(\)", e6);
       }
    }
}
