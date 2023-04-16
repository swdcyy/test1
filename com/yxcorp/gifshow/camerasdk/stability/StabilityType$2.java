package com.yxcorp.gifshow.camerasdk.stability.StabilityType$2;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.s6;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;

public final class StabilityType$2 extends StabilityType	// class@001048
{

    public void StabilityType$2(String p0,int p1){
       super(p0, p1, null);
    }
    public int getClickToastResId(){
       return 0x7f104ee3;
    }
    public int getLabelImageResId(){
       Object obj = PatchProxy.apply(null, this, StabilityType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (s6.m())? 0x7f081bea: 0x7f081bdc;
       return i;
    }
    public String getStrForLog(){
       return "off";
    }
    public boolean isValidWithConfig(CameraUnitConfig p0){
       return true;
    }
    public StabilityType move(){
       return StabilityType.SUPER;
    }
}
