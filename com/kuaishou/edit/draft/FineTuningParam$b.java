package com.kuaishou.edit.draft.FineTuningParam$b;
import z30.h0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FineTuningParam;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FineTuningParam$a;

public final class FineTuningParam$b extends GeneratedMessageLite$Builder implements h0	// class@0017a4
{

    public void FineTuningParam$b(){
       super(FineTuningParam.DEFAULT_INSTANCE);
    }
    public void FineTuningParam$b(FineTuningParam$a p0){
       super(FineTuningParam.DEFAULT_INSTANCE);
    }
    public FineTuningParam$b a(float p0){
       this.copyOnWrite();
       this.instance.setBrightness(p0);
       return this;
    }
    public FineTuningParam$b b(float p0){
       this.copyOnWrite();
       this.instance.setClarity(p0);
       return this;
    }
    public FineTuningParam$b c(float p0){
       this.copyOnWrite();
       this.instance.setColorTemperature(p0);
       return this;
    }
    public FineTuningParam$b d(float p0){
       this.copyOnWrite();
       this.instance.setContrast(p0);
       return this;
    }
    public FineTuningParam$b e(float p0){
       this.copyOnWrite();
       this.instance.setSaturation(p0);
       return this;
    }
    public FineTuningParam$b f(float p0){
       this.copyOnWrite();
       this.instance.setSharpen(p0);
       return this;
    }
    public float getBrightness(){
       return this.instance.getBrightness();
    }
    public float getClarity(){
       return this.instance.getClarity();
    }
    public float getColorTemperature(){
       return this.instance.getColorTemperature();
    }
    public float getContrast(){
       return this.instance.getContrast();
    }
    public float getSaturation(){
       return this.instance.getSaturation();
    }
    public float getSharpen(){
       return this.instance.getSharpen();
    }
}
