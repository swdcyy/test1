package com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$b;
import q96.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import q96.c;

public class LocationPermissionCardPresenter$b implements d	// class@00174b
{
    public final LocationPermissionCardPresenter a;

    public void LocationPermissionCardPresenter$b(LocationPermissionCardPresenter p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       if (PatchProxy.isSupport2(LocationPermissionCardPresenter$b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, LocationPermissionCardPresenter$b.class, "1")) {
          return;
       }
       this.a.R8(true);
       PatchProxy.onMethodExit(LocationPermissionCardPresenter$b.class, "1");
       return;
    }
    public void onError(int p0,String p1){
       if (PatchProxy.isSupport2(LocationPermissionCardPresenter$b.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, LocationPermissionCardPresenter$b.class, "2")) {
          return;
       }
       this.a.R8(false);
       PatchProxy.onMethodExit(LocationPermissionCardPresenter$b.class, "2");
       return;
    }
    public void onFinish(){
       c.b(this);
    }
    public void onStart(){
       c.c(this);
    }
}
