package com.kuaishou.livestream.message.nano.LiveTopUserV2$SCLiveTopUserScoreEventToast;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveTopUserV2$SCLiveTopUserScoreEventToast extends MessageNano	// class@0013a7
{
    public int actionType;
    public static LiveTopUserV2$SCLiveTopUserScoreEventToast[] _emptyArray;

    public void LiveTopUserV2$SCLiveTopUserScoreEventToast(){
       super();
       this.clear();
    }
    public static LiveTopUserV2$SCLiveTopUserScoreEventToast[] emptyArray(){
       if (LiveTopUserV2$SCLiveTopUserScoreEventToast._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTopUserV2$SCLiveTopUserScoreEventToast._emptyArray == null) {
             LiveTopUserV2$SCLiveTopUserScoreEventToast[] sCLiveTopUse = new LiveTopUserV2$SCLiveTopUserScoreEventToast[0];
             LiveTopUserV2$SCLiveTopUserScoreEventToast._emptyArray = sCLiveTopUse;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTopUserV2$SCLiveTopUserScoreEventToast._emptyArray;
    }
    public static LiveTopUserV2$SCLiveTopUserScoreEventToast parseFrom(CodedInputByteBufferNano p0){
       return new LiveTopUserV2$SCLiveTopUserScoreEventToast().mergeFrom(p0);
    }
    public static LiveTopUserV2$SCLiveTopUserScoreEventToast parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTopUserV2$SCLiveTopUserScoreEventToast(), p0);
    }
    public LiveTopUserV2$SCLiveTopUserScoreEventToast clear(){
       this.actionType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveTopUserV2$SCLiveTopUserScoreEventToast tactionType = this.actionType;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tactionType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTopUserV2$SCLiveTopUserScoreEventToast mergeFrom(CodedInputByteBufferNano p0){
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
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.actionType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveTopUserV2$SCLiveTopUserScoreEventToast tactionType = this.actionType;
       if (tactionType != null) {
          p0.writeInt32(1, tactionType);
       }
       super.writeTo(p0);
       return;
    }
}
