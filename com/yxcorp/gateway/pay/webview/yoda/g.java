package com.yxcorp.gateway.pay.webview.yoda.g;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.webview.yoda.b$u;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sv8.p0;

public class g implements View$OnClickListener	// class@0012cf
{
    public final JsPageButtonParams b;
    public final b$u c;

    public void g(b$u p0,JsPageButtonParams p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.c.b(this.b.mOnClick, null);
       return;
    }
}
