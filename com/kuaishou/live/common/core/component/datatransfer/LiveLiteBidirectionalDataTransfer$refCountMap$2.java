package com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransfer$refCountMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteBidirectionalDataTransfer$refCountMap$2 extends Lambda implements a	// class@0010db
{
    public static final LiveLiteBidirectionalDataTransfer$refCountMap$2 INSTANCE;

    static {
       LiveLiteBidirectionalDataTransfer$refCountMap$2.INSTANCE = new LiveLiteBidirectionalDataTransfer$refCountMap$2();
    }
    public void LiveLiteBidirectionalDataTransfer$refCountMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ConcurrentHashMap invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBidirectionalDataTransfer$refCountMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ConcurrentHashMap();
    }
}
