package lj1.d;
import com.yxcorp.gifshow.model.response.WalletResponse;
import lj1.b;
import java.lang.Throwable;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@002f7f
{
    public final WalletResponse a;
    public final b b;
    public final Throwable c;
    public final GiftMessage d;
    public final String e;
    public final long f;

    public void d(WalletResponse p0,b p1,Throwable p2,GiftMessage p3,String p4,long p5){
       a.p(p1, "params");
       a.p(p4, "action");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public void d(WalletResponse p0,b p1,Throwable p2,GiftMessage p3,String p4,long p5,int p6,u p7){
       long l = (p6 & 0x20)? 0: p5;
       super(null, p1, null, null, p4, l);
       return;
    }
    public final GiftMessage a(){
       return this.d;
    }
    public final b b(){
       return this.b;
    }
    public final Throwable c(){
       return this.c;
    }
    public final WalletResponse d(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && !this.f - p0.f))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       d tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       if (tb != null) {
          i = tb.hashCode();
       }
       d tf = this.f;
       return (((i1 + i) * 31) + (int)(tf ^ (tf >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftSendResponse\(walletResponse="+this.a+", params="+this.b+", throwable="+this.c+", giftMessage="+this.d+", action="+this.e+", costTime="+this.f+"\)";
    }
}
