package com.facebook.react.modules.network.b;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.modules.network.e;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.webkit.CookieManager;
import com.facebook.react.modules.network.e$b;

public class b extends GuardedResultAsyncTask	// class@0012ce
{
    public final Callback a;
    public final e b;

    public void b(e p0,ReactContext p1,Callback p2){
       this.b = p0;
       this.a = p2;
       super(p1);
    }
    public Object doInBackgroundGuarded(){
       Boolean uBoolean = PatchProxy.apply(null, this, b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          CookieManager uCookieManag = e.a(this.b);
          if (uCookieManag != null) {
             uCookieManag.removeAllCookie();
          }
          this.b.a.a();
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
    public void onPostExecuteGuarded(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          Object[] objArray = new Object[]{p0};
          this.a.invoke(objArray);
       }
       return;
    }
}
