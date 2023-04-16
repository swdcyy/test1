package com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupBizType;
import java.lang.Enum;
import com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupBizType$Old56Yuan;
import java.lang.String;
import com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupBizType$Integrate;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class IntegrateRedPacketConfig$PopupBizType extends Enum	// class@001ece
{
    public static final IntegrateRedPacketConfig$PopupBizType[] $VALUES;
    public static final IntegrateRedPacketConfig$PopupBizType Integrate;
    public static final IntegrateRedPacketConfig$PopupBizType Old56Yuan;

    static {
       IntegrateRedPacketConfig$PopupBizType$Old56Yuan popupBizType1;
       IntegrateRedPacketConfig$PopupBizType$Integrate popupBizType2;
       IntegrateRedPacketConfig$PopupBizType[] popupBizType = new IntegrateRedPacketConfig$PopupBizType[]{popupBizType1,popupBizType2};
       popupBizType1 = new IntegrateRedPacketConfig$PopupBizType$Old56Yuan("Old56Yuan", 0);
       IntegrateRedPacketConfig$PopupBizType.Old56Yuan = popupBizType1;
       popupBizType2 = new IntegrateRedPacketConfig$PopupBizType$Integrate("Integrate", 1);
       IntegrateRedPacketConfig$PopupBizType.Integrate = popupBizType2;
       IntegrateRedPacketConfig$PopupBizType.$VALUES = popupBizType;
    }
    public void IntegrateRedPacketConfig$PopupBizType(String p0,int p1){
       super(p0, p1);
    }
    public void IntegrateRedPacketConfig$PopupBizType(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static IntegrateRedPacketConfig$PopupBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IntegrateRedPacketConfig$PopupBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IntegrateRedPacketConfig$PopupBizType.class, p0);
    }
    public static IntegrateRedPacketConfig$PopupBizType[] values(){
       Object obj = PatchProxy.apply(null, null, IntegrateRedPacketConfig$PopupBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntegrateRedPacketConfig$PopupBizType.$VALUES.clone();
    }
    public abstract int getSource();
    public abstract int getValue();
}
