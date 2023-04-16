package com.yxcorp.gifshow.webview.view.b;
import com.yxcorp.gifshow.webview.view.c$c;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.view.c$b;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPhysicalBackButtonParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b implements c$c	// class@0017a0
{
    public final c$b a;
    public final JsPhysicalBackButtonParams b;
    public final c c;

    public void b(c p0,c$b p1,JsPhysicalBackButtonParams p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.a.a(this.b.mOnClick, null);
       return;
    }
}
