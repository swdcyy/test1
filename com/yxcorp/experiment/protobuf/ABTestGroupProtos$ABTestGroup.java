package com.yxcorp.experiment.protobuf.ABTestGroupProtos$ABTestGroup;
import com.yxcorp.experiment.protobuf.ABTestGroupProtos$ABTestGroupOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.yxcorp.experiment.protobuf.ABTestGroupProtos$ABTestGroup$Builder;
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
import com.yxcorp.experiment.protobuf.ABTestGroupProtos$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class ABTestGroupProtos$ABTestGroup extends GeneratedMessageLite implements ABTestGroupProtos$ABTestGroupOrBuilder	// class@0011f9
{
    public String appStart_;
    public String immediately_;
    public String lazyLoad_;
    public String loginChange_;
    public static final ABTestGroupProtos$ABTestGroup DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ABTestGroupProtos$ABTestGroup uABTestGroup = new ABTestGroupProtos$ABTestGroup();
       ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE = uABTestGroup;
       GeneratedMessageLite.registerDefaultInstance(ABTestGroupProtos$ABTestGroup.class, uABTestGroup);
    }
    public void ABTestGroupProtos$ABTestGroup(){
       super();
       this.appStart_ = "";
       this.loginChange_ = "";
       this.immediately_ = "";
       this.lazyLoad_ = "";
    }
    public static ABTestGroupProtos$ABTestGroup getDefaultInstance(){
       return ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE;
    }
    public static ABTestGroupProtos$ABTestGroup$Builder newBuilder(){
       return ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE.createBuilder();
    }
    public static ABTestGroupProtos$ABTestGroup$Builder newBuilder(ABTestGroupProtos$ABTestGroup p0){
       return ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ABTestGroupProtos$ABTestGroup parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0);
    }
    public static ABTestGroupProtos$ABTestGroup parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0);
    }
    public static ABTestGroupProtos$ABTestGroup parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAppStart(){
       this.appStart_ = ABTestGroupProtos$ABTestGroup.getDefaultInstance().getAppStart();
    }
    public void clearImmediately(){
       this.immediately_ = ABTestGroupProtos$ABTestGroup.getDefaultInstance().getImmediately();
    }
    public void clearLazyLoad(){
       this.lazyLoad_ = ABTestGroupProtos$ABTestGroup.getDefaultInstance().getLazyLoad();
    }
    public void clearLoginChange(){
       this.loginChange_ = ABTestGroupProtos$ABTestGroup.getDefaultInstance().getLoginChange();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ABTestGroupProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new ABTestGroupProtos$ABTestGroup();
           case 2:
             return new ABTestGroupProtos$ABTestGroup$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"appStart_","loginChange_","immediately_","lazyLoad_"};
             return GeneratedMessageLite.newMessageInfo(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x00", objArray);
           case 4:
             return ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ABTestGroupProtos$ABTestGroup.PARSER;
             if (pARSER == null) {
                _monitor_enter(ABTestGroupProtos$ABTestGroup.class);
                pARSER = ABTestGroupProtos$ABTestGroup.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ABTestGroupProtos$ABTestGroup.DEFAULT_INSTANCE);
                   ABTestGroupProtos$ABTestGroup.PARSER = pARSER;
                }
                _monitor_exit(ABTestGroupProtos$ABTestGroup.class);
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
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.appStart_ = p0.toStringUtf8();
    }
    public void setImmediately(String p0){
       Objects.requireNonNull(p0);
       this.immediately_ = p0;
    }
    public void setImmediatelyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.immediately_ = p0.toStringUtf8();
    }
    public void setLazyLoad(String p0){
       Objects.requireNonNull(p0);
       this.lazyLoad_ = p0;
    }
    public void setLazyLoadBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.lazyLoad_ = p0.toStringUtf8();
    }
    public void setLoginChange(String p0){
       Objects.requireNonNull(p0);
       this.loginChange_ = p0;
    }
    public void setLoginChangeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.loginChange_ = p0.toStringUtf8();
    }
}
