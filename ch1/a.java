package ch1.a;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import java.util.Map;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@0004b4
{
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final UpdatedGiftResponse e;
    public final Map f;

    public void a(String p0,List p1,String p2,String p3,UpdatedGiftResponse p4,Map p5,int p6,u p7){
       if (p6 & 0x10) {
          p4 = null;
       }
       if (p6 & 0x20) {
          p5 = null;
       }
       a.p(p0, "tabId");
       a.p(p1, "giftList");
       a.p(p2, "giftToken");
       a.p(p3, "recoGiftLlsid");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       return;
    }
    public final List a(){
       return this.b;
    }
    public final UpdatedGiftResponse b(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && a.g(this.f, p0.f)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.f;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftPagerInfo\(tabId="+this.a+", giftList="+this.b+", giftToken="+this.c+", recoGiftLlsid="+this.d+", newGiftInfo="+this.e+", extraInfo="+this.f+"\)";
    }
}
