package com.kuaishou.android.model.ads.NeoParamsVideoInfo$CustomData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class NeoParamsVideoInfo$CustomData implements Serializable	// class@00087e
{
    public NeoParamsVideoInfo$ExitInfo mExitInfo;
    public static final long serialVersionUID = 0xddbd51d2c81ead72;

    public void NeoParamsVideoInfo$CustomData(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NeoParamsVideoInfo$CustomData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CustomData{mExitInfo="+this.mExitInfo+'}';
    }
}
