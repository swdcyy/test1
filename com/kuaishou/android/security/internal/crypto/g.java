package com.kuaishou.android.security.internal.crypto.g;
import com.kuaishou.android.security.internal.plugin.bundle.b;
import com.kuaishou.android.security.internal.init.d;
import java.lang.Object;
import com.kuaishou.android.security.internal.plugin.n;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
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

public class g implements b	// class@0006d8
{
    public d k;

    public void g(d p0){
       super();
       this.k = null;
       Object[] objArray = new Object[0];
       this.a(p0, objArray);
    }
    public int a(d p0,Object[] p1){
       this.k = p0;
       return 0;
    }
    public boolean a(n p0,String p1,boolean p2){
       if (PatchProxy.isSupport(g.class)) {
          p1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "2");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       p1 = "safe Decrypt got %s";
       int i = 1;
       try{
          Object[] objArray = new Object[i];
          objArray[0] = new String(p0.e());
          d.b(p1, objArray);
          Object[] objArray1 = new Object[]{p0.e(),p0.a(),Integer.valueOf(0),Boolean.TRUE,b.i().j().c(),Boolean.valueOf(p2),Boolean.valueOf(p0.f()),p0.m()};
          byte[] uobyteArray = this.k.a().a(0x28a6, objArray1);
          if (uobyteArray != null && uobyteArray.length) {
             p0.g().a(uobyteArray);
             return i;
          }else {
             return 0;
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          throw new KSException(613);
       }
    }
    public boolean b(n p0,String p1,boolean p2){
       if (PatchProxy.isSupport(g.class)) {
          p1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "4");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       p1 = "usafe Encrypt got %s";
       int i = 1;
       try{
          Object[] objArray = new Object[i];
          objArray[0] = new String(p0.e());
          d.b(p1, objArray);
          Object[] objArray1 = new Object[]{p0.e(),p0.a(),Integer.valueOf(0),null,b.i().j().c(),Boolean.valueOf(p2),Boolean.valueOf(p0.f()),p0.m()};
          byte[] uobyteArray = this.k.a().a(0x28a6, objArray1);
          if (uobyteArray != null && uobyteArray.length) {
             p0.g().a(uobyteArray);
             return i;
          }else {
             return 0;
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          throw new KSException(613);
       }
    }
    public boolean c(n p0,String p1,boolean p2){
       if (PatchProxy.isSupport(g.class)) {
          p1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "1");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       p1 = "safe Encrypt got %s";
       int i = 1;
       try{
          Object[] objArray = new Object[i];
          objArray[0] = new String(p0.e());
          d.b(p1, objArray);
          Object[] objArray1 = new Object[]{p0.e(),p0.a(),Integer.valueOf(0),null,b.i().j().c(),Boolean.valueOf(p2),Boolean.valueOf(p0.f()),p0.m()};
          byte[] uobyteArray = this.k.a().a(0x28a0, objArray1);
          if (uobyteArray != null && uobyteArray.length) {
             p0.g().a(uobyteArray);
             return i;
          }else {
             return 0;
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          throw new KSException(613);
       }
    }
    public boolean d(n p0,String p1,boolean p2){
       if (PatchProxy.isSupport(g.class)) {
          p1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "3");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       p1 = "usafe Encrypt got %s";
       int i = 1;
       try{
          Object[] objArray = new Object[i];
          objArray[0] = new String(p0.e());
          d.b(p1, objArray);
          Object[] objArray1 = new Object[]{p0.e(),p0.a(),Integer.valueOf(i),null,b.i().j().c(),Boolean.valueOf(p2),Boolean.valueOf(p0.f()),p0.m()};
          byte[] uobyteArray = this.k.a().a(0x28a6, objArray1);
          if (uobyteArray != null && uobyteArray.length) {
             p0.g().a(uobyteArray);
             return i;
          }else {
             return 0;
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          throw new KSException(613);
       }
    }
}
