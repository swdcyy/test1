package com.kuaishou.android.vader.persistent.LogRecord_UsedToGenerateCode;
import java.lang.Object;
import com.kuaishou.android.vader.Channel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.vader.persistent.AutoValue_LogRecord_UsedToGenerateCode;

public abstract class LogRecord_UsedToGenerateCode	// class@000f7a
{

    public void LogRecord_UsedToGenerateCode(){
       super();
    }
    public static LogRecord_UsedToGenerateCode create(int p0,Channel p1,int p2,String p3,int p4,long p5,byte[] p6,int p7){
       Object obj;
       LogRecord_UsedToGenerateCode logRecord_Us = LogRecord_UsedToGenerateCode.class;
       if (PatchProxy.isSupport(logRecord_Us)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),Long.valueOf(p5),p6,Integer.valueOf(p7)};
          obj = PatchProxy.apply(objArray, null, logRecord_Us, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       AutoValue_LogRecord_UsedToGenerateCode uAutoValue_L = new AutoValue_LogRecord_UsedToGenerateCode(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public abstract int channelSeqId();
    public abstract Channel channelType();
    public abstract long clientTimestamp();
    public abstract int compressAlgorithm();
    public abstract int customSeqId();
    public abstract String customType();
    public abstract byte[] payload();
    public abstract int seqId();
}
