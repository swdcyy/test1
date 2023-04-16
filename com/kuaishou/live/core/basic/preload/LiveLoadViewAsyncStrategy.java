package com.kuaishou.live.core.basic.preload.LiveLoadViewAsyncStrategy;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.core.basic.preload.LiveLoadViewAsyncStrategy$a;
import nsd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLoadViewAsyncStrategy extends Enum	// class@0008c4
{
    public final int type;
    public static final LiveLoadViewAsyncStrategy[] $VALUES;
    public static final LiveLoadViewAsyncStrategy ASYNC_LAYOUT_INFLATER;
    public static final LiveLoadViewAsyncStrategy AX2C;
    public static final LiveLoadViewAsyncStrategy$a Companion;
    public static final LiveLoadViewAsyncStrategy DISABLE;
    public static final Map mapping;
    public static Integer serverStrategy;

    static {
       LiveLoadViewAsyncStrategy liveLoadView1;
       LiveLoadViewAsyncStrategy[] liveLoadView = new LiveLoadViewAsyncStrategy[]{liveLoadView1,liveLoadView1,liveLoadView1};
       int i = 0;
       liveLoadView1 = new LiveLoadViewAsyncStrategy("DISABLE", i, i);
       LiveLoadViewAsyncStrategy.DISABLE = liveLoadView1;
       liveLoadView1 = new LiveLoadViewAsyncStrategy("AX2C", 1, 1);
       LiveLoadViewAsyncStrategy.AX2C = liveLoadView1;
       int i1 = 2;
       liveLoadView1 = new LiveLoadViewAsyncStrategy("ASYNC_LAYOUT_INFLATER", i1, i1);
       LiveLoadViewAsyncStrategy.ASYNC_LAYOUT_INFLATER = liveLoadView1;
       LiveLoadViewAsyncStrategy.$VALUES = liveLoadView;
       LiveLoadViewAsyncStrategy.Companion = new LiveLoadViewAsyncStrategy$a(null);
       liveLoadView = LiveLoadViewAsyncStrategy.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(liveLoadView.length), 16));
       int len = liveLoadView.length;
       for (; i < len; i = i + 1) {
          object oobject = liveLoadView[i];
          linkedHashMa.put(Integer.valueOf(oobject.type), oobject);
       }
       LiveLoadViewAsyncStrategy.mapping = linkedHashMa;
    }
    public void LiveLoadViewAsyncStrategy(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static final LiveLoadViewAsyncStrategy getCurrentStrategy(){
       Object obj = PatchProxy.apply(null, null, LiveLoadViewAsyncStrategy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLoadViewAsyncStrategy.Companion.a();
    }
    public static LiveLoadViewAsyncStrategy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLoadViewAsyncStrategy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLoadViewAsyncStrategy.class, p0);
    }
    public static LiveLoadViewAsyncStrategy[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLoadViewAsyncStrategy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLoadViewAsyncStrategy.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
