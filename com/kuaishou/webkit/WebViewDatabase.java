package com.kuaishou.webkit.WebViewDatabase;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import android.webkit.WebViewDatabase;
import com.kuaishou.webkit.adapter.WebViewDatabaseAdapter;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import java.lang.String;

public abstract class WebViewDatabase	// class@001291
{
    public static WebViewDatabase sSystemInstance;

    public void WebViewDatabase(){
       super();
    }
    public static WebViewDatabase getInstance(Context p0){
       if (!KsWebViewUtils.useSysWebView()) {
          return WebViewFactory.getProvider().getWebViewDatabase(p0);
       }
       if (WebViewDatabase.sSystemInstance == null) {
          WebViewDatabase instance = WebViewDatabase.getInstance(p0);
          if (instance != null) {
             WebViewDatabase.sSystemInstance = new WebViewDatabaseAdapter(instance);
          }
       }
       return WebViewDatabase.sSystemInstance;
    }
    public abstract void clearFormData();
    public abstract void clearHttpAuthUsernamePassword();
    public abstract void clearUsernamePassword();
    public abstract String[] getHttpAuthUsernamePassword(String p0,String p1);
    public abstract boolean hasFormData();
    public abstract boolean hasHttpAuthUsernamePassword();
    public abstract boolean hasUsernamePassword();
    public abstract void setHttpAuthUsernamePassword(String p0,String p1,String p2,String p3);
}
