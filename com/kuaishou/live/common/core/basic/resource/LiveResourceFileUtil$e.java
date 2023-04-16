package com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$e;
import la1.b;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$b;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.HashMap;
import java.lang.reflect.Type;
import z83.a;
import com.yxcorp.download.DownloadTask;
import java.lang.Long;

public class LiveResourceFileUtil$e extends b	// class@000ebb
{
    public LiveResourceFileUtil$LiveResourceFileType a;

    public void LiveResourceFileUtil$e(LiveResourceFileUtil$LiveResourceFileType p0){
       super();
       this.a = p0;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveResourceFileUtil$e.class, "1")) {
          return;
       }
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.a.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.onStart();
       }
       return;
    }
    public void c(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveResourceFileUtil$e.class, "4")) {
          return;
       }
       b.I(LiveLogTag.LIVE_RESOURCE, "download onError "+LiveResourceFileUtil.i(this.a.mType), p0);
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.a.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.onError(p0);
       }
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveResourceFileUtil$e.class, "5")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RESOURCE, "download onComplete filePath="+p0+LiveResourceFileUtil.i(this.a.mType));
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.a.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.onComplete();
       }
       return;
    }
    public void f(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveResourceFileUtil$e.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RESOURCE, "download single pack complete filePath="+p2+" bizType = "+p0+" version = "+p1);
       _monitor_enter(LiveResourceFileUtil.class);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveResourceFileUtil.class, "17")) {
          _monitor_exit(LiveResourceFileUtil.class);
       }else if(p0 == null || p1 == null){
          _monitor_exit(LiveResourceFileUtil.class);
       }else {
          HashMap hashMap = a.b(HashMap.class);
          if (hashMap == null) {
             hashMap = new HashMap();
          }
          hashMap.put(p0, p1);
          a.e(hashMap);
          _monitor_exit(LiveResourceFileUtil.class);
       }
       return;
    }
    public void g(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(LiveResourceFileUtil$e.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, LiveResourceFileUtil$e.class, "2")) {
          return;
       }
       LiveResourceFileUtil$LiveResourceFileType mDownloadLis = this.a.mDownloadListener;
       if (mDownloadLis != null) {
          mDownloadLis.a(p0, p1, p2);
       }
       return;
    }
}
