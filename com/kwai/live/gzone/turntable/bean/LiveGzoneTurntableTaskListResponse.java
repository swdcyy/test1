package com.kwai.live.gzone.turntable.bean.LiveGzoneTurntableTaskListResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntableTask;
import ekd.e0;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;

public class LiveGzoneTurntableTaskListResponse implements Serializable, a	// class@000e3d
{
    public int mAvailableDrawCount;
    public int mFinishedNormalTaskCount;
    public List mNormalTasks;
    public int mTotalNormalTaskCount;
    public List mWelfareTasks;
    public static final long serialVersionUID = 0x313625a3aa8dff97;

    public void LiveGzoneTurntableTaskListResponse(){
       super();
    }
    public void afterDeserialize(){
       int i1;
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableTaskListResponse.class, "1")) {
          return;
       }
       int i = 0;
       if (!q.f(this.mNormalTasks)) {
          i1 = this.mNormalTasks.size() - 1;
          while (i1 >= 0) {
             if (this.mNormalTasks.get(i1).mType == 11 && (SystemUtil.M(e0.b, this.mNormalTasks.get(i1).mPkgName) && this.mNormalTasks.get(i1).mObtainedDrawCount != this.mNormalTasks.get(i1).mDayLimit)) {
                this.mNormalTasks.remove(i1);
             }
          label_005a :
             i1 = i1 - 1;
          }
          this.mTotalNormalTaskCount = this.mNormalTasks.size();
          i1 = 0;
          while (i1 < this.mNormalTasks.size()) {
             this.mNormalTasks.get(i1).mListIndex = i1;
             if (this.mNormalTasks.get(i1).mObtainedDrawCount == this.mNormalTasks.get(i1).mDayLimit) {
                int i2 = this.mFinishedNormalTaskCount + 1;
                this.mFinishedNormalTaskCount = i2;
             }
             i1 = i1 + 1;
          }
       }
       if (!q.f(this.mWelfareTasks)) {
          i1 = this.mWelfareTasks.size() - 1;
          while (i1 >= 0) {
             if (this.mWelfareTasks.get(i1).mType == 11 && (SystemUtil.M(e0.b, this.mWelfareTasks.get(i1).mPkgName) && this.mWelfareTasks.get(i1).mObtainedDrawCount != this.mWelfareTasks.get(i1).mDayLimit)) {
                this.mWelfareTasks.remove(i1);
             }
          label_00e2 :
             i1 = i1 - 1;
          }
          for (; i < this.mWelfareTasks.size(); i = i + 1) {
             this.mWelfareTasks.get(i).mListIndex = i;
          }
       }
       return;
    }
}
