package com.kuaishou.webkit.WebChromeClient$FileChooserParams;
import java.lang.Object;
import android.content.Intent;
import android.net.Uri;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import java.lang.String;
import com.kuaishou.webkit.adapter.SystemApiVersionChecker;
import android.webkit.WebChromeClient$FileChooserParams;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import com.kuaishou.webkit.WebViewFactoryProvider$Statics;
import java.lang.CharSequence;

public abstract class WebChromeClient$FileChooserParams	// class@001267
{

    public void WebChromeClient$FileChooserParams(){
       super();
    }
    public static Uri[] parseResult(int p0,Intent p1){
       if (!KsWebViewUtils.useSysWebView()) {
          return WebViewFactory.getProvider().getStatics().parseFileChooserResult(p0, p1);
       }
       if (SystemApiVersionChecker.check(21, "WebChromeClient.FileChooserParams", "parseResult\(resultCode, data\)")) {
          return WebChromeClient$FileChooserParams.parseResult(p0, p1);
       }
       return null;
    }
    public abstract Intent createIntent();
    public abstract String[] getAcceptTypes();
    public abstract String getFilenameHint();
    public abstract int getMode();
    public abstract CharSequence getTitle();
    public abstract boolean isCaptureEnabled();
}
