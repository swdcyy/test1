package com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.io.Serializable;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo$a;
import nsd.u;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo$BarrageAnimConfig;
import java.util.List;

public final class PendantMountInfo implements Serializable	// class@00131a
{
    public boolean animationSwitch;
    public Map animationUrls;
    public String area;
    public PendantMountInfo$BarrageAnimConfig barrageAnimConfig;
    public int bizId;
    public String bizType;
    public String bubbleArrowImage;
    public int bubbleScene;
    public boolean checkAllowShowBubble;
    public int delayUnloadRNViewMills;
    public int delayUpdateBubbleAreaSizeMills;
    public long displayIntervalMillis;
    public Map extraMap;
    public int extraViewHeight;
    public int extraViewWidth;
    public int height;
    public int hierarchy;
    public List incompatibleRelationNames;
    public List incompatibleRelations;
    public String insertPicUrl;
    public boolean isAllChildUnClipChildren;
    public boolean isAnchorYellowCar;
    public boolean isHideBubbleArrow;
    public boolean isNeedResume;
    public boolean isUnCheckDuplicate;
    public int layoutArea;
    public int layoutMode;
    public int layoutOrder;
    public int layoutType;
    public String liveId;
    public String liveStreamId;
    public long materialId;
    public long messageIndex;
    public long minShowMills;
    public String pendantCode;
    public int priority;
    public final String selfRelation;
    public long showMills;
    public int type;
    public boolean unClipChildren;
    public boolean unfixedConfig;
    public boolean waitRendered;
    public int width;
    public static final PendantMountInfo$a Companion;

