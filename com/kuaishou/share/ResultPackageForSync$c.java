package com.kuaishou.share.ResultPackageForSync$c;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.share.ResultPackage;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract ResultPackageForSync$c implements MessageLiteOrBuilder	// class@000f28
{

    ResultPackage getPayload();
    String getType();
    ByteString getTypeBytes();
    boolean hasPayload();
}
