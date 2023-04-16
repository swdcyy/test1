package com.yxcorp.gateway.pay.webview.g;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.webview.b$p;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rv8.d;

public class g implements View$OnClickListener	// class@00129e
{
    public final JsPageButtonParams b;
    public final b$p c;

    public void g(b$p p0,JsPageButtonParams p1){
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
