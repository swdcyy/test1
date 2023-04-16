package com.kuaishou.share.SDKConfigPackage;
import iw4.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.share.SDKConfigPackage$b;
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
import com.kuaishou.share.SDKConfigPackage$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class SDKConfigPackage extends GeneratedMessageLite implements b	// class@000f2c
{
    public String appVersion_;
    public String deviceId_;
    public String globalId_;
    public String kpf_;
    public String kpn_;
    public String sdkVersion_;
    public static final SDKConfigPackage DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       SDKConfigPackage sDKConfigPac = new SDKConfigPackage();
       SDKConfigPackage.DEFAULT_INSTANCE = sDKConfigPac;
       GeneratedMessageLite.registerDefaultInstance(SDKConfigPackage.class, sDKConfigPac);
    }
    public void SDKConfigPackage(){
       super();
       this.kpn_ = "";
       this.kpf_ = "";
       this.deviceId_ = "";
       this.globalId_ = "";
       this.sdkVersion_ = "";
       this.appVersion_ = "";
    }
    public static SDKConfigPackage getDefaultInstance(){
       return SDKConfigPackage.DEFAULT_INSTANCE;
    }
    public static SDKConfigPackage$b newBuilder(){
       return SDKConfigPackage.DEFAULT_INSTANCE.createBuilder();
    }
    public static SDKConfigPackage$b newBuilder(SDKConfigPackage p0){
       return SDKConfigPackage.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SDKConfigPackage parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0);
    }
    public static SDKConfigPackage parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static SDKConfigPackage parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0);
    }
    public static SDKConfigPackage parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static SDKConfigPackage parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0);
    }
    public static SDKConfigPackage parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static SDKConfigPackage parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0);
    }
    public static SDKConfigPackage parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static SDKConfigPackage parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0);
    }
    public static SDKConfigPackage parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static SDKConfigPackage parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0);
    }
    public static SDKConfigPackage parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(SDKConfigPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return SDKConfigPackage.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAppVersion(){
       this.appVersion_ = SDKConfigPackage.getDefaultInstance().getAppVersion();
    }
    public void clearDeviceId(){
       this.deviceId_ = SDKConfigPackage.getDefaultInstance().getDeviceId();
    }
    public void clearGlobalId(){
       this.globalId_ = SDKConfigPackage.getDefaultInstance().getGlobalId();
    }
    public void clearKpf(){
       this.kpf_ = SDKConfigPackage.getDefaultInstance().getKpf();
    }
    public void clearKpn(){
       this.kpn_ = SDKConfigPackage.getDefaultInstance().getKpn();
    }
    public void clearSdkVersion(){
       this.sdkVersion_ = SDKConfigPackage.getDefaultInstance().getSdkVersion();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (SDKConfigPackage$a.a[p0.ordinal()]){
           case 1:
             return new SDKConfigPackage();
           case 2:
             return new SDKConfigPackage$b(p2);
           case 3:
             Object[] objArray = new Object[]{"kpn_","kpf_","deviceId_","globalId_","sdkVersion_","appVersion_"};
             return GeneratedMessageLite.newMessageInfo(SDKConfigPackage.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x02\x02\x06\x02\x02\x00", objArray);
           case 4:
             return SDKConfigPackage.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = SDKConfigPackage.PARSER;
             if (pARSER == null) {
                _monitor_enter(SDKConfigPackage.class);
                pARSER = SDKConfigPackage.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(SDKConfigPackage.DEFAULT_INSTANCE);
                   SDKConfigPackage.PARSER = pARSER;
                }
                _monitor_exit(SDKConfigPackage.class);
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
    public String getDeviceId(){
       return this.deviceId_;
    }
    public ByteString getDeviceIdBytes(){
       return ByteString.copyFromUtf8(this.deviceId_);
    }
    public String getGlobalId(){
       return this.globalId_;
    }
    public ByteString getGlobalIdBytes(){
       return ByteString.copyFromUtf8(this.globalId_);
    }
    public String getKpf(){
       return this.kpf_;
    }
    public ByteString getKpfBytes(){
       return ByteString.copyFromUtf8(this.kpf_);
    }
    public String getKpn(){
       return this.kpn_;
    }
    public ByteString getKpnBytes(){
       return ByteString.copyFromUtf8(this.kpn_);
    }
    public String getSdkVersion(){
       return this.sdkVersion_;
    }
    public ByteString getSdkVersionBytes(){
       return ByteString.copyFromUtf8(this.sdkVersion_);
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
    public void setDeviceId(String p0){
       Objects.requireNonNull(p0);
       this.deviceId_ = p0;
    }
    public void setDeviceIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.deviceId_ = p0.toStringUtf8();
    }
    public void setGlobalId(String p0){
       Objects.requireNonNull(p0);
       this.globalId_ = p0;
    }
    public void setGlobalIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.globalId_ = p0.toStringUtf8();
    }
    public void setKpf(String p0){
       Objects.requireNonNull(p0);
       this.kpf_ = p0;
    }
    public void setKpfBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.kpf_ = p0.toStringUtf8();
    }
    public void setKpn(String p0){
       Objects.requireNonNull(p0);
       this.kpn_ = p0;
    }
    public void setKpnBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.kpn_ = p0.toStringUtf8();
    }
    public void setSdkVersion(String p0){
       Objects.requireNonNull(p0);
       this.sdkVersion_ = p0;
    }
    public void setSdkVersionBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.sdkVersion_ = p0.toStringUtf8();
    }
}
