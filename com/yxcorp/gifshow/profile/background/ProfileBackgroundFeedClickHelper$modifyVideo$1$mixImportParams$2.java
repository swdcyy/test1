package com.yxcorp.gifshow.profile.background.ProfileBackgroundFeedClickHelper$modifyVideo$1$mixImportParams$2;
import com.kwai.feature.post.api.feature.mix.model.IMixImportTimeLineTextFormatter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import nsd.r0;
import java.util.Arrays;
import kotlin.jvm.internal.a;

public final class ProfileBackgroundFeedClickHelper$modifyVideo$1$mixImportParams$2 implements IMixImportTimeLineTextFormatter	// class@001221
{

    public void ProfileBackgroundFeedClickHelper$modifyVideo$1$mixImportParams$2(){
       super();
    }
    public String formatTime(double p0){
       if (PatchProxy.isSupport(ProfileBackgroundFeedClickHelper$modifyVideo$1$mixImportParams$2.class)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, ProfileBackgroundFeedClickHelper$modifyVideo$1$mixImportParams$2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Double.valueOf(p0)};
       String str = String.format("%.1f", Arrays.copyOf(objArray, 1));
       a.o(str, "java.lang.String.format\(format, *args\)");
       return str;
    }
}
