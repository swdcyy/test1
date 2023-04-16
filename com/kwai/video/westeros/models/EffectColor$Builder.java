package com.kwai.video.westeros.models.EffectColor$Builder;
import com.kwai.video.westeros.models.EffectColorOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.EffectColor;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.EffectColor$1;

public final class EffectColor$Builder extends GeneratedMessageLite$Builder implements EffectColorOrBuilder	// class@000eff
{

    public void EffectColor$Builder(){
       super(EffectColor.DEFAULT_INSTANCE);
    }
    public void EffectColor$Builder(EffectColor$1 p0){
       super();
    }
    public EffectColor$Builder clearA(){
       this.copyOnWrite();
       this.instance.clearA();
       return this;
    }
    public EffectColor$Builder clearB(){
       this.copyOnWrite();
       this.instance.clearB();
       return this;
    }
    public EffectColor$Builder clearG(){
       this.copyOnWrite();
       this.instance.clearG();
       return this;
    }
    public EffectColor$Builder clearR(){
       this.copyOnWrite();
       this.instance.clearR();
       return this;
    }
    public float getA(){
       return this.instance.getA();
    }
    public float getB(){
       return this.instance.getB();
    }
    public float getG(){
       return this.instance.getG();
    }
    public float getR(){
       return this.instance.getR();
    }
    public EffectColor$Builder setA(float p0){
       this.copyOnWrite();
       this.instance.setA(p0);
       return this;
    }
    public EffectColor$Builder setB(float p0){
       this.copyOnWrite();
       this.instance.setB(p0);
       return this;
    }
    public EffectColor$Builder setG(float p0){
       this.copyOnWrite();
       this.instance.setG(p0);
       return this;
    }
    public EffectColor$Builder setR(float p0){
       this.copyOnWrite();
       this.instance.setR(p0);
       return this;
    }
}
