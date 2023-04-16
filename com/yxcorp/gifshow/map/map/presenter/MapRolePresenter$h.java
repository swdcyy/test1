package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$h;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import java.lang.Object;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import g6b.c;
import i6b.a;
import g6b.a;
import j6b.h0;
import java.lang.Runnable;
import android.view.View;

public final class MapRolePresenter$h implements g	// class@001cae
{
    public final MapRolePresenter b;

    public void MapRolePresenter$h(MapRolePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter$h.class, "1")) {
       }else {
          a.p(p0, "mapCenter");
          p0 = this.b.K;
          if (p0 != null) {
             p0 = p0.g;
             if (p0 != null) {
                p0 = p0.a;
             label_0020 :
                if (a.g(p0, "FILTER_PANEL")) {
                   p0 = this.b;
                   MapRolePresenter x = p0.X;
                   if (x != null && x.b != null) {
                      p0 = p0.F;
                      if (p0 == null) {
                         a.S("mRootView");
                      }
                      p0.post(new h0(this));
                   }
                }
             }
          }
          p0 = null;
          goto label_0020 ;
       }
    label_0043 :
       return;
    }
}
