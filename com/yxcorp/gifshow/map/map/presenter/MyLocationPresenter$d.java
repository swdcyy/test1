package com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import xl8.b;
import g6b.c;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import u5b.a;
import q87.c;

public final class MyLocationPresenter$d extends m	// class@001cc2
{
    public final MyLocationPresenter c;

    public void MyLocationPresenter$d(MyLocationPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       MyLocationPresenter v;
       if (PatchProxy.applyVoidOneRefs(p0, this, MyLocationPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "v");
       v = this.c.v;
       if (v == null) {
          a.S("mMapLocationButtonClick");
       }
       v.d(Boolean.TRUE);
       MyLocationPresenter$d tc = this.c;
       tc.y = true;
       v = tc.s;
       if (v != null) {
          c f = v.f;
          if (f != null && v != null) {
             v.c(f, "LOCAL_BACK");
          }
       }
       Object[] objArray = new Object[0];
       a.c.w("MyLocationPresenter", "¡¾click location ¡¿", objArray);
       this.c.P8();
       return;
    }
}
