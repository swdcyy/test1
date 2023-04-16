package com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class LiveGzoneTreasureTask extends DefaultObservable	// class@001c5d
{
    public String mLeaveTips;
    public CDNUrl[] mPendantIcon;
    public String mPrizeId;
    public LiveGzoneTreasureTask$Skin mSkin;
    public CDNUrl[] mStatusBarIcon;
    public String mTaskCardNameDescription;
    public String mTaskID;
    public CDNUrl[] mTaskIcon;
    public String mTaskPrizeTitle;
    public long mTaskProgress;
    public int mTaskStatus;
    public String mTaskTitle;
    public int mTaskType;
    public t mTaskWrapper;
    public static final long serialVersionUID = 0x7960ca20bc9df1b4;

    public void LiveGzoneTreasureTask(){
       super();
    }
    public boolean canShowPendant(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneTreasureTask.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.canShowTask();
    }
    public boolean canShowTask(){
       LiveGzoneTreasureTask tmTaskStatus = this.mTaskStatus;
       if (tmTaskStatus != null && (tmTaskStatus != 20 && (tmTaskStatus == 10 || this.mTaskType != true))) {
          return false;
       }
       return true;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneTreasureTask.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mTaskType != p0.mTaskType) {
          return false;
       }
       LiveGzoneTreasureTask tmTaskID = this.mTaskID;
       p0 = p0.mTaskID;
       if (tmTaskID != null) {
          b = tmTaskID.equals(p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
    public int hashCode(){
       LiveGzoneTreasureTask obj = PatchProxy.apply(null, this, LiveGzoneTreasureTask.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTaskID;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.mTaskType);
    }
    public boolean isReceiverPrize(){
       boolean b = (this.mTaskStatus == 10)? true: false;
       return b;
    }
}
