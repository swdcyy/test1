package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCCommentFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeed;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveStreamMessages$SCCommentFeed extends MessageNano	// class@001329
{
    public LiveStreamMessages$CommentFeed[] commentFeeds;
    public static LiveStreamMessages$SCCommentFeed[] _emptyArray;

    public void LiveStreamMessages$SCCommentFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCCommentFeed[] emptyArray(){
       if (LiveStreamMessages$SCCommentFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCCommentFeed._emptyArray == null) {
             LiveStreamMessages$SCCommentFeed[] sCCommentFee = new LiveStreamMessages$SCCommentFeed[0];
             LiveStreamMessages$SCCommentFeed._emptyArray = sCCommentFee;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCCommentFeed._emptyArray;
    }
    public static LiveStreamMessages$SCCommentFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCCommentFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCCommentFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCCommentFeed(), p0);
    }
    public LiveStreamMessages$SCCommentFeed clear(){
       this.commentFeeds = LiveStreamMessages$CommentFeed.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCCommentFeed tcommentFeed = this.commentFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCCommentFeed tcommentFeed1 = this.commentFeeds;
          while (i1 < tcommentFeed1.length) {
             object oobject = tcommentFeed1[i1];
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
    public LiveStreamMessages$SCCommentFeed mergeFrom(CodedInputByteBufferNano p0){
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
             LiveStreamMessages$SCCommentFeed tcommentFeed = this.commentFeeds;
             int i2 = (tcommentFeed == null)? 0: tcommentFeed.length;
             i = i + i2;
             LiveStreamMessages$CommentFeed[] uCommentFeed = new LiveStreamMessages$CommentFeed[i];
             if (i2) {
                System.arraycopy(tcommentFeed, 0, uCommentFeed, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uCommentFeed[i2] = new LiveStreamMessages$CommentFeed();
                p0.readMessage(uCommentFeed[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uCommentFeed[i2] = new LiveStreamMessages$CommentFeed();
             p0.readMessage(uCommentFeed[i2]);
             this.commentFeeds = uCommentFeed;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCCommentFeed tcommentFeed = this.commentFeeds;
       if (tcommentFeed != null && tcommentFeed.length > 0) {
          int i = 0;
          LiveStreamMessages$SCCommentFeed tcommentFeed1 = this.commentFeeds;
          while (i < tcommentFeed1.length) {
             object oobject = tcommentFeed1[i];
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
