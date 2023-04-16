package com.yxcorp.gifshow.tube.TubeViewAreaInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class TubeViewAreaInfo implements Serializable	// class@001e29
{
    public String areaBlockType;
    public String areaId;
    public int areaIndex;
    public String areaName;
    public String areaTitle;
    public int areaType;
    public int posInArea;
    public static final long serialVersionUID = 0x9dc29ca2b9110e1;

    public void TubeViewAreaInfo(){
       super();
       this.areaName = "";
       this.areaType = 0;
       this.areaIndex = 0;
       this.posInArea = 0;
       this.areaBlockType = null;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TubeViewAreaInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TubeViewAreaInfo{areaName=\'"+this.areaName+'''+", areaType="+this.areaType+", areaIndex="+this.areaIndex+", posInArea="+this.posInArea+'}';
    }
}
