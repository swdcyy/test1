package com.kuaishou.webkit.adapter.GeolocationPermissionsAdapter;
import com.kuaishou.webkit.GeolocationPermissions;
import android.webkit.GeolocationPermissions;
import java.lang.String;
import com.kuaishou.webkit.ValueCallback;
import com.kuaishou.webkit.adapter.ValueCallbackSystemAdapter;
import android.webkit.ValueCallback;

public class GeolocationPermissionsAdapter extends GeolocationPermissions	// class@0012a7
{
    public GeolocationPermissions mStub;

    public void GeolocationPermissionsAdapter(GeolocationPermissions p0){
       super();
       this.mStub = p0;
    }
    public static GeolocationPermissionsAdapter getInstance(GeolocationPermissions p0){
       GeolocationPermissionsAdapter geolocationP = (p0 != null)? new GeolocationPermissionsAdapter(p0): null;
       return geolocationP;
    }
    public void allow(String p0){
       this.mStub.allow(p0);
    }
    public void clear(String p0){
       this.mStub.clear(p0);
    }
    public void clearAll(){
       this.mStub.clearAll();
    }
    public void getAllowed(String p0,ValueCallback p1){
       GeolocationPermissionsAdapter tmStub = this.mStub;
       ValueCallbackSystemAdapter valueCallbac = (p1 != null)? new ValueCallbackSystemAdapter(p1): null;
       tmStub.getAllowed(p0, valueCallbac);
       return;
    }
    public void getOrigins(ValueCallback p0){
       GeolocationPermissionsAdapter tmStub = this.mStub;
       ValueCallbackSystemAdapter valueCallbac = (p0 != null)? new ValueCallbackSystemAdapter(p0): null;
       tmStub.getOrigins(valueCallbac);
       return;
    }
}
