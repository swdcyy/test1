package a15.a;
import xx5.c;
import java.lang.Object;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z05.c;
import com.kwai.feature.api.tuna.js_params.BusinessJsParams;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import z05.e;
import z05.d;
import java.util.Map;
import com.yxcorp.gifshow.webview.helper.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import z05.b;
import dy5.h;
import z05.a;
import dy5.b;
import dy5.d;
import com.kuaishou.tuna_js_bridge.js.bridge.a;
import dy5.e;
import dy5.a;

public class a implements c	// class@000010
{
    public c b;

    public void a(){
       super();
    }
    public void Ng(Activity p0,WebView p1,Serializable p2){
       c a;
       d obj2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       if (this.b == null) {
          this.b = new c();
       }
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, tb, c.class, "3")) {
          a = tb.a;
          BusinessJsParams mAction = p2.mAction;
          Objects.requireNonNull(a);
          Object obj = PatchProxy.applyOneRefs(mAction, a, e.class, "3");
          Object obj1 = null;
          if (obj != PatchProxyResult.class) {
          }else if(a.a.containsKey(mAction)){
             obj = a.a.get(mAction);
          }else {
             obj2 = obj1;
          label_005c :
             if (obj2 == null) {
                e.a(p1, p2.mCallback, p2);
             }else {
                BusinessJsParams mAction1 = p2.mAction;
                if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, mAction1, obj2, d.class, "1")) {
                   mAction = p2.mData;
                   obj = PatchProxy.applyOneRefs(mAction, obj2, d.class, "2");
                   if (obj != PatchProxyResult.class) {
                      obj1 = obj;
                   }else if(!TextUtils.isEmpty(mAction)){
                      obj1 = a.a.h(mAction, obj2.b);
                   }
                   obj2 = obj2.a;
                   if (obj2 != null) {
                      obj2.a(new b(p0), obj1, new h(new a(p0, p1, p2), mAction1));
                   }
                }
             }
          }
          obj2 = obj;
          goto label_005c ;
       }
    label_00a8 :
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void kj(String p0){
       c a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a tb = this.b;
       if (tb != null && p0 != null) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, c.class, "2")) {
             a = tb.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(p0, a, e.class, "2")) {
                e a1 = a.a;
                if (a1 != null) {
                   a1.remove(p0);
                }
             }
          }
       }
       return;
    }
    public void sa(e p0,Class p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "2")) {
          return;
       }
       if (this.b == null) {
          this.b = new c();
       }
       this.b.a(p2, new d(p1, new a(p0)));
       return;
    }
    public void tX(a p0,Class p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       if (this.b == null) {
          this.b = new c();
       }
       this.b.a(p2, new d(p1, new a(p0)));
       return;
    }
}
