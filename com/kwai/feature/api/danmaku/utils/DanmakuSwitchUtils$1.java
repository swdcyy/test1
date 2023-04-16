package com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm5.d;

public final class DanmakuSwitchUtils$1 extends Lambda implements a	// class@000e8c
{
    public static final DanmakuSwitchUtils$1 INSTANCE;

    static {
       DanmakuSwitchUtils$1.INSTANCE = new DanmakuSwitchUtils$1();
    }
    public void DanmakuSwitchUtils$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, DanmakuSwitchUtils$1.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       DanmakuSwitchUtils.e = mE.getId();
       DanmakuSwitchUtils.f = false;
       RxBus.f.b(new d(DanmakuSwitchUtils.h.d(), true));
       return;
    }
}
