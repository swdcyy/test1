package com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$trackFirstFrameOnFragment$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import com.kwai.performance.fluency.page.monitor.view.FirstFrameView;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import qrd.l1;
import kotlin.jvm.internal.a;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;
import android.view.ViewGroup;

public final class AutoTracker$trackFirstFrameOnFragment$$inlined$let$lambda$1 extends Lambda implements l	// class@0010ca
{
    public final PageStageEvent $event$inlined;
    public final Fragment $fragment$inlined;
    public final String $pageKey$inlined;
    public final View $root;
    public final FirstFrameView $view;

    public void AutoTracker$trackFirstFrameOnFragment$$inlined$let$lambda$1(View p0,FirstFrameView p1,PageStageEvent p2,String p3,Fragment p4){
       this.$root = p0;
       this.$view = p1;
       this.$event$inlined = p2;
       this.$pageKey$inlined = p3;
       this.$fragment$inlined = p4;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       a.p(p0, "it");
       AutoTracker.INSTANCE.onFirstFrameDraw(this.$fragment$inlined);
       this.$root.removeView(this.$view);
    }
}
