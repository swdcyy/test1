package mg.k$e;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import android.os.Bundle;

public final class k$e implements g	// class@00261d
{
    public final g b;

    public void k$e(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PostUtils.D("JsGetWorkDataFun", "getEditDraftData", p0);
       this.b.a(412, p0.getMessage(), new Bundle());
    }
}
