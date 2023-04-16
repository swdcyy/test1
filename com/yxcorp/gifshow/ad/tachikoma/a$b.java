package com.yxcorp.gifshow.ad.tachikoma.a$b;
import sx4.d$a;
import com.yxcorp.gifshow.ad.tachikoma.a;
import y49.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tx4.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.ad.tachikoma.a$b$a;
import p55.a;
import f55.g;
import com.kwai.bridge.a;
import java.lang.StringBuilder;

public final class a$b implements d$a	// class@001803
{
    public final a a;
    public final a b;

    public void a$b(a p0,a p1){
       a.p(p1, "bridgeCenterContext");
       this.b = p0;
       super();
       this.a = p1;
    }
    public Object a(String p0,String p1,h p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a$b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "advertise";
       Ref$ObjectRef objectRef = PatchProxy.applyFourRefs(obj, p0, p1, p2, this, a$b.class, "2");
       if (objectRef == patchProxyRe) {
          Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
          objectRef1.element = null;
          a$b ta = this.a;
          String str = "";
          String str1 = (p0 != null)? p0: str;
          if (p1 == null) {
             p1 = str;
          }
          a$b$a uob$a = new a$b$a(this, p0, objectRef1, p2, p2, p0);
          a.f(ta, obj, str1, p1, v11);
          this.b.j("bridge : "+p0+" - result : "+objectRef1.element);
          Ref$ObjectRef element = objectRef1.element;
          if (element != null) {
             objectRef = element;
          }else {
             objectRef = p0+" has not return value";
          }
       }
       return objectRef;
    }
    public Object b(String p0,String p1,String p2,h p3){
       Ref$ObjectRef obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Ref$ObjectRef();
       obj.element = null;
       a$b ta = this.a;
       String str = "";
       if (p0 == null) {
          p0 = str;
       }
       String str1 = (p1 != null)? p1: str;
       if (p2 == null) {
          p2 = str;
       }
       a$b$a uob$a = new a$b$a(this, p1, obj, p3, p3, p1);
       a.f(ta, p0, str1, p2, v10);
       this.b.j("bridge : "+p1+" - result : "+obj.element);
       Ref$ObjectRef element = obj.element;
       if (element == null) {
          element = p1+" has not return value";
       }
       return element;
    }
}
