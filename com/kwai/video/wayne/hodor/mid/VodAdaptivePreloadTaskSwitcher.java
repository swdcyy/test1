package com.kwai.video.wayne.hodor.mid.VodAdaptivePreloadTaskSwitcher;
import com.kwai.video.wayne.hodor.mid.IPreloadTaskSwitcher;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask$VodAdaptiveInit;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.video.player.mid.manifest.v2.filter.PhotoInfo;
import com.kwai.video.hodor.AbstractHodorPreloadTask;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class VodAdaptivePreloadTaskSwitcher implements IPreloadTaskSwitcher	// class@000c9c
{
    public Boolean mIsFirst;
    public KwaiManifest mKwaiManifest;
    public int mLastSelectRepId;
    public String mManifestString;
    public final VodAdaptivePreloadPriorityTask$VodAdaptiveInit mVodAdaptiveInitValue;

    public void VodAdaptivePreloadTaskSwitcher(KwaiManifest p0,VodAdaptivePreloadPriorityTask$VodAdaptiveInit p1){
       super();
       this.mLastSelectRepId = -1;
       this.mIsFirst = Boolean.TRUE;
       p0.executeRepresentationFilter();
       this.mManifestString = p0.getManifestString();
       this.mVodAdaptiveInitValue = p1;
       if (p0.getPhotoInfo() != null && p0.getPhotoInfo().getShouldUseVip()) {
          p1.adaptiveMode = 2;
       }
       return;
    }
    public void VodAdaptivePreloadTaskSwitcher(String p0,VodAdaptivePreloadPriorityTask$VodAdaptiveInit p1){
       super();
       this.mLastSelectRepId = -1;
       this.mIsFirst = Boolean.TRUE;
       this.mManifestString = p0;
       this.mVodAdaptiveInitValue = p1;
    }
    public AbstractHodorPreloadTask getNextTask(){
       return this.getNextTask();
    }
    public VodAdaptivePreloadPriorityTask getNextTask(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, VodAdaptivePreloadTaskSwitcher.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.mIsFirst.booleanValue()) {
          if (this.mKwaiManifest == null) {
             try{
                this.mKwaiManifest = KwaiManifest.from(this.mManifestString);
             }catch(java.lang.Exception e0){
                return objArray;
             }
          }
          if (this.mKwaiManifest.canRetry(this.mLastSelectRepId)) {
             this.mKwaiManifest.moveToNextUrl(this.mLastSelectRepId);
             this.mManifestString = this.mKwaiManifest.getManifestString();
          }else {
             return objArray;
          }
       }
       this.mIsFirst = Boolean.FALSE;
       return new VodAdaptivePreloadPriorityTask(this.mManifestString, this.mVodAdaptiveInitValue);
    }
    public void setCacheKey(String p0){
    }
    public void setLastSelectRepId(int p0){
       this.mLastSelectRepId = p0;
    }
}
