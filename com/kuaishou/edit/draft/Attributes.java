package com.kuaishou.edit.draft.Attributes;
import z30.j;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.Attributes$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.Attributes$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Timestamp;
import java.util.Objects;
import com.google.protobuf.Timestamp$Builder;
import com.google.protobuf.AbstractMessageLite;

public final class Attributes extends GeneratedMessageLite implements j	// class@00172c
{
    public String appVersion_;
    public Timestamp createdAt_;
    public String draftVersion_;
    public Timestamp modifiedAt_;
    public static final Attributes DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Attributes uAttributes = new Attributes();
       Attributes.DEFAULT_INSTANCE = uAttributes;
       GeneratedMessageLite.registerDefaultInstance(Attributes.class, uAttributes);
    }
    public void Attributes(){
       super();
       this.appVersion_ = "";
       this.draftVersion_ = "";
    }
    public static Attributes getDefaultInstance(){
       return Attributes.DEFAULT_INSTANCE;
    }
    public static Attributes$b newBuilder(){
       return Attributes.DEFAULT_INSTANCE.createBuilder();
    }
    public static Attributes$b newBuilder(Attributes p0){
       return Attributes.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Attributes parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Attributes.DEFAULT_INSTANCE, p0);
    }
    public static Attributes parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Attributes.DEFAULT_INSTANCE, p0, p1);
    }
    public static Attributes parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0);
    }
    public static Attributes parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0, p1);
    }
    public static Attributes parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0);
    }
    public static Attributes parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0, p1);
    }
    public static Attributes parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0);
    }
    public static Attributes parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0, p1);
    }
    public static Attributes parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0);
    }
    public static Attributes parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0, p1);
    }
    public static Attributes parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0);
    }
    public static Attributes parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Attributes.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Attributes.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAppVersion(){
       this.appVersion_ = Attributes.getDefaultInstance().getAppVersion();
    }
    public void clearCreatedAt(){
       this.createdAt_ = null;
    }
    public void clearDraftVersion(){
       this.draftVersion_ = Attributes.getDefaultInstance().getDraftVersion();
    }
    public void clearModifiedAt(){
       this.modifiedAt_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Attributes$a.a[p0.ordinal()]){
           case 1:
             return new Attributes();
           case 2:
             return new Attributes$b(p2);
           case 3:
             Object[] objArray = new Object[]{"createdAt_","modifiedAt_","appVersion_","draftVersion_"};
             return GeneratedMessageLite.newMessageInfo(Attributes.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\x02\x02\x04\x02\x02\x00", objArray);
           case 4:
             return Attributes.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Attributes.PARSER;
             if (pARSER == null) {
                _monitor_enter(Attributes.class);
                pARSER = Attributes.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Attributes.DEFAULT_INSTANCE);
                   Attributes.PARSER = pARSER;
                }
                _monitor_exit(Attributes.class);
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
    public String getAppVersion(){
       return this.appVersion_;
    }
    public ByteString getAppVersionBytes(){
       return ByteString.copyFromUtf8(this.appVersion_);
    }
    public Timestamp getCreatedAt(){
       Attributes tcreatedAt_ = this.createdAt_;
       if (tcreatedAt_ == null) {
          tcreatedAt_ = Timestamp.getDefaultInstance();
       }
       return tcreatedAt_;
    }
    public String getDraftVersion(){
       return this.draftVersion_;
    }
    public ByteString getDraftVersionBytes(){
       return ByteString.copyFromUtf8(this.draftVersion_);
    }
    public Timestamp getModifiedAt(){
       Attributes tmodifiedAt_ = this.modifiedAt_;
       if (tmodifiedAt_ == null) {
          tmodifiedAt_ = Timestamp.getDefaultInstance();
       }
       return tmodifiedAt_;
    }
    public boolean hasCreatedAt(){
       boolean b = (this.createdAt_ != null)? true: false;
       return b;
    }
    public boolean hasModifiedAt(){
       boolean b = (this.modifiedAt_ != null)? true: false;
       return b;
    }
    public void mergeCreatedAt(Timestamp p0){
       Objects.requireNonNull(p0);
       Attributes tcreatedAt_ = this.createdAt_;
       this.createdAt_ = (tcreatedAt_ != null && tcreatedAt_ != Timestamp.getDefaultInstance())? Timestamp.newBuilder(this.createdAt_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeModifiedAt(Timestamp p0){
       Objects.requireNonNull(p0);
       Attributes tmodifiedAt_ = this.modifiedAt_;
       this.modifiedAt_ = (tmodifiedAt_ != null && tmodifiedAt_ != Timestamp.getDefaultInstance())? Timestamp.newBuilder(this.modifiedAt_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAppVersion(String p0){
       Objects.requireNonNull(p0);
       this.appVersion_ = p0;
    }
    public void setAppVersionBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.appVersion_ = p0.toStringUtf8();
    }
    public void setCreatedAt(Timestamp$Builder p0){
       this.createdAt_ = p0.build();
    }
    public void setCreatedAt(Timestamp p0){
       Objects.requireNonNull(p0);
       this.createdAt_ = p0;
    }
    public void setDraftVersion(String p0){
       Objects.requireNonNull(p0);
       this.draftVersion_ = p0;
    }
    public void setDraftVersionBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.draftVersion_ = p0.toStringUtf8();
    }
    public void setModifiedAt(Timestamp$Builder p0){
       this.modifiedAt_ = p0.build();
    }
    public void setModifiedAt(Timestamp p0){
       Objects.requireNonNull(p0);
       this.modifiedAt_ = p0;
    }
}
