package com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$c;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import u5b.a;
import java.lang.StringBuilder;
import q87.c;
import k6b.g;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import rvb.k;
import rvb.k$a;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import rvb.b;
import rvb.n;
import b6b.r;
import rvb.f;
import rvb.c;
import f07.b;
import k3d.a;
import g6b.c;
import i6b.a;
import xl8.b;
import g6b.e;

public final class MyLocationPresenter$c implements g	// class@001cc1
{
    public final MyLocationPresenter b;

    public void MyLocationPresenter$c(MyLocationPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       c g;
       if (PatchProxy.applyVoidOneRefs(p0, this, MyLocationPresenter$c.class, "1")) {
       }else {
          a.p(p0, "mapCenter");
          Object[] objArray = new Object[0];
          a.c.w("MyLocationPresenter", "¡¾MapCenterChange¡¿centerInfo = "+p0, objArray);
          MyLocationPresenter$c tb = this.b;
          if (tb.w != null) {
             tb.w = false;
             Object[] objArray1 = null;
             if (!PatchProxy.applyVoid(objArray1, objArray1, g.class, "7") && LocalConfigKeyHelper.b()) {
                n.f(k.f, objArray1, objArray1, 6, objArray1).f(r.c);
             }
          }
          MapCenterInfo mCurrentCent = p0.mCurrentCenterLatLng;
          if (mCurrentCent != null) {
             MyLocationPresenter$c tb1 = this.b;
             if (tb1.y == null) {
                mCurrentCent = a.a(mCurrentCent);
             }
             a.o(mCurrentCent, "if \(isFromLocation\) it e¡­l.convertToBDLocation\(it\)");
             tb1.R8(mCurrentCent, p0.mMapZoomLevel);
             p0 = this.b;
             MyLocationPresenter s = p0.s;
             if (s != null) {
                g = s.g;
                if (g != null) {
                   a uoa = new a(true, g.a);
                   p0 = p0.t;
                   if (p0 != null) {
                      p0.d(uoa);
                   }
                   p0 = this.b.x;
                   if (p0 != null) {
                      p0.a(true);
                   }
                   p0.y = false;
                }
             }
          }
       }
    label_0096 :
       return;
    }
}
