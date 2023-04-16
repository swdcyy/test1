package com.kwai.video.westeros.models.UserInfo$Builder;
import com.kwai.video.westeros.models.UserInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.UserInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.UserInfo$1;
import com.kwai.video.westeros.models.Gender;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class UserInfo$Builder extends GeneratedMessageLite$Builder implements UserInfoOrBuilder	// class@00107d
{

    public void UserInfo$Builder(){
       super(UserInfo.DEFAULT_INSTANCE);
    }
    public void UserInfo$Builder(UserInfo$1 p0){
       super();
    }
    public UserInfo$Builder clearGender(){
       this.copyOnWrite();
       this.instance.clearGender();
       return this;
    }
    public UserInfo$Builder clearUserId(){
       this.copyOnWrite();
       this.instance.clearUserId();
       return this;
    }
    public UserInfo$Builder clearUserImagePath(){
       this.copyOnWrite();
       this.instance.clearUserImagePath();
       return this;
    }
    public UserInfo$Builder clearUserName(){
       this.copyOnWrite();
       this.instance.clearUserName();
       return this;
    }
    public Gender getGender(){
       return this.instance.getGender();
    }
    public int getGenderValue(){
       return this.instance.getGenderValue();
    }
    public String getUserId(){
       return this.instance.getUserId();
    }
    public ByteString getUserIdBytes(){
       return this.instance.getUserIdBytes();
    }
    public String getUserImagePath(){
       return this.instance.getUserImagePath();
    }
    public ByteString getUserImagePathBytes(){
       return this.instance.getUserImagePathBytes();
    }
    public String getUserName(){
       return this.instance.getUserName();
    }
    public ByteString getUserNameBytes(){
       return this.instance.getUserNameBytes();
    }
    public UserInfo$Builder setGender(Gender p0){
       this.copyOnWrite();
       this.instance.setGender(p0);
       return this;
    }
    public UserInfo$Builder setGenderValue(int p0){
       this.copyOnWrite();
       this.instance.setGenderValue(p0);
       return this;
    }
    public UserInfo$Builder setUserId(String p0){
       this.copyOnWrite();
       this.instance.setUserId(p0);
       return this;
    }
    public UserInfo$Builder setUserIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setUserIdBytes(p0);
       return this;
    }
    public UserInfo$Builder setUserImagePath(String p0){
       this.copyOnWrite();
       this.instance.setUserImagePath(p0);
       return this;
    }
    public UserInfo$Builder setUserImagePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setUserImagePathBytes(p0);
       return this;
    }
    public UserInfo$Builder setUserName(String p0){
       this.copyOnWrite();
       this.instance.setUserName(p0);
       return this;
    }
    public UserInfo$Builder setUserNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setUserNameBytes(p0);
       return this;
    }
}
