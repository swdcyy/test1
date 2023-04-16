package com.kwai.video.westeros.models.AdjustIntensityConfig$Builder;
import com.kwai.video.westeros.models.AdjustIntensityConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.AdjustIntensityConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.AdjustIntensityConfig$1;
import java.lang.Iterable;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class AdjustIntensityConfig$Builder extends GeneratedMessageLite$Builder implements AdjustIntensityConfigOrBuilder	// class@000e98
{

    public void AdjustIntensityConfig$Builder(){
       super(AdjustIntensityConfig.DEFAULT_INSTANCE);
    }
    public void AdjustIntensityConfig$Builder(AdjustIntensityConfig$1 p0){
       super();
    }
    public AdjustIntensityConfig$Builder addAllEffectTypes(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllEffectTypes(p0);
       return this;
    }
    public AdjustIntensityConfig$Builder addEffectTypes(String p0){
       this.copyOnWrite();
       this.instance.addEffectTypes(p0);
       return this;
    }
    public AdjustIntensityConfig$Builder addEffectTypesBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addEffectTypesBytes(p0);
       return this;
    }
    public AdjustIntensityConfig$Builder clearDefaultIntensity(){
       this.copyOnWrite();
       this.instance.clearDefaultIntensity();
       return this;
    }
    public AdjustIntensityConfig$Builder clearDefaultLookupIntensity(){
       this.copyOnWrite();
       this.instance.clearDefaultLookupIntensity();
       return this;
    }
    public AdjustIntensityConfig$Builder clearDefaultMaleMakeupIntenistyEnabled(){
       this.copyOnWrite();
       this.instance.clearDefaultMaleMakeupIntenistyEnabled();
       return this;
    }
    public AdjustIntensityConfig$Builder clearDefaultMaleMakeupIntensity(){
       this.copyOnWrite();
       this.instance.clearDefaultMaleMakeupIntensity();
       return this;
    }
    public AdjustIntensityConfig$Builder clearEffectTypes(){
       this.copyOnWrite();
       this.instance.clearEffectTypes();
       return this;
    }
    public AdjustIntensityConfig$Builder clearEnabled(){
       this.copyOnWrite();
       this.instance.clearEnabled();
       return this;
    }
    public float getDefaultIntensity(){
       return this.instance.getDefaultIntensity();
    }
    public float getDefaultLookupIntensity(){
       return this.instance.getDefaultLookupIntensity();
    }
    public boolean getDefaultMaleMakeupIntenistyEnabled(){
       return this.instance.getDefaultMaleMakeupIntenistyEnabled();
    }
    public float getDefaultMaleMakeupIntensity(){
       return this.instance.getDefaultMaleMakeupIntensity();
    }
    public String getEffectTypes(int p0){
       return this.instance.getEffectTypes(p0);
    }
    public ByteString getEffectTypesBytes(int p0){
       return this.instance.getEffectTypesBytes(p0);
    }
    public int getEffectTypesCount(){
       return this.instance.getEffectTypesCount();
    }
    public List getEffectTypesList(){
       return Collections.unmodifiableList(this.instance.getEffectTypesList());
    }
    public boolean getEnabled(){
       return this.instance.getEnabled();
    }
    public AdjustIntensityConfig$Builder setDefaultIntensity(float p0){
       this.copyOnWrite();
       this.instance.setDefaultIntensity(p0);
       return this;
    }
    public AdjustIntensityConfig$Builder setDefaultLookupIntensity(float p0){
       this.copyOnWrite();
       this.instance.setDefaultLookupIntensity(p0);
       return this;
    }
    public AdjustIntensityConfig$Builder setDefaultMaleMakeupIntenistyEnabled(boolean p0){
       this.copyOnWrite();
       this.instance.setDefaultMaleMakeupIntenistyEnabled(p0);
       return this;
    }
    public AdjustIntensityConfig$Builder setDefaultMaleMakeupIntensity(float p0){
       this.copyOnWrite();
       this.instance.setDefaultMaleMakeupIntensity(p0);
       return this;
    }
    public AdjustIntensityConfig$Builder setEffectTypes(int p0,String p1){
       this.copyOnWrite();
       this.instance.setEffectTypes(p0, p1);
       return this;
    }
    public AdjustIntensityConfig$Builder setEnabled(boolean p0){
       this.copyOnWrite();
       this.instance.setEnabled(p0);
       return this;
    }
}
