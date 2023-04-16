package com.kwai.sdk.eve.internal.statistics.DownloadState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class DownloadState extends Enum	// class@0015b2
{
    public final int order;
    public static final DownloadState[] $VALUES;
    public static final DownloadState FAILED;
    public static final DownloadState NONE;
    public static final DownloadState STARTED;
    public static final DownloadState SUCCEED;

    static {
       DownloadState uDownloadSta1;
       DownloadState[] uDownloadSta = new DownloadState[]{uDownloadSta1,uDownloadSta1,uDownloadSta1,uDownloadSta1};
       uDownloadSta1 = new DownloadState("NONE", 0, 0);
       DownloadState.NONE = uDownloadSta1;
       uDownloadSta1 = new DownloadState("STARTED", 1, 1);
       DownloadState.STARTED = uDownloadSta1;
       uDownloadSta1 = new DownloadState("SUCCEED", 2, 3);
       DownloadState.SUCCEED = uDownloadSta1;
       uDownloadSta1 = new DownloadState("FAILED", 3, 2);
       DownloadState.FAILED = uDownloadSta1;
       DownloadState.$VALUES = uDownloadSta;
    }
    public void DownloadState(String p0,int p1,int p2){
       super(p0, p1);
       this.order = p2;
    }
    public static DownloadState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DownloadState.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DownloadState.class, p0);
    }
    public static DownloadState[] values(){
       Object obj = PatchProxy.apply(null, null, DownloadState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DownloadState.$VALUES.clone();
    }
    public final boolean reachableTo(DownloadState p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "target");
       boolean b = (p0.order > this.order)? true: false;
       return b;
    }
}
