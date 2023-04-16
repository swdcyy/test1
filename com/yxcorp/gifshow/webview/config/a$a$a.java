package com.yxcorp.gifshow.webview.config.a$a$a;
import erd.g;
import com.yxcorp.gifshow.webview.config.a$a;
import android.content.Intent;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import com.kuaishou.webkit.ValueCallback;

public class a$a$a implements g	// class@00173d
{
    public final Intent b;
    public final a$a c;

    public void a$a$a(a$a p0,Intent p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "1")) {
       }else {
          p0 = this.c;
          a$a b = p0.b;
          if (b != null) {
             p0 = new Uri[]{this.b.getData()};
             b.onReceiveValue(p0);
          }else {
             p0.c.onReceiveValue(this.b.getData());
          }
       }
       return;
    }
}
