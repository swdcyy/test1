package com.kwai.framework.krn.bridges.model.calendar.CalendarUtils$1$1;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.framework.krn.bridges.model.calendar.CalendarUtils$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.framework.krn.bridges.model.calendar.JsCalendarParams$CalendarEvent;
import com.kwai.framework.krn.bridges.model.calendar.a;
import e17.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;

public class CalendarUtils$1$1 implements LifecycleObserver	// class@0015bb
{
    public final CalendarUtils$1 b;

    public void CalendarUtils$1$1(CalendarUtils$1 p0){
       this.b = p0;
       super();
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, CalendarUtils$1$1.class, "1")) {
          return;
       }
       if (PermissionUtils.a(this.b.b, "android.permission.WRITE_CALENDAR") && PermissionUtils.a(this.b.b, "android.permission.READ_CALENDAR")) {
          CalendarUtils$1$1 tb = this.b;
          a.a(tb.b, tb.c, "content://com.android.calendar/events");
          i.a(R.style.arg_RES_7f11066a, 0x7f100104);
       }
       this.b.b.getLifecycle().removeObserver(this);
       return;
    }
}
