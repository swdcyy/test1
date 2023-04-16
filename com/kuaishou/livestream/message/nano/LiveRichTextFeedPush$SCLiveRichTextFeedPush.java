package com.kuaishou.livestream.message.nano.LiveRichTextFeedPush$SCLiveRichTextFeedPush;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveRichTextFeedPush$SCLiveRichTextFeedPush extends MessageNano	// class@001295
{
    public LiveStreamRichTextFeed$RichTextFeed[] richTextFeed;
    public static LiveRichTextFeedPush$SCLiveRichTextFeedPush[] _emptyArray;

    public void LiveRichTextFeedPush$SCLiveRichTextFeedPush(){
       super();
       this.clear();
    }
    public static LiveRichTextFeedPush$SCLiveRichTextFeedPush[] emptyArray(){
       if (LiveRichTextFeedPush$SCLiveRichTextFeedPush._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRichTextFeedPush$SCLiveRichTextFeedPush._emptyArray == null) {
             LiveRichTextFeedPush$SCLiveRichTextFeedPush[] sCLiveRichTe = new LiveRichTextFeedPush$SCLiveRichTextFeedPush[0];
             LiveRichTextFeedPush$SCLiveRichTextFeedPush._emptyArray = sCLiveRichTe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRichTextFeedPush$SCLiveRichTextFeedPush._emptyArray;
    }
    public static LiveRichTextFeedPush$SCLiveRichTextFeedPush parseFrom(CodedInputByteBufferNano p0){
       return new LiveRichTextFeedPush$SCLiveRichTextFeedPush().mergeFrom(p0);
    }
    public static LiveRichTextFeedPush$SCLiveRichTextFeedPush parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRichTextFeedPush$SCLiveRichTextFeedPush(), p0);
    }
    public LiveRichTextFeedPush$SCLiveRichTextFeedPush clear(){
       this.richTextFeed = LiveStreamRichTextFeed$RichTextFeed.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRichTextFeedPush$SCLiveRichTextFeedPush trichTextFee = this.richTextFeed;
       if (trichTextFee != null && trichTextFee.length > 0) {
          int i1 = 0;
          LiveRichTextFeedPush$SCLiveRichTextFeedPush trichTextFee1 = this.richTextFeed;
          while (i1 < trichTextFee1.length) {
             object oobject = trichTextFee1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRichTextFeedPush$SCLiveRichTextFeedPush mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveRichTextFeedPush$SCLiveRichTextFeedPush trichTextFee = this.richTextFeed;
             int i2 = (trichTextFee == null)? 0: trichTextFee.length;
             i = i + i2;
             LiveStreamRichTextFeed$RichTextFeed[] richTextFeed = new LiveStreamRichTextFeed$RichTextFeed[i];
             if (i2) {
                System.arraycopy(trichTextFee, 0, richTextFeed, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                richTextFeed[i2] = new LiveStreamRichTextFeed$RichTextFeed();
                p0.readMessage(richTextFeed[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             richTextFeed[i2] = new LiveStreamRichTextFeed$RichTextFeed();
             p0.readMessage(richTextFeed[i2]);
             this.richTextFeed = richTextFeed;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRichTextFeedPush$SCLiveRichTextFeedPush trichTextFee = this.richTextFeed;
       if (trichTextFee != null && trichTextFee.length > 0) {
          int i = 0;
          LiveRichTextFeedPush$SCLiveRichTextFeedPush trichTextFee1 = this.richTextFeed;
          while (i < trichTextFee1.length) {
             object oobject = trichTextFee1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
