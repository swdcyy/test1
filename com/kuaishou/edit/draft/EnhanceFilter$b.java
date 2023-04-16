package com.kuaishou.edit.draft.EnhanceFilter$b;
import z30.d0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.EnhanceFilter;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.EnhanceFilter$a;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class EnhanceFilter$b extends GeneratedMessageLite$Builder implements d0	// class@001789
{

    public void EnhanceFilter$b(){
       super(EnhanceFilter.DEFAULT_INSTANCE);
    }
    public void EnhanceFilter$b(EnhanceFilter$a p0){
       super(EnhanceFilter.DEFAULT_INSTANCE);
    }
    public EnhanceFilter$b a(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public int getDehazeFilterType(){
       return this.instance.getDehazeFilterType();
    }
    public boolean getEnableCorrection(){
       return this.instance.getEnableCorrection();
    }
    public FeatureId getFeatureId(){
       return this.instance.getFeatureId();
    }
    public int getGrayFilterType(){
       return this.instance.getGrayFilterType();
    }
    public String getResources(int p0){
       return this.instance.getResources(p0);
    }
    public ByteString getResourcesBytes(int p0){
       return this.instance.getResourcesBytes(p0);
    }
    public int getResourcesCount(){
       return this.instance.getResourcesCount();
    }
    public List getResourcesList(){
       return Collections.unmodifiableList(this.instance.getResourcesList());
    }
    public float getSigmaNoiseVariance(){
       return this.instance.getSigmaNoiseVariance();
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasFeatureId(){
       return this.instance.hasFeatureId();
    }
}
