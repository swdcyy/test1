package com.yxcorp.gifshow.util.resource.g$b;
import j16.b;
import com.yxcorp.gifshow.util.resource.g;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.Category;
import com.kwai.feature.post.api.model.DownloadStatus;
import boc.b;

public class g$b implements b	// class@000ce8
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public void a(int p0,float p1){
       this.a.f(Category.FILTER_HOLDER, DownloadStatus.DOWNLOADING, p1);
    }
    public void onComplete(int p0){
       this.a.f(Category.FILTER_HOLDER, DownloadStatus.DOWNLOAD_SUCCESS, 0x3f800000);
    }
    public void onError(int p0){
       this.a.f(Category.FILTER_HOLDER, DownloadStatus.DOWNLOAD_FAILED, 0);
    }
}
