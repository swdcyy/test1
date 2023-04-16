package com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$b;
import com.yxcorp.download.DownloadTask;
import java.lang.Throwable;

public interface abstract LiveResourceFileUtil$b	// class@000eb8
{

    void a(DownloadTask p0,long p1,long p2);
    void onComplete();
    void onError(Throwable p0);
    void onStart();
}
