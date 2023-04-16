package com.kuaishou.krn.log.model.KrnPageRenderFmpParams;
import com.kuaishou.krn.log.model.KrnPageRenderParams;
import com.kuaishou.krn.log.model.KrnPageRenderFmpParams$LcpParams;
import com.kuaishou.krn.log.model.KrnPageRenderFmpParams$FmpParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class KrnPageRenderFmpParams	// class@0008e7
{
    public final int mErrorCode;
    public final KrnPageRenderFmpParams$FmpParams mFmp;
    public final KrnPageRenderFmpParams$FmpParams mGaussianFmp;
    public final KrnPageRenderParams mKrnPageRenderParams;
    public final KrnPageRenderFmpParams$LcpParams mLcp;
    public final long mOnCreateToOnAttachTime;

    public void KrnPageRenderFmpParams(KrnPageRenderParams p0,KrnPageRenderFmpParams$LcpParams p1,KrnPageRenderFmpParams$FmpParams p2,KrnPageRenderFmpParams$FmpParams p3,long p4,int p5){
       a.p(p1, "mLcp");
       a.p(p2, "mFmp");
       a.p(p3, "mGaussianFmp");
       super();
       this.mKrnPageRenderParams = p0;
       this.mLcp = p1;
       this.mFmp = p2;
       this.mGaussianFmp = p3;
       this.mOnCreateToOnAttachTime = p4;
       this.mErrorCode = p5;
    }
}
