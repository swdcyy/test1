package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$foregroundSwitchTabWhenHomeChannels$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.kcube.TabIdentifier;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import on5.b;

public final class HomeExperimentManager$foregroundSwitchTabWhenHomeChannels$2 extends Lambda implements a	// class@0016b5
{
    public static final HomeExperimentManager$foregroundSwitchTabWhenHomeChannels$2 INSTANCE;

    static {
       HomeExperimentManager$foregroundSwitchTabWhenHomeChannels$2.INSTANCE = new HomeExperimentManager$foregroundSwitchTabWhenHomeChannels$2();
    }
    public void HomeExperimentManager$foregroundSwitchTabWhenHomeChannels$2(){
       super(0);
    }
    public final TabIdentifier invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, HomeExperimentManager$foregroundSwitchTabWhenHomeChannels$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a.t().a("enableBackSelectionHot", 4);
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   objArray = b.b;
                }
             }else {
                objArray = b.c;
             }
          }else {
             objArray = b.f;
          }
       }else {
          objArray = b.b;
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
