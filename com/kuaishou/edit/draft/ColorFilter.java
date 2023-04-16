package com.kuaishou.edit.draft.ColorFilter;
import com.kuaishou.edit.draft.f;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.ColorFilter$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.ColorFilter$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.EffectSource;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.ColorFilter$ResourceType;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.FeatureId$b;

public final class ColorFilter extends GeneratedMessageLite implements f	// class@001753
{
    public Attributes attributes_;
    public int effectSource_;
    public FeatureId featureId_;
    public double intensity_;
    public boolean isCommonlyUsed_;
    public boolean isReco_;
    public int resourceType_;
    public Internal$ProtobufList resources_;
    public int sdkType_;
    public int tabId_;
    public String tabName_;
    public static final ColorFilter DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ColorFilter uColorFilter = new ColorFilter();
       ColorFilter.DEFAULT_INSTANCE = uColorFilter;
       GeneratedMessageLite.registerDefaultInstance(ColorFilter.class, uColorFilter);
    }
    public void ColorFilter(){
       super();
       this.resources_ = GeneratedMessageLite.emptyProtobufList();
       this.tabName_ = "";
    }
    public static ColorFilter getDefaultInstance(){
       return ColorFilter.DEFAULT_INSTANCE;
    }
    public static ColorFilter$b newBuilder(){
       return ColorFilter.DEFAULT_INSTANCE.createBuilder();
    }
    public static ColorFilter$b newBuilder(ColorFilter p0){
       return ColorFilter.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ColorFilter parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static ColorFilter parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static ColorFilter parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static ColorFilter parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static ColorFilter parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static ColorFilter parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static ColorFilter parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static ColorFilter parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static ColorFilter parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static ColorFilter parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static ColorFilter parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0);
    }
    public static ColorFilter parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ColorFilter.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ColorFilter.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllResources(Iterable p0){
       this.ensureResourcesIsMutable();
       AbstractMessageLite.addAll(p0, this.resources_);
    }
    public void addResources(String p0){
       Objects.requireNonNull(p0);
       this.ensureResourcesIsMutable();
       this.resources_.add(p0);
    }
    public void addResourcesBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureResourcesIsMutable();
       this.resources_.add(p0.toStringUtf8());
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearEffectSource(){
       this.effectSource_ = 0;
    }
    public void clearFeatureId(){
       this.featureId_ = null;
    }
    public void clearIntensity(){
       this.intensity_ = 0;
    }
    public void clearIsCommonlyUsed(){
       this.isCommonlyUsed_ = false;
    }
    public void clearIsReco(){
       this.isReco_ = false;
    }
    public void clearResourceType(){
       this.resourceType_ = 0;
    }
    public void clearResources(){
       this.resources_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearSdkType(){
       this.sdkType_ = 0;
    }
    public void clearTabId(){
       this.tabId_ = 0;
    }
    public void clearTabName(){
       this.tabName_ = ColorFilter.getDefaultInstance().getTabName();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ColorFilter$a.a[p0.ordinal()]){
           case 1:
             return new ColorFilter();
           case 2:
             return new ColorFilter$b(p2);
           case 3:
             Object[] objArray = new Object[11];
             objArray[0] = "featureId_";
             objArray[i] = "attributes_";
             objArray[2] = "sdkType_";
             objArray[3] = "intensity_";
             objArray[4] = "resources_";
             objArray[5] = "isCommonlyUsed_";
             objArray[6] = "tabId_";
             objArray[7] = "tabName_";
             objArray[8] = "resourceType_";
             objArray[9] = "isReco_";
             objArray[10] = "effectSource_";
             return GeneratedMessageLite.newMessageInfo(ColorFilter.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0b\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x0b\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\t\x02\t\x03\x0b\x04\xff\x02\xff\x02\x05\x02\x02\x06\x07\x07\x04\b\x02\x02\t\f\n\x07\x0b\f\x00", objArray);
           case 4:
             return ColorFilter.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ColorFilter.PARSER;
             if (pARSER == null) {
                _monitor_enter(ColorFilter.class);
                pARSER = ColorFilter.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ColorFilter.DEFAULT_INSTANCE);
                   ColorFilter.PARSER = pARSER;
                }
                _monitor_exit(ColorFilter.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureResourcesIsMutable(){
       if (!this.resources_.isModifiable()) {
          this.resources_ = GeneratedMessageLite.mutableCopy(this.resources_);
       }
       return;
    }
    public Attributes getAttributes(){
       ColorFilter tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public EffectSource getEffectSource(){
       EffectSource uEffectSourc = EffectSource.forNumber(this.effectSource_);
       if (uEffectSourc == null) {
          uEffectSourc = EffectSource.UNRECOGNIZED;
       }
       return uEffectSourc;
    }
    public int getEffectSourceValue(){
       return this.effectSource_;
    }
    public FeatureId getFeatureId(){
       ColorFilter tuColorFilte = this.featureId_;
       if (tuColorFilte == null) {
          tuColorFilte = FeatureId.getDefaultInstance();
       }
       return tuColorFilte;
    }
    public double getIntensity(){
       return this.intensity_;
    }
    public boolean getIsCommonlyUsed(){
       return this.isCommonlyUsed_;
    }
    public boolean getIsReco(){
       return this.isReco_;
    }
    public ColorFilter$ResourceType getResourceType(){
       ColorFilter$ResourceType resourceType = ColorFilter$ResourceType.forNumber(this.resourceType_);
       if (resourceType == null) {
          resourceType = ColorFilter$ResourceType.UNRECOGNIZED;
       }
       return resourceType;
    }
    public int getResourceTypeValue(){
       return this.resourceType_;
    }
    public String getResources(int p0){
       return this.resources_.get(p0);
    }
    public ByteString getResourcesBytes(int p0){
       return ByteString.copyFromUtf8(this.resources_.get(p0));
    }
    public int getResourcesCount(){
       return this.resources_.size();
    }
    public List getResourcesList(){
       return this.resources_;
    }
    public int getSdkType(){
       return this.sdkType_;
    }
    public int getTabId(){
       return this.tabId_;
    }
    public String getTabName(){
       return this.tabName_;
    }
    public ByteString getTabNameBytes(){
       return ByteString.copyFromUtf8(this.tabName_);
    }
    public boolean hasAttributes(){
       boolean b = (this.attributes_ != null)? true: false;
       return b;
    }
    public boolean hasFeatureId(){
       boolean b = (this.featureId_ != null)? true: false;
       return b;
    }
    public void mergeAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       ColorFilter tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       ColorFilter tuColorFilte = this.featureId_;
       this.featureId_ = (tuColorFilte != null && tuColorFilte != FeatureId.getDefaultInstance())? FeatureId.newBuilder(this.featureId_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setEffectSource(EffectSource p0){
       Objects.requireNonNull(p0);
       this.effectSource_ = p0.getNumber();
    }
    public void setEffectSourceValue(int p0){
       this.effectSource_ = p0;
    }
    public void setFeatureId(FeatureId$b p0){
       this.featureId_ = p0.build();
    }
    public void setFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       this.featureId_ = p0;
    }
    public void setIntensity(double p0){
       this.intensity_ = p0;
    }
    public void setIsCommonlyUsed(boolean p0){
       this.isCommonlyUsed_ = p0;
    }
    public void setIsReco(boolean p0){
       this.isReco_ = p0;
    }
    public void setResourceType(ColorFilter$ResourceType p0){
       Objects.requireNonNull(p0);
       this.resourceType_ = p0.getNumber();
    }
    public void setResourceTypeValue(int p0){
       this.resourceType_ = p0;
    }
    public void setResources(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureResourcesIsMutable();
       this.resources_.set(p0, p1);
    }
    public void setSdkType(int p0){
       this.sdkType_ = p0;
    }
    public void setTabId(int p0){
       this.tabId_ = p0;
    }
    public void setTabName(String p0){
       Objects.requireNonNull(p0);
       this.tabName_ = p0;
    }
    public void setTabNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.tabName_ = p0.toStringUtf8();
    }
}
