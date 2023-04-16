package com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.d;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.Beauty$b;
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
import com.kuaishou.edit.draft.Beauty$Item$a;
import java.lang.Object;
import com.kuaishou.edit.draft.Beauty$Item;
import java.util.Objects;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.Beauty$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.EffectSource;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Beauty$c;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.FeatureId$b;

public final class Beauty extends GeneratedMessageLite implements d	// class@001738
{
    public Attributes attributes_;
    public String brightItem_;
    public int effectSource_;
    public FeatureId featureId_;
    public boolean isAiBeauty_;
    public Internal$ProtobufList item_;
    public static final Beauty DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Beauty uBeauty = new Beauty();
       Beauty.DEFAULT_INSTANCE = uBeauty;
       GeneratedMessageLite.registerDefaultInstance(Beauty.class, uBeauty);
    }
    public void Beauty(){
       super();
       this.item_ = GeneratedMessageLite.emptyProtobufList();
       this.brightItem_ = "";
    }
    public static Beauty getDefaultInstance(){
       return Beauty.DEFAULT_INSTANCE;
    }
    public static Beauty$b newBuilder(){
       return Beauty.DEFAULT_INSTANCE.createBuilder();
    }
    public static Beauty$b newBuilder(Beauty p0){
       return Beauty.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Beauty parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Beauty.DEFAULT_INSTANCE, p0);
    }
    public static Beauty parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Beauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0);
    }
    public static Beauty parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0);
    }
    public static Beauty parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0);
    }
    public static Beauty parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0);
    }
    public static Beauty parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Beauty parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0);
    }
    public static Beauty parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Beauty.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Beauty.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllItem(Iterable p0){
       this.ensureItemIsMutable();
       AbstractMessageLite.addAll(p0, this.item_);
    }
    public void addItem(int p0,Beauty$Item$a p1){
       this.ensureItemIsMutable();
       this.item_.add(p0, p1.build());
    }
    public void addItem(int p0,Beauty$Item p1){
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.add(p0, p1);
    }
    public void addItem(Beauty$Item$a p0){
       this.ensureItemIsMutable();
       this.item_.add(p0.build());
    }
    public void addItem(Beauty$Item p0){
       Objects.requireNonNull(p0);
       this.ensureItemIsMutable();
       this.item_.add(p0);
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearBrightItem(){
       this.brightItem_ = Beauty.getDefaultInstance().getBrightItem();
    }
    public void clearEffectSource(){
       this.effectSource_ = 0;
    }
    public void clearFeatureId(){
       this.featureId_ = null;
    }
    public void clearIsAiBeauty(){
       this.isAiBeauty_ = false;
    }
    public void clearItem(){
       this.item_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Beauty$a.a[p0.ordinal()]){
           case 1:
             return new Beauty();
           case 2:
             return new Beauty$b(p2);
           case 3:
             Object[] objArray = new Object[]{"attributes_","featureId_","item_",Beauty$Item.class,"brightItem_","effectSource_","isAiBeauty_"};
             return GeneratedMessageLite.newMessageInfo(Beauty.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\t\x02\t\x03\x1b\x04\x02\x02\x05\f\x06\x07\x00", objArray);
           case 4:
             return Beauty.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Beauty.PARSER;
             if (pARSER == null) {
                _monitor_enter(Beauty.class);
                pARSER = Beauty.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Beauty.DEFAULT_INSTANCE);
                   Beauty.PARSER = pARSER;
                }
                _monitor_exit(Beauty.class);
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
    public final void ensureItemIsMutable(){
       if (!this.item_.isModifiable()) {
          this.item_ = GeneratedMessageLite.mutableCopy(this.item_);
       }
       return;
    }
    public Attributes getAttributes(){
       Beauty tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public String getBrightItem(){
       return this.brightItem_;
    }
    public ByteString getBrightItemBytes(){
       return ByteString.copyFromUtf8(this.brightItem_);
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
       Beauty tuBeauty = this.featureId_;
       if (tuBeauty == null) {
          tuBeauty = FeatureId.getDefaultInstance();
       }
       return tuBeauty;
    }
    public boolean getIsAiBeauty(){
       return this.isAiBeauty_;
    }
    public Beauty$Item getItem(int p0){
       return this.item_.get(p0);
    }
    public int getItemCount(){
       return this.item_.size();
    }
    public List getItemList(){
       return this.item_;
    }
    public Beauty$c getItemOrBuilder(int p0){
       return this.item_.get(p0);
    }
    public List getItemOrBuilderList(){
       return this.item_;
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
       Beauty tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       Beauty tuBeauty = this.featureId_;
       this.featureId_ = (tuBeauty != null && tuBeauty != FeatureId.getDefaultInstance())? FeatureId.newBuilder(this.featureId_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeItem(int p0){
       this.ensureItemIsMutable();
       this.item_.remove(p0);
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setBrightItem(String p0){
       Objects.requireNonNull(p0);
       this.brightItem_ = p0;
    }
    public void setBrightItemBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.brightItem_ = p0.toStringUtf8();
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
    public void setIsAiBeauty(boolean p0){
       this.isAiBeauty_ = p0;
    }
    public void setItem(int p0,Beauty$Item$a p1){
       this.ensureItemIsMutable();
       this.item_.set(p0, p1.build());
    }
    public void setItem(int p0,Beauty$Item p1){
       Objects.requireNonNull(p1);
       this.ensureItemIsMutable();
       this.item_.set(p0, p1);
    }
}
