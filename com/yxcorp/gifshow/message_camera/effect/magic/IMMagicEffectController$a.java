package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.westeros.models.EffectErrorCode;
import com.kwai.video.westeros.models.LookupConfig;

public final class IMMagicEffectController$a	// class@001d89
{

    public void IMMagicEffectController$a(){
       super();
    }
    public void IMMagicEffectController$a(u p0){
       super();
    }
    public final String a(String p0,EffectDescription p1,EffectSlot p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IMMagicEffectController$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       char c = '[';
       if (p1 == null) {
          return c+p0+"] description is null";
       }
       return c+p0+"] trackId "+p1.getTrackId()+' '+"effectSlot "+p2+' '+"renderCodeReason "+p1.getRenderCodeReason()+' '+"renderCode "+p1.getRenderCode()+' '+"disableCustomColorFilter "+p1.getDisableCustomColorFilter()+' '+"disableCustomBeautify "+p1.getDisableCustomBeautify()+' '+"disableCustomMakeup "+p1.getDisableCustomMakeup()+' '+"getGiftDisplayTime "+p1.getGiftDisplayTime()+' '+"lookupConfig "+p1.getLookupConfig();
    }
}
