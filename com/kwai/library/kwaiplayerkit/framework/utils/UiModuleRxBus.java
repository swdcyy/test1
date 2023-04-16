package com.kwai.library.kwaiplayerkit.framework.utils.UiModuleRxBus;
import com.kwai.library.kwaiplayerkit.framework.utils.UiModuleRxBus$a;
import nsd.u;
import java.lang.Object;
import com.kwai.library.kwaiplayerkit.framework.utils.UiModuleRxBus$mStickyEventMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.kwaiplayerkit.framework.utils.UiModuleRxBus$mPublishSubject$2;

public final class UiModuleRxBus	// class@000897
{
    public final p a;
    public final p b;
    public static final UiModuleRxBus$a c;

    static {
       UiModuleRxBus.c = new UiModuleRxBus$a(null);
    }
    public void UiModuleRxBus(){
       super();
       this.a = s.c(UiModuleRxBus$mStickyEventMap$2.INSTANCE);
       this.b = s.c(UiModuleRxBus$mPublishSubject$2.INSTANCE);
    }
}
