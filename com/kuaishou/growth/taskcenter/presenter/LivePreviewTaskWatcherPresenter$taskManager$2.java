package com.kuaishou.growth.taskcenter.presenter.LivePreviewTaskWatcherPresenter$taskManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.pendant.task.PhotoDetailTaskManagerWrapperV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePreviewTaskWatcherPresenter$taskManager$2 extends Lambda implements a	// class@00075b
{
    public static final LivePreviewTaskWatcherPresenter$taskManager$2 INSTANCE;

    static {
       LivePreviewTaskWatcherPresenter$taskManager$2.INSTANCE = new LivePreviewTaskWatcherPresenter$taskManager$2();
    }
    public void LivePreviewTaskWatcherPresenter$taskManager$2(){
       super(0);
    }
    public final PhotoDetailTaskManagerWrapperV2 invoke(){
       Object obj = PatchProxy.apply(null, this, LivePreviewTaskWatcherPresenter$taskManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhotoDetailTaskManagerWrapperV2();
    }
    public Object invoke(){
       return this.invoke();
    }
}
