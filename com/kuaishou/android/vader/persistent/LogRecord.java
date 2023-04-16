package com.kuaishou.android.vader.persistent.LogRecord;
import com.kuaishou.android.vader.Channel;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Enum;
import java.util.Arrays;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LogRecord	// class@000718
{
    public final int channelSeqId;
    public final Channel channelType;
    public final long clientTimestamp;
    public int compressAlgorithm;
    public final int customSeqId;
    public final String customType;
    public byte[] payload;
    public final int seqId;

    public void LogRecord(int p0,Channel p1,int p2,String p3,int p4,long p5,byte[] p6,int p7){
       super();
       this.seqId = p0;
       Objects.requireNonNull(p1, "Null channelType");
       this.channelType = p1;
       this.channelSeqId = p2;
       Objects.requireNonNull(p3, "Null customType");
       this.customType = p3;
       this.customSeqId = p4;
       this.clientTimestamp = p5;
       Objects.requireNonNull(p6, "Null payload");
       this.payload = p6;
       this.compressAlgorithm = p7;
    }
    public int channelSeqId(){
       return this.channelSeqId;
    }
    public Channel channelType(){
       return this.channelType;
    }
    public long clientTimestamp(){
       return this.clientTimestamp;
    }
    public int compressAlgorithm(){
       return this.compressAlgorithm;
    }
    public int customSeqId(){
       return this.customSeqId;
    }
    public String customType(){
       return this.customType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LogRecord.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof LogRecord) {
          return false;
       }
       if (this.seqId != p0.seqId() || (!this.channelType.equals(p0.channelType()) || (this.channelSeqId != p0.channelSeqId() || (!(this.customType).equals(p0.customType()) || (this.customSeqId != p0.customSeqId() || (this.clientTimestamp - p0.clientTimestamp() || (!Arrays.equals(this.payload, p0.payload) || this.compressAlgorithm != p0.compressAlgorithm()))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LogRecord.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       LogRecord tclientTimes = this.clientTimestamp;
       return (((((((((((((this.seqId ^ 0xf4243) * 0xf4243) ^ this.channelType.hashCode()) * 0xf4243) ^ this.channelSeqId) * 0xf4243) ^ (this.customType).hashCode()) * 0xf4243) ^ this.customSeqId) * 0xf4243) ^ (int)(tclientTimes ^ (tclientTimes >> 32))) * 0xf4243) ^ Arrays.hashCode(this.payload));
    }
    public byte[] payload(){
       return this.payload;
    }
    public int seqId(){
       return this.seqId;
    }
    public void setCompressAlgorithm(int p0){
       this.compressAlgorithm = p0;
    }
    public void setPayload(byte[] p0){
       this.payload = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LogRecord.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LogRecord_UsedToGenerateCode{seqId="+this.seqId+", channelType="+this.channelType+", channelId="+this.channelSeqId+", customType="+this.customType+", customId="+this.customSeqId+", clientTimestamp="+this.clientTimestamp+", payload="+Arrays.toString(this.payload)+", compressAlgorithm="+this.compressAlgorithm+"}";
    }
}
