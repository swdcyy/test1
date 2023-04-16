package com.kuaishou.android.security.internal.crypto.j;
import com.kuaishou.android.security.internal.plugin.bundle.d;
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
import java.lang.Integer;
import android.content.Context;
import com.kuaishou.android.security.internal.plugin.n$b;
import java.nio.charset.Charset;
import java.lang.Exception;
import com.kuaishou.android.security.base.exception.KSException;

public class j implements d	// class@0006db
{
    public d k;

    public void j(d p0){
       super();
       this.k = null;
       Object[] objArray = new Object[0];
       this.a(p0, objArray);
    }
    public int a(d p0,Object[] p1){
       this.k = p0;
       return 0;
    }
    public boolean a(n p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       try{
          Object[] objArray = new Object[9];
          String[] stringArray = new String[]{""};
          objArray[b] = stringArray;
          objArray[1] = b.i().j().a();
          objArray[2] = Integer.valueOf(-1);
          objArray[3] = Boolean.FALSE;
          objArray[4] = b.i().j().c();
          objArray[5] = null;
          objArray[6] = Boolean.valueOf(p0.f());
          objArray[7] = p0.m();
          objArray[8] = p0.c();
          String str = this.k.a().a(0x28b3, objArray);
          if (str == null || !str.length()) {
             return b;
          }
          p0.g().a(str.getBytes(Charset.forName("UTF-8")));
          return 1;
       }catch(com.kuaishou.android.security.base.exception.KSException e7){
          e7.printStackTrace();
          throw new KSException(613);
       }
    }
    public boolean b(n p0,String p1){
       String[] stringArray;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       try{
          boolean b = false;
          if (p0 != null && (p0.e() == null || !p0.e().length)) {
             return b;
          }
          Object[] objArray = new Object[]{stringArray,b.i().j().a(),Integer.valueOf(-1),Boolean.FALSE,b.i().j().c(),null,Boolean.valueOf(p0.f()),p0.m()};
          stringArray = new String[]{(new String(p0.e())).trim()};
          String str = this.k.a().a(0x28a5, objArray);
          if (str == null || !str.length()) {
             return b;
          }
          p0.g().a(str.getBytes(Charset.forName("UTF-8")));
          return 1;
       }catch(com.kuaishou.android.security.base.exception.KSException e7){
          e7.printStackTrace();
          throw new KSException(613);
       }
    }
    public boolean d(n p0,String p1){
       String[] stringArray;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       try{
          boolean b = false;
          if (p0 != null && (p0.e() == null || !p0.e().length)) {
             return b;
          }
          Object[] objArray = new Object[]{stringArray,b.i().j().a(),Integer.valueOf(-1),Boolean.FALSE,b.i().j().c(),null,Boolean.valueOf(p0.f()),p0.m()};
          stringArray = new String[]{(new String(p0.e())).trim()};
          String str = this.k.a().a(0x28b1, objArray);
          if (str == null || !str.length()) {
             return b;
          }
          p0.g().a(str.getBytes(Charset.forName("UTF-8")));
          return 1;
       }catch(com.kuaishou.android.security.base.exception.KSException e7){
          e7.printStackTrace();
          throw new KSException(613);
       }
    }
    public boolean f(n p0,String p1){
       String[] stringArray;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       try{
          boolean b = false;
          if (p0 != null && (p0.e() == null || !p0.e().length)) {
             return b;
          }
          Object[] objArray = new Object[]{stringArray,b.i().j().a(),Integer.valueOf(-1),Boolean.FALSE,b.i().j().c(),null,Boolean.valueOf(p0.f()),p0.m()};
          stringArray = new String[]{(new String(p0.e())).trim()};
          String str = this.k.a().a(0x28b2, objArray);
          if (str == null || !str.length()) {
             return b;
          }
          p0.g().a(str.getBytes(Charset.forName("UTF-8")));
          return 1;
       }catch(com.kuaishou.android.security.base.exception.KSException e7){
          e7.printStackTrace();
          throw new KSException(613);
       }
    }
}
