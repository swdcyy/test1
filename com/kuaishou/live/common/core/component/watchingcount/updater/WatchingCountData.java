package com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData$SourceType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Enum;

public class WatchingCountData	// class@0017c6
{
    public WatchingCountData$SourceType a;
    public long b;
    public String c;

    public void WatchingCountData(WatchingCountData$SourceType p0,long p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, WatchingCountData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "WatchingCountData[type:"+this.a.name()+", count:"+this.b+", display:"+this.c+"]";
    }
}
