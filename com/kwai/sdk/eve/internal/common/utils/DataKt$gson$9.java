package com.kwai.sdk.eve.internal.common.utils.DataKt$gson$9;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import ml5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ml5.a;

public final class DataKt$gson$9 implements i	// class@0014a0
{

    public void DataKt$gson$9(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonElement jsonElement = PatchProxy.applyThreeRefs(p0, p1, p2, this, DataKt$gson$9.class, "1");
       if (jsonElement != PatchProxyResult.class) {
       }else {
          a.p(p0, "src");
          a.p(p1, "typeOfSrc");
          a.p(p2, "context");
          jsonElement = p2.a(p0.asTypeValue());
          a.o(jsonElement, "context.serialize\(src.asTypeValue\(\)\)");
       }
       return jsonElement;
    }
}
