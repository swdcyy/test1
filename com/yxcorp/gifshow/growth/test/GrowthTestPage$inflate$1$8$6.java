package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$8$6;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Calendar;
import com.yxcorp.gifshow.push.model.CmdCalendarEvent;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;
import java.lang.Integer;
import java.util.List;
import trd.t;
import m6c.a;
import android.app.Application;
import o56.a;
import android.content.Context;

public final class GrowthTestPage$inflate$1$8$6 extends Lambda implements a	// class@001539
{
    public static final GrowthTestPage$inflate$1$8$6 INSTANCE;

    static {
       GrowthTestPage$inflate$1$8$6.INSTANCE = new GrowthTestPage$inflate$1$8$6();
    }
    public void GrowthTestPage$inflate$1$8$6(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthTestPage$inflate$1$8$6.class, "1")) {
          return;
       }
       Calendar instance = Calendar.getInstance();
       a.o(instance, "calendar");
       long timeInMillis = instance.getTimeInMillis();
       CmdCalendarEvent uCmdCalendar = new CmdCalendarEvent("��������-��ȫ��-��ǰ10����", false, timeInMillis, (TimeUnit.HOURS.toMillis(1) + instance.getTimeInMillis()), t.k(Integer.valueOf(10)), "RING", "��������-��ȫ��-��ǰ10����", "calendarId3");
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       a.a.f(uApplication, v12);
       return;
    }
}
