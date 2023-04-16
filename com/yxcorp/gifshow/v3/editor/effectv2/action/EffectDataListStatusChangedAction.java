package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectDataListStatusChangedAction;
import xvc.b;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class EffectDataListStatusChangedAction extends b	// class@000f26
{
    public final List dataList;
    public final EffectGroupType type;

    public void EffectDataListStatusChangedAction(List p0,EffectGroupType p1){
       a.p(p0, "dataList");
       a.p(p1, "type");
       super();
       this.dataList = p0;
       this.type = p1;
    }
    public final List getDataList(){
       return this.dataList;
    }
    public final EffectGroupType getType(){
       return this.type;
    }
}
