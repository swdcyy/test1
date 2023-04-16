package com.yxcorp.gifshow.growth.push.permission.PushPermissionRecord;
import java.io.Serializable;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PushPermissionRecord implements Serializable	// class@0014b3
{
    public long lastLikeTime;
    public long lastPushPermissionAlertTime;
    public long lastPushPermissionAlertTimeLongPeriod;
    public long lastValidPlayTime;
    public int likeTimes;
    public int pushPermissionShowTimes;
    public long pushPermissionShowTimesLongPeriod;
    public final long serialVersionUID;
    public Map validPlayConfigMap;
    public int validPlayTimes;

    public void PushPermissionRecord(){
       super();
       this.serialVersionUID = 0xd89fceacdda0e645;
       this.validPlayConfigMap = new LinkedHashMap();
    }
    public final long getLastLikeTime(){
       return this.lastLikeTime;
    }
    public final long getLastPushPermissionAlertTime(){
       return this.lastPushPermissionAlertTime;
    }
    public final long getLastPushPermissionAlertTimeLongPeriod(){
       return this.lastPushPermissionAlertTimeLongPeriod;
    }
    public final long getLastValidPlayTime(){
       return this.lastValidPlayTime;
    }
    public final int getLikeTimes(){
       return this.likeTimes;
    }
    public final int getPushPermissionShowTimes(){
       return this.pushPermissionShowTimes;
    }
    public final long getPushPermissionShowTimesLongPeriod(){
       return this.pushPermissionShowTimesLongPeriod;
    }
    public final Map getValidPlayConfigMap(){
       return this.validPlayConfigMap;
    }
    public final int getValidPlayTimes(){
       return this.validPlayTimes;
    }
    public final void reset(){
       if (PatchProxy.applyVoid(null, this, PushPermissionRecord.class, "2")) {
          return;
       }
       this.lastPushPermissionAlertTime = 0;
       this.lastPushPermissionAlertTimeLongPeriod = 0;
       this.pushPermissionShowTimes = 0;
       this.pushPermissionShowTimesLongPeriod = 0;
       this.likeTimes = 0;
       this.validPlayTimes = 0;
       this.validPlayConfigMap.clear();
       return;
    }
    public final void setLastLikeTime(long p0){
       this.lastLikeTime = p0;
    }
    public final void setLastPushPermissionAlertTime(long p0){
       this.lastPushPermissionAlertTime = p0;
    }
    public final void setLastPushPermissionAlertTimeLongPeriod(long p0){
       this.lastPushPermissionAlertTimeLongPeriod = p0;
    }
    public final void setLastValidPlayTime(long p0){
       this.lastValidPlayTime = p0;
    }
    public final void setLikeTimes(int p0){
       this.likeTimes = p0;
    }
    public final void setPushPermissionShowTimes(int p0){
       this.pushPermissionShowTimes = p0;
    }
    public final void setPushPermissionShowTimesLongPeriod(long p0){
       this.pushPermissionShowTimesLongPeriod = p0;
    }
    public final void setValidPlayConfigMap(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushPermissionRecord.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.validPlayConfigMap = p0;
       return;
    }
    public final void setValidPlayTimes(int p0){
       this.validPlayTimes = p0;
    }
}
