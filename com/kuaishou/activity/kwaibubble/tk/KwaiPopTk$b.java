package com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$b;
import erd.r;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.app.Activity;

public final class KwaiPopTk$b implements r	// class@00078d
{
    public final GifshowActivity b;

    public void KwaiPopTk$b(GifshowActivity p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPopTk$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "activityEvent");
          b = (p0 == ActivityEvent.PAUSE && this.b.isFinishing())? true: false;
       }
       return b;
    }
}
