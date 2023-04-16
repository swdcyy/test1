package com.tencent.connect.auth.a$a$1;
import java.lang.Runnable;
import com.tencent.connect.auth.a$a;
import java.lang.Object;
import com.tencent.connect.auth.a;
import com.tencent.open.c.c;
import java.lang.String;
import com.kuaishou.webkit.WebView;

public class a$a$1 implements Runnable	// class@000e25
{
    public final a$a a;

    public void a$a$1(a$a p0){
       this.a = p0;
       super();
    }
    public void run(){
       a.e(this.a.a).loadUrl(a.i(this.a.a));
    }
}
