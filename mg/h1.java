package mg.h1;
import n3d.a;
import f55.g;
import com.kwai.feature.post.api.feature.bridge.JsSelectLocationParams;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import ekd.j0;
import java.io.Serializable;
import com.kuaishou.android.model.mix.Location;
import lnc.a1;
import com.kwai.feature.post.api.feature.bridge.JsSelectLocationResult$Location;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.feature.bridge.JsSelectLocationResult;
import com.yxcorp.utility.Log;
import android.os.Bundle;

public final class h1 implements a	// class@002605
{
    public final g b;
    public final JsSelectLocationParams c;

    public void h1(g p0,JsSelectLocationParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       Location location;
       h1 tb = this.b;
       h1 tc = this.c;
       if (p1 == -1) {
          if (p2 != null) {
             String str = "location";
             if (j0.g(p2, str)) {
                location = j0.e(p2, str);
             label_0026 :
                JsSelectLocationResult$Location location1 = new JsSelectLocationResult$Location();
                if (location != null) {
                   location1.mPoiId = location.mId;
                   location1.mPoi = a.a.q(location);
                   location1.mLatitude = String.valueOf(location.latitude);
                   location1.mLongitude = String.valueOf(location.longitude);
                }
                tb.onSuccess(new JsSelectLocationResult(location1));
             }
          }
          location = new Location();
          location.mTitle = a1.p(0x7f1034d3);
          goto label_0026 ;
       }else {
          Log.g("SelectLocationFun", "selectLocation: canceled");
          tb.a(0, tc.mCallback, null);
       }
       return;
    }
}
