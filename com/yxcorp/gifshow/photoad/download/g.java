package com.yxcorp.gifshow.photoad.download.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.String;
import g59.g$a;
import g59.g;
import nxb.d0;
import ekd.k1;

public final class g implements Runnable	// class@000f7f
{
    public final APKDownloadTask b;

    public void g(APKDownloadTask p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       PhotoApkDownloadTaskInfo taskInfo = tb.getTaskInfo();
       BaseFeed photo = taskInfo.mAdDataWrapper.getPhoto();
       if (photo != null) {
          k1.o(new d0(photo, g.a(tb, tb.mTaskInfo.getPkgName()), taskInfo));
          tb.mReportedInstalled = true;
          tb.saveToCache();
       }
       return;
    }
}
