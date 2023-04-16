package com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$e;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class MyLocationPresenter$e implements g	// class@001cc3
{
    public final MyLocationPresenter b;

    public void MyLocationPresenter$e(MyLocationPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyLocationPresenter$e.class, "1")) {
       }else {
          a.p(p0, "cityInfo");
          this.b.S8(p0);
       }
       return;
    }
}
