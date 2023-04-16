package com.kuaishou.live.bridge.commands.LiveJsCmdAbility$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdAbility$a	// class@000deb
{
    public final String a;
    public final String b;
    public final String c;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdAbility$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdAbility$a && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdAbility$a obj = PatchProxy.apply(null, this, LiveJsCmdAbility$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdAbility$a tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdAbility$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(ability="+this.a+", method="+this.b+", params="+this.c+"\)";
    }
}
