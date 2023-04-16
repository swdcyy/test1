package com.kuaishou.android.security.internal.crypto.a;
import com.kuaishou.android.security.internal.plugin.bundle.a;
import com.kuaishou.android.security.internal.init.d;
import java.lang.Object;
import com.kuaishou.android.security.internal.plugin.n;
import com.kuaishou.android.security.internal.common.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.internal.plugin.e;
import java.lang.Integer;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import android.content.Context;
import com.kuaishou.android.security.internal.plugin.n$b;
import java.lang.Exception;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.util.f;
import android.util.Base64;
import java.util.Arrays;

public class a implements a	// class@0006d2
{
    public d k;

    public void a(d p0){
       super();
       this.k = null;
       Object[] objArray = new Object[0];
       this.a(p0, objArray);
    }
    public int a(d p0,Object[] p1){
       this.k = p0;
       return 0;
    }
    public boolean a(n p0,boolean p1,b p2){
       String obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = "asymmetric Encrypt got %s";
       int i = 1;
       try{
          Object[] objArray = new Object[i];
          objArray[0] = new String(p0.e());
          d.b(obj, objArray);
          Object[] objArray1 = new Object[]{p0.e(),p0.a(),Integer.valueOf(0),Boolean.valueOf(p1),b.i().j().c(),Integer.valueOf(0),Boolean.valueOf(p0.f()),p2.a()};
          byte[] uobyteArray = this.k.a().a(0x28ae, objArray1);
          if (uobyteArray != null && uobyteArray.length) {
             p0.g().a(uobyteArray);
             return i;
          }else {
             return 0;
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          throw new KSException("asymDecrypt "+e8.getMessage(), 613);
       }
    }
    public boolean b(n p0,boolean p1,b p2){
       String obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = "asymmetric Encrypt got %s";
       int i = 0;
       try{
          Object[] objArray = new Object[]{super(p0.e())};
          d.b(obj, objArray);
          int i1 = 2;
          obj = Base64.encodeToString(f.a(p0.e()), i1);
          if (obj.isEmpty()) {
             return i;
          }else {
             Object[] objArray1 = new Object[]{obj.getBytes(),p0.a(),Integer.valueOf(1),Integer.valueOf(i),b.i().j().c(),Boolean.valueOf(p1),Boolean.valueOf(p0.f())};
             byte[] uobyteArray = this.k.a().a(0x28ae, objArray1);
             if (uobyteArray != null && uobyteArray.length) {
                p2.a(Arrays.copyOfRange(uobyteArray, i, 33));
                p0.g().a(Arrays.copyOfRange(uobyteArray, 33, uobyteArray.length));
                return 1;
             }
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return i;
    }
}
