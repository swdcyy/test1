package com.loc.i$2;
import java.lang.Runnable;
import com.loc.i;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import java.lang.StringBuilder;

public final class i$2 implements Runnable	// class@001444
{
    public final String a;
    public final i b;

    public void i$2(i p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       i.b(this.b).loadUrl("javascript:"+i.a(this.b)+"\(\'"+this.a+"\'\)");
    }
}
