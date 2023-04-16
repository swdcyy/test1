package com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BizEndReason extends Enum	// class@0017e2
{
    public static final BizEndReason[] $VALUES;
    public static final BizEndReason Other;
    public static final BizEndReason PageOut;

    static {
       BizEndReason uBizEndReaso1;
       BizEndReason[] uBizEndReaso = new BizEndReason[]{uBizEndReaso1,uBizEndReaso1};
       uBizEndReaso1 = new BizEndReason("PageOut", 0);
       BizEndReason.PageOut = uBizEndReaso1;
       uBizEndReaso1 = new BizEndReason("Other", 1);
       BizEndReason.Other = uBizEndReaso1;
       BizEndReason.$VALUES = uBizEndReaso;
    }
    public void BizEndReason(String p0,int p1){
       super(p0, p1);
    }
    public static BizEndReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BizEndReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BizEndReason.class, p0);
    }
    public static BizEndReason[] values(){
       Object obj = PatchProxy.apply(null, null, BizEndReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BizEndReason.$VALUES.clone();
    }
}
