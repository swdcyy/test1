package com.yxcorp.download.DownloadTask$DownloadBizExtra;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$DownloadUpBizFt;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.download.DownloadConfig;
import com.yxcorp.download.DownloadManager;
import java.util.ArrayList;
import java.util.Map;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$SubSolutionType;
import com.yxcorp.download.DownloadTask;
import java.lang.Boolean;
import java.lang.Math;

public class DownloadTask$DownloadBizExtra implements Serializable	// class@0011ad
{
    public String b;
    public boolean isPluginLaunchBizFtUpdate;
    public Map mExtraMap;
    public int mInitPriority;
    public DownloadTask$DownloadBizExtra$DownloadUpBizFt mPluginLaunchBizFt;
    public DownloadTask$DownloadBizExtra$SubSolutionType mSubSolution;
    public int mTaskId;
    public DownloadTask$DownloadBizExtra$DownloadUpBizFt mUpBizFt;

    public void DownloadTask$DownloadBizExtra(){
       super();
       this.mTaskId = -1;
       this.mPluginLaunchBizFt = null;
       this.mInitPriority = Integer.MAX_VALUE;
       this.isPluginLaunchBizFtUpdate = false;
       this.mExtraMap = new HashMap();
    }
    public static int groupPriorityWithLaunchBizFt(DownloadTask$DownloadBizExtra$DownloadUpBizFt p0){
       DownloadConfig obj = PatchProxy.applyOneRefs(p0, null, DownloadTask$DownloadBizExtra.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = DownloadManager.i().F;
       if (obj != null && (p0 != null && obj.contains(p0))) {
          return (obj.size() - obj.indexOf(p0));
       }
       return 0;
    }
    public String getBundleId(){
       return this.b;
    }
    public Serializable getExtraValue(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadTask$DownloadBizExtra.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return this.mExtraMap.get(p0);
       }
       return null;
    }
    public int getInitPriority(){
       return this.mInitPriority;
    }
    public DownloadTask$DownloadBizExtra$DownloadUpBizFt getPluginLaunchBizFt(){
       return this.mPluginLaunchBizFt;
    }
    public DownloadTask$DownloadBizExtra$SubSolutionType getSubSolution(){
       return this.mSubSolution;
    }
    public DownloadTask$DownloadBizExtra$DownloadUpBizFt getUpBizFt(){
       return this.mUpBizFt;
    }
    public void setBundleId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadTask$DownloadBizExtra.class, "2")) {
          return;
       }
       this.b = p0;
       if (p0 != null) {
          this.setExtraValue("bundle_id", p0);
       }
       return;
    }
    public DownloadTask$DownloadBizExtra setExtraValue(String p0,Serializable p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DownloadTask$DownloadBizExtra.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.mExtraMap.put(p0, p1);
       }
       return this;
    }
    public void setPluginLaunchBizFt(DownloadTask$DownloadBizExtra$DownloadUpBizFt p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadTask$DownloadBizExtra.class, "1")) {
          return;
       }
       DownloadTask$DownloadBizExtra tmPluginLaun = this.mPluginLaunchBizFt;
       if (p0 != tmPluginLaun && tmPluginLaun != null) {
          this.isPluginLaunchBizFtUpdate = true;
          DownloadTask uDownloadTas = DownloadManager.n().l(this.mTaskId);
          if (uDownloadTas != null) {
             uDownloadTas.updateGroupPriority(DownloadTask$DownloadBizExtra.groupPriorityWithLaunchBizFt(p0), Boolean.FALSE);
          }
       }
       this.mPluginLaunchBizFt = p0;
       this.updateInitPriority(Boolean.FALSE);
       return;
    }
    public void setSubSolution(DownloadTask$DownloadBizExtra$SubSolutionType p0){
       this.mSubSolution = p0;
    }
    public void setUpBizFt(DownloadTask$DownloadBizExtra$DownloadUpBizFt p0){
       this.mUpBizFt = p0;
    }
    public void updateInitPriority(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadTask$DownloadBizExtra.class, "3")) {
          return;
       }
       DownloadConfig f = DownloadManager.i().F;
       if (f != null) {
          DownloadTask$DownloadBizExtra tmPluginLaun = this.mPluginLaunchBizFt;
          if (tmPluginLaun != null && f.contains(tmPluginLaun)) {
             int i = (p0.booleanValue())? f.indexOf(this.mPluginLaunchBizFt): Math.min(this.mInitPriority, f.indexOf(this.mPluginLaunchBizFt));
             this.mInitPriority = i;
          label_003e :
             return;
          }
       }
       this.mInitPriority = Integer.MAX_VALUE;
       goto label_003e ;
    }
}
