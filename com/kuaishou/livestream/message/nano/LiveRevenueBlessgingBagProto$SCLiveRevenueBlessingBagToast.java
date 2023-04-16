package com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle;

public final class LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast extends MessageNano	// class@001290
{
    public LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle noticeTextCaption;
    public LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle noticeTextSubline;
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast[] _emptyArray;

    public void LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast(){
       super();
       this.clear();
    }
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast[] emptyArray(){
       if (LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast._emptyArray == null) {
             LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast[] sCLiveRevenu = new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast[0];
             LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast._emptyArray = sCLiveRevenu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast._emptyArray;
    }
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast parseFrom(CodedInputByteBufferNano p0){
       return new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast().mergeFrom(p0);
    }
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast(), p0);
    }
    public LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast clear(){
       this.noticeTextCaption = null;
       this.noticeTextSubline = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast tnoticeTextC = this.noticeTextCaption;
       if (tnoticeTextC != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tnoticeTextC);
       }
       tnoticeTextC = this.noticeTextSubline;
       if (tnoticeTextC != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tnoticeTextC);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.noticeTextSubline == null){
                this.noticeTextSubline = new LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle();
             }
             p0.readMessage(this.noticeTextSubline);
          }else if(this.noticeTextCaption == null){
             this.noticeTextCaption = new LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle();
          }
          p0.readMessage(this.noticeTextCaption);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagToast tnoticeTextC = this.noticeTextCaption;
       if (tnoticeTextC != null) {
          p0.writeMessage(1, tnoticeTextC);
       }
       tnoticeTextC = this.noticeTextSubline;
       if (tnoticeTextC != null) {
          p0.writeMessage(2, tnoticeTextC);
       }
       super.writeTo(p0);
       return;
    }
}
