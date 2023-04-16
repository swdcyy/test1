package com.facebook.react.modules.network.e$b$b;
import java.lang.Runnable;
import com.facebook.react.modules.network.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.network.e;
import com.kuaishou.webkit.CookieSyncManager;
import java.util.Objects;
import com.kuaishou.webkit.CookieManager;

public class e$b$b implements Runnable	// class@0012d3
{
    public final e$b b;

    public void e$b$b(e$b p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$b$b.class, "1")) {
          return;
       }
       if (e.d) {
          CookieSyncManager.getInstance().sync();
       }else {
          e$b$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, e$b.class, "3")) {
             CookieManager uCookieManag = e.a(tb.b);
             if (uCookieManag != null) {
                uCookieManag.flush();
             }
          }
       }
       return;
    }
}
