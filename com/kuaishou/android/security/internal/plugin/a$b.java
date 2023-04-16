package com.kuaishou.android.security.internal.plugin.a$b;
import com.kuaishou.android.security.internal.plugin.n$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.plugin.n$b;
import java.util.Objects;
import java.util.Map;
import java.lang.Boolean;
import com.kuaishou.android.security.internal.plugin.n;
import java.lang.StringBuilder;
import com.kuaishou.android.security.internal.plugin.a;
import com.kuaishou.android.security.internal.plugin.a$a;
import java.lang.IllegalStateException;

public final class a$b extends n$a	// class@0006ed
{
    public Map a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public byte[] f;
    public n$b g;
    public Integer h;
    public byte[] i;
    public String j;
    public Boolean k;
    public String l;

    public void a$b(){
       super();
    }
    public n$a a(int p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.h = Integer.valueOf(p0);
       return this;
    }
    public n$a a(n$b p0){
       this.g = p0;
       return this;
    }
    public n$a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null appKey");
       this.b = p0;
       return this;
    }
    public n$a a(Map p0){
       this.a = p0;
       return this;
    }
    public n$a a(boolean p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.k = Boolean.valueOf(p0);
       return this;
    }
    public n$a a(byte[] p0){
       this.f = p0;
       return this;
    }
    public n a(){
       Object obj = this;
       String obj1 = PatchProxy.apply(null, obj, a$b.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = (obj.b == null)? " appKey": "";
       if (obj.c == null) {
          obj1 = obj1+" requestType";
       }
       if (obj.h == null) {
          obj1 = obj1+" errorCode";
       }
       if (obj.k == null) {
          obj1 = obj1+" isInnerInvoke";
       }
       if (obj.l == null) {
          obj1 = obj1+" did";
       }
       if (obj1.isEmpty()) {
          a uoa = new a(obj.a, obj.b, obj.c.intValue(), obj.d, obj.e, obj.f, obj.g, obj.h.intValue(), obj.i, obj.j, obj.k.booleanValue(), obj.l, null);
          return obj1;
       }else {
          throw new IllegalStateException("Missing required properties:"+obj1);
       }
    }
    public n$a b(int p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.c = Integer.valueOf(p0);
       return this;
    }
    public n$a b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null did");
       this.l = p0;
       return this;
    }
    public n$a b(byte[] p0){
       this.i = p0;
       return this;
    }
    public n$a c(String p0){
       this.d = p0;
       return this;
    }
    public n$a d(String p0){
       this.e = p0;
       return this;
    }
    public n$a e(String p0){
       this.j = p0;
       return this;
    }
}
