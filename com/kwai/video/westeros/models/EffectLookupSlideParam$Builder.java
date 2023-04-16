package com.kwai.video.westeros.models.EffectLookupSlideParam$Builder;
import com.kwai.video.westeros.models.EffectLookupSlideParamOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.EffectLookupSlideParam;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.EffectLookupSlideParam$1;

public final class EffectLookupSlideParam$Builder extends GeneratedMessageLite$Builder implements EffectLookupSlideParamOrBuilder	// class@000f2e
{

    public void EffectLookupSlideParam$Builder(){
       super(EffectLookupSlideParam.DEFAULT_INSTANCE);
    }
    public void EffectLookupSlideParam$Builder(EffectLookupSlideParam$1 p0){
       super();
    }
    public EffectLookupSlideParam$Builder clearEndWithNewEffect(){
       this.copyOnWrite();
       this.instance.clearEndWithNewEffect();
       return this;
    }
    public EffectLookupSlideParam$Builder clearNewEffectDisplayLeft(){
       this.copyOnWrite();
       this.instance.clearNewEffectDisplayLeft();
       return this;
    }
    public EffectLookupSlideParam$Builder clearNewEffectDisplayRight(){
       this.copyOnWrite();
       this.instance.clearNewEffectDisplayRight();
       return this;
    }
    public boolean getEndWithNewEffect(){
       return this.instance.getEndWithNewEffect();
    }
    public float getNewEffectDisplayLeft(){
       return this.instance.getNewEffectDisplayLeft();
    }
    public float getNewEffectDisplayRight(){
       return this.instance.getNewEffectDisplayRight();
    }
    public EffectLookupSlideParam$Builder setEndWithNewEffect(boolean p0){
       this.copyOnWrite();
       this.instance.setEndWithNewEffect(p0);
       return this;
    }
    public EffectLookupSlideParam$Builder setNewEffectDisplayLeft(float p0){
       this.copyOnWrite();
       this.instance.setNewEffectDisplayLeft(p0);
       return this;
    }
    public EffectLookupSlideParam$Builder setNewEffectDisplayRight(float p0){
       this.copyOnWrite();
       this.instance.setNewEffectDisplayRight(p0);
       return this;
    }
}
