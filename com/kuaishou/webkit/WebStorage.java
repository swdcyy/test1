package com.kuaishou.webkit.WebStorage;
import java.lang.Object;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import android.webkit.WebStorage;
import com.kuaishou.webkit.adapter.WebStorageAdapter;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import java.lang.String;
import com.kuaishou.webkit.ValueCallback;

public class WebStorage	// class@00127d
{

    public void WebStorage(){
       super();
    }
    public static WebStorage getInstance(){
       if (KsWebViewUtils.useSysWebView()) {
          return WebStorageAdapter.getInstance(WebStorage.getInstance());
       }
       return WebViewFactory.getProvider().getWebStorage();
    }
    public void deleteAllData(){
    }
    public void deleteOrigin(String p0){
    }
    public void getOrigins(ValueCallback p0){
    }
    public void getQuotaForOrigin(String p0,ValueCallback p1){
    }
    public void getUsageForOrigin(String p0,ValueCallback p1){
    }
    public void setQuotaForOrigin(String p0,long p1){
    }
}
