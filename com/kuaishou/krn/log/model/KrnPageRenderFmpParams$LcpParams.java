package com.kuaishou.krn.log.model.KrnPageRenderFmpParams$LcpParams;
import java.lang.Object;

public final class KrnPageRenderFmpParams$LcpParams	// class@0008e6
{
    public final long mFirstToLcpUIFrameTime;
    public final long mFirstUIOpTime;
    public final long mLayoutOverHeadTime;
    public final long mLayoutUpdateTime;
    public final long mLcpUIOp;
    public final long mOnDrawOverHeadTime;
    public final long mOnDrawTime;

    public void KrnPageRenderFmpParams$LcpParams(long p0,long p1,long p2,long p3,long p4,long p5,long p6){
       super();
       this.mLayoutUpdateTime = p0;
       this.mLayoutOverHeadTime = p1;
       this.mOnDrawTime = p2;
       this.mOnDrawOverHeadTime = p3;
       this.mFirstUIOpTime = p4;
       this.mLcpUIOp = p5;
       this.mFirstToLcpUIFrameTime = p6;
    }
}
