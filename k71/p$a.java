package k71.p$a;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class p$a	// class@002cc1
{
    public final WalletResponse walletResponse;

    public void p$a(){
       super(null);
    }
    public void p$a(WalletResponse p0){
       super();
       this.walletResponse = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof p$a && a.g(this.walletResponse, p0.walletResponse))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       p$a obj = PatchProxy.apply(null, this, p$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.walletResponse;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, p$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(walletResponse="+this.walletResponse+"\)";
    }
}
