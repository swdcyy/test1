package com.unionpay.p;
import java.lang.Runnable;
import com.unionpay.WebViewJavascriptBridge;
import com.unionpay.u;
import java.lang.String;
import com.unionpay.v;
import java.lang.Object;

public final class p implements Runnable	// class@001002
{
    public final u a;
    public final String b;
    public final v c;
    public final WebViewJavascriptBridge d;

    public void p(WebViewJavascriptBridge p0,u p1,String p2,v p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public final void run(){
       p ta = this.a;
       if (ta != null) {
          ta.a(this.b, this.c);
       }
       return;
    }
}
