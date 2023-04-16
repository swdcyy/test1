package com.kuaishou.live.locallife.stat.LocalLifeStatLogger;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.kuaishou.live.locallife.stat.LocalLifeStatLogger$MessageData;
import com.kuaishou.live.locallife.stat.LocalLifeStatLogger$PreRequestData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Exception;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import java.util.Map;
import java.lang.Throwable;
import lr3.d;

public class LocalLifeStatLogger implements Serializable	// class@000c55
{
    public long bottomIconShowTimePeriod;
    public long enterLiveTime;
    public long leaveLiveTimePeriod;
    public String liveStreamId;
    public ArrayList messageDataArray;
    public String messageType;
    public ArrayList preRequestDataArray;
    public long registerSignalTimePeriod;
    public String role;
    public static final long serialVersionUID = 0xf960e906ef47dcc3;

    public void LocalLifeStatLogger(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LocalLifeStatLogger.class, "2")) {
          return;
       }
       this.role = "";
       this.liveStreamId = "";
       this.messageType = "";
       this.enterLiveTime = 0;
       this.registerSignalTimePeriod = 0;
       this.leaveLiveTimePeriod = 0;
       if (!q.f(this.messageDataArray)) {
          this.messageDataArray.clear();
       }
       if (!q.f(this.preRequestDataArray)) {
          this.preRequestDataArray.clear();
       }
       return;
    }
    public void addMessageData(LocalLifeStatLogger$MessageData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeStatLogger.class, "4")) {
          return;
       }
       if (this.messageDataArray == null) {
          this.messageDataArray = new ArrayList();
       }
       p0.index = this.messageDataArray.size() + 1;
       this.messageDataArray.add(p0);
       return;
    }
    public void addPreRequestData(LocalLifeStatLogger$PreRequestData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeStatLogger.class, "5")) {
          return;
       }
       if (this.preRequestDataArray == null) {
          this.preRequestDataArray = new ArrayList();
       }
       p0.index = this.preRequestDataArray.size() + 1;
       this.preRequestDataArray.add(p0);
       return;
    }
    public long calculatePeriodTime(){
       Object obj = PatchProxy.apply(null, this, LocalLifeStatLogger.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (System.currentTimeMillis() - this.enterLiveTime);
    }
    public long calculatePeriodTime(long p0){
       return (p0 - this.enterLiveTime);
    }
    public void reportCustomLog(){
       String str;
       if (PatchProxy.applyVoid(null, this, LocalLifeStatLogger.class, "1")) {
          return;
       }
       if (q.f(this.messageDataArray) && q.f(this.preRequestDataArray)) {
          this.a();
          return;
       }else {
          try{
             str = a.a.q(this);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          String str1 = str;
          if (!TextUtils.x(str1)) {
             d.a("localLifeLiveMessage", LocalLifeLiveLogBiz.LIVE_ROOM, "LocalLifeStatLogger", str1, null, null, false, 1);
          }
          this.a();
          return;
       }
    }
}
