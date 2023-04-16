package com.kuaishou.live.common.core.basic.resource.g;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$c;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileResponse$LiveResourceFileInfo;
import java.lang.String;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.yxcorp.download.DownloadTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import java.lang.Throwable;

public class g extends LiveResourceFileUtil$c	// class@000ee4
{
    public final LiveResourceFileUtil$LiveResourceFileType e;

    public void g(LiveResourceFileResponse$LiveResourceFileInfo p0,String p1,LiveResourceFileUtil$LiveResourceFileType p2){
       this.e = p2;
       super(p0, p1);
    }
    public void a(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, g.class, "2")) {
          return;
       }
       super.a(p0, p1, p2);
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.e.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.a(p0, p1, p2);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       super.b(p0);
       b.Z(LiveLogTag.LIVE_RESOURCE, "downloadbytype onComplete filePath="+p0+LiveResourceFileUtil.i(this.e.mType));
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.e.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.onComplete();
       }
       LiveResourceFileUtil.e.remove(this.e);
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.c(p0);
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.e.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.onStart();
       }
       LiveResourceFileUtil.e.add(this.e);
       return;
    }
    public void d(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "4")) {
          return;
       }
       super.d(p0, p1);
       b.I(LiveLogTag.LIVE_RESOURCE, "downloadbytype  onError throwable="+LiveResourceFileUtil.i(this.e.mType), p0);
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.e.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.onError(p0);
       }
       LiveResourceFileUtil.e.remove(this.e);
       return;
    }
}
