package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType$a;
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

public final class LiveLiteQuickInteractiveAreaItemType extends Enum	// class@000ac4
{
    public static final LiveLiteQuickInteractiveAreaItemType[] $VALUES;
    public static final LiveLiteQuickInteractiveAreaItemType COMMON_TRIGGER;
    public static final LiveLiteQuickInteractiveAreaItemType$a Companion;
    public static final LiveLiteQuickInteractiveAreaItemType DEFAULT;
    public static final LiveLiteQuickInteractiveAreaItemType QUICK_COMMENT;
    public static final LiveLiteQuickInteractiveAreaItemType QUICK_GIFT;
    public static final Map mapping;

    static {
       LiveLiteQuickInteractiveAreaItemType liveLiteQuic1;
       LiveLiteQuickInteractiveAreaItemType[] liveLiteQuic = new LiveLiteQuickInteractiveAreaItemType[]{liveLiteQuic1,liveLiteQuic1,liveLiteQuic1,liveLiteQuic1};
       int i = 0;
       liveLiteQuic1 = new LiveLiteQuickInteractiveAreaItemType("DEFAULT", i);
       LiveLiteQuickInteractiveAreaItemType.DEFAULT = liveLiteQuic1;
       liveLiteQuic1 = new LiveLiteQuickInteractiveAreaItemType("QUICK_GIFT", 1);
       LiveLiteQuickInteractiveAreaItemType.QUICK_GIFT = liveLiteQuic1;
       liveLiteQuic1 = new LiveLiteQuickInteractiveAreaItemType("QUICK_COMMENT", 2);
       LiveLiteQuickInteractiveAreaItemType.QUICK_COMMENT = liveLiteQuic1;
       int i1 = 3;
       liveLiteQuic1 = new LiveLiteQuickInteractiveAreaItemType("COMMON_TRIGGER", i1);
       LiveLiteQuickInteractiveAreaItemType.COMMON_TRIGGER = liveLiteQuic1;
       LiveLiteQuickInteractiveAreaItemType.$VALUES = liveLiteQuic;
       LiveLiteQuickInteractiveAreaItemType.Companion = new LiveLiteQuickInteractiveAreaItemType$a(null);
       liveLiteQuic = LiveLiteQuickInteractiveAreaItemType.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(liveLiteQuic.length), 16));
       int len = liveLiteQuic.length;
       for (; i < len; i = i + 1) {
          object oobject = liveLiteQuic[i];
          linkedHashMa.put(Integer.valueOf(oobject.ordinal()), oobject);
       }
       LiveLiteQuickInteractiveAreaItemType.mapping = linkedHashMa;
    }
    public void LiveLiteQuickInteractiveAreaItemType(String p0,int p1){
       super(p0, p1);
    }
    public static final LiveLiteQuickInteractiveAreaItemType fromOrdinal(int p0){
       LiveLiteQuickInteractiveAreaItemType liveLiteQuic = LiveLiteQuickInteractiveAreaItemType.class;
       if (PatchProxy.isSupport(liveLiteQuic)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, liveLiteQuic, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LiveLiteQuickInteractiveAreaItemType.Companion.a(p0);
    }
    public static LiveLiteQuickInteractiveAreaItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteQuickInteractiveAreaItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteQuickInteractiveAreaItemType.class, p0);
    }
    public static LiveLiteQuickInteractiveAreaItemType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteQuickInteractiveAreaItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteQuickInteractiveAreaItemType.$VALUES.clone();
    }
}
