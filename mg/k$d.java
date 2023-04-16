package mg.k$d;
import erd.g;
import f55.g;
import java.lang.Object;
import java.util.List;
import og.l;
import java.lang.String;
import q87.c;
import android.os.Bundle;
import com.kwai.feature.post.api.feature.bridge.JsGetEditDraftDataResult;

public final class k$d implements g	// class@00261c
{
    public final g b;

    public void k$d(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i = 0;
       String str = "JsGetWorkDataFun";
       if (p0.isEmpty()) {
          Object[] objArray = new Object[i];
          l.D().w(str, "getEditDraftData: no available data", objArray);
          this.b.a(412, "no available data", new Bundle());
       }else {
          JsGetEditDraftDataResult jsGetEditDra = new JsGetEditDraftDataResult(1);
          jsGetEditDra.mDraftDataList = p0;
          Object[] objArray1 = new Object[i];
          l.D().w(str, "getEditDraftData: success", objArray1);
          this.b.onSuccess(jsGetEditDra);
       }
       return;
    }
}
