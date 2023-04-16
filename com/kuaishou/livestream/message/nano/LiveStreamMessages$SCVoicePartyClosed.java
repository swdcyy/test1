package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoicePartyClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCVoicePartyClosed extends MessageNano	// class@001372
{
    public long time;
    public String voicePartyId;
    public static LiveStreamMessages$SCVoicePartyClosed[] _emptyArray;

    public void LiveStreamMessages$SCVoicePartyClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCVoicePartyClosed[] emptyArray(){
       if (LiveStreamMessages$SCVoicePartyClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCVoicePartyClosed._emptyArray == null) {
             LiveStreamMessages$SCVoicePartyClosed[] sCVoiceParty = new LiveStreamMessages$SCVoicePartyClosed[0];
             LiveStreamMessages$SCVoicePartyClosed._emptyArray = sCVoiceParty;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCVoicePartyClosed._emptyArray;
    }
    public static LiveStreamMessages$SCVoicePartyClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCVoicePartyClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCVoicePartyClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCVoicePartyClosed(), p0);
    }
    public LiveStreamMessages$SCVoicePartyClosed clear(){
       this.time = 0;
       this.voicePartyId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCVoicePartyClosed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       if (!(this.voicePartyId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCVoicePartyClosed mergeFrom(CodedInputByteBufferNano p0){
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
             }else {
                this.voicePartyId = p0.readString();
             }
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCVoicePartyClosed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       if (!(this.voicePartyId).equals("")) {
          p0.writeString(2, this.voicePartyId);
       }
       super.writeTo(p0);
       return;
    }
}
