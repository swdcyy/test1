package com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents;
import nrb.a;
import java.lang.Enum;
import com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents$1;
import java.lang.String;
import com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents$2;
import com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents$3;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class MigrateEvents extends Enum implements a	// class@00210f
{
    public final int mLevel;
    public static final MigrateEvents[] $VALUES;
    public static final MigrateEvents HOME_DOT;
    public static final MigrateEvents LOCAL_NOTIFICATION;
    public static final MigrateEvents REAL_TAB;

    static {
       MigrateEvents$1 u1 = new MigrateEvents$1("REAL_TAB", 0, 0);
       MigrateEvents.REAL_TAB = u1;
       MigrateEvents$2 u2 = new MigrateEvents$2("HOME_DOT", 1, 1);
       MigrateEvents.HOME_DOT = u2;
       MigrateEvents$3 u3 = new MigrateEvents$3("LOCAL_NOTIFICATION", 2, 3);
       MigrateEvents.LOCAL_NOTIFICATION = u3;
       MigrateEvents[] migrateEvent = new MigrateEvents[]{u1,u2,u3};
       MigrateEvents.$VALUES = migrateEvent;
    }
    public void MigrateEvents(String p0,int p1,int p2){
       super(p0, p1);
       this.mLevel = p2;
    }
    public void MigrateEvents(String p0,int p1,int p2,MigrateEvents$1 p3){
       super(p0, p1, p2);
    }
    public static MigrateEvents valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MigrateEvents.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MigrateEvents.class, p0);
    }
    public static MigrateEvents[] values(){
       Object obj = PatchProxy.apply(null, null, MigrateEvents.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MigrateEvents.$VALUES.clone();
    }
    public int getEventLevel(){
       return this.mLevel;
    }
}
