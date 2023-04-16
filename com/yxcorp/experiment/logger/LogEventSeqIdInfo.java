package com.yxcorp.experiment.logger.LogEventSeqIdInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Long;
import wu8.a;

public class LogEventSeqIdInfo implements Serializable	// class@0011e8
{
    public int seqId;
    public long timestamp;
    public static final long serialVersionUID = 0xc430597f9f47f215;

    public void LogEventSeqIdInfo(){
       super();
       this.seqId = 0;
    }
    public static String createExtraInfo(LogEventSeqIdInfo p0,String p1){
       if (p0 == null) {
          return null;
       }
       HashMap hashMap = new HashMap(3);
       hashMap.put("uuid", p1);
       hashMap.put("seqId", Integer.valueOf(p0.getSeqId()));
       hashMap.put("timestamp", Long.valueOf(p0.getTimestamp()));
       return a.d(hashMap);
    }
    public static String createNotInNewDataExtraInfo(LogEventSeqIdInfo p0,String p1){
       if (p0 == null) {
          return null;
       }
       HashMap hashMap = new HashMap(4);
       hashMap.put("GroupIdNotInNewData", Integer.valueOf(1));
       hashMap.put("uuid", p1);
       hashMap.put("seqId", Integer.valueOf(p0.getSeqId()));
       hashMap.put("timestamp", Long.valueOf(p0.getTimestamp()));
       return a.d(hashMap);
    }
    public int getSeqId(){
       return this.seqId;
    }
    public long getTimestamp(){
       return this.timestamp;
    }
    public void setSeqId(int p0){
       this.seqId = p0;
    }
    public void setTimestamp(long p0){
       this.timestamp = p0;
    }
}
