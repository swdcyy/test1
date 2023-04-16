package com.kuaishou.share.b;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.share.ResultPackageForSync$InternalCustomProtoEvent;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract b implements MessageLiteOrBuilder	// class@000f2e
{

    long getClientIncrementId();
    long getClientTimestamp();
    ResultPackageForSync$InternalCustomProtoEvent getCustomProtoEvent();
    long getServerTimestamp();
    String getSessionId();
    ByteString getSessionIdBytes();
    boolean hasCustomProtoEvent();
}
