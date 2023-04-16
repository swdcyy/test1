package com.kwai.sdk.switchconfig.proto.KswitchGroupProtos$KswitchGroup;
import ko7.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.sdk.switchconfig.proto.KswitchGroupProtos$KswitchGroup$a;
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
import ko7.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class KswitchGroupProtos$KswitchGroup extends GeneratedMessageLite implements b	// class@001666
{
    public String appStart_;
    public String immediately_;
    public String lazyLoad_;
    public String loginChange_;
    public static final KswitchGroupProtos$KswitchGroup DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       KswitchGroupProtos$KswitchGroup kswitchGroup = new KswitchGroupProtos$KswitchGroup();
       KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE = kswitchGroup;
       GeneratedMessageLite.registerDefaultInstance(KswitchGroupProtos$KswitchGroup.class, kswitchGroup);
    }
    public void KswitchGroupProtos$KswitchGroup(){
       super();
       this.appStart_ = "";
       this.loginChange_ = "";
       this.immediately_ = "";
       this.lazyLoad_ = "";
    }
    public static KswitchGroupProtos$KswitchGroup getDefaultInstance(){
       return KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE;
    }
    public static KswitchGroupProtos$KswitchGroup$a newBuilder(){
       return KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE.createBuilder();
    }
    public static KswitchGroupProtos$KswitchGroup$a newBuilder(KswitchGroupProtos$KswitchGroup p0){
       return KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static KswitchGroupProtos$KswitchGroup parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0);
    }
    public static KswitchGroupProtos$KswitchGroup parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0);
    }
    public static KswitchGroupProtos$KswitchGroup parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAppStart(){
       this.appStart_ = KswitchGroupProtos$KswitchGroup.getDefaultInstance().getAppStart();
    }
    public void clearImmediately(){
       this.immediately_ = KswitchGroupProtos$KswitchGroup.getDefaultInstance().getImmediately();
    }
    public void clearLazyLoad(){
       this.lazyLoad_ = KswitchGroupProtos$KswitchGroup.getDefaultInstance().getLazyLoad();
    }
    public void clearLoginChange(){
       this.loginChange_ = KswitchGroupProtos$KswitchGroup.getDefaultInstance().getLoginChange();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new KswitchGroupProtos$KswitchGroup();
           case 2:
             return new KswitchGroupProtos$KswitchGroup$a(p2);
           case 3:
             Object[] objArray = new Object[]{"appStart_","loginChange_","immediately_","lazyLoad_"};
             return GeneratedMessageLite.newMessageInfo(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x00", objArray);
           case 4:
             return KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = KswitchGroupProtos$KswitchGroup.PARSER;
             if (pARSER == null) {
                _monitor_enter(KswitchGroupProtos$KswitchGroup.class);
                pARSER = KswitchGroupProtos$KswitchGroup.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(KswitchGroupProtos$KswitchGroup.DEFAULT_INSTANCE);
                   KswitchGroupProtos$KswitchGroup.PARSER = pARSER;
                }
                _monitor_exit(KswitchGroupProtos$KswitchGroup.class);
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
    public String getAppStart(){
       return this.appStart_;
    }
    public ByteString getAppStartBytes(){
       return ByteString.copyFromUtf8(this.appStart_);
    }
    public String getImmediately(){
       return this.immediately_;
    }
    public ByteString getImmediatelyBytes(){
       return ByteString.copyFromUtf8(this.immediately_);
    }
    public String getLazyLoad(){
       return this.lazyLoad_;
    }
    public ByteString getLazyLoadBytes(){
       return ByteString.copyFromUtf8(this.lazyLoad_);
    }
    public String getLoginChange(){
       return this.loginChange_;
    }
    public ByteString getLoginChangeBytes(){
       return ByteString.copyFromUtf8(this.loginChange_);
    }
    public void setAppStart(String p0){
       Objects.requireNonNull(p0);
       this.appStart_ = p0;
    }
    public void setAppStartBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.appStart_ = p0.toStringUtf8();
    }
    public void setImmediately(String p0){
       Objects.requireNonNull(p0);
       this.immediately_ = p0;
    }
    public void setImmediatelyBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.immediately_ = p0.toStringUtf8();
    }
    public void setLazyLoad(String p0){
       Objects.requireNonNull(p0);
       this.lazyLoad_ = p0;
    }
    public void setLazyLoadBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.lazyLoad_ = p0.toStringUtf8();
    }
    public void setLoginChange(String p0){
       Objects.requireNonNull(p0);
       this.loginChange_ = p0;
    }
    public void setLoginChangeBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.loginChange_ = p0.toStringUtf8();
    }
}
