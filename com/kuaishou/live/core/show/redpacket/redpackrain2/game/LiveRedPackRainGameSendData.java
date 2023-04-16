package com.kuaishou.live.core.show.redpacket.redpackrain2.game.LiveRedPackRainGameSendData;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.LiveRedPackRainGameMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.k1;
import java.io.File;
import qkd.b;
import fg6.a;
import com.google.gson.Gson;

public class LiveRedPackRainGameSendData implements Serializable	// class@000ef7
{
    public String mBarImagePath;
    public String mGoldPackImagePath;
    public long mRainDurationMillis;
    public static final long serialVersionUID = 0xfd13e31e01bf3885;

    public void LiveRedPackRainGameSendData(){
       super();
    }
    public LiveRedPackRainGameMessage buildMessage(){
       LiveRedPackRainGameMessage obj = PatchProxy.apply(null, this, LiveRedPackRainGameSendData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveRedPackRainGameMessage();
       obj.mReqId = String.valueOf(k1.j());
       obj.mReqType = 7;
       obj.mData = this;
       return obj;
    }
    public LiveRedPackRainGameSendData setBarImage(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRedPackRainGameSendData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.S(p0)) {
          this.mBarImagePath = p0.getAbsolutePath();
       }
       return this;
    }
    public LiveRedPackRainGameSendData setGoldPackImage(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRedPackRainGameSendData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.S(p0)) {
          this.mGoldPackImagePath = p0.getAbsolutePath();
       }
       return this;
    }
    public LiveRedPackRainGameSendData setRainDurationMillis(long p0){
       this.mRainDurationMillis = p0;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainGameSendData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
