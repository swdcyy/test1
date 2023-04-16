package com.kuaishou.socket.nano.SocketMessages$SCVoicePartyAboardApplyResult;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$SCVoicePartyAboardApplyResult extends MessageNano	// class@000f48
{
    public boolean allow;
    public String aryaConfig;
    public String liveStreamId;
    public String voicePartyId;
    public static SocketMessages$SCVoicePartyAboardApplyResult[] _emptyArray;

    public void SocketMessages$SCVoicePartyAboardApplyResult(){
       super();
       this.clear();
    }
    public static SocketMessages$SCVoicePartyAboardApplyResult[] emptyArray(){
       if (SocketMessages$SCVoicePartyAboardApplyResult._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SCVoicePartyAboardApplyResult._emptyArray == null) {
             SocketMessages$SCVoicePartyAboardApplyResult[] sCVoiceParty = new SocketMessages$SCVoicePartyAboardApplyResult[0];
             SocketMessages$SCVoicePartyAboardApplyResult._emptyArray = sCVoiceParty;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SCVoicePartyAboardApplyResult._emptyArray;
    }
    public static SocketMessages$SCVoicePartyAboardApplyResult parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SCVoicePartyAboardApplyResult().mergeFrom(p0);
    }
    public static SocketMessages$SCVoicePartyAboardApplyResult parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SCVoicePartyAboardApplyResult(), p0);
    }
    public SocketMessages$SCVoicePartyAboardApplyResult clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.allow = false;
       this.aryaConfig = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       SocketMessages$SCVoicePartyAboardApplyResult tallow = this.allow;
       if (tallow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tallow);
       }
       if (!(this.aryaConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.aryaConfig);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SCVoicePartyAboardApplyResult mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.aryaConfig = p0.readString();
                   }
                }else {
                   this.allow = p0.readBool();
                }
             }else {
                this.voicePartyId = p0.readString();
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
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       SocketMessages$SCVoicePartyAboardApplyResult tallow = this.allow;
       if (tallow != null) {
          p0.writeBool(3, tallow);
       }
       if (!(this.aryaConfig).equals(str)) {
          p0.writeString(4, this.aryaConfig);
       }
       super.writeTo(p0);
       return;
    }
}
