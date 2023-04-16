package com.kwai.video.ksuploaderkit.stats.HttpUploadStats;
import java.lang.String;
import java.lang.Object;
import java.lang.System;
import java.lang.Thread;
import com.kwai.video.ksuploaderkit.stats.HttpUploadStats$1;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Math;
import com.google.gson.JsonElement;

public class HttpUploadStats	// class@0009c0
{
    public int mFirstFragIndex;
    public int mFragNum;
    public String mIpAddress;
    public Object mLock;
    public long mMaxFragSize;
    public long mSentFragBytes;
    public long mStartMillis;
    public long mWorkingDurationMillis;

    public void HttpUploadStats(int p0,String p1){
       super();
       this.mLock = new Object();
       this.mStartMillis = System.currentTimeMillis();
       this.mMaxFragSize = 0;
       this.mFirstFragIndex = p0;
       this.mSentFragBytes = 0;
       this.mFragNum = 0;
       this.mWorkingDurationMillis = 0;
       new Thread(new HttpUploadStats$1(this, p1)).start();
    }
    public void didSendData(long p0){
       HttpUploadStats tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mFragNum = this.mFragNum + 1;
       HttpUploadStats tmMaxFragSiz = this.mMaxFragSize;
       if (p0 - tmMaxFragSiz > 0) {
          tmMaxFragSiz = p0;
       }
       this.mMaxFragSize = tmMaxFragSiz;
       this.mSentFragBytes = this.mSentFragBytes + p0;
       _monitor_exit(tmLock);
       return;
    }
    public String getQos(){
       JsonObject obj = PatchProxy.apply(null, this, HttpUploadStats.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       HttpUploadStats tmLock = this.mLock;
       _monitor_enter(tmLock);
       obj.a0("sentFragBytes", Long.valueOf(this.mSentFragBytes));
       obj.a0("startTime", Long.valueOf(this.mStartMillis));
       obj.a0("workingDuration", Long.valueOf(this.mWorkingDurationMillis));
       obj.a0("fileNum", Integer.valueOf(1));
       obj.a0("fragNum", Integer.valueOf(this.mFragNum));
       obj.a0("maxFragSize", Long.valueOf(this.mMaxFragSize));
       obj.a0("firstFragIndex", Integer.valueOf(this.mFirstFragIndex));
       HttpUploadStats tmWorkingDur = this.mWorkingDurationMillis;
       if (tmWorkingDur > 0) {
          obj.a0("Sbr", Integer.valueOf(Math.round(((float)((this.mSentFragBytes * 8) / 1024) / ((float)tmWorkingDur / 1000.00f)))));
       }
       tmWorkingDur = this.mIpAddress;
       if (tmWorkingDur != null) {
          obj.c0("gatewayIp", tmWorkingDur);
       }
       _monitor_exit(tmLock);
       return obj.toString();
    }
    public long getSpeed(){
       Object obj = PatchProxy.apply(null, this, HttpUploadStats.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = System.currentTimeMillis() - this.mStartMillis;
       HttpUploadStats httpUploadSt = null;
       if (l - httpUploadSt > 0) {
          httpUploadSt = this.mSentFragBytes / l;
       }
       return httpUploadSt;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, HttpUploadStats.class, "1")) {
          return;
       }
       this.mWorkingDurationMillis = System.currentTimeMillis() - this.mStartMillis;
       return;
    }
}
