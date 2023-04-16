package com.kuaishou.merchant.live.basic.effect.EffectMsg;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import ekd.k1;
import fg6.a;
import com.google.gson.Gson;

public class EffectMsg implements Serializable	// class@00188d
{
    public Object mData;
    public String mReqId;
    public int mReqType;
    public static final long serialVersionUID = 0xe44c9ccd3d81e2d6;

    public void EffectMsg(){
       super();
    }
    public static String createReqJson(int p0,Object p1){
       EffectMsg obj;
       if (PatchProxy.isSupport(EffectMsg.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, EffectMsg.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new EffectMsg();
       obj.mReqId = String.valueOf(k1.j());
       obj.mReqType = p0;
       obj.mData = p1;
       return a.a.q(obj);
    }
}
