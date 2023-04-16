package com.yxcorp.gifshow.v3.editor.segment.model.VideoSegmentsModel;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import maa.a;
import com.kuaishou.edit.draft.Asset;
import java.lang.Boolean;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.edit.draft.model.c;
import yl8.b;

public class VideoSegmentsModel extends DefaultObservableAndSyncable	// class@0011d9
{
    public int mAddCount;
    public int mDeleteCount;
    public List mSegmentInfoList;
    public double mVideoDuration;
    public static final long serialVersionUID = 0x920f73ceb8d3cda1;

    public void VideoSegmentsModel(){
       super();
       this.mSegmentInfoList = new ArrayList();
    }
    public void addSingleSegmentInfo(int p0,SingleSegmentInfo p1){
       if (PatchProxy.isSupport(VideoSegmentsModel.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, VideoSegmentsModel.class, "1")) {
          return;
       }
       this.mSegmentInfoList.add(p0, p1);
       return;
    }
    public void addSingleSegmentInfo(a p0,Asset p1,boolean p2){
       if (PatchProxy.isSupport(VideoSegmentsModel.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, VideoSegmentsModel.class, "2")) {
          return;
       }
       SingleSegmentInfo singleSegmen = new SingleSegmentInfo();
       singleSegmen.setEditable(p2);
       singleSegmen.setAsset(p1, p0);
       singleSegmen.setOriginStart(p1.getSelectedRange().getStart());
       singleSegmen.setOriginEnd((p1.getSelectedRange().getStart() + p1.getSelectedRange().getDuration()));
       this.mSegmentInfoList.add(singleSegmen);
       return;
    }
    public int getAddCount(){
       return this.mAddCount;
    }
    public int getDeleteCount(){
       return this.mDeleteCount;
    }
    public List getSegmentInfoList(){
       return this.mSegmentInfoList;
    }
    public int getSegmentInfoListSize(){
       Object obj = PatchProxy.apply(null, this, VideoSegmentsModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mSegmentInfoList.size();
    }
    public double getVideoDuration(){
       return this.mVideoDuration;
    }
    public void initAddDeleteCount(int p0,int p1){
       this.mAddCount = p0;
       this.mDeleteCount = p1;
    }
    public void plusAddCount(int p0){
       this.mAddCount = this.mAddCount + p0;
    }
    public void plusDeleteCount(int p0){
       this.mDeleteCount = this.mDeleteCount + p0;
    }
    public void refreshTrackAsset(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSegmentsModel.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       List list = p0.z();
       int i = 0;
       while (i < list.size()) {
          if (i < this.mSegmentInfoList.size()) {
             this.mSegmentInfoList.get(i).setAsset(list.get(i), p0);
          }
          i = i + 1;
       }
       return;
    }
    public SingleSegmentInfo removeSingleSegmentInfo(int p0){
       if (PatchProxy.isSupport(VideoSegmentsModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, VideoSegmentsModel.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < 0 || p0 >= this.mSegmentInfoList.size()) {
          return null;
       }else {
          return this.mSegmentInfoList.remove(p0);
       }
    }
    public void setVideoDuration(double p0){
       this.mVideoDuration = p0;
    }
    public void sync(VideoSegmentsModel p0){
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
