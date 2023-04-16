package com.kwai.middleware.azeroth.web.KwaiWebView;
import com.kuaishou.webkit.WebView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public abstract class KwaiWebView extends WebView	// class@000f1e
{
    public HashMap b;

    public void KwaiWebView(Context p0){
       a.q(p0, "context");
       super(p0);
    }
}
