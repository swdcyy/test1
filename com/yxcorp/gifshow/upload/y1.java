package com.yxcorp.gifshow.upload.y1;
import erd.g;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.gifshow.upload.b2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aa6.c;
import w96.l;
import qq.a;
import q87.c;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import wkd.b;
import gnc.b;
import com.google.gson.JsonElement;
import brd.t;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.upload.x1;
import crd.b;

public final class y1 implements g	// class@001ebb
{
    public static final y1 b;

    static {
       y1.b = new y1();
    }
    public void y1(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, null, b2.class, "8")) {
       }else {
          int i = 0;
          if (l.a() == null) {
             objArray = new Object[i];
             a.D().w("UploadParamUtils", "LoggingUploadConfig is null, please use loggerV2", objArray);
          }else if(p0 == null || p0.isEmpty()){
             objArray = new Object[i];
             a.D().w("UploadParamUtils", "upload params is null, skip", objArray);
          }else {
             JsonObject jsonObject = new JsonObject();
             p0 = p0.entrySet().iterator();
             while (p0.hasNext()) {
                Map$Entry uEntry = p0.next();
                String key = uEntry.getKey();
                jsonObject.c0(key, uEntry.getValue());
             }
             Object[] objArray1 = new Object[i];
             a.D().w("UploadParamUtils", "postUploadParamsToLogger", objArray1);
             b.a(-1142264700).m(jsonObject.toString()).subscribe(Functions.d(), x1.b);
          }
       }
       return;
    }
}
