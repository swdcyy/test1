package com.kuaishou.edit.draft.EditBeauty$b;
import z30.x;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.EditBeauty;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.EditBeauty$a;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.DeformParam;
import java.util.List;
import java.util.Collections;
import com.kuaishou.edit.draft.FeatureId;

public final class EditBeauty$b extends GeneratedMessageLite$Builder implements x	// class@001774
{

    public void EditBeauty$b(){
       super(EditBeauty.DEFAULT_INSTANCE);
    }
    public void EditBeauty$b(EditBeauty$a p0){
       super(EditBeauty.DEFAULT_INSTANCE);
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public float getBeautifyLipsIntensity(){
       return this.instance.getBeautifyLipsIntensity();
    }
    public float getBrightIntensity(){
       return this.instance.getBrightIntensity();
    }
    public DeformParam getDeformParams(int p0){
       return this.instance.getDeformParams(p0);
    }
    public int getDeformParamsCount(){
       return this.instance.getDeformParamsCount();
    }
    public List getDeformParamsList(){
       return Collections.unmodifiableList(this.instance.getDeformParamsList());
    }
    public float getEyeBagRemoveIntensity(){
       return this.instance.getEyeBagRemoveIntensity();
    }
    public float getEyeBrightenIntensity(){
       return this.instance.getEyeBrightenIntensity();
    }
    public FeatureId getFeatureId(){
       return this.instance.getFeatureId();
    }
    public float getNoseShadowIntensity(){
       return this.instance.getNoseShadowIntensity();
    }
    public float getSoftenIntensity(){
       return this.instance.getSoftenIntensity();
    }
    public float getTeethBrightenIntensity(){
       return this.instance.getTeethBrightenIntensity();
    }
    public float getWrinkleRemoveIntensity(){
       return this.instance.getWrinkleRemoveIntensity();
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasFeatureId(){
       return this.instance.hasFeatureId();
    }
}
