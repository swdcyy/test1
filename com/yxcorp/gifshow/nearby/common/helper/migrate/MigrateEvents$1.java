package com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents$1;
import com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.nearby.common.helper.migrate.c;
import nrb.a;

public final class MigrateEvents$1 extends MigrateEvents	// class@00210c
{

    public void MigrateEvents$1(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public boolean isConsume(){
       return false;
    }
    public boolean isEnable(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, MigrateEvents$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, c.class, "3");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): MigrateEvents.LOCAL_NOTIFICATION.isEnable() ^ 0x01;
       return b;
    }
}
