package com.kuaishou.live.liteend.framework.LiteEndLayoutViewType;
import vb3.p;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiteEndLayoutViewType extends Enum implements p	// class@000bc5
{
    public static final LiteEndLayoutViewType[] $VALUES;
    public static final LiteEndLayoutViewType Background;
    public static final LiteEndLayoutViewType BaseInfo;

    static {
       LiteEndLayoutViewType liteEndLayou1;
       LiteEndLayoutViewType[] liteEndLayou = new LiteEndLayoutViewType[]{liteEndLayou1,liteEndLayou1};
       liteEndLayou1 = new LiteEndLayoutViewType("Background", 0);
       LiteEndLayoutViewType.Background = liteEndLayou1;
       liteEndLayou1 = new LiteEndLayoutViewType("BaseInfo", 1);
       LiteEndLayoutViewType.BaseInfo = liteEndLayou1;
       LiteEndLayoutViewType.$VALUES = liteEndLayou;
    }
    public void LiteEndLayoutViewType(String p0,int p1){
       super(p0, p1);
    }
    public static LiteEndLayoutViewType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiteEndLayoutViewType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiteEndLayoutViewType.class, p0);
    }
    public static LiteEndLayoutViewType[] values(){
       Object obj = PatchProxy.apply(null, null, LiteEndLayoutViewType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiteEndLayoutViewType.$VALUES.clone();
    }
}
