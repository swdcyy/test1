package com.kuaishou.android.security.base.perf.a;
import java.lang.Object;
import java.util.TreeMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Number;

public class a	// class@000ef7
{
    public Map a;

    public void a(){
       this.a = new TreeMap();
    }
    public static a a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public static a a(String p0,String p1,String[] p2){
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 == null || (p2.length % 2)) {
          throw new IllegalArgumentException("param length must be  even");
       }
       obj = new a();
       for (int i = 0; i < p2.length; i = i + 2) {
          int i1 = i + 1;
          obj.a(p2[i], p2[i1]);
       }
       return obj.a(p0, p1);
    }
    public a a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !p0.b().isEmpty()) {
          this.a.putAll(p0.b());
       }
       return this;
    }
    public a a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = this.b(p0);
       p1 = this.b(p1);
       if (p0.length() > 0 && p1.length() > 0) {
          this.a.put(p0, p1);
       }
       return this;
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.containsKey(p0);
    }
    public String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return (p0.trim()).replaceAll(".,=", "___");
    }
    public Map b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 != null && this.getClass() == p0.getClass()) {
          return (this.toString()).equals(p0.toString());
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.toString()).hashCode();
    }
}
