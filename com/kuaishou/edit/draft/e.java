package com.kuaishou.edit.draft.e;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.CaptionTopic$TopicFrom;
import com.kuaishou.edit.draft.CaptionTopic$TopicType;

public interface abstract e implements MessageLiteOrBuilder	// class@00192d
{

    String getExpTag();
    ByteString getExpTagBytes();
    String getExtraInfo();
    ByteString getExtraInfoBytes();
    long getTopicClassifyId();
    CaptionTopic$TopicFrom getTopicFrom();
    int getTopicFromValue();
    long getTopicId();
    String getTopicName();
    ByteString getTopicNameBytes();
    CaptionTopic$TopicType getTopicType();
    int getTopicTypeValue();
}
