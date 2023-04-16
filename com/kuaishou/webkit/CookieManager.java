package com.kuaishou.webkit.CookieManager;
import java.lang.Object;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import android.webkit.CookieManager;
import com.kuaishou.webkit.adapter.CookieManagerAdapter;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import com.kuaishou.webkit.WebView;
import java.lang.CloneNotSupportedException;
import java.lang.String;
import com.kuaishou.webkit.WebAddress;
import com.kuaishou.webkit.ValueCallback;

public abstract class CookieManager	// class@001247
{

    public void CookieManager(){
       super();
    }
    public static boolean allowFileSchemeCookies(){
       return CookieManager.getInstance().allowFileSchemeCookiesImpl();
    }
    public static CookieManager getInstance(){
       if (KsWebViewUtils.useSysWebView()) {
          return CookieManagerAdapter.getInstance(CookieManager.getInstance());
       }
       return WebViewFactory.getProvider().getCookieManager();
    }
    public static void setAcceptFileSchemeCookies(boolean p0){
       CookieManager.getInstance().setAcceptFileSchemeCookiesImpl(p0);
    }
    public abstract boolean acceptCookie();
    public abstract boolean acceptThirdPartyCookies(WebView p0);
    public abstract boolean allowFileSchemeCookiesImpl();
    public Object clone(){
       throw new CloneNotSupportedException("doesn\'t implement Cloneable");
    }
    public abstract void flush();
    public synchronized String getCookie(WebAddress p0){
       return this.getCookie(p0.toString());
    }
    public abstract String getCookie(String p0);
    public abstract String getCookie(String p0,boolean p1);
    public abstract boolean hasCookies();
    public abstract boolean hasCookies(boolean p0);
    public abstract void removeAllCookie();
    public abstract void removeAllCookies(ValueCallback p0);
    public abstract void removeExpiredCookie();
    public abstract void removeSessionCookie();
    public abstract void removeSessionCookies(ValueCallback p0);
    public abstract void setAcceptCookie(boolean p0);
    public abstract void setAcceptFileSchemeCookiesImpl(boolean p0);
    public abstract void setAcceptThirdPartyCookies(WebView p0,boolean p1);
    public abstract void setCookie(String p0,String p1);
    public abstract void setCookie(String p0,String p1,ValueCallback p2);
    public void setCookies(String p0,String[] p1){
       if (p0 != null && p1 != null) {
          int len = p1.length;
          for (int i = 0; i < len; i = i + 1) {
             this.setCookie(p0, p1[i]);
          }
       }
       return;
    }
}
