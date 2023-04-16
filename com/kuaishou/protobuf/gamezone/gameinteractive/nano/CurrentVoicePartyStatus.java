package com.kuaishou.protobuf.gamezone.gameinteractive.nano.CurrentVoicePartyStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatsInfo;

public final class CurrentVoicePartyStatus extends MessageNano	// class@000ba7
{
    public String aryaConfig;
    public MicSeatsInfo micSeatsInfo;
    public String voicePartyId;
    public static CurrentVoicePartyStatus[] _emptyArray;

    public void CurrentVoicePartyStatus(){
       super();
       this.clear();
    }
    public static CurrentVoicePartyStatus[] emptyArray(){
       if (CurrentVoicePartyStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CurrentVoicePartyStatus._emptyArray == null) {
             CurrentVoicePartyStatus[] uCurrentVoic = new CurrentVoicePartyStatus[0];
             CurrentVoicePartyStatus._emptyArray = uCurrentVoic;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CurrentVoicePartyStatus._emptyArray;
    }
    public static CurrentVoicePartyStatus parseFrom(CodedInputByteBufferNano p0){
       return new CurrentVoicePartyStatus().mergeFrom(p0);
    }
    public static CurrentVoicePartyStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CurrentVoicePartyStatus(), p0);
    }
    public CurrentVoicePartyStatus clear(){
       this.voicePartyId = "";
       this.micSeatsInfo = null;
       this.aryaConfig = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.voicePartyId);
       }
       CurrentVoicePartyStatus tmicSeatsInf = this.micSeatsInfo;
       if (tmicSeatsInf != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tmicSeatsInf);
       }
       if (!(this.aryaConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.aryaConfig);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CurrentVoicePartyStatus mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.aryaConfig = p0.readString();
                }
             }else if(this.micSeatsInfo == null){
                this.micSeatsInfo = new MicSeatsInfo();
             }
             p0.readMessage(this.micSeatsInfo);
          }else {
             this.voicePartyId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(1, this.voicePartyId);
       }
       CurrentVoicePartyStatus tmicSeatsInf = this.micSeatsInfo;
       if (tmicSeatsInf != null) {
          p0.writeMessage(2, tmicSeatsInf);
       }
       if (!(this.aryaConfig).equals(str)) {
          p0.writeString(3, this.aryaConfig);
       }
       super.writeTo(p0);
       return;
    }
}
