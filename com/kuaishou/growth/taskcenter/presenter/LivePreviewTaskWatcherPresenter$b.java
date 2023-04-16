package com.kuaishou.growth.taskcenter.presenter.LivePreviewTaskWatcherPresenter$b;
import erd.g;
import com.kuaishou.growth.taskcenter.presenter.LivePreviewTaskWatcherPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;

public final class LivePreviewTaskWatcherPresenter$b implements g	// class@00075a
{
    public final LivePreviewTaskWatcherPresenter b;

    public void LivePreviewTaskWatcherPresenter$b(LivePreviewTaskWatcherPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       LivePreviewTaskWatcherPresenter$b uob = LivePreviewTaskWatcherPresenter$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "1")) {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LivePreviewTaskWatcherPresenter", "active "+b, false, 4, null);
          this.b.P8(b);
       }
       return;
    }
}
