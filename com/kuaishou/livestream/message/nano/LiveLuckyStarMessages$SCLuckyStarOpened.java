package com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLuckyStarMessages$SCLuckyStarOpened extends MessageNano	// class@0011f5
{
    public String luckyStarId;
    public long requestMaxDelayMillis;
    public boolean useNewUi;
    public static LiveLuckyStarMessages$SCLuckyStarOpened[] _emptyArray;

    public void LiveLuckyStarMessages$SCLuckyStarOpened(){
       super();
       this.clear();
    }
    public static LiveLuckyStarMessages$SCLuckyStarOpened[] emptyArray(){
       if (LiveLuckyStarMessages$SCLuckyStarOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLuckyStarMessages$SCLuckyStarOpened._emptyArray == null) {
             LiveLuckyStarMessages$SCLuckyStarOpened[] sCLuckyStarO = new LiveLuckyStarMessages$SCLuckyStarOpened[0];
             LiveLuckyStarMessages$SCLuckyStarOpened._emptyArray = sCLuckyStarO;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLuckyStarMessages$SCLuckyStarOpened._emptyArray;
    }
    public static LiveLuckyStarMessages$SCLuckyStarOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveLuckyStarMessages$SCLuckyStarOpened().mergeFrom(p0);
    }
    public static LiveLuckyStarMessages$SCLuckyStarOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLuckyStarMessages$SCLuckyStarOpened(), p0);
    }
    public LiveLuckyStarMessages$SCLuckyStarOpened clear(){
       this.luckyStarId = "";
       this.requestMaxDelayMillis = 0;
       this.useNewUi = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.luckyStarId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.luckyStarId);
       }
       LiveLuckyStarMessages$SCLuckyStarOpened trequestMaxD = this.requestMaxDelayMillis;
       if (trequestMaxD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, trequestMaxD);
       }
       trequestMaxD = this.useNewUi;
       if (trequestMaxD != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, trequestMaxD);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLuckyStarMessages$SCLuckyStarOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 48) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.useNewUi = p0.readBool();
                }
             }else {
                this.requestMaxDelayMillis = p0.readUInt64();
             }
          }else {
             this.luckyStarId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.luckyStarId).equals("")) {
          p0.writeString(1, this.luckyStarId);
       }
       LiveLuckyStarMessages$SCLuckyStarOpened trequestMaxD = this.requestMaxDelayMillis;
       if (trequestMaxD) {
          p0.writeUInt64(2, trequestMaxD);
       }
       trequestMaxD = this.useNewUi;
       if (trequestMaxD != null) {
          p0.writeBool(6, trequestMaxD);
       }
       super.writeTo(p0);
       return;
    }
}
