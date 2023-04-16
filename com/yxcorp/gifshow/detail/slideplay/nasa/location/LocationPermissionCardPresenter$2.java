package com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$2;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LocationPermissionCardPresenter$2 implements LifecycleObserver	// class@001749
{
    public final LocationPermissionCardPresenter b;

    public void LocationPermissionCardPresenter$2(LocationPermissionCardPresenter p0){
       this.b = p0;
       super();
    }
    public void onActivityResumed(){
       if (PatchProxy.applyVoidWithListener(null, this, LocationPermissionCardPresenter$2.class, "1")) {
          return;
       }
       LocationPermissionCardPresenter$2 tb = this.b;
       tb.R8(tb.P8());
       PatchProxy.onMethodExit(LocationPermissionCardPresenter$2.class, "1");
       return;
    }
}
