package com.yxcorp.gifshow.homepage.presenter.HomeTabChannelForegroundSwitchPresenter$handler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;

public final class HomeTabChannelForegroundSwitchPresenter$handler$2 extends Lambda implements a	// class@001792
{
    public static final HomeTabChannelForegroundSwitchPresenter$handler$2 INSTANCE;

    static {
       HomeTabChannelForegroundSwitchPresenter$handler$2.INSTANCE = new HomeTabChannelForegroundSwitchPresenter$handler$2();
    }
    public void HomeTabChannelForegroundSwitchPresenter$handler$2(){
       super(0);
    }
    public final Handler invoke(){
       Object obj = PatchProxy.apply(null, this, HomeTabChannelForegroundSwitchPresenter$handler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Handler(Looper.getMainLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
