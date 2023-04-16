package com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.kuaishou.edit.draft.Asset;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.edit.draft.TimeRange;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import qkd.b;
import com.kuaishou.edit.draft.Asset$PositionType;
import yl8.b;

public class SingleSegmentInfo extends DefaultObservableAndSyncable	// class@0011d8
{
    public Asset mAsset;
    public String mAssetPath;
    public int mIndex;
    public boolean mIsEditable;
    public boolean mIsMoveEnabled;
    public boolean mIsSelected;
    public double mOriginEnd;
    public double mOriginStart;
    public float mRemainClipTime;
    public int mRotateDegree;
    public static final long serialVersionUID = 0x9e45fbb87cdec0f4;

    public void SingleSegmentInfo(){
       super();
       this.mRotateDegree = 0;
       this.mOriginStart = 0;
       this.mOriginEnd = 0;
       this.mIsEditable = true;
       this.mIsMoveEnabled = true;
    }
    public Asset getAsset(){
       return this.mAsset;
    }
    public String getAssetPath(){
       return this.mAssetPath;
    }
    public double getClipDuration(){
       Object obj = PatchProxy.apply(null, this, SingleSegmentInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (this.mAsset.getSelectedRange() == null) {
          return 0xbff0000000000000;
       }
       return this.mAsset.getSelectedRange().getDuration();
    }
    public double getClipEnd(){
       Object obj = PatchProxy.apply(null, this, SingleSegmentInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (this.mAsset.getSelectedRange() == null) {
          return 0xbff0000000000000;
       }
       return (this.mAsset.getSelectedRange().getStart() + this.mAsset.getSelectedRange().getDuration());
    }
    public double getClipStart(){
       Object obj = PatchProxy.apply(null, this, SingleSegmentInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (this.mAsset.getSelectedRange() == null) {
          return 0xbff0000000000000;
       }
       return this.mAsset.getSelectedRange().getStart();
    }
    public int getIndex(){
       return this.mIndex;
    }
    public double getOriginEnd(){
       return this.mOriginEnd;
    }
    public double getOriginStart(){
       return this.mOriginStart;
    }
    public float getRemainClipTime(){
       return this.mRemainClipTime;
    }
    public int getRotateDegree(){
       return this.mRotateDegree;
    }
    public boolean isEditable(){
       return this.mIsEditable;
    }
    public boolean isMoveEnabled(){
       return this.mIsMoveEnabled;
    }
    public boolean isSelected(){
       return this.mIsSelected;
    }
    public void setAsset(Asset p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SingleSegmentInfo.class, "1")) {
          return;
       }
       this.mAsset = p0;
       this.mRotateDegree = p0.getRotate();
       File uFile = DraftFileManager.E().B(p0.getFile(), p1);
       if (b.S(uFile)) {
          this.mAssetPath = uFile.getAbsolutePath();
       }
       if (p0.getSubAssetCount() > 0) {
          this.mIsEditable = false;
          File uFile1 = DraftFileManager.E().B(p0.getSubAsset(false).getFile(), p1);
          if (b.S(uFile1)) {
             this.mAssetPath = uFile1.getAbsolutePath();
          }
       }
       if (p0.getPositionType() == Asset$PositionType.OPENING || p0.getPositionType() == Asset$PositionType.ENDING) {
          this.mIsEditable = false;
          this.mIsMoveEnabled = false;
       }
       return;
    }
    public void setEditable(boolean p0){
       this.mIsEditable = p0;
    }
    public void setIndex(int p0){
       this.mIndex = p0;
    }
    public void setOriginEnd(double p0){
       this.mOriginEnd = p0;
    }
    public void setOriginStart(double p0){
       this.mOriginStart = p0;
    }
    public void setRemainClipTime(float p0){
       this.mRemainClipTime = p0;
    }
    public void setRotateDegree(int p0){
       this.mRotateDegree = p0;
    }
    public void setSelected(boolean p0){
       this.mIsSelected = p0;
    }
    public void sync(b p0){
    }
}
