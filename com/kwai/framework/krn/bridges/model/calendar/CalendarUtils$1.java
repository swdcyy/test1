package com.kwai.framework.krn.bridges.model.calendar.CalendarUtils$1;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.kwai.framework.krn.bridges.model.calendar.CalendarUtils$1$1;
import androidx.lifecycle.LifecycleObserver;

public class CalendarUtils$1 implements Runnable	// class@0015bc
{
    public final Activity b;
    public final JsCalendarParams$CalendarEvent c;

    public void run(){
       if (PatchProxy.applyVoid(null, this, CalendarUtils$1.class, "1")) {
          return;
       }
       if (!this.b.b3()) {
          this.b.getLifecycle().addObserver(new CalendarUtils$1$1(this));
       }
       return;
    }
}
