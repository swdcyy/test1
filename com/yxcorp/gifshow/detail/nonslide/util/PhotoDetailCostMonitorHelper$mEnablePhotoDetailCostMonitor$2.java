package com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCostMonitorHelper$mEnablePhotoDetailCostMonitor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j2a.b;
import com.kwai.sdk.switchconfig.a;

public final class PhotoDetailCostMonitorHelper$mEnablePhotoDetailCostMonitor$2 extends Lambda implements a	// class@0015f8
{
    public static final PhotoDetailCostMonitorHelper$mEnablePhotoDetailCostMonitor$2 INSTANCE;

    static {
       PhotoDetailCostMonitorHelper$mEnablePhotoDetailCostMonitor$2.INSTANCE = new PhotoDetailCostMonitorHelper$mEnablePhotoDetailCostMonitor$2();
    }
    public void PhotoDetailCostMonitorHelper$mEnablePhotoDetailCostMonitor$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PhotoDetailCostMonitorHelper$mEnablePhotoDetailCostMonitor$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, b.class, "6");
       b = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("atlasPageCostFindFeedEnable", false);
       return b;
    }
}
