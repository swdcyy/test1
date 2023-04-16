package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import g6b.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.map.MapLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;

public final class MapRolePresenter$c extends m	// class@001ca9
{
    public final MapRolePresenter c;

    public void MapRolePresenter$c(MapRolePresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       MapRolePresenter u0;
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter$c.class, "1")) {
          return;
       }
       MapExperimentUtils g = MapExperimentUtils.g;
       if (g.f()) {
          u0 = this.c.U0;
          if (u0 != null) {
             u0.a(3);
          }
       }else {
          int i = 1;
          if (g.b()) {
             u0 = this.c.U0;
             if (u0 != null) {
                u0.a(i);
             }
          }else {
             u0 = this.c.G;
             if (u0 == null) {
                a.S("mFragment");
             }
             if (!PatchProxy.applyVoidOneRefs(u0, null, MapLogger.class, "27")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "NOW_CARD";
                u1.B(new ClickMetaData().setLogPage(u0).setType(i).setDirection(0).setElementPackage(uElementPack).setIsRealTime(0));
             }
             this.c.Z8();
          }
       }
       return;
    }
}
