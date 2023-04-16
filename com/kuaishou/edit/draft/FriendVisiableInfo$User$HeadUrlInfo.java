package com.kuaishou.edit.draft.FriendVisiableInfo$User$HeadUrlInfo;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$HeadUrlInfo$a;
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
import com.kuaishou.edit.draft.FriendVisiableInfo$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class FriendVisiableInfo$User$HeadUrlInfo extends GeneratedMessageLite implements FriendVisiableInfo$User$b	// class@0017b0
{
    public String cdn_;
    public String url_;
    public static final FriendVisiableInfo$User$HeadUrlInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FriendVisiableInfo$User$HeadUrlInfo user$HeadUrl = new FriendVisiableInfo$User$HeadUrlInfo();
       FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE = user$HeadUrl;
       GeneratedMessageLite.registerDefaultInstance(FriendVisiableInfo$User$HeadUrlInfo.class, user$HeadUrl);
    }
    public void FriendVisiableInfo$User$HeadUrlInfo(){
       super();
       this.cdn_ = "";
       this.url_ = "";
    }
    public static FriendVisiableInfo$User$HeadUrlInfo getDefaultInstance(){
       return FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE;
    }
    public static FriendVisiableInfo$User$HeadUrlInfo$a newBuilder(){
       return FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static FriendVisiableInfo$User$HeadUrlInfo$a newBuilder(FriendVisiableInfo$User$HeadUrlInfo p0){
       return FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User$HeadUrlInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearCdn(){
       this.cdn_ = FriendVisiableInfo$User$HeadUrlInfo.getDefaultInstance().getCdn();
    }
    public void clearUrl(){
       this.url_ = FriendVisiableInfo$User$HeadUrlInfo.getDefaultInstance().getUrl();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FriendVisiableInfo$a.a[p0.ordinal()]){
           case 1:
             return new FriendVisiableInfo$User$HeadUrlInfo();
           case 2:
             return new FriendVisiableInfo$User$HeadUrlInfo$a(p2);
           case 3:
             Object[] objArray = new Object[]{"cdn_","url_"};
             return GeneratedMessageLite.newMessageInfo(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x00", objArray);
           case 4:
             return FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FriendVisiableInfo$User$HeadUrlInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(FriendVisiableInfo$User$HeadUrlInfo.class);
                pARSER = FriendVisiableInfo$User$HeadUrlInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FriendVisiableInfo$User$HeadUrlInfo.DEFAULT_INSTANCE);
                   FriendVisiableInfo$User$HeadUrlInfo.PARSER = pARSER;
                }
                _monitor_exit(FriendVisiableInfo$User$HeadUrlInfo.class);
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
    public String getCdn(){
       return this.cdn_;
    }
    public ByteString getCdnBytes(){
       return ByteString.copyFromUtf8(this.cdn_);
    }
    public String getUrl(){
       return this.url_;
    }
    public ByteString getUrlBytes(){
       return ByteString.copyFromUtf8(this.url_);
    }
    public void setCdn(String p0){
       Objects.requireNonNull(p0);
       this.cdn_ = p0;
    }
    public void setCdnBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.cdn_ = p0.toStringUtf8();
    }
    public void setUrl(String p0){
       Objects.requireNonNull(p0);
       this.url_ = p0;
    }
    public void setUrlBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.url_ = p0.toStringUtf8();
    }
}
