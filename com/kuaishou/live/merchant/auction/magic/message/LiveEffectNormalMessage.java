package com.kuaishou.live.merchant.auction.magic.message.LiveEffectNormalMessage;
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

public abstract class LiveEffectNormalMessage implements Serializable, a	// class@000c9d
{
    public Object mData;
    public String mReqId;
    public int mReqType;
    public static final long serialVersionUID = 0xc4edf86c2b629892;

    public void LiveEffectNormalMessage(){
       super();
    }
    public static LiveEffectNormalMessage parse(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveEffectNormalMessage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          try{
             LiveEffectNormalMessage liveEffectNo = a.a.h(p0, LiveEffectNormalMessage.class);
             liveEffectNo.afterDeserialize();
             return liveEffectNo;
          }catch(java.lang.Exception e3){
             b.I(LiveLogTag.MERCHANT, "Parse fail", e3);
          }
          return v1;
       }else {
          goto label_002c ;
       }
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveEffectNormalMessage.class, "1")) {
          return;
       }
       if (this.mData == null) {
          return;
       }
       Class dataClass = this.getDataClass();
       if (dataClass == null) {
          return;
       }
       try{
          Gson a = a.a;
          this.mData = a.h(a.q(this.mData), dataClass);
       }catch(java.lang.Exception e0){
          b.I(LiveLogTag.MERCHANT, "Parse fail", e0);
       }
       return;
    }
    public Object getData(){
       LiveEffectNormalMessage obj = PatchProxy.apply(null, this, LiveEffectNormalMessage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mData;
       if (obj != null) {
          return obj;
       }
       return null;
    }
    public abstract Class getDataClass();
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveEffectNormalMessage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
