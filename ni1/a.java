package ni1.a;
import lj1.c;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.SelectMode;
import java.util.Map;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import java.lang.Object;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@003326
{
    public final c a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final SelectMode f;
    public final Map g;

    public void a(c p0,int p1,int p2,String p3,int p4,SelectMode p5,Map p6,int p7,u p8){
       if (p7 & 0x04) {
          p2 = -1;
       }
       if (p7 & 0x08) {
          p3 = "NormalGift";
       }
       if (p7 & 0x10) {
          p4 = 1;
       }
       if (p7 & 0x20) {
          Objects.requireNonNull(LiveGiftBoxConfig.m);
          p5 = LiveGiftBoxConfig.l;
       }
       if (p7 & 0x40) {
          p6 = null;
       }
       a.p(p0, "receiver");
       a.p(p3, "selectTabId");
       a.p(p5, "selectMode");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       return;
    }
    public final c a(){
       return this.a;
    }
    public final int b(){
       return this.e;
    }
    public final int c(){
       return this.c;
    }
    public final SelectMode d(){
       return this.f;
    }
    public final String e(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (a.g(this.d, p0.d) && (this.e == p0.e && (a.g(this.f, p0.f) && a.g(this.g, p0.g))))))))) {
          return true;
       }
       return false;
    }
    public final int f(){
       return this.b;
    }
    public final Map g(){
       return this.g;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.b) * 31) + this.c) * 31;
       a td = this.d;
       int i2 = (td != null)? td.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.e) * 31;
       td = this.f;
       i2 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       td = this.g;
       if (td != null) {
          i = td.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftBoxParam\(receiver="+this.a+", sourceType="+this.b+", selectGiftId="+this.c+", selectTabId=\'"+this.d+"\', batchCount="+this.e+", selectMode="+this.f+')';
    }
}
