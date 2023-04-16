package com.kwai.sdk.eve.internal.common.utils.DataKt$gson$10;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.kwai.eve.blockdata.BlockData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import zk.g;

public final class DataKt$gson$10 implements i	// class@00149e
{

    public void DataKt$gson$10(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       g og = PatchProxy.applyThreeRefs(p0, p1, p2, this, DataKt$gson$10.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "src");
          a.p(p1, "typeOfSrc");
          a.p(p2, "context");
          og = new g(p0.getMetaInfo());
       }
       return og;
    }
}
