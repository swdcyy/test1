package com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyPlayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$VoicePartyPlayInfo extends MessageNano	// class@001389
{
    public String bizId;
    public int newPlayType;
    public int playType;
    public static LiveStreamMessages$VoicePartyPlayInfo[] _emptyArray;

    public void LiveStreamMessages$VoicePartyPlayInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$VoicePartyPlayInfo[] emptyArray(){
       if (LiveStreamMessages$VoicePartyPlayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$VoicePartyPlayInfo._emptyArray == null) {
             LiveStreamMessages$VoicePartyPlayInfo[] voicePartyPl = new LiveStreamMessages$VoicePartyPlayInfo[0];
             LiveStreamMessages$VoicePartyPlayInfo._emptyArray = voicePartyPl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$VoicePartyPlayInfo._emptyArray;
    }
    public static LiveStreamMessages$VoicePartyPlayInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$VoicePartyPlayInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$VoicePartyPlayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$VoicePartyPlayInfo(), p0);
    }
    public LiveStreamMessages$VoicePartyPlayInfo clear(){
       this.playType = 0;
       this.bizId = "";
       this.newPlayType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$VoicePartyPlayInfo tplayType = this.playType;
       if (tplayType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tplayType);
       }
       if (!(this.bizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizId);
       }
       tplayType = this.newPlayType;
       if (tplayType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tplayType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$VoicePartyPlayInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = p0.readInt32();
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 1:
                         break;
                       default:
                   }
                   this.newPlayType = i;
                }
             }else {
                this.bizId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 1:
                   break;
                 default:
             }
             this.playType = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$VoicePartyPlayInfo tplayType = this.playType;
       if (tplayType != null) {
          p0.writeInt32(1, tplayType);
       }
       if (!(this.bizId).equals("")) {
          p0.writeString(2, this.bizId);
       }
       tplayType = this.newPlayType;
       if (tplayType != null) {
          p0.writeInt32(3, tplayType);
       }
       super.writeTo(p0);
       return;
    }
}
