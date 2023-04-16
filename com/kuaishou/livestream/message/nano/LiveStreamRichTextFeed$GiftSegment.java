package com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$GiftSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamRichTextFeed$GiftSegment extends MessageNano	// class@001393
{
    public int giftId;
    public static LiveStreamRichTextFeed$GiftSegment[] _emptyArray;

    public void LiveStreamRichTextFeed$GiftSegment(){
       super();
       this.clear();
    }
    public static LiveStreamRichTextFeed$GiftSegment[] emptyArray(){
       if (LiveStreamRichTextFeed$GiftSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamRichTextFeed$GiftSegment._emptyArray == null) {
             LiveStreamRichTextFeed$GiftSegment[] giftSegmentA = new LiveStreamRichTextFeed$GiftSegment[0];
             LiveStreamRichTextFeed$GiftSegment._emptyArray = giftSegmentA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamRichTextFeed$GiftSegment._emptyArray;
    }
    public static LiveStreamRichTextFeed$GiftSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamRichTextFeed$GiftSegment().mergeFrom(p0);
    }
    public static LiveStreamRichTextFeed$GiftSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamRichTextFeed$GiftSegment(), p0);
    }
    public LiveStreamRichTextFeed$GiftSegment clear(){
       this.giftId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamRichTextFeed$GiftSegment tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tgiftId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamRichTextFeed$GiftSegment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.giftId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamRichTextFeed$GiftSegment tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       super.writeTo(p0);
       return;
    }
}
