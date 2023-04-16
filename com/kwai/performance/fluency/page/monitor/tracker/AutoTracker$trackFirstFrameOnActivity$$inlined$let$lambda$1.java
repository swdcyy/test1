package com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$trackFirstFrameOnActivity$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.fluency.page.monitor.view.FirstFrameView;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import kotlin.jvm.internal.a;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;
import android.view.Window;
import java.util.Objects;
import android.view.ViewGroup;

public final class AutoTracker$trackFirstFrameOnActivity$$inlined$let$lambda$1 extends Lambda implements l	// class@0010c9
{
    public final Activity $activity$inlined;
    public final PageStageEvent $event$inlined;
    public final String $pageKey$inlined;
    public final FirstFrameView $view;

    public void AutoTracker$trackFirstFrameOnActivity$$inlined$let$lambda$1(FirstFrameView p0,PageStageEvent p1,Activity p2,String p3){
       this.$view = p0;
       this.$event$inlined = p1;
       this.$activity$inlined = p2;
       this.$pageKey$inlined = p3;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       a.p(p0, "it");
       AutoTracker.INSTANCE.onFirstFrameDraw(this.$activity$inlined);
       Window window = this.$activity$inlined.getWindow();
       a.o(window, "activity.window");
       window = window.getDecorView();
       Objects.requireNonNull(window, "null cannot be cast to non-null type android.view.ViewGroup");
       window.removeView(this.$view);
    }
}
