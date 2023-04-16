package com.kwai.slide.play.detail.information.caption.k$a;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class k$a	// class@0017dd
{
    public final CharSequence a;
    public final CharSequence b;

    public void k$a(CharSequence p0,CharSequence p1){
       a.p(p0, "name");
       a.p(p1, "caption");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof k$a && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       k$a obj = PatchProxy.apply(null, this, k$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       k$a tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, k$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CaptionDialogInfo\(name="+this.a+", caption="+this.b+"\)";
    }
}
