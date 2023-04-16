package com.kuaishou.edit.draft.EnhanceColorFilter$b;
import z30.b0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.EnhanceColorFilter;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.EnhanceColorFilter$a;
import java.lang.String;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class EnhanceColorFilter$b extends GeneratedMessageLite$Builder implements b0	// class@001783
{

    public void EnhanceColorFilter$b(){
       super(EnhanceColorFilter.DEFAULT_INSTANCE);
    }
    public void EnhanceColorFilter$b(EnhanceColorFilter$a p0){
       super(EnhanceColorFilter.DEFAULT_INSTANCE);
    }
    public EnhanceColorFilter$b a(String p0){
       this.copyOnWrite();
       this.instance.addResources(p0);
       return this;
    }
    public EnhanceColorFilter$b b(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public FeatureId getFeatureId(){
       return this.instance.getFeatureId();
    }
    public double getIntensity(){
       return this.instance.getIntensity();
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
    public int getSdkType(){
       return this.instance.getSdkType();
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasFeatureId(){
       return this.instance.hasFeatureId();
    }
}
