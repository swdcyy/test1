package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd extends MessageNano	// class@001112
{
    public String liveStreamId;
    public long[] paidServingUserId;
    public String sessionId;
    public boolean showReview;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd clear(){
       this.liveStreamId = "";
       this.sessionId = "";
       this.showReview = false;
       this.paidServingUserId = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.sessionId);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd tshowReview = this.showReview;
       if (tshowReview != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tshowReview);
       }
       tshowReview = this.paidServingUserId;
       if (tshowReview != null && tshowReview.length > 0) {
          int i1 = 0;
          int i2 = 0;
          LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd tpaidServing = this.paidServingUserId;
          while (i1 < tpaidServing.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tpaidServing[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tpaidServing.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd tpaidServing;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   int i1 = 32;
                   if (i != i1) {
                      if (i != 34) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.pushLimit(p0.readRawVarint32());
                         i1 = p0.getPosition();
                         i2 = 0;
                         while (p0.getBytesUntilLimit() > 0) {
                            p0.readUInt64();
                            i2 = i2 + 1;
                         }
                         p0.rewindToPosition(i1);
                         tpaidServing = this.paidServingUserId;
                         int i3 = (tpaidServing == null)? 0: tpaidServing.length;
                         i2 = i2 + i3;
                         long[] olongArray = new long[i2];
                         if (i3) {
                            System.arraycopy(tpaidServing, 0, olongArray, 0, i3);
                         }
                         while (i3 < i2) {
                            olongArray[i3] = p0.readUInt64();
                            i3 = i3 + 1;
                         }
                         this.paidServingUserId = olongArray;
                         p0.popLimit(i);
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tpaidServing = this.paidServingUserId;
                      i2 = (tpaidServing == null)? 0: tpaidServing.length;
                      i = i + i2;
                      long[] olongArray1 = new long[i];
                      if (i2) {
                         System.arraycopy(tpaidServing, 0, olongArray1, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         olongArray1[i2] = p0.readUInt64();
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      olongArray1[i2] = p0.readUInt64();
                      this.paidServingUserId = olongArray1;
                   }
                }else {
                   this.showReview = p0.readBool();
                }
             }else {
                this.sessionId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.sessionId).equals(str)) {
          p0.writeString(2, this.sessionId);
       }
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd tshowReview = this.showReview;
       if (tshowReview != null) {
          p0.writeBool(3, tshowReview);
       }
       tshowReview = this.paidServingUserId;
       if (tshowReview != null && tshowReview.length > 0) {
          int i = 0;
          LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd tpaidServing = this.paidServingUserId;
          while (i < tpaidServing.length) {
             p0.writeUInt64(4, tpaidServing[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
