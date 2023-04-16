package com.kwai.performance.stability.crash.monitor.anr.extra.ThreadHolder;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Thread;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.util.CpuInfoUtils$CpuInfo;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$FixHeadLimitedSizeQueue;
import java.lang.Long;
import java.lang.Integer;

public class ThreadHolder implements Serializable	// class@0011cc
{
    public List dataList;
    public boolean focus;
    public CpuInfoUtils$CpuInfo info;
    public boolean isMain;
    public f lockChecker;
    public long stmd;
    public Thread thread;
    public int threadIdWhenBlocked;
    public int topIndex;
    public long update;
    public long utmd;
    public static int b = 100;

    public void ThreadHolder(){
       super();
       this.topIndex = -1;
       this.focus = false;
    }
    public void ThreadHolder(Thread p0){
       super();
       this.topIndex = -1;
       this.focus = false;
       this.thread = p0;
    }
    public void ThreadHolder(Thread p0,boolean p1){
       super();
       this.topIndex = -1;
       this.focus = false;
       this.thread = p0;
       this.isMain = p1;
    }
    public static void setMaxPairSize(int p0){
       ThreadHolder.b = p0;
    }
    public List getDataList(){
       return this.dataList;
    }
    public boolean isMainThread(){
       return this.isMain;
    }
    public boolean isNoNeedToFocus(int p0){
       ThreadHolder ttopIndex = this.topIndex;
       if (ttopIndex == -1 || (ttopIndex > p0 && (this.focus == null && this.threadIdWhenBlocked == null))) {
          return true;
       }
       ThreadHolder tthread = this.thread;
       if (tthread != null && !tthread.isAlive()) {
          return true;
       }
       return false;
    }
    public boolean isNotRunning(){
       ThreadHolder tinfo = this.info;
       boolean b = (tinfo != null && !("R").equals(tinfo.status))? true: false;
       return b;
    }
    public boolean needTrace(){
       boolean b;
       if (this.isMain == null && this.thread != null) {
          ThreadHolder tinfo = this.info;
          if (tinfo == null || (tinfo.stm + tinfo.utm)) {
             b = true;
          label_001a :
             return b;
          }
       }
       b = false;
       goto label_001a ;
    }
    public String toString(){
       StringBuilder str = "ThreadHolder {";
       String str1 = (this.thread != null)? this.thread.getName()+"."+this.thread.getId(): "NoThread";
       str = str+str1+", ";
       str1 = (this.info != null)? this.info.name+":"+this.info.tid: "NoCpu";
       return str+str1+'}';
    }
    public void updateCpu(CpuInfoUtils$CpuInfo p0,long p1){
       ThreadHolder tinfo = this.info;
       int i = -1;
       long l = 1;
       CpuInfoUtils$CpuInfo uCpuInfo = null;
       if (tinfo != null) {
          if (!("R").equals(tinfo.status) && "R".equals(p0.status)) {
             if (this.dataList == null) {
                int i1 = 2;
                this.dataList = new LogRecordQueue$FixHeadLimitedSizeQueue(((ThreadHolder.b * 7) + i1), 7, i1);
             }
             if (!this.dataList.size()) {
                this.dataList.add(Long.valueOf(l));
                this.dataList.add(Long.valueOf(this.update));
             }
             this.dataList.add(Long.valueOf(p0.cpu.longValue()));
             this.dataList.add(Long.valueOf(p1));
             i = l;
          }else if("R".equals(this.info.status) && !"R".equals(p0.status)){
             if (this.dataList == null) {
                this.dataList = new LogRecordQueue$FixHeadLimitedSizeQueue(((ThreadHolder.b * 7) + 6), 7, 6);
             }
             if (!this.dataList.size()) {
                this.dataList.add(Long.valueOf(i));
                this.dataList.add(Long.valueOf(this.info.cpu.longValue()));
                this.dataList.add(Long.valueOf(this.update));
             }
             this.dataList.add(Long.valueOf(p1));
          }else {
          label_00be :
             i = uCpuInfo;
          }
       }else {
          goto label_00be ;
       }
       if (i - uCpuInfo) {
          ThreadHolder tinfo1 = this.info;
          long l1 = p0.stm - tinfo1.stm;
          this.stmd = l1;
          this.utmd = p0.utm - tinfo1.utm;
          this.dataList.add(Long.valueOf(l1));
          this.dataList.add(Long.valueOf(this.utmd));
       }
       this.info = p0;
       this.update = p1;
       return;
    }
}
