package com.kuaishou.edit.draft.FriendVisiableInfo$User;
import com.kuaishou.edit.draft.FriendVisiableInfo$c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$a;
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
import com.kuaishou.edit.draft.FriendVisiableInfo$User$HeadUrlInfo$a;
import java.lang.Object;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$HeadUrlInfo;
import java.util.Objects;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.FriendVisiableInfo$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$b;

public final class FriendVisiableInfo$User extends GeneratedMessageLite implements FriendVisiableInfo$c	// class@0017b3
{
    public String headUrl_;
    public Internal$ProtobufList headUrls_;
    public String id_;
    public boolean isFollowing_;
    public String name_;
    public boolean visitorBeFollowed_;
    public static final FriendVisiableInfo$User DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       FriendVisiableInfo$User user = new FriendVisiableInfo$User();
       FriendVisiableInfo$User.DEFAULT_INSTANCE = user;
       GeneratedMessageLite.registerDefaultInstance(FriendVisiableInfo$User.class, user);
    }
    public void FriendVisiableInfo$User(){
       super();
       this.id_ = "";
       this.name_ = "";
       this.headUrl_ = "";
       this.headUrls_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static FriendVisiableInfo$User getDefaultInstance(){
       return FriendVisiableInfo$User.DEFAULT_INSTANCE;
    }
    public static FriendVisiableInfo$User$a newBuilder(){
       return FriendVisiableInfo$User.DEFAULT_INSTANCE.createBuilder();
    }
    public static FriendVisiableInfo$User$a newBuilder(FriendVisiableInfo$User p0){
       return FriendVisiableInfo$User.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static FriendVisiableInfo$User parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0, p1);
    }
    public static FriendVisiableInfo$User parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0);
    }
    public static FriendVisiableInfo$User parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(FriendVisiableInfo$User.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return FriendVisiableInfo$User.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllHeadUrls(Iterable p0){
       this.ensureHeadUrlsIsMutable();
       AbstractMessageLite.addAll(p0, this.headUrls_);
    }
    public void addHeadUrls(int p0,FriendVisiableInfo$User$HeadUrlInfo$a p1){
       this.ensureHeadUrlsIsMutable();
       this.headUrls_.add(p0, p1.build());
    }
    public void addHeadUrls(int p0,FriendVisiableInfo$User$HeadUrlInfo p1){
       Objects.requireNonNull(p1);
       this.ensureHeadUrlsIsMutable();
       this.headUrls_.add(p0, p1);
    }
    public void addHeadUrls(FriendVisiableInfo$User$HeadUrlInfo$a p0){
       this.ensureHeadUrlsIsMutable();
       this.headUrls_.add(p0.build());
    }
    public void addHeadUrls(FriendVisiableInfo$User$HeadUrlInfo p0){
       Objects.requireNonNull(p0);
       this.ensureHeadUrlsIsMutable();
       this.headUrls_.add(p0);
    }
    public void clearHeadUrl(){
       this.headUrl_ = FriendVisiableInfo$User.getDefaultInstance().getHeadUrl();
    }
    public void clearHeadUrls(){
       this.headUrls_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearId(){
       this.id_ = FriendVisiableInfo$User.getDefaultInstance().getId();
    }
    public void clearIsFollowing(){
       this.isFollowing_ = false;
    }
    public void clearName(){
       this.name_ = FriendVisiableInfo$User.getDefaultInstance().getName();
    }
    public void clearVisitorBeFollowed(){
       this.visitorBeFollowed_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (FriendVisiableInfo$a.a[p0.ordinal()]){
           case 1:
             return new FriendVisiableInfo$User();
           case 2:
             return new FriendVisiableInfo$User$a(p2);
           case 3:
             Object[] objArray = new Object[]{"id_","name_","headUrl_","isFollowing_","visitorBeFollowed_","headUrls_",FriendVisiableInfo$User$HeadUrlInfo.class};
             return GeneratedMessageLite.newMessageInfo(FriendVisiableInfo$User.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x07\x05\x07\x06\x1b\x00", objArray);
           case 4:
             return FriendVisiableInfo$User.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = FriendVisiableInfo$User.PARSER;
             if (pARSER == null) {
                _monitor_enter(FriendVisiableInfo$User.class);
                pARSER = FriendVisiableInfo$User.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(FriendVisiableInfo$User.DEFAULT_INSTANCE);
                   FriendVisiableInfo$User.PARSER = pARSER;
                }
                _monitor_exit(FriendVisiableInfo$User.class);
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
    public final void ensureHeadUrlsIsMutable(){
       if (!this.headUrls_.isModifiable()) {
          this.headUrls_ = GeneratedMessageLite.mutableCopy(this.headUrls_);
       }
       return;
    }
    public String getHeadUrl(){
       return this.headUrl_;
    }
    public ByteString getHeadUrlBytes(){
       return ByteString.copyFromUtf8(this.headUrl_);
    }
    public FriendVisiableInfo$User$HeadUrlInfo getHeadUrls(int p0){
       return this.headUrls_.get(p0);
    }
    public int getHeadUrlsCount(){
       return this.headUrls_.size();
    }
    public List getHeadUrlsList(){
       return this.headUrls_;
    }
    public FriendVisiableInfo$User$b getHeadUrlsOrBuilder(int p0){
       return this.headUrls_.get(p0);
    }
    public List getHeadUrlsOrBuilderList(){
       return this.headUrls_;
    }
    public String getId(){
       return this.id_;
    }
    public ByteString getIdBytes(){
       return ByteString.copyFromUtf8(this.id_);
    }
    public boolean getIsFollowing(){
       return this.isFollowing_;
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public boolean getVisitorBeFollowed(){
       return this.visitorBeFollowed_;
    }
    public void removeHeadUrls(int p0){
       this.ensureHeadUrlsIsMutable();
       this.headUrls_.remove(p0);
    }
    public void setHeadUrl(String p0){
       Objects.requireNonNull(p0);
       this.headUrl_ = p0;
    }
    public void setHeadUrlBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.headUrl_ = p0.toStringUtf8();
    }
    public void setHeadUrls(int p0,FriendVisiableInfo$User$HeadUrlInfo$a p1){
       this.ensureHeadUrlsIsMutable();
       this.headUrls_.set(p0, p1.build());
    }
    public void setHeadUrls(int p0,FriendVisiableInfo$User$HeadUrlInfo p1){
       Objects.requireNonNull(p1);
       this.ensureHeadUrlsIsMutable();
       this.headUrls_.set(p0, p1);
    }
    public void setId(String p0){
       Objects.requireNonNull(p0);
       this.id_ = p0;
    }
    public void setIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.id_ = p0.toStringUtf8();
    }
    public void setIsFollowing(boolean p0){
       this.isFollowing_ = p0;
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
    public void setVisitorBeFollowed(boolean p0){
       this.visitorBeFollowed_ = p0;
    }
}
