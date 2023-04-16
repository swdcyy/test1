package com.kuaishou.share.ResultPackage;
import iw4.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.share.ResultPackage$b;
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
import com.kuaishou.share.ResultPackage$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.share.ElementPackage;
import com.kuaishou.share.SDKConfigPackage;
import java.util.Objects;
import com.kuaishou.share.ElementPackage$b;
import com.kuaishou.share.SDKConfigPackage$b;
import com.google.protobuf.AbstractMessageLite;

public final class ResultPackage extends GeneratedMessageLite implements a	// class@000f23
{
    public String appInfo_;
    public String clientTimeStamp_;
    public String sessionId_;
    public ElementPackage shareElementPackage_;
    public SDKConfigPackage shareSDKConfigPackage_;
    public String userId_;
    public static final ResultPackage DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       ResultPackage resultPackag = new ResultPackage();
       ResultPackage.DEFAULT_INSTANCE = resultPackag;
       GeneratedMessageLite.registerDefaultInstance(ResultPackage.class, resultPackag);
    }
    public void ResultPackage(){
       super();
       this.userId_ = "";
       this.sessionId_ = "";
       this.clientTimeStamp_ = "";
       this.appInfo_ = "";
    }
    public static ResultPackage getDefaultInstance(){
       return ResultPackage.DEFAULT_INSTANCE;
    }
    public static ResultPackage$b newBuilder(){
       return ResultPackage.DEFAULT_INSTANCE.createBuilder();
    }
    public static ResultPackage$b newBuilder(ResultPackage p0){
       return ResultPackage.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static ResultPackage parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(ResultPackage.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackage parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(ResultPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackage parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackage parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackage parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackage parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackage parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackage parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackage parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackage parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static ResultPackage parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0);
    }
    public static ResultPackage parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(ResultPackage.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return ResultPackage.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAppInfo(){
       this.appInfo_ = ResultPackage.getDefaultInstance().getAppInfo();
    }
    public void clearClientTimeStamp(){
       this.clientTimeStamp_ = ResultPackage.getDefaultInstance().getClientTimeStamp();
    }
    public void clearSessionId(){
       this.sessionId_ = ResultPackage.getDefaultInstance().getSessionId();
    }
    public void clearShareElementPackage(){
       this.shareElementPackage_ = null;
    }
    public void clearShareSDKConfigPackage(){
       this.shareSDKConfigPackage_ = null;
    }
    public void clearUserId(){
       this.userId_ = ResultPackage.getDefaultInstance().getUserId();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (ResultPackage$a.a[p0.ordinal()]){
           case 1:
             return new ResultPackage();
           case 2:
             return new ResultPackage$b(p2);
           case 3:
             Object[] objArray = new Object[]{"userId_","sessionId_","clientTimeStamp_","shareElementPackage_","shareSDKConfigPackage_","appInfo_"};
             return GeneratedMessageLite.newMessageInfo(ResultPackage.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\t\x05\t\x06\x02\x02\x00", objArray);
           case 4:
             return ResultPackage.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = ResultPackage.PARSER;
             if (pARSER == null) {
                _monitor_enter(ResultPackage.class);
                pARSER = ResultPackage.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(ResultPackage.DEFAULT_INSTANCE);
                   ResultPackage.PARSER = pARSER;
                }
                _monitor_exit(ResultPackage.class);
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
    public String getAppInfo(){
       return this.appInfo_;
    }
    public ByteString getAppInfoBytes(){
       return ByteString.copyFromUtf8(this.appInfo_);
    }
    public String getClientTimeStamp(){
       return this.clientTimeStamp_;
    }
    public ByteString getClientTimeStampBytes(){
       return ByteString.copyFromUtf8(this.clientTimeStamp_);
    }
    public String getSessionId(){
       return this.sessionId_;
    }
    public ByteString getSessionIdBytes(){
       return ByteString.copyFromUtf8(this.sessionId_);
    }
    public ElementPackage getShareElementPackage(){
       ResultPackage tshareElemen = this.shareElementPackage_;
       if (tshareElemen == null) {
          tshareElemen = ElementPackage.getDefaultInstance();
       }
       return tshareElemen;
    }
    public SDKConfigPackage getShareSDKConfigPackage(){
       ResultPackage tshareSDKCon = this.shareSDKConfigPackage_;
       if (tshareSDKCon == null) {
          tshareSDKCon = SDKConfigPackage.getDefaultInstance();
       }
       return tshareSDKCon;
    }
    public String getUserId(){
       return this.userId_;
    }
    public ByteString getUserIdBytes(){
       return ByteString.copyFromUtf8(this.userId_);
    }
    public boolean hasShareElementPackage(){
       boolean b = (this.shareElementPackage_ != null)? true: false;
       return b;
    }
    public boolean hasShareSDKConfigPackage(){
       boolean b = (this.shareSDKConfigPackage_ != null)? true: false;
       return b;
    }
    public void mergeShareElementPackage(ElementPackage p0){
       Objects.requireNonNull(p0);
       ResultPackage tshareElemen = this.shareElementPackage_;
       this.shareElementPackage_ = (tshareElemen != null && tshareElemen != ElementPackage.getDefaultInstance())? ElementPackage.newBuilder(this.shareElementPackage_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeShareSDKConfigPackage(SDKConfigPackage p0){
       Objects.requireNonNull(p0);
       ResultPackage tshareSDKCon = this.shareSDKConfigPackage_;
       this.shareSDKConfigPackage_ = (tshareSDKCon != null && tshareSDKCon != SDKConfigPackage.getDefaultInstance())? SDKConfigPackage.newBuilder(this.shareSDKConfigPackage_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAppInfo(String p0){
       Objects.requireNonNull(p0);
       this.appInfo_ = p0;
    }
    public void setAppInfoBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.appInfo_ = p0.toStringUtf8();
    }
    public void setClientTimeStamp(String p0){
       Objects.requireNonNull(p0);
       this.clientTimeStamp_ = p0;
    }
    public void setClientTimeStampBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.clientTimeStamp_ = p0.toStringUtf8();
    }
    public void setSessionId(String p0){
       Objects.requireNonNull(p0);
       this.sessionId_ = p0;
    }
    public void setSessionIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.sessionId_ = p0.toStringUtf8();
    }
    public void setShareElementPackage(ElementPackage$b p0){
       this.shareElementPackage_ = p0.build();
    }
    public void setShareElementPackage(ElementPackage p0){
       Objects.requireNonNull(p0);
       this.shareElementPackage_ = p0;
    }
    public void setShareSDKConfigPackage(SDKConfigPackage$b p0){
       this.shareSDKConfigPackage_ = p0.build();
    }
    public void setShareSDKConfigPackage(SDKConfigPackage p0){
       Objects.requireNonNull(p0);
       this.shareSDKConfigPackage_ = p0;
    }
    public void setUserId(String p0){
       Objects.requireNonNull(p0);
       this.userId_ = p0;
    }
    public void setUserIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.userId_ = p0.toStringUtf8();
    }
}
