package com.kwai.sdk.eve.proto.AFKEventOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.sdk.eve.proto.AFKEvent$Action;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract AFKEventOrBuilder implements MessageLiteOrBuilder	// class@0015da
{

    AFKEvent$Action getAction();
    int getActionValue();
    String getDate();
    ByteString getDateBytes();
    long getDuration();
    String getLevel();
    ByteString getLevelBytes();
    String getPage();
    ByteString getPageBytes();
    String getSessionId();
    ByteString getSessionIdBytes();
    long getTimestamp();
}
