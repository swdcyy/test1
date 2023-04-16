package com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper$b;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.model.config.NebulaDownloadRedPacketConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class DownloadRedPacketHelper$b implements g	// class@000ee8
{
    public static final DownloadRedPacketHelper$b b;

    static {
       DownloadRedPacketHelper$b.b = new DownloadRedPacketHelper$b();
    }
    public void DownloadRedPacketHelper$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadRedPacketHelper$b.class, "1")) {
       }else if(TextUtils.x(p0.mTemplate)){
          p0.mTemplate = "https://static.yximgs.com/udata/pkg/ks-share-sdk/nebulaTailRedPack.eb5ca56cbf0a8061.zip";
       }
       p0.mDurationMinLimit = 0;
       p0.mDurationLimit = 600;
       p0.mDownloadCountDaily = 0x1869f;
       p0.mDownloadCountTotal = 0x1869f;
       p0.mViewCountLimit = 0;
       return;
    }
}
