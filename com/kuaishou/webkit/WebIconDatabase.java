package com.kuaishou.webkit.WebIconDatabase;
import java.lang.Object;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import android.webkit.WebIconDatabase;
import com.kuaishou.webkit.adapter.WebIconDatabaseAdapter;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import android.content.ContentResolver;
import java.lang.String;
import com.kuaishou.webkit.WebIconDatabase$IconListener;

public abstract class WebIconDatabase	// class@00126b
{

    public void WebIconDatabase(){
       super();
    }
    public static WebIconDatabase getInstance(){
       if (KsWebViewUtils.useSysWebView()) {
          return WebIconDatabaseAdapter.getInstance(WebIconDatabase.getInstance());
       }
       return WebViewFactory.getProvider().getWebIconDatabase();
    }
    public abstract void bulkRequestIconForPageUrl(ContentResolver p0,String p1,WebIconDatabase$IconListener p2);
    public abstract void close();
    public abstract void open(String p0);
    public abstract void releaseIconForPageUrl(String p0);
    public abstract void removeAllIcons();
    public abstract void requestIconForPageUrl(String p0,WebIconDatabase$IconListener p1);
    public abstract void retainIconForPageUrl(String p0);
}
