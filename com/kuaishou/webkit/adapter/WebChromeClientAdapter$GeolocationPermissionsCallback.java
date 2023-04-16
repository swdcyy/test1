package com.kuaishou.webkit.adapter.WebChromeClientAdapter$GeolocationPermissionsCallback;
import com.kuaishou.webkit.GeolocationPermissions$Callback;
import com.kuaishou.webkit.adapter.WebChromeClientAdapter;
import android.webkit.GeolocationPermissions$Callback;
import java.lang.Object;
import java.lang.String;

public class WebChromeClientAdapter$GeolocationPermissionsCallback implements GeolocationPermissions$Callback	// class@0012b7
{
    public GeolocationPermissions$Callback mStub;
    public final WebChromeClientAdapter this$0;

    public void WebChromeClientAdapter$GeolocationPermissionsCallback(WebChromeClientAdapter p0,GeolocationPermissions$Callback p1){
       this.this$0 = p0;
       super();
       this.mStub = p1;
    }
    public void invoke(String p0,boolean p1,boolean p2){
       this.mStub.invoke(p0, p1, p2);
    }
}
