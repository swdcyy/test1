package com.kwai.video.westeros.models.PopupWindowConfigOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.Map;
import com.kwai.video.westeros.models.PopupWindowConfigData;

public interface abstract PopupWindowConfigOrBuilder implements MessageLiteOrBuilder	// class@00101a
{

    boolean containsData(String p0);
    String getBgColor();
    ByteString getBgColorBytes();
    Map getData();
    int getDataCount();
    Map getDataMap();
    PopupWindowConfigData getDataOrDefault(String p0,PopupWindowConfigData p1);
    PopupWindowConfigData getDataOrThrow(String p0);
    int getMaxInputLength();
    float getTriggerHeight();
    float getTriggerWidth();
    float getTriggerX();
    float getTriggerY();
}
