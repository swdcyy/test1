package com.kuaishou.socket.nano.SocketMessages$SCVoicePartyCoverAuditInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SocketMessages$SCVoicePartyCoverAuditInfo extends MessageNano	// class@000f49
{
    public boolean auditPass;
    public String liveStreamId;
    public String voicePartyId;
    public static SocketMessages$SCVoicePartyCoverAuditInfo[] _emptyArray;

    public void SocketMessages$SCVoicePartyCoverAuditInfo(){
       super();
       this.clear();
    }
    public static SocketMessages$SCVoicePartyCoverAuditInfo[] emptyArray(){
       if (SocketMessages$SCVoicePartyCoverAuditInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SCVoicePartyCoverAuditInfo._emptyArray == null) {
             SocketMessages$SCVoicePartyCoverAuditInfo[] sCVoiceParty = new SocketMessages$SCVoicePartyCoverAuditInfo[0];
             SocketMessages$SCVoicePartyCoverAuditInfo._emptyArray = sCVoiceParty;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SCVoicePartyCoverAuditInfo._emptyArray;
    }
    public static SocketMessages$SCVoicePartyCoverAuditInfo parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SCVoicePartyCoverAuditInfo().mergeFrom(p0);
    }
    public static SocketMessages$SCVoicePartyCoverAuditInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SCVoicePartyCoverAuditInfo(), p0);
    }
    public SocketMessages$SCVoicePartyCoverAuditInfo clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.auditPass = false;
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
       SocketMessages$SCVoicePartyCoverAuditInfo tauditPass = this.auditPass;
       if (tauditPass != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tauditPass);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SCVoicePartyCoverAuditInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.auditPass = p0.readBool();
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
       SocketMessages$SCVoicePartyCoverAuditInfo tauditPass = this.auditPass;
       if (tauditPass != null) {
          p0.writeBool(3, tauditPass);
       }
       super.writeTo(p0);
       return;
    }
}
