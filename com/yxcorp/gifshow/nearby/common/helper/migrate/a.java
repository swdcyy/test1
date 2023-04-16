package com.yxcorp.gifshow.nearby.common.helper.migrate.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.nearby.common.helper.migrate.c;
import java.util.ArrayList;
import com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents;
import nrb.a;
import com.yxcorp.gifshow.nearby.common.helper.migrate.b;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public final class a implements x	// class@002110
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       ArrayList uArrayList = new ArrayList();
       MigrateEvents rEAL_TAB = MigrateEvents.REAL_TAB;
       if (rEAL_TAB.isEnable()) {
          uArrayList.add(rEAL_TAB);
       }
       rEAL_TAB = MigrateEvents.HOME_DOT;
       if (rEAL_TAB.isEnable()) {
          uArrayList.add(rEAL_TAB);
       }
       rEAL_TAB = MigrateEvents.LOCAL_NOTIFICATION;
       if (rEAL_TAB.isEnable()) {
          uArrayList.add(rEAL_TAB);
       }
       Collections.sort(uArrayList, b.b);
       return uArrayList;
    }
}
