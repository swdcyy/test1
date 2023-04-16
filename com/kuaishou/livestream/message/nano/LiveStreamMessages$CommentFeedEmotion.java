package com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeedEmotion;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$CommentFeedEmotion extends MessageNano	// class@0012cc
{
    public String emotionName;
    public static LiveStreamMessages$CommentFeedEmotion[] _emptyArray;

    public void LiveStreamMessages$CommentFeedEmotion(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CommentFeedEmotion[] emptyArray(){
       if (LiveStreamMessages$CommentFeedEmotion._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CommentFeedEmotion._emptyArray == null) {
             LiveStreamMessages$CommentFeedEmotion[] uCommentFeed = new LiveStreamMessages$CommentFeedEmotion[0];
             LiveStreamMessages$CommentFeedEmotion._emptyArray = uCommentFeed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CommentFeedEmotion._emptyArray;
    }
    public static LiveStreamMessages$CommentFeedEmotion parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CommentFeedEmotion().mergeFrom(p0);
    }
    public static LiveStreamMessages$CommentFeedEmotion parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CommentFeedEmotion(), p0);
    }
    public LiveStreamMessages$CommentFeedEmotion clear(){
       this.emotionName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.emotionName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.emotionName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CommentFeedEmotion mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.emotionName = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.emotionName).equals("")) {
          p0.writeString(1, this.emotionName);
       }
       super.writeTo(p0);
       return;
    }
}
