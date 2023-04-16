package com.kuaishou.edit.draft.ColorFilter$b;
import com.kuaishou.edit.draft.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.ColorFilter;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.ColorFilter$a;
import java.lang.String;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.EffectSource;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.ColorFilter$ResourceType;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class ColorFilter$b extends GeneratedMessageLite$Builder implements f	// class@001752
{

    public void ColorFilter$b(){
       super(ColorFilter.DEFAULT_INSTANCE);
    }
    public void ColorFilter$b(ColorFilter$a p0){
       super(ColorFilter.DEFAULT_INSTANCE);
    }
    public ColorFilter$b a(String p0){
       this.copyOnWrite();
       this.instance.addResources(p0);
       return this;
    }
    public ColorFilter$b b(){
       this.copyOnWrite();
       this.instance.clearResources();
       return this;
    }
    public ColorFilter$b c(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public ColorFilter$b d(FeatureId$b p0){
       this.copyOnWrite();
       this.instance.setFeatureId(p0);
       return this;
    }
    public ColorFilter$b e(double p0){
       this.copyOnWrite();
       this.instance.setIntensity(p0);
       return this;
    }
    public ColorFilter$b f(boolean p0){
       this.copyOnWrite();
       this.instance.setIsReco(p0);
       return this;
    }
    public ColorFilter$b g(int p0){
       this.copyOnWrite();
       this.instance.setResourceTypeValue(p0);
       return this;
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
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
    public double getIntensity(){
       return this.instance.getIntensity();
    }
    public boolean getIsCommonlyUsed(){
       return this.instance.getIsCommonlyUsed();
    }
    public boolean getIsReco(){
       return this.instance.getIsReco();
    }
    public ColorFilter$ResourceType getResourceType(){
       return this.instance.getResourceType();
    }
    public int getResourceTypeValue(){
       return this.instance.getResourceTypeValue();
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
    public int getTabId(){
       return this.instance.getTabId();
    }
    public String getTabName(){
       return this.instance.getTabName();
    }
    public ByteString getTabNameBytes(){
       return this.instance.getTabNameBytes();
    }
    public ColorFilter$b h(int p0){
       this.copyOnWrite();
       this.instance.setSdkType(p0);
       return this;
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasFeatureId(){
       return this.instance.hasFeatureId();
    }
}
