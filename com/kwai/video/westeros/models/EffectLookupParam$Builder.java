package com.kwai.video.westeros.models.EffectLookupParam$Builder;
import com.kwai.video.westeros.models.EffectLookupParamOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.EffectLookupParam;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.EffectLookupParam$1;
import com.kwai.video.westeros.models.EffectResource;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.EffectLookupResType;
import com.kwai.video.westeros.models.EffectResource$Builder;

public final class EffectLookupParam$Builder extends GeneratedMessageLite$Builder implements EffectLookupParamOrBuilder	// class@000f27
{

    public void EffectLookupParam$Builder(){
       super(EffectLookupParam.DEFAULT_INSTANCE);
    }
    public void EffectLookupParam$Builder(EffectLookupParam$1 p0){
       super();
    }
    public EffectLookupParam$Builder clearDimension(){
       this.copyOnWrite();
       this.instance.clearDimension();
       return this;
    }
    public EffectLookupParam$Builder clearEffectRes(){
       this.copyOnWrite();
       this.instance.clearEffectRes();
       return this;
    }
    public EffectLookupParam$Builder clearIntensity(){
       this.copyOnWrite();
       this.instance.clearIntensity();
       return this;
    }
    public EffectLookupParam$Builder clearPath(){
       this.copyOnWrite();
       this.instance.clearPath();
       return this;
    }
    public EffectLookupParam$Builder clearResType(){
       this.copyOnWrite();
       this.instance.clearResType();
       return this;
    }
    public EffectLookupParam$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public int getDimension(){
       return this.instance.getDimension();
    }
    public EffectResource getEffectRes(){
       return this.instance.getEffectRes();
    }
    public float getIntensity(){
       return this.instance.getIntensity();
    }
    public String getPath(){
       return this.instance.getPath();
    }
    public ByteString getPathBytes(){
       return this.instance.getPathBytes();
    }
    public EffectLookupResType getResType(){
       return this.instance.getResType();
    }
    public int getResTypeValue(){
       return this.instance.getResTypeValue();
    }
    public int getType(){
       return this.instance.getType();
    }
    public boolean hasEffectRes(){
       return this.instance.hasEffectRes();
    }
    public EffectLookupParam$Builder mergeEffectRes(EffectResource p0){
       this.copyOnWrite();
       this.instance.mergeEffectRes(p0);
       return this;
    }
    public EffectLookupParam$Builder setDimension(int p0){
       this.copyOnWrite();
       this.instance.setDimension(p0);
       return this;
    }
    public EffectLookupParam$Builder setEffectRes(EffectResource$Builder p0){
       this.copyOnWrite();
       this.instance.setEffectRes(p0);
       return this;
    }
    public EffectLookupParam$Builder setEffectRes(EffectResource p0){
       this.copyOnWrite();
       this.instance.setEffectRes(p0);
       return this;
    }
    public EffectLookupParam$Builder setIntensity(float p0){
       this.copyOnWrite();
       this.instance.setIntensity(p0);
       return this;
    }
    public EffectLookupParam$Builder setPath(String p0){
       this.copyOnWrite();
       this.instance.setPath(p0);
       return this;
    }
    public EffectLookupParam$Builder setPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPathBytes(p0);
       return this;
    }
    public EffectLookupParam$Builder setResType(EffectLookupResType p0){
       this.copyOnWrite();
       this.instance.setResType(p0);
       return this;
    }
    public EffectLookupParam$Builder setResTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setResTypeValue(p0);
       return this;
    }
    public EffectLookupParam$Builder setType(int p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
}
