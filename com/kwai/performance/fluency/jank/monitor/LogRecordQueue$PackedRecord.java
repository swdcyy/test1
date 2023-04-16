package com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecord;
import java.io.Serializable;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecord$a;
import nsd.u;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.String;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecordExtra;
import org.json.JSONArray;

public final class LogRecordQueue$PackedRecord implements Serializable	// class@001088
{
    public long count;
    public long cpu;
    public LogRecordQueue$PackedRecordExtra extra;
    public boolean isFullPack;
    public boolean isSinglePack;
    public long maxWall;
    public String msg;
    public long now;
    public int typeFlag;
    public final String uuid;
    public long wall;
    public int what;
    public static final LogRecordQueue$PackedRecord$a Companion;
    public static final int FLAG_CTR_ADD;
    public static final int FLAG_CTR_NEW;
    public static final int FLAG_CTR_SINGLE;
    public static final int FLAG_TYPE_ACTIVITY_THREAD;
    public static final int FLAG_TYPE_ANR_MSG;
    public static final int FLAG_TYPE_IDLE_MSG;
    public static final int FLAG_TYPE_INIT_TASK;
    public static final int FLAG_TYPE_UNDEFINED;
    public static final int FLAG_TYPE_WITH_IDLE_HANDLER;
    public static final AtomicInteger INDEX;
    public static final int MASK_CONTROL;
    public static final int MASK_TYPE;
    public static final String TYPE_ACTIVITY_THREAD;
    public static final String TYPE_IDLE_HANDLER;
    public static final String TYPE_IDLE_MSG;
    public static final String TYPE_OTHER;

    static {
       LogRecordQueue$PackedRecord.Companion = new LogRecordQueue$PackedRecord$a(null);
       LogRecordQueue$PackedRecord.INDEX = new AtomicInteger(0);
    }
    public void LogRecordQueue$PackedRecord(){
       super();
       this.now = -1;
       this.what = -1;
       this.isFullPack = true;
       this.uuid = LogRecordQueue$PackedRecord.INDEX.getAndDecrement()+'-'+System.currentTimeMillis();
    }
    public final void addRecord(long p0,long p1,String p2,boolean p3,int p4){
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
    public final void clear(){
       this.now = -1;
       this.wall = 0;
       this.cpu = 0;
       this.msg = null;
       this.count = 0;
       this.what = -1;
       this.typeFlag = 0;
       this.maxWall = 0;
       this.isSinglePack = false;
       this.isFullPack = true;
       this.extra = null;
    }
    public final long getCount(){
       return this.count;
    }
    public final long getCpu(){
       return this.cpu;
    }
    public final LogRecordQueue$PackedRecordExtra getExtra(){
       return this.extra;
    }
    public final long getMaxWall(){
       return this.maxWall;
    }
    public final String getMsg(){
       return this.msg;
    }
    public final long getNow(){
       return this.now;
    }
    public final int getTypeFlag(){
       return this.typeFlag;
    }
    public final String getUuid(){
       return this.uuid;
    }
    public final long getWall(){
       return this.wall;
    }
    public final int getWhat(){
       return this.what;
    }
    public final boolean isFullPack(){
       return this.isFullPack;
    }
    public final int logTypeFlag(String p0,long p1,long p2,boolean p3){
       int i = Integer.MIN_VALUE;
       if (this.isSinglePack != null) {
          return i;
       }
       LogRecordQueue$PackedRecord tcount = this.count;
       if (tcount && (this.wall + p1) - p2 > 0) {
          return i;
       }
       if (tcount && p3) {
          return 0xc0000000;
       }
       if (!tcount) {
          i = 0;
       }
       return i;
    }
    public final void setCount(long p0){
       this.count = p0;
    }
    public final void setCpu(long p0){
       this.cpu = p0;
    }
    public final void setExtra(LogRecordQueue$PackedRecordExtra p0){
       this.extra = p0;
    }
    public final void setFullPack(boolean p0){
       this.isFullPack = p0;
    }
    public final void setMaxWall(long p0){
       this.maxWall = p0;
    }
    public final void setMsg(String p0){
       this.msg = p0;
    }
    public final void setNow(long p0){
       this.now = p0;
    }
    public final void setTypeFlag(int p0){
       this.typeFlag = p0;
    }
    public final void setWall(long p0){
       this.wall = p0;
    }
    public final void setWhat(int p0){
       this.what = p0;
    }
    public String toString(){
       StringBuilder str = "PackedRecord {now="+this.now+" wall="+this.wall+", cpu="+this.cpu+", count="+this.count+", maxWall="+this.maxWall+", handlerType="+this.typeFlag+", what="+this.what+", msg=\'"+this.msg+"\', extra=";
       LogRecordQueue$PackedRecord textra = this.extra;
       JSONArray jSONArray = (textra == null)? null: textra.getStacks();
       return str+jSONArray+'}';
    }
}
