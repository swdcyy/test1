package im9.a;
import java.lang.String;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class a	// class@00287e
{
    public final long mBusinessId;
    public final long mEndTime;
    public final String mExtParams;
    public final String mMediaScene;
    public final List mNeoInfos;
    public final long mPageId;
    public final long mPosId;
    public final int mReportType;
    public final long mStartTime;
    public final long mSubPageId;

    public void a(){
       super(0, 0, 0, 0, null, null, 0, 0, null, 0, 1023, null);
    }
    public void a(long p0){
       super(p0, 0, 0, 0, null, null, 0, 0, null, 0, 1022, null);
    }
    public void a(long p0,long p1,long p2,long p3,String p4,String p5,long p6,long p7,List p8,int p9,int p10,u p11){
       int i = this;
       int i1 = p10;
       long l = (i1 & 0x01)? 0: p0;
       long l1 = (i1 & 0x02)? 0: p1;
       long l2 = (i1 & 0x04)? 0: p2;
       long l3 = (i1 & 0x08)? 0: p3;
       String str = (i1 & 0x10)? null: p4;
       String str1 = (i1 & 0x20)? null: p5;
       long l4 = (i1 & 0x40)? 0: p6;
       int i2 = (i1 & 0x0080)? 0: p7;
       List list = (i1 & 0x0100)? null: p8;
       i1 = (i1 & 0x0200)? 0: p9;
       super();
       i.mPageId = l;
       i.mSubPageId = l1;
       i.mPosId = l2;
       i.mBusinessId = l3;
       i.mMediaScene = str;
       i.mExtParams = str1;
       i.mStartTime = l4;
       i.mEndTime = i2;
       i.mNeoInfos = list;
       i.mReportType = i1;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReportNeoStatusInfo\(mPageId="+this.mPageId+", mSubPageId="+this.mSubPageId+", mPosId="+this.mPosId+", "+"mBusinessId="+this.mBusinessId+", mMediaScene="+this.mMediaScene+", mExtParams="+this.mExtParams+", "+"mStartTime="+this.mStartTime+", mEndTime="+this.mEndTime+", mNeoInfos="+this.mNeoInfos+", mReportType="+this.mReportType+')';
    }
}
