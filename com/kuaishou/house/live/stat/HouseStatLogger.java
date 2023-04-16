package com.kuaishou.house.live.stat.HouseStatLogger;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.house.live.stat.HouseStatLogger$MessageData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.kuaishou.house.live.stat.HouseStatLogger$PreRequestData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import java.util.Collection;
import ekd.q;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Exception;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pp.a;
import q87.c;
import k2b.u1;

public class HouseStatLogger implements Serializable	// class@000797
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

    public void HouseStatLogger(){
       super();
    }
    public void addMessageData(HouseStatLogger$MessageData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseStatLogger.class, "4")) {
          return;
       }
       if (this.messageDataArray == null) {
          this.messageDataArray = new ArrayList();
       }
       p0.index = this.messageDataArray.size() + 1;
       this.messageDataArray.add(p0);
       return;
    }
    public void addPreRequestData(HouseStatLogger$PreRequestData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseStatLogger.class, "5")) {
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
       Object obj = PatchProxy.apply(null, this, HouseStatLogger.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (System.currentTimeMillis() - this.enterLiveTime);
    }
    public long calculatePeriodTime(long p0){
       return (p0 - this.enterLiveTime);
    }
    public void clean(){
       if (PatchProxy.applyVoid(null, this, HouseStatLogger.class, "2")) {
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
    public void reportCustomLog(){
       String str;
       if (PatchProxy.applyVoid(null, this, HouseStatLogger.class, "1")) {
          return;
       }
       if (q.f(this.messageDataArray) && q.f(this.preRequestDataArray)) {
          this.clean();
          return;
       }else {
          try{
             str = a.a.q(this);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          if (!TextUtils.x(str)) {
             Object[] objArray = new Object[0];
             a.C().s("houseLiveMessage", str, objArray);
             u1.R("houseLiveMessage", str, 15);
          }
          this.clean();
          return;
       }
    }
}
