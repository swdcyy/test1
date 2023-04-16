package lm1.g$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import lm1.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.google.gson.JsonElement;

public final class g$a	// class@002fa3
{

    public void g$a(){
       super();
    }
    public void g$a(u p0){
       super();
    }
    public final g a(int p0,String p1){
       Object obj;
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       g og = new g(null, null, p0, p1, null);
       return obj;
    }
}
