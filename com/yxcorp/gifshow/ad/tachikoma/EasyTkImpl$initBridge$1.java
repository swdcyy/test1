package com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl$initBridge$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import fg6.a;
import msd.a;
import java.util.Map;
import com.google.gson.Gson;

public final class EasyTkImpl$initBridge$1 extends Lambda implements l	// class@0017fe
{
    public final EasyTkImpl this$0;

    public void EasyTkImpl$initBridge$1(EasyTkImpl p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(JSONObject p0){
       Gson a;
       EasyTkImpl obj = PatchProxy.applyOneRefs(p0, this, EasyTkImpl$initBridge$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       a = a.a;
       obj = this.this$0.g;
       Map map = (obj != null)? obj.invoke(): null;
       return a.q(map);
    }
}
