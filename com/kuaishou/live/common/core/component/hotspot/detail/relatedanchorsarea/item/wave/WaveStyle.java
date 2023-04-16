package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WaveStyle extends Enum	// class@00140f
{
    public static final WaveStyle[] $VALUES;
    public static final WaveStyle RING_FIX_WAVE_DIFFUSE;
    public static final WaveStyle RING_SCALING_WAVE_DIFFUSE;
    public static final WaveStyle RING_SCALING_WAVE_SCALING;

    static {
       WaveStyle waveStyle;
       WaveStyle[] waveStyleArr = new WaveStyle[]{waveStyle,waveStyle,waveStyle};
       waveStyle = new WaveStyle("RING_FIX_WAVE_DIFFUSE", 0);
       WaveStyle.RING_FIX_WAVE_DIFFUSE = waveStyle;
       waveStyle = new WaveStyle("RING_SCALING_WAVE_DIFFUSE", 1);
       WaveStyle.RING_SCALING_WAVE_DIFFUSE = waveStyle;
       waveStyle = new WaveStyle("RING_SCALING_WAVE_SCALING", 2);
       WaveStyle.RING_SCALING_WAVE_SCALING = waveStyle;
       WaveStyle.$VALUES = waveStyleArr;
    }
    public void WaveStyle(String p0,int p1){
       super(p0, p1);
    }
    public static WaveStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WaveStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WaveStyle.class, p0);
    }
    public static WaveStyle[] values(){
       Object obj = PatchProxy.apply(null, null, WaveStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WaveStyle.$VALUES.clone();
    }
}
