package com.kwai.framework.logger.config.StagFactorykskernelsframeworklogger;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y96.m;
import com.kwai.framework.logger.config.StyleTypeInfo$TypeAdapter;
import y96.e;
import com.kwai.framework.logger.config.LoggerConfigPojo$TypeAdapter;

public final class StagFactorykskernelsframeworklogger implements j	// class@00165c
{

    public void StagFactorykskernelsframeworklogger(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworklogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == m.class) {
          return new StyleTypeInfo$TypeAdapter(p0);
       }
       if (rawType == e.class) {
          return new LoggerConfigPojo$TypeAdapter(p0);
       }
       return null;
    }
}
