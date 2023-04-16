package ac4.p;
import wr3.d$a;
import f55.g;
import java.lang.Object;
import com.kuaishou.merchant.bridge.jsmodel.component.JsMerchantPopupToFollowResult;

public final class p implements d$a	// class@000082
{
    public final g a;

    public void p(g p0){
       this.a = p0;
    }
    public final void a(int p0){
       this.a.onSuccess(new JsMerchantPopupToFollowResult(1, p0));
    }
}
