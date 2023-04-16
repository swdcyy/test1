package com.kwai.video.ksuploaderkit.speedtester.InnerSpeedTesterCache;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.utils.UploaderLruCache;
import com.kwai.video.ksuploaderkit.speedtester.InnerSpeedTesterCache$1;
import com.kwai.video.ksuploaderkit.speedtester.InnerSpeedTesterCache$LazyInstanceHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.LinkedHashMap;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.robust.PatchProxyResult;
import com.ks.ksuploader.KSUploader$RickonConfig;
import c97.d;
import h97.d;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import java.lang.reflect.Type;

public final class InnerSpeedTesterCache	// class@0009ba
{
    public final UploaderLruCache mPipelineKeyCache;
    public KSUploader$RickonConfig mRickonConfig;

    public void InnerSpeedTesterCache(){
       super();
       this.mPipelineKeyCache = new UploaderLruCache(8);
       this.mRickonConfig = null;
    }
    public void InnerSpeedTesterCache(InnerSpeedTesterCache$1 p0){
       super();
    }
    public static InnerSpeedTesterCache getInstance(){
       return InnerSpeedTesterCache$LazyInstanceHolder.INSTANCE;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, InnerSpeedTesterCache.class, "3")) {
          return;
       }
       InnerSpeedTesterCache tmPipelineKe = this.mPipelineKeyCache;
       _monitor_enter(tmPipelineKe);
       this.mPipelineKeyCache.clear();
       _monitor_exit(tmPipelineKe);
       return;
    }
    public ApiResponse getPipelineKeyResponse(String p0){
       InnerSpeedTesterCache obj = PatchProxy.applyOneRefs(p0, this, InnerSpeedTesterCache.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPipelineKeyCache;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return this.mPipelineKeyCache.get(p0);
    }
    public KSUploader$RickonConfig getRickonConfig(){
       InnerSpeedTesterCache innerSpeedTe = InnerSpeedTesterCache.class;
       PublishConfig obj = PatchProxy.apply(null, this, innerSpeedTe, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mRickonConfig == null) {
          _monitor_enter(innerSpeedTe);
          if (this.mRickonConfig == null) {
             obj = d.a().c().a("ksuploaderkit", PublishConfig.class);
             if (obj != null) {
                KSUploader$RickonConfig rickonConfig = new KSUploader$RickonConfig();
                this.mRickonConfig = rickonConfig;
                rickonConfig.nativeConfig = obj.getRickonConfig();
             }
          }
          _monitor_exit(innerSpeedTe);
       }
       return this.mRickonConfig;
    }
    public void savePipelineKeyResopnse(String p0,ApiResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InnerSpeedTesterCache.class, "2")) {
          return;
       }
       InnerSpeedTesterCache tmPipelineKe = this.mPipelineKeyCache;
       _monitor_enter(tmPipelineKe);
       this.mPipelineKeyCache.put(p0, p1);
       _monitor_exit(tmPipelineKe);
       return;
    }
}
