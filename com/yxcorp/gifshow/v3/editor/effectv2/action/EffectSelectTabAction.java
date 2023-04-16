package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectSelectTabAction;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class EffectSelectTabAction extends b	// class@000f3c
{
    public final EffectGroupType effectType;

    public void EffectSelectTabAction(EffectGroupType p0){
       a.p(p0, "effectType");
       super();
       this.effectType = p0;
    }
    public final EffectGroupType getEffectType(){
       return this.effectType;
    }
}
