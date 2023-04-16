package com.kwai.slide.play.detail.rightactionbar.backgroundplay.BackgroundPlayRightEntranceEventBus$entranceClickSubject$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BackgroundPlayRightEntranceEventBus$entranceClickSubject$2 extends Lambda implements a	// class@001846
{
    public static final BackgroundPlayRightEntranceEventBus$entranceClickSubject$2 INSTANCE;

    static {
       BackgroundPlayRightEntranceEventBus$entranceClickSubject$2.INSTANCE = new BackgroundPlayRightEntranceEventBus$entranceClickSubject$2();
    }
    public void BackgroundPlayRightEntranceEventBus$entranceClickSubject$2(){
       super(0);
    }
    public final PublishSubject invoke(){
       Object obj = PatchProxy.apply(null, this, BackgroundPlayRightEntranceEventBus$entranceClickSubject$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PublishSubject.g();
    }
    public Object invoke(){
       return this.invoke();
    }
}
