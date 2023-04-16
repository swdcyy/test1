package com.kuaishou.android.security.internal.crypto.h;
import com.kuaishou.android.security.internal.plugin.bundle.f;
import com.kuaishou.android.security.internal.init.d;
import java.lang.Object;
import com.kuaishou.android.security.internal.plugin.n;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.internal.plugin.e;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import android.content.Context;
import java.lang.Boolean;
import com.kuaishou.android.security.internal.plugin.n$b;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.StringBuilder;
import java.lang.Exception;

public class h implements f	// class@0006d9
{
    public d k;

    public void h(d p0){
       super();
       this.k = null;
       Object[] objArray = new Object[0];
       this.a(p0, objArray);
    }
    public int a(d p0,Object[] p1){
       this.k = p0;
       return 0;
    }
    public String c(n p0,String p1){
       String[] stringArray;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       try{
          byte[] uobyteArray = p0.e();
          p1 = new String(uobyteArray);
          Integer.parseInt(p1);
          Object[] objArray = new Object[]{p1};
          d.b("getCustomValue got %s", objArray);
          objArray = new Object[]{stringArray,p0.a(),Integer.valueOf(0),null,b.i().j().c(),null,Boolean.valueOf(p0.f()),p0.m()};
          stringArray = new String[]{new String(p0.e())};
          p1 = this.k.a().a(0x28ad, objArray);
          if (p1 == null || !p1.length()) {
             return "";
          }
          p0.g().a(p1.getBytes());
          return p1;
       }catch(java.lang.Exception e8){
          throw new KSException("getcustomvalue exception"+e8.getMessage(), 801);
       }catch(java.lang.NumberFormatException e0){
          throw new KSException("getcustomvalue NumberFormatException", 802);
       }
    }
}
