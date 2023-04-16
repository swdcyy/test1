package kv8.g;
import kv8.a;
import android.app.Activity;
import java.lang.String;
import fv8.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import lv8.d;
import com.yxcorp.gateway.pay.response.PrepareOrderResponse;
import com.google.gson.Gson;
import android.content.Intent;
import java.lang.StringBuilder;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j0;

public final class g extends a	// class@002c26
{
    public b b;

    public void g(Activity p0){
       super(p0);
    }
    public void a(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       this.b = p1;
       Activity uActivity = this.a.get();
       if (uActivity != null && !uActivity.isFinishing()) {
          String packageName = uActivity.getPackageName();
          Intent intent = new Intent();
          intent.setClassName(packageName, packageName+".wxapi.WXPayEntryActivity");
          SerializableHook.putExtra(intent, "key_preorder_response", d.a.h(p0, PrepareOrderResponse.class));
          uActivity.startActivityForResult(intent, 102);
       }
       return;
    }
    public boolean a(){
       return true;
    }
    public boolean b(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, g.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.b == null || p0 != 102) {
          return false;
       }else {
          String str = null;
          if (p2 != null) {
             str = j0.f(p2, "pay_error_message");
          }
          this.b.onPayFinish(p1, str);
          return true;
       }
    }
}