    static {
       PendantMountInfo.Companion = new PendantMountInfo$a(null);
    }
    public void PendantMountInfo(){
       super();
       this.hierarchy = -1000;
       this.selfRelation = "";
       this.checkAllowShowBubble = true;
    }
    public final boolean getAnimationSwitch(){
       return this.animationSwitch;
    }
    public final Map getAnimationUrls(){
       return this.animationUrls;
    }
    public final String getArea(){
       return this.area;
    }
    public final PendantMountInfo$BarrageAnimConfig getBarrageAnimConfig(){
       return this.barrageAnimConfig;
    }
    public final int getBizId(){
       return this.bizId;
    }
    public final String getBizType(){
       return this.bizType;
    }
    public final String getBubbleArrowImage(){
       return this.bubbleArrowImage;
    }
    public final int getBubbleScene(){
       return this.bubbleScene;
    }
    public final boolean getCheckAllowShowBubble(){
       return this.checkAllowShowBubble;
    }
    public final int getDelayUnloadRNViewMills(){
       return this.delayUnloadRNViewMills;
    }
    public final int getDelayUpdateBubbleAreaSizeMills(){
       return this.delayUpdateBubbleAreaSizeMills;
    }
    public final long getDisplayIntervalMillis(){
       return this.displayIntervalMillis;
    }
    public final Map getExtraMap(){
       return this.extraMap;
    }
    public final int getExtraViewHeight(){
       return this.extraViewHeight;
    }
    public final int getExtraViewWidth(){
       return this.extraViewWidth;
    }
    public final int getHeight(){
       return this.height;
    }
    public final int getHierarchy(){
       return this.hierarchy;
    }
    public final List getIncompatibleRelationNames(){
       return this.incompatibleRelationNames;
    }
    public final List getIncompatibleRelations(){
       return this.incompatibleRelations;
    }
    public final String getInsertPicUrl(){
       return this.insertPicUrl;
    }
    public final int getLayoutArea(){
       return this.layoutArea;
    }
    public final int getLayoutMode(){
       return this.layoutMode;
    }
    public final int getLayoutOrder(){
       return this.layoutOrder;
    }
    public final int getLayoutType(){
       return this.layoutType;
    }
    public final String getLiveId(){
       return this.liveId;
    }
    public final String getLiveStreamId(){
       return this.liveStreamId;
    }
    public final long getMaterialId(){
       return this.materialId;
    }
    public final long getMessageIndex(){
       return this.messageIndex;
    }
    public final long getMinShowMills(){
       return this.minShowMills;
    }
    public final String getPendantCode(){
       return this.pendantCode;
    }
    public final int getPriority(){
       return this.priority;
    }
    public final String getSelfRelation(){
       return this.selfRelation;
    }
    public final long getShowMills(){
       return this.showMills;
    }
    public final int getType(){
       return this.type;
    }
    public final boolean getUnClipChildren(){
       return this.unClipChildren;
    }
    public final boolean getUnfixedConfig(){
       return this.unfixedConfig;
    }
    public final boolean getWaitRendered(){
       return this.waitRendered;
    }
    public final int getWidth(){
       return this.width;
    }
    public final boolean isAllChildUnClipChildren(){
       return this.isAllChildUnClipChildren;
    }
    public final boolean isAnchorYellowCar(){
       return this.isAnchorYellowCar;
    }
    public final boolean isHideBubbleArrow(){
       return this.isHideBubbleArrow;
    }
    public final boolean isNeedResume(){
       return this.isNeedResume;
    }
    public final boolean isUnCheckDuplicate(){
       return this.isUnCheckDuplicate;
    }
    public final void setAllChildUnClipChildren(boolean p0){
       this.isAllChildUnClipChildren = p0;
    }
    public final void setAnchorYellowCar(boolean p0){
       this.isAnchorYellowCar = p0;
    }
    public final void setAnimationSwitch(boolean p0){
       this.animationSwitch = p0;
    }
    public final void setAnimationUrls(Map p0){
       this.animationUrls = p0;
    }
    public final void setArea(String p0){
       this.area = p0;
    }
    public final void setBarrageAnimConfig(PendantMountInfo$BarrageAnimConfig p0){
       this.barrageAnimConfig = p0;
    }
    public final void setBizId(int p0){
       this.bizId = p0;
    }
    public final void setBizType(String p0){
       this.bizType = p0;
    }
    public final void setBubbleArrowImage(String p0){
       this.bubbleArrowImage = p0;
    }
    public final void setBubbleScene(int p0){
       this.bubbleScene = p0;
    }
    public final void setCheckAllowShowBubble(boolean p0){
       this.checkAllowShowBubble = p0;
    }
    public final void setDelayUnloadRNViewMills(int p0){
       this.delayUnloadRNViewMills = p0;
    }
    public final void setDelayUpdateBubbleAreaSizeMills(int p0){
       this.delayUpdateBubbleAreaSizeMills = p0;
    }
    public final void setDisplayIntervalMillis(long p0){
       this.displayIntervalMillis = p0;
    }
    public final void setExtraMap(Map p0){
       this.extraMap = p0;
    }
    public final void setExtraViewHeight(int p0){
       this.extraViewHeight = p0;
    }
    public final void setExtraViewWidth(int p0){
       this.extraViewWidth = p0;
    }
    public final void setHeight(int p0){
       this.height = p0;
    }
    public final void setHideBubbleArrow(boolean p0){
       this.isHideBubbleArrow = p0;
    }
    public final void setHierarchy(int p0){
       this.hierarchy = p0;
    }
    public final void setIncompatibleRelationNames(List p0){
       this.incompatibleRelationNames = p0;
    }
    public final void setIncompatibleRelations(List p0){
       this.incompatibleRelations = p0;
    }
    public final void setInsertPicUrl(String p0){
       this.insertPicUrl = p0;
    }
    public final void setLayoutArea(int p0){
       this.layoutArea = p0;
    }
    public final void setLayoutMode(int p0){
       this.layoutMode = p0;
    }
    public final void setLayoutOrder(int p0){
       this.layoutOrder = p0;
    }
    public final void setLayoutType(int p0){
       this.layoutType = p0;
    }
    public final void setLiveId(String p0){
       this.liveId = p0;
    }
    public final void setLiveStreamId(String p0){
       this.liveStreamId = p0;
    }
    public final void setMaterialId(long p0){
       this.materialId = p0;
    }
    public final void setMessageIndex(long p0){
       this.messageIndex = p0;
    }
    public final void setMinShowMills(long p0){
       this.minShowMills = p0;
    }
    public final void setNeedResume(boolean p0){
       this.isNeedResume = p0;
    }
    public final void setPendantCode(String p0){
       this.pendantCode = p0;
    }
    public final void setPriority(int p0){
       this.priority = p0;
    }
    public final void setShowMills(long p0){
       this.showMills = p0;
    }
    public final void setType(int p0){
       this.type = p0;
    }
    public final void setUnCheckDuplicate(boolean p0){
       this.isUnCheckDuplicate = p0;
    }
    public final void setUnClipChildren(boolean p0){
       this.unClipChildren = p0;
    }
    public final void setUnfixedConfig(boolean p0){
       this.unfixedConfig = p0;
    }
    public final void setWaitRendered(boolean p0){
       this.waitRendered = p0;
    }
    public final void setWidth(int p0){
       this.width = p0;
    }
}
