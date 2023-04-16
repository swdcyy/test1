package com.kwai.video.westeros.models.UserInfo;
import com.kwai.video.westeros.models.UserInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.UserInfo$Builder;
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
import com.kwai.video.westeros.models.UserInfo$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.Gender;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class UserInfo extends GeneratedMessageLite implements UserInfoOrBuilder	// class@00107e
{
    public int gender_;
    public String userId_;
    public String userImagePath_;
    public String userName_;
    public static final UserInfo DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       UserInfo userInfo = new UserInfo();
       UserInfo.DEFAULT_INSTANCE = userInfo;
       GeneratedMessageLite.registerDefaultInstance(UserInfo.class, userInfo);
    }
    public void UserInfo(){
       super();
       this.userName_ = "";
       this.userId_ = "";
       this.userImagePath_ = "";
    }
    public static UserInfo getDefaultInstance(){
       return UserInfo.DEFAULT_INSTANCE;
    }
    public static UserInfo$Builder newBuilder(){
       return UserInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static UserInfo$Builder newBuilder(UserInfo p0){
       return UserInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static UserInfo parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(UserInfo.DEFAULT_INSTANCE, p0);
    }
    public static UserInfo parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(UserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static UserInfo parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0);
    }
    public static UserInfo parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static UserInfo parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0);
    }
    public static UserInfo parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static UserInfo parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0);
    }
    public static UserInfo parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static UserInfo parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0);
    }
    public static UserInfo parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static UserInfo parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0);
    }
    public static UserInfo parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(UserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return UserInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearGender(){
       this.gender_ = 0;
    }
    public void clearUserId(){
       this.userId_ = UserInfo.getDefaultInstance().getUserId();
    }
    public void clearUserImagePath(){
       this.userImagePath_ = UserInfo.getDefaultInstance().getUserImagePath();
    }
    public void clearUserName(){
       this.userName_ = UserInfo.getDefaultInstance().getUserName();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (UserInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new UserInfo();
           case 2:
             return new UserInfo$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"userName_","userId_","userImagePath_","gender_"};
             return GeneratedMessageLite.newMessageInfo(UserInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\f\x00", objArray);
           case 4:
             return UserInfo.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = UserInfo.PARSER;
             if (pARSER == null) {
                _monitor_enter(UserInfo.class);
                pARSER = UserInfo.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(UserInfo.DEFAULT_INSTANCE);
                   UserInfo.PARSER = pARSER;
                }
                _monitor_exit(UserInfo.class);
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
    public Gender getGender(){
       Gender gender = Gender.forNumber(this.gender_);
       if (gender == null) {
          gender = Gender.UNRECOGNIZED;
       }
       return gender;
    }
    public int getGenderValue(){
       return this.gender_;
    }
    public String getUserId(){
       return this.userId_;
    }
    public ByteString getUserIdBytes(){
       return ByteString.copyFromUtf8(this.userId_);
    }
    public String getUserImagePath(){
       return this.userImagePath_;
    }
    public ByteString getUserImagePathBytes(){
       return ByteString.copyFromUtf8(this.userImagePath_);
    }
    public String getUserName(){
       return this.userName_;
    }
    public ByteString getUserNameBytes(){
       return ByteString.copyFromUtf8(this.userName_);
    }
    public void setGender(Gender p0){
       Objects.requireNonNull(p0);
       this.gender_ = p0.getNumber();
    }
    public void setGenderValue(int p0){
       this.gender_ = p0;
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
    public void setUserImagePath(String p0){
       Objects.requireNonNull(p0);
       this.userImagePath_ = p0;
    }
    public void setUserImagePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.userImagePath_ = p0.toStringUtf8();
    }
    public void setUserName(String p0){
       Objects.requireNonNull(p0);
       this.userName_ = p0;
    }
    public void setUserNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.userName_ = p0.toStringUtf8();
    }
}
