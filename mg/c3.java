package mg.c3;
import java.lang.Runnable;
import java.lang.String;
import f55.g;
import java.lang.Object;
import i46.b;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import com.feature.post.bridge.jsmodel.JsPostGrowthBooleanCallback;
import org.json.JSONObject;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import w46.b;

public final class c3 implements Runnable	// class@0025d8
{
    public final String b;
    public final g c;

    public void c3(String p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c3 tb = this.b;
       c3 tc = this.c;
       b uob = y6.r(b.class);
       int i = 0;
       int i1 = (tb == null || !tb.length())? 1: 0;
       if (i1 || uob == null) {
          if (tc != null) {
             tc.onSuccess(JsPostGrowthBooleanCallback.getFailedParams());
          }
       }else if(uob.getTaskType() != Integer.MIN_VALUE){
          if (tc != null) {
             tc.onSuccess(JsPostGrowthBooleanCallback.getFailedParams());
          }
       }else {
          try{
             int intx = new JSONObject(tb).getInt("taskType");
             uob.Nn(intx);
             Object[] objArray = new Object[i];
             l.D().w("JsGrowthBridgeFuns", "lockFlyWheelTaskType success, "+intx, objArray);
             if (tc != null) {
                tc.onSuccess(JsPostGrowthBooleanCallback.getSuccessParams());
             }
          }catch(org.json.JSONException e0){
             l.D().e("JsGrowthBridgeFuns", "lockFlyWheelTaskType parse json error", e0);
             if (tc != null) {
                tc.onSuccess(JsPostGrowthBooleanCallback.getFailedParams());
             }
          }
       }
    }
}
