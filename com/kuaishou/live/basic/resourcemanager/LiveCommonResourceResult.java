package com.kuaishou.live.basic.resourcemanager.LiveCommonResourceResult;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveCommonResourceResult implements Serializable	// class@000cf8
{
    public boolean mIsAllSuccess;
    public Map mResMap;
    public static final long serialVersionUID = 0x26ab3faeab10198a;

    public void LiveCommonResourceResult(){
       super();
       this.mIsAllSuccess = true;
       this.mResMap = new HashMap();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCommonResourceResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCommonResourceResult{mIsAllSuccess="+this.mIsAllSuccess+", mResMap="+this.mResMap+'}';
    }
}
