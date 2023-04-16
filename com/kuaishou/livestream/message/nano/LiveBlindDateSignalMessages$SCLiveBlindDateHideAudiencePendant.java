package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant extends MessageNano	// class@001117
{
    public String liveStreamId;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant clear(){
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
    public LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant mergeFrom(CodedInputByteBufferNano p0){
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
