package com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter$c;
import tk7.b$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class LocationPermissionCardPresenter$c implements b$a	// class@00174c
{
    public final LocationPermissionCardPresenter a;

    public void LocationPermissionCardPresenter$c(LocationPermissionCardPresenter p0){
       this.a = p0;
       super();
    }
    public b$a a(String p0){
       return this;
    }
    public b$a b(CharSequence p0,View$OnClickListener p1){
       return this;
    }
    public b$a c(CharSequence p0,View$OnClickListener p1){
       p0.C = p1;
       return this;
    }
    public b$a d(View$OnClickListener p0){
       return this;
    }
    public b$a setTitle(String p0){
       return this;
    }
    public void show(){
       if (PatchProxy.applyVoidWithListener(null, this, LocationPermissionCardPresenter$c.class, "1")) {
          return;
       }
       this.a.y.setVisibility(0);
       LocationPermissionCardPresenter$c ta = this.a;
       LocationPermissionCardPresenter c = ta.C;
       if (c != null) {
          c.onClick(ta.x);
       }
       PatchProxy.onMethodExit(LocationPermissionCardPresenter$c.class, "1");
       return;
    }
}
