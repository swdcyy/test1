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
       StringBuilder str1 = new h().a()+"\t��RAM����: "+this.mTotalMB+" \(MB\)\n"+"\tʣ��RAM����: "+this.mAvailableMB+" \(MB\)\n"+"\t������Java������: "+this.mJavaHeapLimitMB+" \(MB\)\n"+"\t������Java����ʹ��: "+this.mJavaHeapMB+" \(MB\)\n"+"\t�����ַ�ռ���ʹ��Vss: "+this.mVssMB+" \(MB\)\n"+"\tʵ�ʿռ�ʹ����\(���������\) Rss: "+this.mRssMB+" \(MB\)\n"+"\tʵ�ʿռ�ʹ����\(������Ѿ���̯\)\(���ڴ�ɱ���̵����ݣ�Pss: "+this.mPssMB+" \(MB\)\n"+"\t���ļ���������: "+this.mFdCount+str;
       if (this.mFds.size() > 0) {
          str1 = str1+"\t�ļ�����������: \n";
          iterator = this.mFds.iterator();
          while (iterator.hasNext()) {
             str1 = str1+"\t"+iterator.next()+str;
          }
       }
       str1 = str1+"\t���������߳���: "+this.mThreadsCount+str;
       if (this.mJavaThreadsCount > null) {
          str1 = str1+"\tJava�߳���: "+this.mJavaThreadsCount+str+"\tNative�߳���: "+(this.mThreadsCount - this.mJavaThreadsCount)+"\n\n";
       }
       if (this.mThreadNames.size() > 0) {
          str1 = str1+"\tȫ���߳���: \n";
          iterator = this.mThreadNames.iterator();
          while (iterator.hasNext()) {
             str1 = str1+"\t"+iterator.next()+str;
          }
       }
       return str1.substring(0);
    }
}
