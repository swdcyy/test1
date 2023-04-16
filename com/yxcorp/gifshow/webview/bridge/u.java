package com.yxcorp.gifshow.webview.bridge.u;
import com.yxcorp.gifshow.webview.yoda.function.g$a;
import java.lang.Object;
import com.yxcorp.gifshow.webview.bridge.a;
import java.lang.String;

public final class u implements g$a	// class@001734
{
    public static final u a;

    static {
       u.a = new u();
    }
    public void u(){
       super();
    }
    public final void a(a p0,String p1){
       p0.requestLocationPermission(p1);
    }
}
