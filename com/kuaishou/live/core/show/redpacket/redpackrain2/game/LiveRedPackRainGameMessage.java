package com.kuaishou.live.core.show.redpacket.redpackrain2.game.LiveRedPackRainGameMessage;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.LiveRedPackRainGameSendData;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.LiveRedPackRainGameReceiveData;

public class LiveRedPackRainGameMessage implements Serializable, a	// class@000ef5
{
    public Object mData;
    public String mReqId;
    public int mReqType;
    public static final long serialVersionUID = 0xf87a6c5445dcff67;

    public void LiveRedPackRainGameMessage(){
       super();
    }
    public static LiveRedPackRainGameMessage parse(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPackRainGameMessage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          try{
             LiveRedPackRainGameMessage liveRedPackR = a.a.h(p0, LiveRedPackRainGameMessage.class);
             liveRedPackR.afterDeserialize();
             return liveRedPackR;
          }catch(java.lang.Exception e3){
             b.I(LiveLogTag.LIVE_RED_PACK_RAIN, "Parse fail", e3);
          }
          return v1;
       }else {
          goto label_002c ;
       }
    }
    public void afterDeserialize(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRedPackRainGameMessage.class, "1")) {
          return;
       }
       LiveRedPackRainGameMessage tmData = this.mData;
       if (tmData == null) {
          return;
       }
       LiveRedPackRainGameMessage tmReqType = this.mReqType;
       if (tmReqType != 6) {
          if (tmReqType == 7) {
             objArray = LiveRedPackRainGameSendData.class;
          }
       }else {
          objArray = LiveRedPackRainGameReceiveData.class;
       }
       if (objArray == null) {
          return;
       }else {
          try{
             Gson a = a.a;
             this.mData = a.h(a.q(tmData), objArray);
          }catch(java.lang.Exception e0){
             b.I(LiveLogTag.LIVE_RED_PACK_RAIN, "Parse fail", e0);
          }
          return;
       }
    }
    public Object getData(){
       LiveRedPackRainGameMessage obj = PatchProxy.apply(null, this, LiveRedPackRainGameMessage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mData;
       if (obj != null) {
          return obj;
       }
       return null;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainGameMessage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
