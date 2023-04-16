package com.yxcorp.gifshow.share.widget.ForwardFansSectionFragment$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ForwardFansSectionFragment$b	// class@001cb6
{
    public final String a;
    public final String b;

    public void ForwardFansSectionFragment$b(String p0,String p1){
       a.p(p0, "dialogTextLeft");
       a.p(p1, "dialogTextRight");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ForwardFansSectionFragment$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ForwardFansSectionFragment$b && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ForwardFansSectionFragment$b obj = PatchProxy.apply(null, this, ForwardFansSectionFragment$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ForwardFansSectionFragment$b tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ForwardFansSectionFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ForwardFansPopBanner\(dialogTextLeft="+this.a+", dialogTextRight="+this.b+"\)";
    }
}
