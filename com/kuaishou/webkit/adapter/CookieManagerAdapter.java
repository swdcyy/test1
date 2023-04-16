package com.kuaishou.webkit.adapter.CookieManagerAdapter;
import com.kuaishou.webkit.CookieManager;
import android.webkit.CookieManager;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.kuaishou.webkit.adapter.SystemApiVersionChecker;
import android.view.View;
import android.webkit.WebView;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Exception;
import com.kuaishou.webkit.ValueCallback;
import com.kuaishou.webkit.adapter.ValueCallbackSystemAdapter;
import android.webkit.ValueCallback;

public class CookieManagerAdapter extends CookieManager	// class@0012a4
{
    public CookieManager mStub;

    public void CookieManagerAdapter(CookieManager p0){
       super();
       this.mStub = p0;
    }
    public static CookieManagerAdapter getInstance(CookieManager p0){
       CookieManagerAdapter uCookieManag = (p0 != null)? new CookieManagerAdapter(p0): null;
       return uCookieManag;
    }
    public boolean acceptCookie(){
       return this.mStub.acceptCookie();
    }
    public boolean acceptThirdPartyCookies(WebView p0){
       if (!SystemApiVersionChecker.check(21, "CookieManager", "acceptThirdPartyCookies\(WebView\)")) {
          return false;
       }
       CookieManagerAdapter tmStub = this.mStub;
       p0 = (p0 != null)? p0.getView(): null;
       return tmStub.acceptThirdPartyCookies(p0);
    }
    public boolean allowFileSchemeCookiesImpl(){
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Method declaredMeth = Class.forName("android.webkit.CookieManager").getDeclaredMethod("allowFileSchemeCookiesImpl", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[i];
          return declaredMeth.invoke(this.mStub, objArray).booleanValue();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          return i;
       }
    }
    public void flush(){
       if (SystemApiVersionChecker.check(21, "CookieManager", "flush\(\)")) {
          this.mStub.flush();
       }
       return;
    }
    public String getCookie(String p0){
       return this.mStub.getCookie(p0);
    }
    public String getCookie(String p0,boolean p1){
       String str = null;
       try{
          Class[] uClassArray = new Class[]{String.class,Boolean.class};
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1)};
          Class.forName("android.webkit.CookieManager").getMethod("getCookie", uClassArray).invoke(this.mStub, objArray);
          return str;
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
          return str;
       }
    }
    public CookieManager getStub(){
       return this.mStub;
    }
    public boolean hasCookies(){
       return this.mStub.hasCookies();
    }
    public boolean hasCookies(boolean p0){
       int i = 0;
       try{
          Class[] uClassArray = new Class[]{Boolean.class};
          Object[] objArray = new Object[]{Boolean.valueOf(p0)};
          return Class.forName("android.webkit.CookieManager").getMethod("hasCookies", uClassArray).invoke(this.mStub, objArray).booleanValue();
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          return i;
       }
    }
    public void removeAllCookie(){
       this.mStub.removeAllCookie();
    }
    public void removeAllCookies(ValueCallback p0){
       ValueCallbackSystemAdapter valueCallbac;
       if (SystemApiVersionChecker.check(21, "CookieManager", "removeAllCookies\(callback\)")) {
          CookieManagerAdapter tmStub = this.mStub;
          p0 = (p0 == null)? null: new ValueCallbackSystemAdapter(p0);
          tmStub.removeAllCookies(p0);
       }
       return;
    }
    public void removeExpiredCookie(){
       this.mStub.removeExpiredCookie();
    }
    public void removeSessionCookie(){
       this.mStub.removeSessionCookie();
    }
    public void removeSessionCookies(ValueCallback p0){
       ValueCallbackSystemAdapter valueCallbac;
       if (SystemApiVersionChecker.check(21, "CookieManager", "removeSessionCookies\(callback\)")) {
          CookieManagerAdapter tmStub = this.mStub;
          p0 = (p0 == null)? null: new ValueCallbackSystemAdapter(p0);
          tmStub.removeSessionCookies(p0);
       }
       return;
    }
    public void setAcceptCookie(boolean p0){
       this.mStub.setAcceptCookie(p0);
    }
    public void setAcceptFileSchemeCookiesImpl(boolean p0){
       try{
          Class[] uClassArray = new Class[]{Boolean.class};
          Method declaredMeth = Class.forName("android.webkit.CookieManager").getDeclaredMethod("setAcceptFileSchemeCookiesImpl", uClassArray);
          declaredMeth.setAccessible(1);
          Object[] objArray = new Object[]{Boolean.valueOf(p0)};
          declaredMeth.invoke(this.mStub, objArray);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public void setAcceptThirdPartyCookies(WebView p0,boolean p1){
       if (SystemApiVersionChecker.check(21, "CookieManager", "setAcceptThirdPartyCookies\(webview, accept\)")) {
          CookieManagerAdapter tmStub = this.mStub;
          p0 = (p0 != null)? p0.getView(): null;
          tmStub.setAcceptThirdPartyCookies(p0, p1);
       }
       return;
    }
    public void setCookie(String p0,String p1){
       this.mStub.setCookie(p0, p1);
    }
    public void setCookie(String p0,String p1,ValueCallback p2){
       ValueCallbackSystemAdapter valueCallbac;
       if (SystemApiVersionChecker.check(21, "CookieManager", "setCookie\(url, callback\)")) {
          CookieManagerAdapter tmStub = this.mStub;
          p2 = (p2 == null)? null: new ValueCallbackSystemAdapter(p2);
          tmStub.setCookie(p0, p1, p2);
       }
       return;
    }
}
