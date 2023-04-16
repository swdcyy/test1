package com.kuaishou.edit.draft.EditBeauty;
import z30.x;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.EditBeauty$b;
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
import com.kuaishou.edit.draft.DeformParam$b;
import java.lang.Object;
import com.kuaishou.edit.draft.DeformParam;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.EditBeauty$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.kuaishou.edit.draft.Attributes;
import z30.t;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.FeatureId$b;

public final class EditBeauty extends GeneratedMessageLite implements x	// class@001775
{
    public Attributes attributes_;
    public float beautifyLipsIntensity_;
    public float brightIntensity_;
    public Internal$ProtobufList deformParams_;
    public float eyeBagRemoveIntensity_;
    public float eyeBrightenIntensity_;
    public FeatureId featureId_;
    public float noseShadowIntensity_;
    public float softenIntensity_;
    public float teethBrightenIntensity_;
    public float wrinkleRemoveIntensity_;
    public static final EditBeauty DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EditBeauty uEditBeauty = new EditBeauty();
       EditBeauty.DEFAULT_INSTANCE = uEditBeauty;
       GeneratedMessageLite.registerDefaultInstance(EditBeauty.class, uEditBeauty);
    }
    public void EditBeauty(){
       super();
       this.deformParams_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static EditBeauty getDefaultInstance(){
       return EditBeauty.DEFAULT_INSTANCE;
    }
    public static EditBeauty$b newBuilder(){
       return EditBeauty.DEFAULT_INSTANCE.createBuilder();
    }
    public static EditBeauty$b newBuilder(EditBeauty p0){
       return EditBeauty.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EditBeauty parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EditBeauty.DEFAULT_INSTANCE, p0);
    }
    public static EditBeauty parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EditBeauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditBeauty parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0);
    }
    public static EditBeauty parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditBeauty parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0);
    }
    public static EditBeauty parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditBeauty parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0);
    }
    public static EditBeauty parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditBeauty parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0);
    }
    public static EditBeauty parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditBeauty parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0);
    }
    public static EditBeauty parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditBeauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EditBeauty.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllDeformParams(Iterable p0){
       this.ensureDeformParamsIsMutable();
       AbstractMessageLite.addAll(p0, this.deformParams_);
    }
    public void addDeformParams(int p0,DeformParam$b p1){
       this.ensureDeformParamsIsMutable();
       this.deformParams_.add(p0, p1.build());
    }
    public void addDeformParams(int p0,DeformParam p1){
       Objects.requireNonNull(p1);
       this.ensureDeformParamsIsMutable();
       this.deformParams_.add(p0, p1);
    }
    public void addDeformParams(DeformParam$b p0){
       this.ensureDeformParamsIsMutable();
       this.deformParams_.add(p0.build());
    }
    public void addDeformParams(DeformParam p0){
       Objects.requireNonNull(p0);
       this.ensureDeformParamsIsMutable();
       this.deformParams_.add(p0);
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearBeautifyLipsIntensity(){
       this.beautifyLipsIntensity_ = 0;
    }
    public void clearBrightIntensity(){
       this.brightIntensity_ = 0;
    }
    public void clearDeformParams(){
       this.deformParams_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearEyeBagRemoveIntensity(){
       this.eyeBagRemoveIntensity_ = 0;
    }
    public void clearEyeBrightenIntensity(){
       this.eyeBrightenIntensity_ = 0;
    }
    public void clearFeatureId(){
       this.featureId_ = null;
    }
    public void clearNoseShadowIntensity(){
       this.noseShadowIntensity_ = 0;
    }
    public void clearSoftenIntensity(){
       this.softenIntensity_ = 0;
    }
    public void clearTeethBrightenIntensity(){
       this.teethBrightenIntensity_ = 0;
    }
    public void clearWrinkleRemoveIntensity(){
       this.wrinkleRemoveIntensity_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EditBeauty$a.a[p0.ordinal()]){
           case 1:
             return new EditBeauty();
           case 2:
             return new EditBeauty$b(p2);
           case 3:
             Object[] objArray = new Object[12];
             objArray[0] = "featureId_";
             objArray[i] = "attributes_";
             objArray[2] = "brightIntensity_";
             objArray[3] = "softenIntensity_";
             objArray[4] = "deformParams_";
             objArray[5] = DeformParam.class;
             objArray[6] = "wrinkleRemoveIntensity_";
             objArray[7] = "eyeBagRemoveIntensity_";
             objArray[8] = "eyeBrightenIntensity_";
             objArray[9] = "teethBrightenIntensity_";
             objArray[10] = "beautifyLipsIntensity_";
             objArray[11] = "noseShadowIntensity_";
             return GeneratedMessageLite.newMessageInfo(EditBeauty.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0b\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x0b\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\t\x02\t\x03\x01\x04\x01\x05\x1b\x06\x01\x07\x01\b\x01\t\x01\n\x01\x0b\x01\x00", objArray);
           case 4:
             return EditBeauty.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EditBeauty.PARSER;
             if (pARSER == null) {
                _monitor_enter(EditBeauty.class);
                pARSER = EditBeauty.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EditBeauty.DEFAULT_INSTANCE);
                   EditBeauty.PARSER = pARSER;
                }
                _monitor_exit(EditBeauty.class);
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
    public final void ensureDeformParamsIsMutable(){
       if (!this.deformParams_.isModifiable()) {
          this.deformParams_ = GeneratedMessageLite.mutableCopy(this.deformParams_);
       }
       return;
    }
    public Attributes getAttributes(){
       EditBeauty tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public float getBeautifyLipsIntensity(){
       return this.beautifyLipsIntensity_;
    }
    public float getBrightIntensity(){
       return this.brightIntensity_;
    }
    public DeformParam getDeformParams(int p0){
       return this.deformParams_.get(p0);
    }
    public int getDeformParamsCount(){
       return this.deformParams_.size();
    }
    public List getDeformParamsList(){
       return this.deformParams_;
    }
    public t getDeformParamsOrBuilder(int p0){
       return this.deformParams_.get(p0);
    }
    public List getDeformParamsOrBuilderList(){
       return this.deformParams_;
    }
    public float getEyeBagRemoveIntensity(){
       return this.eyeBagRemoveIntensity_;
    }
    public float getEyeBrightenIntensity(){
       return this.eyeBrightenIntensity_;
    }
    public FeatureId getFeatureId(){
       EditBeauty tuEditBeauty = this.featureId_;
       if (tuEditBeauty == null) {
          tuEditBeauty = FeatureId.getDefaultInstance();
       }
       return tuEditBeauty;
    }
    public float getNoseShadowIntensity(){
       return this.noseShadowIntensity_;
    }
    public float getSoftenIntensity(){
       return this.softenIntensity_;
    }
    public float getTeethBrightenIntensity(){
       return this.teethBrightenIntensity_;
    }
    public float getWrinkleRemoveIntensity(){
       return this.wrinkleRemoveIntensity_;
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
       EditBeauty tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       EditBeauty tuEditBeauty = this.featureId_;
       this.featureId_ = (tuEditBeauty != null && tuEditBeauty != FeatureId.getDefaultInstance())? FeatureId.newBuilder(this.featureId_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeDeformParams(int p0){
       this.ensureDeformParamsIsMutable();
       this.deformParams_.remove(p0);
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setBeautifyLipsIntensity(float p0){
       this.beautifyLipsIntensity_ = p0;
    }
    public void setBrightIntensity(float p0){
       this.brightIntensity_ = p0;
    }
    public void setDeformParams(int p0,DeformParam$b p1){
       this.ensureDeformParamsIsMutable();
       this.deformParams_.set(p0, p1.build());
    }
    public void setDeformParams(int p0,DeformParam p1){
       Objects.requireNonNull(p1);
       this.ensureDeformParamsIsMutable();
       this.deformParams_.set(p0, p1);
    }
    public void setEyeBagRemoveIntensity(float p0){
       this.eyeBagRemoveIntensity_ = p0;
    }
    public void setEyeBrightenIntensity(float p0){
       this.eyeBrightenIntensity_ = p0;
    }
    public void setFeatureId(FeatureId$b p0){
       this.featureId_ = p0.build();
    }
    public void setFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       this.featureId_ = p0;
    }
    public void setNoseShadowIntensity(float p0){
       this.noseShadowIntensity_ = p0;
    }
    public void setSoftenIntensity(float p0){
       this.softenIntensity_ = p0;
    }
    public void setTeethBrightenIntensity(float p0){
       this.teethBrightenIntensity_ = p0;
    }
    public void setWrinkleRemoveIntensity(float p0){
       this.wrinkleRemoveIntensity_ = p0;
    }
}
