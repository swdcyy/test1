package com.kuaishou.webkit.GeolocationPermissions;
import java.lang.Object;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import android.webkit.GeolocationPermissions;
import com.kuaishou.webkit.adapter.GeolocationPermissionsAdapter;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import java.lang.String;
import com.kuaishou.webkit.ValueCallback;

public class GeolocationPermissions	// class@00124c
{
    public static GeolocationPermissionsAdapter mSystemInstance;

    public void GeolocationPermissions(){
       super();
    }
    public static GeolocationPermissions getInstance(){
       if (KsWebViewUtils.useSysWebView()) {
          return GeolocationPermissionsAdapter.getInstance(GeolocationPermissions.getInstance());
       }
       return WebViewFactory.getProvider().getGeolocationPermissions();
    }
    public void allow(String p0){
    }
    public void clear(String p0){
    }
    public void clearAll(){
    }
    public void getAllowed(String p0,ValueCallback p1){
    }
    public void getOrigins(ValueCallback p0){
    }
}
