package com.kwai.slide.play.detail.rightactionbar.backgroundplay.BackgroundPlayRightEntranceEventBus;
import qp7.c;
import com.kwai.slide.play.detail.rightactionbar.backgroundplay.BackgroundPlayRightEntranceEventBus$entranceClickSubject$2;
import msd.a;
import qrd.p;
import qrd.s;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BackgroundPlayRightEntranceEventBus extends c	// class@001847
{
    public final p a;

    public void BackgroundPlayRightEntranceEventBus(){
       super();
       this.a = s.c(BackgroundPlayRightEntranceEventBus$entranceClickSubject$2.INSTANCE);
    }
    public final PublishSubject a(){
       Object obj = PatchProxy.apply(null, this, BackgroundPlayRightEntranceEventBus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
