package com.feature.post.bridge.n0;
import com.yxcorp.gifshow.webview.yoda.function.i$a;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import mg.j4;
import og.l;
import q87.c;
import mg.d4;
import com.kuaishou.webkit.WebView;
import vxc.z;

public final class n0 implements i$a	// class@0014ae
{
    public static final n0 a;

    static {
       n0.a = new n0();
    }
    public void n0(){
       super();
    }
    public final void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       Object[] objArray = new Object[0];
       l.D().w("Bridge_Post", "uploadVideoFromAlbum: ", objArray);
       new d4(p0).f(p3);
    }
}
