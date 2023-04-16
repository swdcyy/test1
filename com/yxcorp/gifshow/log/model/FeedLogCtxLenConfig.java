package com.yxcorp.gifshow.log.model.FeedLogCtxLenConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FeedLogCtxLenConfig implements Serializable	// class@001b17
{
    public int clientParamsKeyMaxLen;
    public int clientParamsMaxCount;
    public int clientParamsValueMaxLen;
    public int feedLogCtxMaxLen;
    public int stidIdMaxLen;
    public static final long serialVersionUID = 0x1b3d3c2bc85505bd;

    public void FeedLogCtxLenConfig(){
       super();
       this.feedLogCtxMaxLen = 2400;
       this.stidIdMaxLen = 230;
       this.clientParamsMaxCount = 20;
       this.clientParamsKeyMaxLen = 10;
       this.clientParamsValueMaxLen = 32;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeedLogCtxLenConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeedLogCtxLenConfig{feedLogCtxMaxLen="+this.feedLogCtxMaxLen+", stidIdMaxLen="+this.stidIdMaxLen+", clientParamsMaxCount="+this.clientParamsMaxCount+", clientParamsKeyMaxLen="+this.clientParamsKeyMaxLen+", clientParamsValueMaxLen="+this.clientParamsValueMaxLen+'}';
    }
}
