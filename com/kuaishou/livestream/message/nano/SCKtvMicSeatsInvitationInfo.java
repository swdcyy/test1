package com.kuaishou.livestream.message.nano.SCKtvMicSeatsInvitationInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCKtvMicSeatsInvitationInfo extends MessageNano	// class@0013f7
{
    public long guestUserId;
    public String ktvId;
    public String liveStreamId;
    public String token;
    public String voicePartyId;
    public static SCKtvMicSeatsInvitationInfo[] _emptyArray;

    public void SCKtvMicSeatsInvitationInfo(){
       super();
       this.clear();
    }
    public static SCKtvMicSeatsInvitationInfo[] emptyArray(){
       if (SCKtvMicSeatsInvitationInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCKtvMicSeatsInvitationInfo._emptyArray == null) {
             SCKtvMicSeatsInvitationInfo[] sCKtvMicSeat = new SCKtvMicSeatsInvitationInfo[0];
             SCKtvMicSeatsInvitationInfo._emptyArray = sCKtvMicSeat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCKtvMicSeatsInvitationInfo._emptyArray;
    }
    public static SCKtvMicSeatsInvitationInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCKtvMicSeatsInvitationInfo().mergeFrom(p0);
    }
    public static SCKtvMicSeatsInvitationInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCKtvMicSeatsInvitationInfo(), p0);
    }
    public SCKtvMicSeatsInvitationInfo clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.ktvId = "";
       this.guestUserId = 0;
       this.token = "";
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
       if (!(this.ktvId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ktvId);
       }
       SCKtvMicSeatsInvitationInfo tguestUserId = this.guestUserId;
       if (tguestUserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tguestUserId);
       }
       if (!(this.token).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.token);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCKtvMicSeatsInvitationInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.token = p0.readString();
                      }
                   }else {
                      this.guestUserId = p0.readUInt64();
                   }
                }else {
                   this.ktvId = p0.readString();
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
       if (!(this.ktvId).equals(str)) {
          p0.writeString(3, this.ktvId);
       }
       SCKtvMicSeatsInvitationInfo tguestUserId = this.guestUserId;
       if (tguestUserId) {
          p0.writeUInt64(4, tguestUserId);
       }
       if (!(this.token).equals(str)) {
          p0.writeString(5, this.token);
       }
       super.writeTo(p0);
       return;
    }
}
