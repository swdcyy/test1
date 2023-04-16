package mg.k$m;
import erd.g;
import com.kwai.feature.post.api.feature.bridge.JsGetPublishedDataParams;
import f55.g;
import java.lang.Object;
import java.util.List;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import android.os.Bundle;
import com.kwai.feature.post.api.feature.bridge.JSGetEligibleDraftDataResult$EligibleDraftData;
import java.util.ArrayList;
import java.util.Collection;

public final class k$m implements g	// class@002625
{
    public final JsGetPublishedDataParams b;
    public final g c;

    public void k$m(JsGetPublishedDataParams p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       String str = "JsGetWorkDataFun";
       int i = 0;
       if (p0.isEmpty()) {
          objArray = new Object[i];
          l.D().w(str, "getPublishedDataWithStartTime\(\) no valid draft data, params="+this.b, objArray);
          this.c.a(412, "no valid draft data, params="+this.b, new Bundle());
       }else {
          objArray = new Object[i];
          l.D().w(str, "getPublishedDataWithStartTime\(\) success. data "+"size="+p0.size()+", draftData="+p0.get(i).mExtraData, objArray);
          ArrayList uArrayList = new ArrayList();
          uArrayList.addAll(p0);
          this.c.onSuccess(uArrayList);
       }
       return;
    }
}
