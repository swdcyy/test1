package bn4.a;
import an4.a;
import java.lang.String;
import p55.a;
import java.lang.Object;
import f55.g;
import com.kuaishou.merchant.basic.model.JsOpenMidGroundUrlBridge;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gateway.pay.api.PayManager;
import com.kwai.yoda.function.FunctionResultParams;

public class a extends a	// class@0003a4
{

    public void a(){
       super();
    }
    public String f(){
       return "openMidGroundUrl";
    }
    public void g(a p0,Object p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
       }else {
          Activity uActivity = this.e(p0);
          if (uActivity == null || uActivity.isFinishing()) {
             this.b(p2, 0x1e84a, "current page is finished");
          }else {
             int i = -1;
             if (p1 == null) {
                this.b(p2, i, "params is empty");
             }else if(TextUtils.x(p1.mUrl)){
                this.b(p2, i, "url is empty");
             }else {
                PayManager.getInstance().openMidGroundUrl(uActivity, p1.mUrl, p1.mIsTranslucent);
                FunctionResultParams uFunctionRes = new FunctionResultParams();
                uFunctionRes.mResult = 1;
                this.c(p2, uFunctionRes);
             }
          }
       }
       return;
    }
}
