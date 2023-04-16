package com.kuaishou.godzilla.idc.KwaiSpeedTestResult;
import java.lang.String;
import com.kuaishou.godzilla.idc.KwaiIDCHost;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KwaiSpeedTestResult	// class@00089f
{
    public final long mDuration;
    public final long mEnd;
    public final String mException;
    public final KwaiIDCHost mHost;
    public final int mReponseCode;
    public final long mStart;
    public final boolean mSucceed;
    public final String mTspCode;

    public void KwaiSpeedTestResult(int p0,String p1,String p2){
       super(null, 0, 0, 0, p0, false, p1, p2);
    }
    public void KwaiSpeedTestResult(KwaiIDCHost p0,long p1,long p2,long p3,int p4,boolean p5,String p6,String p7){
       super();
       this.mHost = p0;
       this.mDuration = p3;
       this.mReponseCode = p4;
       this.mSucceed = p5;
       this.mStart = p1;
       this.mEnd = p2;
       this.mTspCode = p6;
       this.mException = p7;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KwaiSpeedTestResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{"+"host:"+this.mHost+", "+"start:"+this.mStart+", "+"end:"+this.mEnd+", "+"duration:"+this.mDuration+", "+"response code:"+this.mReponseCode+", "+"succeed:"+this.mSucceed+", "+"tspCode:"+this.mTspCode+", "+"exception:"+this.mException+"}";
    }
}
