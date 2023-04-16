package com.kwai.video.wayne.hodor.mid.HlsPreloadTaskSwitcher;
import com.kwai.video.wayne.hodor.mid.IPreloadTaskSwitcher;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.hodor.HlsPreloadPriorityTask$HlsAdaptiveConfig;
import java.util.Map;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.video.hodor.AbstractHodorPreloadTask;
import com.kwai.video.hodor.HlsPreloadPriorityTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class HlsPreloadTaskSwitcher implements IPreloadTaskSwitcher	// class@000c99
{
    public HlsPreloadPriorityTask$HlsAdaptiveConfig mAbrConfig;
    public Map mHeaders;
    public Boolean mIsFirst;
    public KwaiManifest mKwaiManifest;
    public int mLastSelectRepId;
    public String mManifestString;

    public void HlsPreloadTaskSwitcher(KwaiManifest p0,HlsPreloadPriorityTask$HlsAdaptiveConfig p1,Map p2){
       super();
       this.mLastSelectRepId = -1;
       this.mIsFirst = Boolean.TRUE;
       p0.executeRepresentationFilter();
       this.mManifestString = p0.getManifestString();
       this.mAbrConfig = p1;
       this.mHeaders = p2;
    }
    public void HlsPreloadTaskSwitcher(String p0,HlsPreloadPriorityTask$HlsAdaptiveConfig p1,Map p2){
       super();
       this.mLastSelectRepId = -1;
       this.mIsFirst = Boolean.TRUE;
       this.mManifestString = p0;
       this.mAbrConfig = p1;
       this.mHeaders = p2;
    }
    public AbstractHodorPreloadTask getNextTask(){
       return this.getNextTask();
    }
    public HlsPreloadPriorityTask getNextTask(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, HlsPreloadTaskSwitcher.class, "1");
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
       return new HlsPreloadPriorityTask(this.mManifestString, this.mAbrConfig, this.mHeaders);
    }
    public void setCacheKey(String p0){
    }
    public void setLastSelectRepId(int p0){
       this.mLastSelectRepId = p0;
    }
}
