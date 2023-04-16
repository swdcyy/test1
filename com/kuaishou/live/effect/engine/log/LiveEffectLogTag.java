package com.kuaishou.live.effect.engine.log.LiveEffectLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveEffectLogTag extends Enum implements c	// class@001b00
{
    public final String _name;
    public static final LiveEffectLogTag[] $VALUES;
    public static final LiveEffectLogTag LIVE_EFFECT;
    public static final LiveEffectLogTag LIVE_EFFECT_DOWNLOAD;
    public static final LiveEffectLogTag LIVE_EFFECT_ENGINE;
    public static final LiveEffectLogTag LIVE_EFFECT_RESOURCE;

    static {
       LiveEffectLogTag liveEffectLo1;
       LiveEffectLogTag[] liveEffectLo = new LiveEffectLogTag[]{liveEffectLo1,liveEffectLo1,liveEffectLo1,liveEffectLo1};
       liveEffectLo1 = new LiveEffectLogTag("LIVE_EFFECT", 0, "LiveEffect");
       LiveEffectLogTag.LIVE_EFFECT = liveEffectLo1;
       liveEffectLo1 = new LiveEffectLogTag("LIVE_EFFECT_ENGINE", 1, "LiveEffectEngine");
       LiveEffectLogTag.LIVE_EFFECT_ENGINE = liveEffectLo1;
       liveEffectLo1 = new LiveEffectLogTag("LIVE_EFFECT_RESOURCE", 2, "LiveEffectResource");
       LiveEffectLogTag.LIVE_EFFECT_RESOURCE = liveEffectLo1;
       liveEffectLo1 = new LiveEffectLogTag("LIVE_EFFECT_DOWNLOAD", 3, "LiveEffectDownload");
       LiveEffectLogTag.LIVE_EFFECT_DOWNLOAD = liveEffectLo1;
       LiveEffectLogTag.$VALUES = liveEffectLo;
    }
    public void LiveEffectLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this._name = p2;
    }
    public static LiveEffectLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveEffectLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveEffectLogTag.class, p0);
    }
    public static LiveEffectLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveEffectLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveEffectLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this._name;
    }
    public final String get_name(){
       return this._name;
    }
}
