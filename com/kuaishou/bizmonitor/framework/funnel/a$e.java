package com.kuaishou.bizmonitor.framework.funnel.a$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public class a$e	// class@001148
{
    public boolean a;
    public Class b;
    public String c;
    public String d;
    public String e;
    public long f;
    public int g;
    public WeakReference h;
    public ArrayList i;

    public void a$e(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof a$e) {
          return false;
       }
       if (this.a != p0.a || (!this.b.equals(p0.b) || !(this.d).equals(p0.d))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       a$e obj = PatchProxy.apply(null, this, a$e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (this.d == null)? this.b.hashCode(): this.b.hashCode() ^ (this.d).hashCode();
       return (obj ^ i);
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, a$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       String str = (this.a != null)? "p<": " <";
       return obj+str+this.b.getSimpleName()+">: "+this.d;
    }
}
