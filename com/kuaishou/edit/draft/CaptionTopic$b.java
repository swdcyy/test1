package com.kuaishou.edit.draft.CaptionTopic$b;
import com.kuaishou.edit.draft.e;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.CaptionTopic;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.CaptionTopic$a;
import java.lang.String;
import com.kuaishou.edit.draft.CaptionTopic$TopicType;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.CaptionTopic$TopicFrom;

public final class CaptionTopic$b extends GeneratedMessageLite$Builder implements e	// class@001749
{

    public void CaptionTopic$b(){
       super(CaptionTopic.DEFAULT_INSTANCE);
    }
    public void CaptionTopic$b(CaptionTopic$a p0){
       super(CaptionTopic.DEFAULT_INSTANCE);
    }
    public CaptionTopic$b a(String p0){
       this.copyOnWrite();
       this.instance.setExtraInfo(p0);
       return this;
    }
    public CaptionTopic$b b(long p0){
       this.copyOnWrite();
       this.instance.setTopicId(p0);
       return this;
    }
    public CaptionTopic$b c(String p0){
       this.copyOnWrite();
       this.instance.setTopicName(p0);
       return this;
    }
    public CaptionTopic$b d(CaptionTopic$TopicType p0){
       this.copyOnWrite();
       this.instance.setTopicType(p0);
       return this;
    }
    public String getExpTag(){
       return this.instance.getExpTag();
    }
    public ByteString getExpTagBytes(){
       return this.instance.getExpTagBytes();
    }
    public String getExtraInfo(){
       return this.instance.getExtraInfo();
    }
    public ByteString getExtraInfoBytes(){
       return this.instance.getExtraInfoBytes();
    }
    public long getTopicClassifyId(){
       return this.instance.getTopicClassifyId();
    }
    public CaptionTopic$TopicFrom getTopicFrom(){
       return this.instance.getTopicFrom();
    }
    public int getTopicFromValue(){
       return this.instance.getTopicFromValue();
    }
    public long getTopicId(){
       return this.instance.getTopicId();
    }
    public String getTopicName(){
       return this.instance.getTopicName();
    }
    public ByteString getTopicNameBytes(){
       return this.instance.getTopicNameBytes();
    }
    public CaptionTopic$TopicType getTopicType(){
       return this.instance.getTopicType();
    }
    public int getTopicTypeValue(){
       return this.instance.getTopicTypeValue();
    }
}
