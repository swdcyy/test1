package com.kuaishou.live.gzone.treasurebox.LiveTreasureBoxGzoneTaskModel;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import xl8.d;

public class LiveTreasureBoxGzoneTaskModel extends LiveTreasureBoxModel	// class@001c52
{
    public int mImageResource;
    public int mTaskRemainSecond;
    public String mText;

    public void LiveTreasureBoxGzoneTaskModel(LiveGzoneTreasureTask p0){
       super();
       this.updateTaskModel(p0);
       this.mTaskRemainSecond = (int)(p0.mTaskProgress / 1000);
    }
    public int getRemainSecond(){
       return this.mTaskRemainSecond;
    }
    public void setRemainSecond(int p0){
       if (PatchProxy.isSupport(LiveTreasureBoxGzoneTaskModel.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveTreasureBoxGzoneTaskModel.class, "1")) {
          return;
       }
       this.mTaskRemainSecond = p0;
       if (p0 <= 0) {
          this.setBoxStatus(LiveTreasureBoxModel$BoxStatus.OPENED);
       }
       this.notifyChanged();
       return;
    }
    public void updateTaskModel(LiveGzoneTreasureTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTreasureBoxGzoneTaskModel.class, "2")) {
          return;
       }
       if (p0 == null) {
          this.setBoxStatus(LiveTreasureBoxModel$BoxStatus.OPENED);
          return;
       }else {
          p0 = p0.mTaskStatus;
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 != 10) {
                      this.setBoxStatus(LiveTreasureBoxModel$BoxStatus.OPENED);
                   }else {
                      this.setBoxStatus(LiveTreasureBoxModel$BoxStatus.OPENED);
                   }
                }else {
                label_0034 :
                   this.setBoxStatus(LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN);
                }
             }else {
                this.setBoxStatus(LiveTreasureBoxModel$BoxStatus.COUNTING_DOWN);
             }
          }else {
             goto label_0034 ;
          }
          return;
       }
    }
}
