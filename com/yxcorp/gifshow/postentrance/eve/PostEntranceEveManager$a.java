package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$a;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PostEntranceEveManager$a	// class@001045
{
    public final String a;
    public final Integer b;
    public final String c;

    public void PostEntranceEveManager$a(String p0,Integer p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String a(){
       return this.c;
    }
    public final String b(){
       return this.a;
    }
    public final Integer c(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntranceEveManager$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PostEntranceEveManager$a && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PostEntranceEveManager$a obj = PatchProxy.apply(null, this, PostEntranceEveManager$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PostEntranceEveManager$a tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostEntranceEveManager$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MaterialData\(id="+this.a+", type="+this.b+", iconUrl="+this.c+"\)";
    }
}
