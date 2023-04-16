package com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager$a;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cra.w;
import java.lang.StringBuilder;
import java.lang.Integer;
import q87.c;

public final class GrowthResourcePreDownloadManager$a extends AwesomeCacheCallback	// class@00147e
{

    public void GrowthResourcePreDownloadManager$a(){
       super();
    }
    public void onDownloadFinish(AcCallBackInfo p0){
       AcCallBackInfo cacheKey;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthResourcePreDownloadManager$a.class, "1")) {
          return;
       }
       w ow = w.C();
       StringBuilder str = "onDownloadFinish cacheKey=";
       Integer integer = null;
       cacheKey = (p0 != null)? p0.cacheKey: integer;
       str = str+cacheKey+", taskState=";
       if (p0 != null) {
          integer = Integer.valueOf(p0.taskState);
       }
       Object[] objArray = new Object[0];
       ow.w("GrowthResourcePreDownloadManager", str+integer, objArray);
       return;
    }
    public void onSessionProgress(AcCallBackInfo p0){
    }
}
