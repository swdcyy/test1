package mg.k$p;
import erd.g;
import f55.g;
import java.lang.Object;
import java.util.List;
import og.l;
import java.lang.String;
import q87.c;
import android.os.Bundle;
import com.kwai.feature.post.api.feature.bridge.JsGetSmartAlbumDataResult;

public final class k$p implements g	// class@002628
{
    public final g b;

    public void k$p(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i = 0;
       String str = "JsGetWorkDataFun";
       if (p0.isEmpty()) {
          Object[] objArray = new Object[i];
          l.D().w(str, "getSmartAlbumData: no available data", objArray);
          this.b.a(412, "no available data", new Bundle());
       }else {
          JsGetSmartAlbumDataResult jsGetSmartAl = new JsGetSmartAlbumDataResult(1);
          jsGetSmartAl.mSmartAlbumDataList = p0;
          Object[] objArray1 = new Object[i];
          l.D().w(str, "getSmartAlbumData: success", objArray1);
          this.b.onSuccess(jsGetSmartAl);
       }
       return;
    }
}
