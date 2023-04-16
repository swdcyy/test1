package com.yxcorp.gifshow.ad.award.flow.model.ActivityInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.ActivityInfo$a;
import nsd.u;
import java.util.List;
import java.lang.Object;

public final class ActivityInfo implements Serializable	// class@0014f5
{
    public final List imgCdnUrl;
    public int mPendantType;
    public final long pendantDisappearTime;
    public static final ActivityInfo$a Companion;
    public static final long serialVersionUID;

    static {
       ActivityInfo.Companion = new ActivityInfo$a(null);
    }
    public void ActivityInfo(){
       super(null, 0, 0, 7, null);
    }
    public void ActivityInfo(List p0,long p1,int p2){
       super();
       this.imgCdnUrl = p0;
       this.pendantDisappearTime = p1;
       this.mPendantType = p2;
    }
    public void ActivityInfo(List p0,long p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = null;
       }
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final int getMPendantType(){
       return this.mPendantType;
    }
    public final void setMPendantType(int p0){
       this.mPendantType = p0;
    }
}
