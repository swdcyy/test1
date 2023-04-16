package com.kwai.performance.stability.crash.monitor.message.ExceptionHistory;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;

public final class ExceptionHistory implements Serializable	// class@0011fb
{
    public long mExceptionTimeStamp;
    public int mIndex;
    public int mPid;
    public static final long serialVersionUID = 0x8e9c4906aadf389d;

    public void ExceptionHistory(int p0,int p1,long p2){
       super();
       this.mPid = p0;
       this.mIndex = p1;
       this.mExceptionTimeStamp = p2;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof ExceptionHistory) {
          return false;
       }
       if (this.mPid != p0.mPid || this.mIndex != p0.mIndex) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.mPid),Integer.valueOf(this.mIndex)};
       return Objects.hash(objArray);
    }
}
