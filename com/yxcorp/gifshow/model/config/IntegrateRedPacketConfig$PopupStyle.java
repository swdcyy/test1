package com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupStyle;
import java.lang.Enum;
import com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupStyle$Old56Yuan;
import java.lang.String;
import com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupStyle$IntegrateA;
import com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupStyle$IntegrateB;
import com.yxcorp.gifshow.model.config.IntegrateRedPacketConfig$PopupStyle$IntegrateC;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class IntegrateRedPacketConfig$PopupStyle extends Enum	// class@001ed3
{
    public static final IntegrateRedPacketConfig$PopupStyle[] $VALUES;
    public static final IntegrateRedPacketConfig$PopupStyle IntegrateA;
    public static final IntegrateRedPacketConfig$PopupStyle IntegrateB;
    public static final IntegrateRedPacketConfig$PopupStyle IntegrateC;
    public static final IntegrateRedPacketConfig$PopupStyle Old56Yuan;

    static {
       IntegrateRedPacketConfig$PopupStyle$Old56Yuan popupStyle$O;
       IntegrateRedPacketConfig$PopupStyle$IntegrateA popupStyle$I;
       IntegrateRedPacketConfig$PopupStyle$IntegrateB popupStyle$I1;
       IntegrateRedPacketConfig$PopupStyle$IntegrateC popupStyle$I2;
       IntegrateRedPacketConfig$PopupStyle[] popupStyleAr = new IntegrateRedPacketConfig$PopupStyle[]{popupStyle$O,popupStyle$I,popupStyle$I1,popupStyle$I2};
       popupStyle$O = new IntegrateRedPacketConfig$PopupStyle$Old56Yuan("Old56Yuan", 0);
       IntegrateRedPacketConfig$PopupStyle.Old56Yuan = popupStyle$O;
       popupStyle$I = new IntegrateRedPacketConfig$PopupStyle$IntegrateA("IntegrateA", 1);
       IntegrateRedPacketConfig$PopupStyle.IntegrateA = popupStyle$I;
       popupStyle$I1 = new IntegrateRedPacketConfig$PopupStyle$IntegrateB("IntegrateB", 2);
       IntegrateRedPacketConfig$PopupStyle.IntegrateB = popupStyle$I1;
       popupStyle$I2 = new IntegrateRedPacketConfig$PopupStyle$IntegrateC("IntegrateC", 3);
       IntegrateRedPacketConfig$PopupStyle.IntegrateC = popupStyle$I2;
       IntegrateRedPacketConfig$PopupStyle.$VALUES = popupStyleAr;
    }
    public void IntegrateRedPacketConfig$PopupStyle(String p0,int p1){
       super(p0, p1);
    }
    public void IntegrateRedPacketConfig$PopupStyle(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static IntegrateRedPacketConfig$PopupStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IntegrateRedPacketConfig$PopupStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IntegrateRedPacketConfig$PopupStyle.class, p0);
    }
    public static IntegrateRedPacketConfig$PopupStyle[] values(){
       Object obj = PatchProxy.apply(null, null, IntegrateRedPacketConfig$PopupStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntegrateRedPacketConfig$PopupStyle.$VALUES.clone();
    }
    public abstract int getValue();
}
