package lm1.g;
import lm1.g$a;
import nsd.u;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g	// class@002fa4
{
    public WalletResponse a;
    public LiveSendNoPanelGiftResponse b;
    public int c;
    public String d;
    public JsonElement e;
    public static final g$a f;

    static {
       g.f = new g$a(null);
    }
    public void g(WalletResponse p0,LiveSendNoPanelGiftResponse p1,int p2,String p3,JsonElement p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static final g a(int p0,String p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, og, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return g.f.a(p0, p1);
    }
    public final void b(JsonElement p0){
       this.e = p0;
    }
    public final void c(int p0){
       this.c = p0;
    }
    public final void d(String p0){
       this.d = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (this.c == p0.c && (a.g(this.d, p0.d) && a.g(this.e, p0.e))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       g tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.c) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftSendResponseParams\(response="+this.a+", noPanelGiftResponse="+this.b+", errorCode="+this.c+", errorMessage="+this.d+", csLogCorrelateInfo="+this.e+"\)";
    }
}
