package com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$a;
import q96.d;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import q96.c;
import java.lang.Integer;

public final class MyLocationPresenter$a implements d	// class@001cbf
{
    public final MyLocationPresenter a;

    public void MyLocationPresenter$a(MyLocationPresenter p0){
       super();
       this.a = p0;
    }
    public void a(boolean p0,LocationCityInfo p1){
       MyLocationPresenter$a uoa = MyLocationPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       a.p(p1, "cityInfo");
       c.d(this, p0, p1);
       MyLocationPresenter$a ta = this.a;
       if (ta != null) {
          ta.S8(p1);
       }
       return;
    }
    public void onError(int p0,String p1){
       MyLocationPresenter$a uoa = MyLocationPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       c.a(this, p0, p1);
       return;
    }
    public void onFinish(){
       c.b(this);
    }
    public void onStart(){
       c.c(this);
    }
}
