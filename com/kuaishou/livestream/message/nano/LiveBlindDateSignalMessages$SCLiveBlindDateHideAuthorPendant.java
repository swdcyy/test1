package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant extends MessageNano	// class@001118
{
    public String liveStreamId;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant clear(){
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateHideAuthorPendant mergeFrom(CodedInputByteBufferNano p0){
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
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
