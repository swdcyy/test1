package com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$mIsSwitchOpen$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class ThanosAdAutoJumpMonitorPresenter$mIsSwitchOpen$2 extends Lambda implements a	// class@0016c7
{
    public static final ThanosAdAutoJumpMonitorPresenter$mIsSwitchOpen$2 INSTANCE;

    static {
       ThanosAdAutoJumpMonitorPresenter$mIsSwitchOpen$2.INSTANCE = new ThanosAdAutoJumpMonitorPresenter$mIsSwitchOpen$2();
    }
    public void ThanosAdAutoJumpMonitorPresenter$mIsSwitchOpen$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ThanosAdAutoJumpMonitorPresenter$mIsSwitchOpen$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableMonitorAdPageAutoJump", false);
    }
}
