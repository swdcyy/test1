package com.kuaishou.live.common.core.basic.resource.i;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$c;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileResponse$LiveResourceFileInfo;
import java.lang.String;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$b;
import com.yxcorp.download.DownloadTask;
import java.lang.Throwable;

public class i extends LiveResourceFileUtil$c	// class@000ee6
{
    public final AtomicBoolean e;
    public final LiveResourceFileUtil$LiveResourceFileType f;
    public final LiveResourceFileResponse$LiveResourceFileInfo g;

    public void i(LiveResourceFileResponse$LiveResourceFileInfo p0,String p1,LiveResourceFileUtil$LiveResourceFileType p2,LiveResourceFileResponse$LiveResourceFileInfo p3){
       this.f = p2;
       this.g = p3;
       super(p0, p1);
       this.e = new AtomicBoolean();
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       super.b(p0);
       b.Z(LiveLogTag.LIVE_RESOURCE, "download  onComplete filePath="+p0+LiveResourceFileUtil.i(this.f.mType));
       LiveResourceFileUtil.b.remove(LiveResourceFileUtil$LiveResourceFileType.fromTypeString(this.g.mType));
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.f.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.onComplete();
       }
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.c(p0);
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.f.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.onStart();
       }
       return;
    }
    public void d(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "3")) {
          return;
       }
       if (!this.e.getAndSet(true)) {
          super.d(p0, p1);
          b.Z(LiveLogTag.LIVE_RESOURCE, "download  onError throwable="+p0+LiveResourceFileUtil.i(this.f.mType));
          LiveResourceFileUtil.b.remove(LiveResourceFileUtil$LiveResourceFileType.fromTypeString(this.g.mType));
          LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.f.mDownloadListener;
          if (mDownloadLis != null) {
             mDownloadLis.onError(p0);
          }
       }
       return;
    }
}
