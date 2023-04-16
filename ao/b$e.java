package ao.b$e;
import erd.g;
import ao.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import ao.e;
import xn.a$e;
import java.lang.Long;
import qn.m;
import rn.b;
import xn.a;
import java.lang.Integer;
import android.os.SystemClock;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import qn.j;
import qn.h;
import rn.a;
import xn.a$c;
import qrd.l1;
import java.lang.ref.WeakReference;
import java.lang.Exception;
import q87.c;

public final class b$e implements g	// class@000202
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       try{
          Object obj = this;
          if (PatchProxy.applyVoidOneRefs(p0, obj, b$e.class, "1")) {
          }else {
             KwaiPopLog e = KwaiPopLog.e;
             String str = obj.b.e().l();
             a$e b = a$e.b;
             Boolean uBoolean = null;
             Boolean uBoolean1 = null;
             Long longx = Long.valueOf(obj.b.b);
             Long longx1 = Long.valueOf(obj.b.b);
             Integer integer = null;
             String str1 = null;
             m om = obj.b.e().b();
             String str2 = null;
             int i = 716;
             KwaiYodaWebView obj1 = null;
             KwaiPopLog kwaiPopLog = e;
             KwaiPopLog.G(kwaiPopLog, str, b, uBoolean, uBoolean1, longx, longx1, integer, str1, om, str2, i, obj1);
             long l = SystemClock.uptimeMillis();
             b$e b1 = obj.b;
             obj1 = new KwaiYodaWebView(obj.b.getActivity());
             obj.b.d(obj1, l);
             obj.b.e().k = new ColorDrawable(Color.parseColor("#B3000000"));
             obj.b.e().j(obj.b);
             obj.b.c = new h(obj.b).a();
             b$e b2 = obj.b;
             if (b2.e != null && b2.e().s == null) {
                obj.b.f();
             }
             KwaiPopLog.G(e, obj.b.e().l(), a$c.b, 0, 0, Long.valueOf(obj.b.b), Long.valueOf(l), 0, 0, obj.b.e().b(), 0, 716, 0);
             b1.a = new WeakReference(obj1);
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          KwaiPopLog.e.t("KwaiPopWeb error", e0.getLocalizedMessage(), objArray);
       }
       return;
    }
}
