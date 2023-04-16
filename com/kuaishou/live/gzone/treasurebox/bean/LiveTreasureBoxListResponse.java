package com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxListResponse;
import la6.b;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;

public class LiveTreasureBoxListResponse implements b, a	// class@001c5e
{
    public List mBubbles;
    public List mLiveTreasureBoxModels;
    public String mLotteryPanelH5Url;
    public boolean mNeedShowGzoneVideo;
    public long mNextRequestSecond;
    public boolean mOverrideLocalWatchedTime;
    public long mServerTimeStamp;
    public boolean mShowKShell;
    public LiveGzoneTreasureTask mTaskInfo;
    public String mToleranceFlag;
    public long mToleranceSecond;
    public long mTotalKShellCount;
    public int mWatchedTime;

    public void LiveTreasureBoxListResponse(){
       super();
       this.mOverrideLocalWatchedTime = true;
    }
    public void afterDeserialize(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveTreasureBoxListResponse.class, "1")) {
          return;
       }
       if (this.mLiveTreasureBoxModels == null) {
          this.mLiveTreasureBoxModels = new ArrayList();
       }
       if (q.f(this.mLiveTreasureBoxModels)) {
          return;
       }else {
          Iterator iterator = this.mLiveTreasureBoxModels.iterator();
          int i = 0;
          int i1 = 0;
          while (iterator.hasNext()) {
             LiveTreasureBoxModel liveTreasure = iterator.next();
             if (objArray != null) {
                i = objArray.getRequiredSecond();
             }
             liveTreasure.setStartCountDownWatchedTime(i);
             liveTreasure.onWatchedTimeChanged(this.mWatchedTime, false);
             liveTreasure.setDataTimeStamp(this.mServerTimeStamp);
             int i2 = i1 + 1;
             liveTreasure.setPosition(i1);
             liveTreasure.setToleranceFlag(this.mToleranceFlag);
             int i3 = 1;
             int i4 = this.mLiveTreasureBoxModels.size() - i3;
             if (liveTreasure.getPosition() != i4) {
                i3 = false;
             }
             liveTreasure.setLast(i3);
             i1 = i2;
             objArray = liveTreasure;
          }
          return;
       }
    }
    public List getItems(){
       return this.mLiveTreasureBoxModels;
    }
    public boolean hasMore(){
       return false;
    }
    public boolean isDataValid(){
       boolean b = (this.mWatchedTime > -1 && (this.mNextRequestSecond - -1 > 0 && this.mTotalKShellCount - -1 > 0))? true: false;
       return b;
    }
}
