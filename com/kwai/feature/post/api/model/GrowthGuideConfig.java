package com.kwai.feature.post.api.model.GrowthGuideConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import trd.t;
import java.util.LinkedHashMap;
import com.google.gson.JsonArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Map;
import com.google.gson.JsonElement;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig$a;

public final class GrowthGuideConfig implements Serializable	// class@00140b
{
    public final Map b;
    public long cacheExpireTime;
    public JsonArray editConfigs;
    public long expireTime;
    public long priority;
    public JsonArray publishConfigs;
    public JsonArray shootConfigs;
    public List supportScenes;
    public int taskType;
    public long taskVersion;
    public boolean unlockable;
    public JsonArray uploadConfigs;

    public void GrowthGuideConfig(){
       super();
       this.cacheExpireTime = -1;
       this.taskType = Integer.MIN_VALUE;
       this.supportScenes = t.k("MAIN");
       this.b = new LinkedHashMap();
    }
    public final long getCacheExpireTime(){
       return this.cacheExpireTime;
    }
    public final JsonArray getEditConfigs(){
       return this.editConfigs;
    }
    public final long getExpireTime(){
       return this.expireTime;
    }
    public final List getGuideItemCfgs(){
       String[] obj = PatchProxy.apply(null, this, GrowthGuideConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"shootConfigs","editConfigs","publishConfigs","uploadConfigs"};
       return this.getGuideItemCfgs(CollectionsKt__CollectionsKt.P(obj));
    }
    public final List getGuideItemCfgs(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, GrowthGuideConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stages");
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          List guideItemCfg = this.getGuideItemCfgsByStage(iterator.next());
          if (guideItemCfg != null) {
             obj.addAll(guideItemCfg);
          }
       }
       return obj;
    }
    public final List getGuideItemCfgsByStage(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, GrowthGuideConfig.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "stage");
       if (this.b.containsKey(p0)) {
          return this.b.get(p0);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, GrowthGuideConfig.class, "6") && !this.b.containsKey(p0)) {
          obj = new ArrayList();
          GrowthGuideConfig growthGuideC = PatchProxy.applyOneRefs(p0, this, GrowthGuideConfig.class, "5");
          if (growthGuideC != patchProxyRe) {
          }else {
             switch (p0.hashCode()){
                 case 0xa8ee1007:
                   if (p0.equals("editConfigs")) {
                      growthGuideC = this.editConfigs;
                   }else {
                   label_0081 :
                      growthGuideC = null;
                   }
                   break;
                 case 0xd52be852:
                   if (p0.equals("shootConfigs")) {
                      growthGuideC = this.shootConfigs;
                   }else {
                      goto label_0081 ;
                   }
                   break;
                 case 0x31a7e162:
                   if (p0.equals("publishConfigs")) {
                      growthGuideC = this.publishConfigs;
                   }else {
                      goto label_0081 ;
                   }
                   break;
                 case 0x79badc30:
                   if (p0.equals("uploadConfigs")) {
                      growthGuideC = this.uploadConfigs;
                   }else {
                      goto label_0081 ;
                   }
                   break;
                 default:
                   goto label_0081 ;
             }
          }
          if (growthGuideC != null) {
             Iterator iterator = growthGuideC.iterator();
             while (iterator.hasNext()) {
                JsonElement jsonElement = iterator.next();
                a.o(jsonElement, "it");
                GrowthGuideItemConfig growthGuideI = GrowthGuideItemConfig.Companion.a(jsonElement, this.taskType, p0, this.unlockable);
                if (growthGuideI != null && growthGuideI.isPlatformSupport()) {
                   obj.add(growthGuideI);
                }
             }
          }
          if (obj.size() > 0) {
             this.b.put(p0, obj);
          }
       }
    label_00ba :
       return this.b.get(p0);
    }
    public final long getPriority(){
       return this.priority;
    }
    public final JsonArray getPublishConfigs(){
       return this.publishConfigs;
    }
    public final JsonArray getShootConfigs(){
       return this.shootConfigs;
    }
    public final List getSupportScenes(){
       return this.supportScenes;
    }
    public final int getTaskType(){
       return this.taskType;
    }
    public final long getTaskVersion(){
       return this.taskVersion;
    }
    public final boolean getUnlockable(){
       return this.unlockable;
    }
    public final JsonArray getUploadConfigs(){
       return this.uploadConfigs;
    }
    public final void setCacheExpireTime(long p0){
       this.cacheExpireTime = p0;
    }
    public final void setEditConfigs(JsonArray p0){
       this.editConfigs = p0;
    }
    public final void setExpireTime(long p0){
       this.expireTime = p0;
    }
    public final void setPriority(long p0){
       this.priority = p0;
    }
    public final void setPublishConfigs(JsonArray p0){
       this.publishConfigs = p0;
    }
    public final void setShootConfigs(JsonArray p0){
       this.shootConfigs = p0;
    }
    public final void setSupportScenes(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthGuideConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.supportScenes = p0;
       return;
    }
    public final void setTaskType(int p0){
       this.taskType = p0;
    }
    public final void setTaskVersion(long p0){
       this.taskVersion = p0;
    }
    public final void setUnlockable(boolean p0){
       this.unlockable = p0;
    }
    public final void setUploadConfigs(JsonArray p0){
       this.uploadConfigs = p0;
    }
}
