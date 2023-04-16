package com.kwai.video.westeros.models.UserInfoOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.Gender;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract UserInfoOrBuilder implements MessageLiteOrBuilder	// class@00107f
{

    Gender getGender();
    int getGenderValue();
    String getUserId();
    ByteString getUserIdBytes();
    String getUserImagePath();
    ByteString getUserImagePathBytes();
    String getUserName();
    ByteString getUserNameBytes();
}
