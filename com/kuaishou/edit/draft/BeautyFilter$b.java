package com.kuaishou.edit.draft.BeautyFilter$b;
import z30.l;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.BeautyFilter;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.BeautyFilter$a;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.EffectSource;
import com.kuaishou.edit.draft.FeatureId;

public final class BeautyFilter$b extends GeneratedMessageLite$Builder implements l	// class@00173a
{

    public void BeautyFilter$b(){
       super(BeautyFilter.DEFAULT_INSTANCE);
    }
    public void BeautyFilter$b(BeautyFilter$a p0){
       super(BeautyFilter.DEFAULT_INSTANCE);
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public double getBright(){
       return this.instance.getBright();
    }
    public EffectSource getEffectSource(){
       return this.instance.getEffectSource();
    }
    public int getEffectSourceValue(){
       return this.instance.getEffectSourceValue();
    }
    public FeatureId getFeatureId(){
       return this.instance.getFeatureId();
    }
    public double getSoft(){
       return this.instance.getSoft();
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasFeatureId(){
       return this.instance.hasFeatureId();
    }
}
