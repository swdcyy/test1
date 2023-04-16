package com.kuaishou.merchant.basic.MerchantWebViewEvent$EventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantWebViewEvent$EventType extends Enum	// class@00159b
{
    public static final MerchantWebViewEvent$EventType[] $VALUES;
    public static final MerchantWebViewEvent$EventType Enter;
    public static final MerchantWebViewEvent$EventType Leave;

    static {
       MerchantWebViewEvent$EventType uEventType = new MerchantWebViewEvent$EventType("Enter", 0);
       MerchantWebViewEvent$EventType.Enter = uEventType;
       MerchantWebViewEvent$EventType uEventType1 = new MerchantWebViewEvent$EventType("Leave", 1);
       MerchantWebViewEvent$EventType.Leave = uEventType1;
       MerchantWebViewEvent$EventType[] uEventTypeAr = new MerchantWebViewEvent$EventType[]{uEventType,uEventType1};
       MerchantWebViewEvent$EventType.$VALUES = uEventTypeAr;
    }
    public void MerchantWebViewEvent$EventType(String p0,int p1){
       super(p0, p1);
    }
    public static MerchantWebViewEvent$EventType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantWebViewEvent$EventType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantWebViewEvent$EventType.class, p0);
    }
    public static MerchantWebViewEvent$EventType[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantWebViewEvent$EventType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantWebViewEvent$EventType.$VALUES.clone();
    }
}
