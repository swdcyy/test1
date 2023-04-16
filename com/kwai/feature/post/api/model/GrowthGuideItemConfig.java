package com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import java.io.Serializable;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig$a;
import nsd.u;
import java.lang.Object;
import com.kwai.feature.post.api.model.AnchorPosition;
import java.lang.StringBuilder;
import java.util.UUID;
import java.lang.String;
import java.lang.System;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.google.gson.JsonObject;
import java.util.Collection;
import kotlin.jvm.internal.a;

public final class GrowthGuideItemConfig implements Serializable	// class@00140e
{
    public List bridgeConfigs;
    public List conditions;
    public String configId;
    public boolean configUnlock;
    public int executeTimeout;
    public String guideItemId;
    public JsonObject originInfo;
    public AnchorPosition position;
    public int showTimes;
    public String stage;
    public long startExecuteTimeStamp;
    public List supportPlatforms;
    public int taskType;
    public List triggers;
    public String type;
    public String uiType;
    public boolean unlockable;
    public static final GrowthGuideItemConfig$a Companion;

    static {
       GrowthGuideItemConfig.Companion = new GrowthGuideItemConfig$a(null);
    }
    public void GrowthGuideItemConfig(){
       super();
       this.type = "";
       this.uiType = "";
       this.configId = "";
       this.showTimes = 1;
       this.executeTimeout = 3000;
       this.position = new AnchorPosition();
       this.taskType = Integer.MIN_VALUE;
       this.stage = "UnKnown";
       this.guideItemId = UUID.randomUUID().toString()+System.currentTimeMillis();
    }
    public static final GrowthGuideItemConfig convert2GrowthGuideItemConfig(JsonElement p0,int p1,String p2,boolean p3){
       if (PatchProxy.isSupport(GrowthGuideItemConfig.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), null, GrowthGuideItemConfig.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return GrowthGuideItemConfig.Companion.a(p0, p1, p2, p3);
    }
    public final List getAction(){
       return this.bridgeConfigs;
    }
    public final List getBridgeConfigs(){
       return this.bridgeConfigs;
    }
    public final List getConditions(){
       return this.conditions;
    }
    public final String getConfigId(){
       return this.configId;
    }
    public final boolean getConfigUnlock(){
       return this.configUnlock;
    }
    public final int getExecuteTimeout(){
       return this.executeTimeout;
    }
    public final String getGuideItemId(){
       return this.guideItemId;
    }
    public final String getItemId(){
       return this.guideItemId;
    }
    public final int getItemTaskType(){
       return this.taskType;
    }
    public final JsonObject getOriginInfo(){
       return this.originInfo;
    }
    public final AnchorPosition getPosition(){
       return this.position;
    }
    public final int getShowTimes(){
       return this.showTimes;
    }
    public final String getStage(){
       return this.stage;
    }
    public final long getStartExecuteTimeStamp(){
       return this.startExecuteTimeStamp;
    }
    public final List getSupportPlatforms(){
       return this.supportPlatforms;
    }
    public final int getTaskType(){
       return this.taskType;
    }
    public final List getTriggers(){
       return this.triggers;
    }
    public final String getType(){
       return this.type;
    }
    public final String getUiType(){
       return this.uiType;
    }
    public final boolean getUnlockable(){
       return this.unlockable;
    }
    public final boolean isPlatformSupport(){
       GrowthGuideItemConfig obj = PatchProxy.apply(null, this, GrowthGuideItemConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.supportPlatforms;
       String str = null;
       obj = (obj == null || obj.isEmpty())? 1: null;
       if (obj) {
          return true;
       }else {
          obj = this.supportPlatforms;
          if (obj != null) {
             str = obj.contains("android");
          }
          return str;
       }
    }
    public final boolean isUnlock(){
       boolean b = (this.unlockable != null || this.configUnlock != null)? true: false;
       return b;
    }
    public final void setBridgeConfigs(List p0){
       this.bridgeConfigs = p0;
    }
    public final void setConditions(List p0){
       this.conditions = p0;
    }
    public final void setConfigId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthGuideItemConfig.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.configId = p0;
       return;
    }
    public final void setConfigUnlock(boolean p0){
       this.configUnlock = p0;
    }
    public final void setExecuteTimeout(int p0){
       this.executeTimeout = p0;
    }
    public final void setGuideItemId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthGuideItemConfig.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.guideItemId = p0;
       return;
    }
    public final void setOriginInfo(JsonObject p0){
       this.originInfo = p0;
    }
    public final void setPosition(AnchorPosition p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthGuideItemConfig.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.position = p0;
       return;
    }
    public final void setShowTimes(int p0){
       this.showTimes = p0;
    }
    public final void setStartExecuteTimeStamp(long p0){
       this.startExecuteTimeStamp = p0;
    }
    public final void setSupportPlatforms(List p0){
       this.supportPlatforms = p0;
    }
    public final void setTaskType(int p0){
       this.taskType = p0;
    }
    public final void setTriggers(List p0){
       this.triggers = p0;
    }
    public final void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthGuideItemConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.type = p0;
       return;
    }
    public final void setUiType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthGuideItemConfig.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.uiType = p0;
       return;
    }
    public final void setUnlockable(boolean p0){
       this.unlockable = p0;
    }
}
