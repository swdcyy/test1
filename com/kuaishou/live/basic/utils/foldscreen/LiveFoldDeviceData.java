package com.kuaishou.live.basic.utils.foldscreen.LiveFoldDeviceData;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFoldDeviceData implements Serializable	// class@000d2b
{
    public List mFoldDeviceModelList;
    public static final long serialVersionUID = 0x4b0dc3e8d2c7f58f;

    public void LiveFoldDeviceData(){
       super();
       this.mFoldDeviceModelList = new ArrayList();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFoldDeviceData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFoldDeviceKconf{mFoldDeviceModelList="+this.mFoldDeviceModelList+'}';
    }
}
