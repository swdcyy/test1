package com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentGiftSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;

public final class LiveCommentRichText$CommentGiftSegment extends MessageNano	// class@000c4e
{
    public int giftId;
    public LiveCommentAction$Action tapAction;
    public static LiveCommentRichText$CommentGiftSegment[] _emptyArray;

    public void LiveCommentRichText$CommentGiftSegment(){
       super();
       this.clear();
    }
    public static LiveCommentRichText$CommentGiftSegment[] emptyArray(){
       if (LiveCommentRichText$CommentGiftSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentRichText$CommentGiftSegment._emptyArray == null) {
             LiveCommentRichText$CommentGiftSegment[] uCommentGift = new LiveCommentRichText$CommentGiftSegment[0];
             LiveCommentRichText$CommentGiftSegment._emptyArray = uCommentGift;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentRichText$CommentGiftSegment._emptyArray;
    }
    public static LiveCommentRichText$CommentGiftSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentRichText$CommentGiftSegment().mergeFrom(p0);
    }
    public static LiveCommentRichText$CommentGiftSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentRichText$CommentGiftSegment(), p0);
    }
    public LiveCommentRichText$CommentGiftSegment clear(){
       this.giftId = 0;
       this.tapAction = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommentRichText$CommentGiftSegment tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tgiftId);
       }
       tgiftId = this.tapAction;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tgiftId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentRichText$CommentGiftSegment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.tapAction == null){
                this.tapAction = new LiveCommentAction$Action();
             }
             p0.readMessage(this.tapAction);
          }else {
             this.giftId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommentRichText$CommentGiftSegment tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       tgiftId = this.tapAction;
       if (tgiftId != null) {
          p0.writeMessage(2, tgiftId);
       }
       super.writeTo(p0);
       return;
    }
}
