package com.kwai.nearby.local.tab.present.h$a;
import q96.f;
import com.kwai.nearby.local.tab.present.h;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.nearby.common.helper.migrate.c;
import com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents;
import id7.m0;
import lsb.a;
import id7.n0;

public class h$a implements f	// class@000ff7
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(LocationCityInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       c.a = true;
       c.b(MigrateEvents.REAL_TAB, new m0(p0));
       c.b(MigrateEvents.LOCAL_NOTIFICATION, new n0(p0));
       return;
    }
}
