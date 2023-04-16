package com.kuaishou.live.basic.model.QLiveWatchingUsersBundle;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class QLiveWatchingUsersBundle implements Serializable	// class@000cdf
{
    public List mCurrentWatchingUsers;
    public String mDisplayWatchingCount;
    public String mKshp;
    public String mLiteDisplayWatchingCount;
    public String mPCursor;
    public int mPendingDuration;
    public int mResult;
    public String mSequenceId;
    public int mWatchingCount;
    public static final long serialVersionUID = 0xc42b6b619dea6be9;

    public void QLiveWatchingUsersBundle(){
       super();
       this.mCurrentWatchingUsers = new ArrayList();
    }
    public List getCurrentWatchingUsers(){
       return this.mCurrentWatchingUsers;
    }
    public String getDisplayWatchingCount(){
       return this.mDisplayWatchingCount;
    }
    public String getKshp(){
       return this.mKshp;
    }
    public String getLiteDisplayWatchingCount(){
       return this.mLiteDisplayWatchingCount;
    }
    public String getPCursor(){
       return this.mPCursor;
    }
    public int getPendingDuration(){
       return this.mPendingDuration;
    }
    public int getResult(){
       return this.mResult;
    }
    public String getSequenceId(){
       return this.mSequenceId;
    }
    public int getWatchingCount(){
       return this.mWatchingCount;
    }
    public void setKshp(String p0){
       this.mKshp = p0;
    }
    public QLiveWatchingUsersBundle setResult(int p0){
       this.mResult = p0;
       return this;
    }
    public void setWatchingCount(int p0){
       this.mWatchingCount = p0;
    }
}
