package com.kwai.sdk.eve.proto.ShowEventOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.sdk.eve.proto.ImageType;
import com.kwai.sdk.eve.proto.ShowEvent$ShowType;

public interface abstract ShowEventOrBuilder implements MessageLiteOrBuilder	// class@001608
{

    String getAuthorId();
    ByteString getAuthorIdBytes();
    int getClickCount();
    String getContentId();
    ByteString getContentIdBytes();
    ContentType getContentType();
    int getContentTypeValue();
    long getEnterTimestamp();
    String getExpTag();
    ByteString getExpTagBytes();
    ImageType getImageType();
    int getImageTypeValue();
    double getLatitude();
    long getLeaveTimestamp();
    String getLlsid();
    ByteString getLlsidBytes();
    double getLongitude();
    String getPage();
    ByteString getPageBytes();
    int getPosition();
    String getReferPage();
    ByteString getReferPageBytes();
    String getSessionId();
    ByteString getSessionIdBytes();
    int getShowCount();
    ShowEvent$ShowType getType();
    int getTypeValue();
}
