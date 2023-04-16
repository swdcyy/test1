package com.yxcorp.gifshow.reminder.widget.e;
import com.kwai.library.widget.scrollview.HorizontalSlideView$b;
import com.yxcorp.gifshow.reminder.widget.ReminderSlideView$a;
import com.yxcorp.gifshow.reminder.widget.d;
import java.lang.Object;
import com.kwai.library.widget.scrollview.HorizontalSlideView;
import ofc.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.reminder.widget.ReminderSlideView;

public abstract class e implements HorizontalSlideView$b, ReminderSlideView$a	// class@001b08
{
    public final d b;

    public void e(d p0){
       super();
       this.b = p0;
    }
    public void a(HorizontalSlideView p0){
       g.a(this, p0);
    }
    public void u(HorizontalSlideView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.b.b(p0);
       return;
    }
}
