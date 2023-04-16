package com.kwai.video.clipkit.mv.EditorSdk2MvAssetImpl;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public class EditorSdk2MvAssetImpl implements EditorSdk2MvAsset	// class@001abd
{
    public String mAssetPath;
    public String mAssetTag;
    public String mAssetType;
    public int mClipBodyType;
    public EditorSdk2$TimeRange mClipedRange;
    public boolean mDisableReplace;
    public String mFaceBlendPath;
    public Minecraft$WesterosFaceMagicParam mFaceMagicParam;
    public String mGroupId;
    public int mHeight;
    public Minecraft$TimeMapParams mInsertFrameParam;
    public boolean mIsNeedReverse;
    public boolean mIsReplaceable;
    public boolean mIsRestoreAlpha;
    public double mMinClipDuration;
    public String mPicture;
    public String mRefId;
    public boolean mRequireBodyMatting;
    public boolean mRequireClipBody;
    public boolean mRequireClipFace;
    public boolean mRequireClipHead;
    public boolean mRequireFace;
    public boolean mRequireFaceBlend;
    public boolean mRequireFaceMatting;
    public boolean mRequireFacialReco;
    public boolean mRequireHeadMatting;
    public boolean mRequireOriginAudio;
    public String mReturnMediaType;
    public long mSelectFrameTime;
    public String mServiceAction;
    public String mServiceType;
    public ArrayList mSourceList;
    public String mTextStyleId;
    public double mTimeStamp;
    public EditorSdk2$TimeRange mVisibleTimeRange;
    public ArrayList mVisibleTimeRanges;
    public int mWidth;

    public void EditorSdk2MvAssetImpl(){
       super();
       this.mSelectFrameTime = -1;
    }
    public int clipBodyType(){
       return this.mClipBodyType;
    }
    public boolean disableReplace(){
       return this.mDisableReplace;
    }
    public String getAssetPath(){
       return this.mAssetPath;
    }
    public String getAssetTag(){
       return this.mAssetTag;
    }
    public String getAssetType(){
       return this.mAssetType;
    }
    public EditorSdk2$TimeRange getClipedRange(){
       return this.mClipedRange;
    }
    public String getFaceBlendPath(){
       return this.mFaceBlendPath;
    }
    public Minecraft$WesterosFaceMagicParam getFaceMagicParam(){
       return this.mFaceMagicParam;
    }
    public String getGroupId(){
       return this.mGroupId;
    }
    public int getHeight(){
       return this.mHeight;
    }
    public Minecraft$TimeMapParams getInsertFrameParam(){
       return this.mInsertFrameParam;
    }
    public double getMinClipDuration(){
       return this.mMinClipDuration;
    }
    public String getPicture(){
       return this.mPicture;
    }
    public String getRefId(){
       return this.mRefId;
    }
    public String getReturnMediaType(){
       return this.mReturnMediaType;
    }
    public String getServiceType(){
       return this.mServiceType;
    }
    public List getSourceList(){
       EditorSdk2MvAssetImpl obj = PatchProxy.apply(null, this, EditorSdk2MvAssetImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSourceList;
       if (obj != null) {
          return obj.clone();
       }
       return null;
    }
    public String getTextStyleId(){
       return this.mTextStyleId;
    }
    public double getTimeStamp(){
       return this.mTimeStamp;
    }
    public EditorSdk2$TimeRange getVisibleTimeRange(){
       return this.mVisibleTimeRange;
    }
    public List getVisibleTimeRanges(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2MvAssetImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mVisibleTimeRanges.clone();
    }
    public int getWidth(){
       return this.mWidth;
    }
    public boolean isNeedReverse(){
       return this.mIsNeedReverse;
    }
    public boolean isReplaceable(){
       return this.mIsReplaceable;
    }
    public boolean isRestoreAlpha(){
       return this.mIsRestoreAlpha;
    }
    public boolean requireBodyMatting(){
       return this.mRequireBodyMatting;
    }
    public boolean requireClipBody(){
       return this.mRequireClipBody;
    }
    public boolean requireClipFace(){
       return this.mRequireClipFace;
    }
    public boolean requireClipHead(){
       return this.mRequireClipHead;
    }
    public boolean requireFace(){
       return this.mRequireFace;
    }
    public boolean requireFaceBlend(){
       return this.mRequireFaceBlend;
    }
    public boolean requireFaceMatting(){
       return this.mRequireFaceMatting;
    }
    public boolean requireFacialReco(){
       return this.mRequireFacialReco;
    }
    public boolean requireHeadMatting(){
       return this.mRequireHeadMatting;
    }
    public boolean requireOriginAudio(){
       return this.mRequireOriginAudio;
    }
    public long selectFrameTime(){
       return this.mSelectFrameTime;
    }
    public String serviceAction(){
       return this.mServiceAction;
    }
    public void setAssetPath(String p0){
       this.mAssetPath = p0;
    }
    public void setAssetTag(String p0){
       this.mAssetTag = p0;
    }
    public void setAssetType(String p0){
       this.mAssetType = p0;
    }
    public void setClipBodyType(int p0){
       this.mClipBodyType = p0;
    }
    public void setClipedRange(EditorSdk2$TimeRange p0){
       this.mClipedRange = p0;
    }
    public void setDisableReplace(boolean p0){
       this.mDisableReplace = p0;
    }
    public void setFaceBlendPath(String p0){
       this.mFaceBlendPath = p0;
    }
    public void setFaceMagicParam(Minecraft$WesterosFaceMagicParam p0){
       this.mFaceMagicParam = p0;
    }
    public void setGroupId(String p0){
       this.mGroupId = p0;
    }
    public void setHeight(int p0){
       this.mHeight = p0;
    }
    public void setInsertFrameParam(Minecraft$TimeMapParams p0){
       this.mInsertFrameParam = p0;
    }
    public void setIsNeedReverse(boolean p0){
       this.mIsNeedReverse = p0;
    }
    public void setIsReplaceable(boolean p0){
       this.mIsReplaceable = p0;
    }
    public void setIsRestoreAlpha(boolean p0){
       this.mIsRestoreAlpha = p0;
    }
    public void setMinClipDuration(double p0){
       this.mMinClipDuration = p0;
    }
    public void setPicture(String p0){
       this.mPicture = p0;
    }
    public void setRefId(String p0){
       this.mRefId = p0;
    }
    public void setRequireBodyMatting(boolean p0){
       this.mRequireBodyMatting = p0;
    }
    public void setRequireClipBody(boolean p0){
       this.mRequireClipBody = p0;
    }
    public void setRequireClipFace(boolean p0){
       this.mRequireClipFace = p0;
    }
    public void setRequireClipHead(boolean p0){
       this.mRequireClipHead = p0;
    }
    public void setRequireFace(boolean p0){
       this.mRequireFace = p0;
    }
    public void setRequireFaceBlend(boolean p0){
       this.mRequireFaceBlend = p0;
    }
    public void setRequireFaceMatting(boolean p0){
       this.mRequireFaceMatting = p0;
    }
    public void setRequireFacialReco(boolean p0){
       this.mRequireFacialReco = p0;
    }
    public void setRequireHeadMatting(boolean p0){
       this.mRequireHeadMatting = p0;
    }
    public void setRequireOriginAudio(boolean p0){
       this.mRequireOriginAudio = p0;
    }
    public void setReturnMediaType(String p0){
       this.mReturnMediaType = p0;
    }
    public void setSelectFrameTime(long p0){
       this.mSelectFrameTime = p0;
    }
    public void setServiceAction(String p0){
       this.mServiceAction = p0;
    }
    public void setServiceType(String p0){
       this.mServiceType = p0;
    }
    public void setSourceList(ArrayList p0){
       this.mSourceList = p0;
    }
    public void setTextStyleId(String p0){
       this.mTextStyleId = p0;
    }
    public void setTimeStamp(double p0){
       this.mTimeStamp = p0;
    }
    public void setVisibleTimeRange(EditorSdk2$TimeRange p0){
       this.mVisibleTimeRange = p0;
    }
    public void setVisibleTimeRanges(ArrayList p0){
       this.mVisibleTimeRanges = p0;
    }
    public void setWidth(int p0){
       this.mWidth = p0;
    }
}
