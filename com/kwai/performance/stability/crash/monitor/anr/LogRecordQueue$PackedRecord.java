package com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecord;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.AnrTypeEnum;
import java.util.UUID;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecordExtra;
import java.lang.StringBuilder;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.anr.b$d;
import com.google.gson.Gson;
import com.kwai.apm.message.FastUnwindBackTraceElement;
import java.lang.Class;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.Integer;
import java.lang.Exception;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$IdleRecord;
import java.util.HashMap;

public class LogRecordQueue$PackedRecord implements Serializable	// class@000df2
{
    public long count;
    public long cpu;
    public LogRecordQueue$PackedRecordExtra extra;
    public long idleCpu;
    public Map idleRecords;
    public long idleWall;
    public boolean isFullPack;
    public boolean isSinglePack;
    public long maxWall;
    public String msg;
    public long now;
    public AnrTypeEnum packType;
    public int typeFlag;
    public String uuid;
    public long wall;
    public int what;

    public void LogRecordQueue$PackedRecord(){
       super();
       this.now = -1;
       this.wall = 0;
       this.cpu = 0;
       this.msg = null;
       this.count = 0;
       this.what = -1;
       this.typeFlag = 0;
       this.maxWall = 0;
       this.isSinglePack = false;
       this.idleWall = -1;
       this.idleCpu = -1;
       this.packType = AnrTypeEnum.DEFAULT;
       this.isFullPack = true;
       this.uuid = UUID.randomUUID().toString();
       this.extra = new LogRecordQueue$PackedRecordExtra();
    }
    public static LogRecordQueue$PackedRecord newInstance(){
       LogRecordQueue$PackedRecord packedRecord = new LogRecordQueue$PackedRecord();
       packedRecord.typeFlag = 1024;
       return packedRecord;
    }
    public static String typeToString(int p0){
       StringBuilder str = "";
       if (p0 & 0x0100) {
          str = str+"ActivityThread,";
       }else if(p0 & 0x01){
          str = str+"AnrMsg,";
       }else if(p0 & 0x02){
          str = str+"IdleMsg,";
       }else if(p0 & 0x04){
          str = str+"WithIdleHandler,";
       }
       if (str.length()) {
          return str.substring(0, (str.length() - 1));
       }else {
          return "Other";
       }
    }
    public void addRecord(long p0,long p1,String p2,boolean p3,int p4){
       this.isSinglePack = p3;
       this.typeFlag = p4;
       if (this.maxWall - p0 <= 0) {
          this.maxWall = p0;
          this.msg = p2;
       }
       this.wall = this.wall + p0;
       this.cpu = this.cpu + p1;
       this.count = this.count + 1;
       return;
    }
    public void clear(){
       long l = -1;
       this.now = l;
       this.wall = 0;
       this.cpu = 0;
       this.msg = null;
       this.count = 0;
       this.extra.clear();
       this.what = -1;
       this.typeFlag = 0;
       this.maxWall = 0;
       this.isSinglePack = false;
       LogRecordQueue$PackedRecord tidleRecords = this.idleRecords;
       if (tidleRecords != null) {
          tidleRecords.clear();
       }
       this.idleWall = l;
       this.idleCpu = l;
       this.packType = AnrTypeEnum.DEFAULT;
       this.isFullPack = true;
       return;
    }
    public LogRecordQueue$PackedRecord copy(){
       LogRecordQueue$PackedRecord packedRecord = new LogRecordQueue$PackedRecord();
       packedRecord.now = this.now;
       packedRecord.wall = this.wall;
       packedRecord.cpu = this.cpu;
       packedRecord.msg = this.msg;
       packedRecord.count = this.count;
       packedRecord.extra = this.extra.copy();
       packedRecord.what = this.what;
       packedRecord.typeFlag = this.typeFlag;
       packedRecord.maxWall = this.maxWall;
       packedRecord.isSinglePack = this.isSinglePack;
       packedRecord.idleRecords = this.idleRecords;
       packedRecord.idleWall = this.idleWall;
       packedRecord.idleCpu = this.idleCpu;
       packedRecord.packType = this.packType;
       packedRecord.isFullPack = this.isFullPack;
       packedRecord.uuid = this.uuid+"\(Copy\)";
       return packedRecord;
    }
    public int getIdleRecordCount(){
       LogRecordQueue$PackedRecord tidleRecords = this.idleRecords;
       int i = (tidleRecords != null)? tidleRecords.size(): 0;
       return i;
    }
    public String getStackTrace(){
       if (this.extra.stacks == null) {
          return "";
       }
       Gson a = b$d.a;
       StringBuilder str = "";
       LogRecordQueue$PackedRecordExtra stacks = this.extra.stacks;
       int len = stacks.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = stacks[i];
          if (oobject instanceof Map) {
             oobject = a.h(a.q(oobject), FastUnwindBackTraceElement.class);
             oobject.hasUnwind = true;
          }
          str = str+"  "+oobject+"\n";
       }
       return str;
    }
    public String getUuid(){
       return this.uuid;
    }
    public boolean hasStackTrace(){
       boolean b = (this.extra.stacks != null)? true: false;
       return b;
    }
    public boolean isAnr(){
       int i = 1;
       if (this.typeFlag & i) {
       }else {
          i = false;
       }
       return i;
    }
    public boolean isIdle(){
       boolean b = (this.typeFlag & 0x02)? true: false;
       return b;
    }
    public int logTypeFlag(String p0,long p1,long p2,boolean p3,boolean p4,AnrMonitorConfig p5){
       LogRecordQueue$PackedRecord packedRecord = this;
       int i = p0;
       int i1 = Integer.MIN_VALUE;
       if (packedRecord.isSinglePack != null) {
          return i1;
       }
       LogRecordQueue$PackedRecord count = packedRecord.count;
       if (count && (packedRecord.wall + p1) - p2 > 0) {
          return i1;
       }
       if (count && (p3 || p4)) {
          return 0xc0000000;
       }
       if (p5.enableActivityThreadMsgSingle != null && i) {
          i1 = 57;
          if (p0.length() > i1 && p0.charAt(i1) == 'H') {
             i1 = 30;
             if ((p0.substring(i1, p0.indexOf(41, i1))).equals("android.app.ActivityThread$H")) {
                if (!packedRecord.count) {
                   return 0x40000100;
                }else {
                   return -1073741568;
                }
             }
          }
       }
       return 0;
    }
    public void processOnDump(boolean p0){
       this.extra.processOnDump(p0);
    }
    public void processOnParse(){
       AnrTypeEnum[] uAnrTypeEnum;
       int len;
       int i;
       object oobject;
       Iterator iterator;
       LogRecordQueue$IdleRecord value;
       long l;
       if (this.typeFlag & 0x0100) {
          try{
             LogRecordQueue$PackedRecord tmsg = this.msg;
             this.what = Integer.parseInt(tmsg.substring((tmsg.lastIndexOf(" ") + 1)));
          }catch(java.lang.Exception e0){
             this.what = -2;
             e0.getMessage();
          }
       }
    }
    public void setNow(long p0){
       if (!this.now - -1) {
          this.now = p0;
       }
       return;
    }
    public String toString(){
       StringBuilder str = "PackedRecord {wall="+this.wall+", cpu="+this.cpu+", count="+this.count+", maxWall="+this.maxWall+", handlerType="+this.typeFlag+", reasonType="+this.packType.getType()+", what="+this.what+", withStack=";
       LogRecordQueue$PackedRecordExtra stacks = this.extra.stacks;
       int i = -1;
       int len = (stacks != null)? stacks.length: -1;
       str = str+len+", withIdleRecord=";
       LogRecordQueue$PackedRecord tidleRecords = this.idleRecords;
       if (tidleRecords != null) {
          i = tidleRecords.size();
       }
       str = str+i;
       String str1 = "";
       String str2 = (this.idleRecords != null)? ", idleWall="+this.idleWall+", idleCpu="+this.idleCpu: str1;
       str = str+str2+", samplingCostWall="+this.extra.costWall+", samplingCostCpu="+this.extra.costCpu;
       if (this.extra.nativePollMsg != null) {
          str1 = ", pollMsg="+this.extra.nativePollMsg;
       }
       return str+str1+", msg=\'"+this.msg+'''+'}';
    }
    public void updateIdleRecords(Map p0,AnrMonitorConfig p1){
       if (p0.size()) {
          if (this.idleRecords == null) {
             this.idleRecords = new HashMap(p0);
          }else {
             Iterator iterator = p0.keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                LogRecordQueue$IdleRecord idleRecord = p0.get(str);
                LogRecordQueue$IdleRecord idleRecord1 = this.idleRecords.get(str);
                if (idleRecord1 == null) {
                   if (this.idleRecords.size() > p1.maxIdleHandlerMonitor) {
                      continue ;
                   }
                }else if(idleRecord != null){
                   idleRecord1.update(idleRecord);
                }
                this.idleRecords.put(str, idleRecord);
             }
          }
          p0.clear();
       }
       return;
    }
}
