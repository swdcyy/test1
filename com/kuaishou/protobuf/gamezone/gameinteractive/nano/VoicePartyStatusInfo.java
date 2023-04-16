package com.kuaishou.protobuf.gamezone.gameinteractive.nano.VoicePartyStatusInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class VoicePartyStatusInfo extends MessageNano	// class@000bbc
{
    public String liveStreamId;
    public int status;
    public long timestamp;
    public String voicePartyId;
    public static VoicePartyStatusInfo[] _emptyArray;

    public void VoicePartyStatusInfo(){
       super();
       this.clear();
    }
    public static VoicePartyStatusInfo[] emptyArray(){
       if (VoicePartyStatusInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (VoicePartyStatusInfo._emptyArray == null) {
             VoicePartyStatusInfo[] voicePartySt = new VoicePartyStatusInfo[0];
             VoicePartyStatusInfo._emptyArray = voicePartySt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return VoicePartyStatusInfo._emptyArray;
    }
    public static VoicePartyStatusInfo parseFrom(CodedInputByteBufferNano p0){
       return new VoicePartyStatusInfo().mergeFrom(p0);
    }
    public static VoicePartyStatusInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new VoicePartyStatusInfo(), p0);
    }
    public VoicePartyStatusInfo clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.status = 0;
       this.timestamp = 0;
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
       VoicePartyStatusInfo tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tstatus);
       }
       tstatus = this.timestamp;
       if (tstatus) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public VoicePartyStatusInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.timestamp = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.status = i;
                   }
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
       VoicePartyStatusInfo tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(3, tstatus);
       }
       tstatus = this.timestamp;
       if (tstatus) {
          p0.writeUInt64(4, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
