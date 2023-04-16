package com.kuaishou.live.core.basic.model.LiveGiftPanelComboSendConfig;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftPanelComboSendConfig implements Serializable	// class@00086f
{
    public final Boolean disableComboSend;

    public void LiveGiftPanelComboSendConfig(Boolean p0){
       super();
       this.disableComboSend = p0;
    }
    public static LiveGiftPanelComboSendConfig copy$default(LiveGiftPanelComboSendConfig p0,Boolean p1,int p2,Object p3){
       LiveGiftPanelComboSendConfig disableCombo;
       if (p2 & 0x01) {
          disableCombo = p0.disableComboSend;
       }
       return p0.copy(disableCombo);
    }
    public final Boolean component1(){
       return this.disableComboSend;
    }
    public final LiveGiftPanelComboSendConfig copy(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftPanelComboSendConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftPanelComboSendConfig(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftPanelComboSendConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveGiftPanelComboSendConfig && a.g(this.disableComboSend, p0.disableComboSend))) {
          return true;
       }
       return false;
    }
    public final Boolean getDisableComboSend(){
       return this.disableComboSend;
    }
    public int hashCode(){
       LiveGiftPanelComboSendConfig obj = PatchProxy.apply(null, this, LiveGiftPanelComboSendConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.disableComboSend;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftPanelComboSendConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftPanelComboSendConfig\(disableComboSend="+this.disableComboSend+"\)";
    }
}
