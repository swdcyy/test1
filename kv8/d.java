package kv8.d;
import kv8.a;
import android.app.Activity;
import java.lang.String;
import fv8.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.content.Intent;
import lv8.c;
import lv8.g;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class d extends a	// class@002c23
{
    public b b;

    public void d(Activity p0){
       super(p0);
    }
    public void a(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       this.b = p1;
       Activity uActivity = this.a.get();
       if (uActivity == null || uActivity.isFinishing()) {
          g.d("KsCoinPay start failed, activity is invalid");
          return;
       }else {
          Intent intent = c.l(uActivity);
          if (intent == null) {
             g.d("KsCoinPay start failed, kwai not installed");
             return;
          }else {
             intent.putExtra("kwai_trade", p0);
             uActivity.startActivityForResult(intent, 101);
             return;
          }
       }
    }
    public boolean a(){
       return true;
    }
    public boolean b(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(d.class)) {
          p2 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, d.class, "2");
          if (p2 != PatchProxyResult.class) {
             return p2.booleanValue();
          }
       }
       d tb = this.b;
       if (tb == null || p0 != 101) {
          return false;
       }else {
          tb.onPayFinish(p1, null);
          return true;
       }
    }
}
