package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$Companion$UP_LOAD_PLUGIN_LOG$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class LandscapeEntranceVMPresenter$Companion$UP_LOAD_PLUGIN_LOG$2 extends Lambda implements a	// class@0016df
{
    public static final LandscapeEntranceVMPresenter$Companion$UP_LOAD_PLUGIN_LOG$2 INSTANCE;

    static {
       LandscapeEntranceVMPresenter$Companion$UP_LOAD_PLUGIN_LOG$2.INSTANCE = new LandscapeEntranceVMPresenter$Companion$UP_LOAD_PLUGIN_LOG$2();
    }
    public void LandscapeEntranceVMPresenter$Companion$UP_LOAD_PLUGIN_LOG$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LandscapeEntranceVMPresenter$Companion$UP_LOAD_PLUGIN_LOG$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("coronaPluginUploadLog", false);
    }
}
