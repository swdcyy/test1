package com.yxcorp.gifshow.magic.data.repo.response.MagicTipColorConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MagicTipColorConfig	// class@001b99
{
    public final int backgroundAlpha;
    public final String entranceTipBackgroundEndColor;
    public final String entranceTipBackgroundStartColor;
    public final String entranceTipMsgColor;

    public void MagicTipColorConfig(){
       a.p("", "entranceTipMsgColor");
       a.p("", "entranceTipBackgroundStartColor");
       a.p("", "entranceTipBackgroundEndColor");
       super();
       this.entranceTipMsgColor = "";
       this.entranceTipBackgroundStartColor = "";
       this.entranceTipBackgroundEndColor = "";
       this.backgroundAlpha = 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicTipColorConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MagicTipColorConfig && (a.g(this.entranceTipMsgColor, p0.entranceTipMsgColor) && (a.g(this.entranceTipBackgroundStartColor, p0.entranceTipBackgroundStartColor) && (a.g(this.entranceTipBackgroundEndColor, p0.entranceTipBackgroundEndColor) && this.backgroundAlpha == p0.backgroundAlpha))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MagicTipColorConfig obj = PatchProxy.apply(null, this, MagicTipColorConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.entranceTipMsgColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MagicTipColorConfig tentranceTip = this.entranceTipBackgroundStartColor;
       int i2 = (tentranceTip != null)? tentranceTip.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tentranceTip = this.entranceTipBackgroundEndColor;
       if (tentranceTip != null) {
          i = tentranceTip.hashCode();
       }
       return (((i1 + i) * 31) + this.backgroundAlpha);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicTipColorConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicTipColorConfig\(entranceTipMsgColor="+this.entranceTipMsgColor+", entranceTipBackgroundStartColor="+this.entranceTipBackgroundStartColor+", entranceTipBackgroundEndColor="+this.entranceTipBackgroundEndColor+", backgroundAlpha="+this.backgroundAlpha+"\)";
    }
}
