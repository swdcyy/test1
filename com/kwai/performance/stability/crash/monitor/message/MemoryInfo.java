package com.kwai.performance.stability.crash.monitor.message.MemoryInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import vg7.h;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Iterator;

public class MemoryInfo implements Serializable	// class@000e39
{
    public List mAllThreads;
    public int mAvailableMB;
    public int mFdCount;
    public List mFds;
    public int mJavaHeapLimitMB;
    public int mJavaHeapMB;
    public int mJavaThreadsCount;
    public int mPssMB;
    public int mRssMB;
    public List mThreadNames;
    public int mThreadsCount;
    public int mTotalMB;
    public int mVssMB;
    public static final long serialVersionUID = 0xbb6023c164eb90a2;

    public void MemoryInfo(){
       super();
       this.mFds = new ArrayList();
       this.mThreadNames = new ArrayList();
       this.mAllThreads = new ArrayList();
    }
    public String toString(){
       Iterator iterator;
       String str = "\n";
       StringBuilder str1 = new h().a()+"\t总RAM容量: "+this.mTotalMB+" \(MB\)\n"+"\t剩余RAM容量: "+this.mAvailableMB+" \(MB\)\n"+"\t本进程Java堆上限: "+this.mJavaHeapLimitMB+" \(MB\)\n"+"\t本进程Java堆已使用: "+this.mJavaHeapMB+" \(MB\)\n"+"\t虚拟地址空间已使用Vss: "+this.mVssMB+" \(MB\)\n"+"\t实际空间使用量\(包含共享库\) Rss: "+this.mRssMB+" \(MB\)\n"+"\t实际空间使用量\(共享库已经均摊\)\(高内存杀进程的依据）Pss: "+this.mPssMB+" \(MB\)\n"+"\t打开文件描述符数: "+this.mFdCount+str;
       if (this.mFds.size() > 0) {
          str1 = str1+"\t文件描述符详情: \n";
          iterator = this.mFds.iterator();
          while (iterator.hasNext()) {
             str1 = str1+"\t"+iterator.next()+str;
          }
       }
       str1 = str1+"\t正在运行线程数: "+this.mThreadsCount+str;
       if (this.mJavaThreadsCount > null) {
          str1 = str1+"\tJava线程数: "+this.mJavaThreadsCount+str+"\tNative线程数: "+(this.mThreadsCount - this.mJavaThreadsCount)+"\n\n";
       }
       if (this.mThreadNames.size() > 0) {
          str1 = str1+"\t全部线程名: \n";
          iterator = this.mThreadNames.iterator();
          while (iterator.hasNext()) {
             str1 = str1+"\t"+iterator.next()+str;
          }
       }
       return str1.substring(0);
    }
}
