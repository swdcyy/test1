package com.yxcorp.gifshow.photoad.PhotoAdvertisementMmaTrackingReporter$isMmaPluginValid$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PhotoAdvertisementMmaTrackingReporter$isMmaPluginValid$2 extends Lambda implements a	// class@000f68
{
    public static final PhotoAdvertisementMmaTrackingReporter$isMmaPluginValid$2 INSTANCE;

    static {
       PhotoAdvertisementMmaTrackingReporter$isMmaPluginValid$2.INSTANCE = new PhotoAdvertisementMmaTrackingReporter$isMmaPluginValid$2();
    }
    public void PhotoAdvertisementMmaTrackingReporter$isMmaPluginValid$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PhotoAdvertisementMmaTrackingReporter$isMmaPluginValid$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.t().d("disableMmaPlugin", true) ^ true);
    }
}
