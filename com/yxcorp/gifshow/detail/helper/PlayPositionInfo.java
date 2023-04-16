package com.yxcorp.gifshow.detail.helper.PlayPositionInfo;
import java.io.Serializable;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.System;
import com.google.gson.JsonObject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.Number;

public class PlayPositionInfo implements Serializable	// class@001566
{
    public long mExtraKeepSaveTimeMs;
    public long mPlayPosition;
    public long mSaveTimestamp;
    public static final long serialVersionUID = 0x132e405f8d5f0b66;

    public void PlayPositionInfo(long p0,long p1,long p2){
       super();
       this.mPlayPosition = p0;
       this.mSaveTimestamp = p1;
       this.mExtraKeepSaveTimeMs = p2;
    }
    public void PlayPositionInfo(JsonElement p0){
       super();
       if (p0.F()) {
          this.mPlayPosition = p0.t();
          this.mSaveTimestamp = System.currentTimeMillis();
          this.mExtraKeepSaveTimeMs = 0;
       }else {
          this.mPlayPosition = p0.r().e0("playPosition").t();
          this.mSaveTimestamp = p0.r().e0("saveTimestamp").t();
          this.mExtraKeepSaveTimeMs = p0.r().e0("extraKeepSaveTimeMs").t();
       }
       return;
    }
    public JsonElement toJsonElement(){
       JsonObject obj = PatchProxy.apply(null, this, PlayPositionInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.a0("playPosition", Long.valueOf(this.mPlayPosition));
       obj.a0("saveTimestamp", Long.valueOf(this.mSaveTimestamp));
       obj.a0("extraKeepSaveTimeMs", Long.valueOf(this.mSaveTimestamp));
       return obj;
    }
}
