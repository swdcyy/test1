package com.kwai.yoda.helper.a;
import gy7.l$d;
import java.lang.Object;
import android.content.Context;
import mz7.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import gy7.l;
import com.kwai.yoda.YodaWebView;
import android.content.MutableContextWrapper;
import yz7.n;
import java.lang.Throwable;
import yz7.r;

public final class a implements l$d	// class@001268
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final YodaBaseWebView a(Context p0,a p1){
       YodaWebView yodaWebView = new YodaWebView(new MutableContextWrapper(n.d(p0)), p1);
       return yodaWebView;
    }
}
