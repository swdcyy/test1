package com.kwai.video.westeros.models.TriggerInputTextConfigOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.Map;
import com.kwai.video.westeros.models.TriggerInputTextData;

public interface abstract TriggerInputTextConfigOrBuilder implements MessageLiteOrBuilder	// class@001065
{

    boolean containsData(String p0);
    String getBgColor();
    ByteString getBgColorBytes();
    Map getData();
    int getDataCount();
    Map getDataMap();
    TriggerInputTextData getDataOrDefault(String p0,TriggerInputTextData p1);
    TriggerInputTextData getDataOrThrow(String p0);
    String getFontPath();
    ByteString getFontPathBytes();
    int getMaxInputLength();
    String getTextColor();
    ByteString getTextColorBytes();
    String getTitle();
    ByteString getTitleBytes();
}
