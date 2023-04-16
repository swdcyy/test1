package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkOtherPlayerVoiceOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCPkOtherPlayerVoiceOpened extends MessageNano	// class@00135d
{
    public String pkId;
    public long time;
    public static LiveStreamMessages$SCPkOtherPlayerVoiceOpened[] _emptyArray;

    public void LiveStreamMessages$SCPkOtherPlayerVoiceOpened(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCPkOtherPlayerVoiceOpened[] emptyArray(){
       if (LiveStreamMessages$SCPkOtherPlayerVoiceOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCPkOtherPlayerVoiceOpened._emptyArray == null) {
             LiveStreamMessages$SCPkOtherPlayerVoiceOpened[] sCPkOtherPla = new LiveStreamMessages$SCPkOtherPlayerVoiceOpened[0];
             LiveStreamMessages$SCPkOtherPlayerVoiceOpened._emptyArray = sCPkOtherPla;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCPkOtherPlayerVoiceOpened._emptyArray;
    }
    public static LiveStreamMessages$SCPkOtherPlayerVoiceOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCPkOtherPlayerVoiceOpened().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCPkOtherPlayerVoiceOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCPkOtherPlayerVoiceOpened(), p0);
    }
    public LiveStreamMessages$SCPkOtherPlayerVoiceOpened clear(){
       this.pkId = "";
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LiveStreamMessages$SCPkOtherPlayerVoiceOpened ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCPkOtherPlayerVoiceOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.time = p0.readUInt64();
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       LiveStreamMessages$SCPkOtherPlayerVoiceOpened ttime = this.time;
       if (ttime) {
          p0.writeUInt64(2, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
