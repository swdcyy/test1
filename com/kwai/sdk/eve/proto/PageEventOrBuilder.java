package com.kwai.sdk.eve.proto.PageEventOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.sdk.eve.proto.PageEvent$Action;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.sdk.eve.proto.PageEvent$SubAction;

public interface abstract PageEventOrBuilder implements MessageLiteOrBuilder	// class@0015fa
{

    PageEvent$Action getAction();
    int getActionValue();
    String getAuthorId();
    ByteString getAuthorIdBytes();
    String getContentId();
    ByteString getContentIdBytes();
    String getContentParamField1();
    ByteString getContentParamField1Bytes();
    ContentType getContentType();
    int getContentTypeValue();
    String getEntryPageId();
    ByteString getEntryPageIdBytes();
    String getEntryPageSource();
    ByteString getEntryPageSourceBytes();
    String getExpTag();
    ByteString getExpTagBytes();
    long getForegroundTime();
    String getIdentity();
    ByteString getIdentityBytes();
    String getLastPage();
    ByteString getLastPageBytes();
    double getLatitude();
    String getLlsid();
    ByteString getLlsidBytes();
    double getLongitude();
    String getPage();
    ByteString getPageBytes();
    int getPageShowSeq();
    int getPosition();
    String getReferPage();
    ByteString getReferPageBytes();
    String getSessionId();
    ByteString getSessionIdBytes();
    PageEvent$SubAction getSubAction();
    int getSubActionValue();
    long getTimestamp();
    String getUrlParamField1();
    ByteString getUrlParamField1Bytes();
    String getUrlParamField2();
    ByteString getUrlParamField2Bytes();
}
