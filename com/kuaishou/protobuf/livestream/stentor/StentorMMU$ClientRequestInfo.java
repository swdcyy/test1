package com.kuaishou.protobuf.livestream.stentor.StentorMMU$ClientRequestInfo;
import hr4.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$ClientRequestInfo$a;
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
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$ClientRequestInfo extends GeneratedMessageLite implements b	// class@000d88
{
    public int appType_;
    public String appver_;
    public int clientId_;
    public String deviceId_;
    public String locale_;
    public String serverInfo_;
    public String sysver_;
    public long userId_;
    public static final StentorMMU$ClientRequestInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$ClientRequestInfo uClientReque = new StentorMMU$ClientRequestInfo();
       StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE = uClientReque;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$ClientRequestInfo.class, uClientReque);
    }
    public void StentorMMU$ClientRequestInfo(){
       super();
       this.deviceId_ = "";
       this.appver_ = "";
       this.sysver_ = "";
       this.serverInfo_ = "";
       this.locale_ = "";
    }
    public static StentorMMU$ClientRequestInfo getDefaultInstance(){
       return StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE;
    }
    public static StentorMMU$ClientRequestInfo$a newBuilder(){
       return StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$ClientRequestInfo$a newBuilder(StentorMMU$ClientRequestInfo p0){
       return StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$ClientRequestInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$ClientRequestInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$ClientRequestInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAppType(){
       this.appType_ = 0;
    }
    public void clearAppver(){
       this.appver_ = StentorMMU$ClientRequestInfo.getDefaultInstance().getAppver();
    }
    public void clearClientId(){
       this.clientId_ = 0;
    }
    public void clearDeviceId(){
       this.deviceId_ = StentorMMU$ClientRequestInfo.getDefaultInstance().getDeviceId();
    }
    public void clearLocale(){
       this.locale_ = StentorMMU$ClientRequestInfo.getDefaultInstance().getLocale();
    }
    public void clearServerInfo(){
       this.serverInfo_ = StentorMMU$ClientRequestInfo.getDefaultInstance().getServerInfo();
    }
    public void clearSysver(){
       this.sysver_ = StentorMMU$ClientRequestInfo.getDefaultInstance().getSysver();
    }
    public void clearUserId(){
       this.userId_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$ClientRequestInfo();
           case 2:
             return new StentorMMU$ClientRequestInfo$a(p2);
           case 3:
             Object[] objArray = new Object[]{"userId_","deviceId_","clientId_","appver_","sysver_","serverInfo_","locale_","appType_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x02\x02\x02\x03\x0b\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x04\x00", objArray);
           case 4:
             return StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$ClientRequestInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$ClientRequestInfo.class);
                pARSER = StentorMMU$ClientRequestInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$ClientRequestInfo.DEFAULT_INSTANCE);
                   StentorMMU$ClientRequestInfo.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$ClientRequestInfo.class);
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
    public int getAppType(){
       return this.appType_;
    }
    public String getAppver(){
       return this.appver_;
    }
    public ByteString getAppverBytes(){
       return ByteString.copyFromUtf8(this.appver_);
    }
    public int getClientId(){
       return this.clientId_;
    }
    public String getDeviceId(){
       return this.deviceId_;
    }
    public ByteString getDeviceIdBytes(){
       return ByteString.copyFromUtf8(this.deviceId_);
    }
    public String getLocale(){
       return this.locale_;
    }
    public ByteString getLocaleBytes(){
       return ByteString.copyFromUtf8(this.locale_);
    }
    public String getServerInfo(){
       return this.serverInfo_;
    }
    public ByteString getServerInfoBytes(){
       return ByteString.copyFromUtf8(this.serverInfo_);
    }
    public String getSysver(){
       return this.sysver_;
    }
    public ByteString getSysverBytes(){
       return ByteString.copyFromUtf8(this.sysver_);
    }
    public long getUserId(){
       return this.userId_;
    }
    public void setAppType(int p0){
       this.appType_ = p0;
    }
    public void setAppver(String p0){
       Objects.requireNonNull(p0);
       this.appver_ = p0;
    }
    public void setAppverBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.appver_ = p0.toStringUtf8();
    }
    public void setClientId(int p0){
       this.clientId_ = p0;
    }
    public void setDeviceId(String p0){
       Objects.requireNonNull(p0);
       this.deviceId_ = p0;
    }
    public void setDeviceIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.deviceId_ = p0.toStringUtf8();
    }
    public void setLocale(String p0){
       Objects.requireNonNull(p0);
       this.locale_ = p0;
    }
    public void setLocaleBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.locale_ = p0.toStringUtf8();
    }
    public void setServerInfo(String p0){
       Objects.requireNonNull(p0);
       this.serverInfo_ = p0;
    }
    public void setServerInfoBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.serverInfo_ = p0.toStringUtf8();
    }
    public void setSysver(String p0){
       Objects.requireNonNull(p0);
       this.sysver_ = p0;
    }
    public void setSysverBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.sysver_ = p0.toStringUtf8();
    }
    public void setUserId(long p0){
       this.userId_ = p0;
    }
}
