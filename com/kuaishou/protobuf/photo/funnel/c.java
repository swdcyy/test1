package com.kuaishou.protobuf.photo.funnel.c;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$Status;

public interface abstract c implements MessageLiteOrBuilder	// class@000e86
{

    long getEncodeCost();
    long getStartTimeStamp();
    EncodeStat$Status getStatus();
    int getStatusValue();
}
