package com.kwai.sdk.eve.proto.ClickEventOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.sdk.eve.proto.ImageType;
import com.kwai.sdk.eve.proto.ClickEvent$ClickType;

public interface abstract ClickEventOrBuilder implements MessageLiteOrBuilder	// class@0015e1
{

    String getAction();
    ByteString getActionBytes();
    String getAuthorId();
    ByteString getAuthorIdBytes();
    String getContentId();
    ByteString getContentIdBytes();
    String getContentParamField1();
    ByteString getContentParamField1Bytes();
    ContentType getContentType();
    int getContentTypeValue();
    String getElementId();
    ByteString getElementIdBytes();
    String getElementParamField1();
    ByteString getElementParamField1Bytes();
    String getExpTag();
    ByteString getExpTagBytes();
    ImageType getImageType();
    int getImageTypeValue();
    double getLatitude();
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
    long getTimestamp();
    ClickEvent$ClickType getType();
    int getTypeValue();
    String getUrlParamField1();
    ByteString getUrlParamField1Bytes();
    String getUrlParamField2();
    ByteString getUrlParamField2Bytes();
}
