package com.kwai.locallife.model.LocalLifeGlobalEvent$LocalLifeData$AdditionInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public class LocalLifeGlobalEvent$LocalLifeData$AdditionInfo implements Serializable	// class@000ec3
{
    public String source;
    public static final long serialVersionUID = 0xebbdb0be4cb20813;

    public void LocalLifeGlobalEvent$LocalLifeData$AdditionInfo(String p0){
       super();
       this.source = p0;
    }
    public static String parseSource(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalLifeGlobalEvent$LocalLifeData$AdditionInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          LocalLifeGlobalEvent$LocalLifeData$AdditionInfo localLifeDat = a.a.h(p0, LocalLifeGlobalEvent$LocalLifeData$AdditionInfo.class);
          if (localLifeDat != null) {
             return localLifeDat.source;
          }
          return null;
       }catch(com.google.gson.JsonSyntaxException e0){
       }
    }
}
