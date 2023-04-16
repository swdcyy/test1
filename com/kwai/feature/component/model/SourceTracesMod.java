package com.kwai.feature.component.model.SourceTracesMod;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;

public class SourceTracesMod implements Serializable	// class@00121e
{
    public String entryReferPage2;
    public String entrySource;
    public String entryStyle;
    public ArrayList traceList;
    public static final long serialVersionUID = 0x1e7f3b658e51e394;

    public void SourceTracesMod(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SourceTracesMod.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GsonUtil.toJson(this);
    }
}
