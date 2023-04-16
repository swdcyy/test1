package lx1.h;
import erd.g;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveInteractiveWidgetConfig;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@003073
{
    public final LiveConfigStartupResponse$LiveInteractiveWidgetConfig b;

    public void h(LiveConfigStartupResponse$LiveInteractiveWidgetConfig p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "activity widget loop", "sceneActivityWidgetLoop", Long.valueOf(this.b.mWidgetRollingDurationMsMs));
    }
}
