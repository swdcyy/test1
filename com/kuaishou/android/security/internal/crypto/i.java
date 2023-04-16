package com.kuaishou.android.security.internal.crypto.i;
import com.kuaishou.android.security.internal.plugin.bundle.c;
import com.kuaishou.android.security.internal.init.d;
import java.lang.Object;
import com.kuaishou.android.security.internal.plugin.n;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.security.internal.plugin.e;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import android.content.Context;
import com.kuaishou.android.security.internal.plugin.n$b;
import java.lang.Exception;
import com.kuaishou.android.security.base.exception.KSException;

public class i implements c	// class@0006da
{
    public d k;

    public void i(d p0){
       super();
       this.k = p0;
       Object[] objArray = new Object[0];
       this.a(p0, objArray);
    }
    public int a(d p0,Object[] p1){
       this.k = p0;
       return 0;
    }
    public boolean e(n p0,String p1){
       String[] stringArray;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       try{
          Object[] objArray = new Object[]{stringArray,p0.a(),null,null,b.i().j().c(),null,null};
          stringArray = new String[]{new String(p0.e())};
          p1 = this.k.a().a(0x28ab, objArray);
          if (p1 == null || p1.length() <= 0) {
             return 0;
          }
          p0.g().a(p1.getBytes());
          return 1;
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          throw new KSException(-1);
       }
    }
}
