package com.kuaishou.livestream.message.nano.SCMicSeatsInvitationInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCMicSeatsInvitationInfo extends MessageNano	// class@001458
{
    public String aryaConfig;
    public String deviceId;
    public int friendshipType;
    public long guestUserId;
    public int invitationType;
    public UserInfos$UserInfo inviter;
    public String[] inviterTag;
    public String liveStreamId;
    public int micSeatId;
    public String token;
    public String voicePartyId;
    public static SCMicSeatsInvitationInfo[] _emptyArray;

    public void SCMicSeatsInvitationInfo(){
       super();
       this.clear();
    }
    public static SCMicSeatsInvitationInfo[] emptyArray(){
       if (SCMicSeatsInvitationInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMicSeatsInvitationInfo._emptyArray == null) {
             SCMicSeatsInvitationInfo[] sCMicSeatsIn = new SCMicSeatsInvitationInfo[0];
             SCMicSeatsInvitationInfo._emptyArray = sCMicSeatsIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMicSeatsInvitationInfo._emptyArray;
    }
    public static SCMicSeatsInvitationInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCMicSeatsInvitationInfo().mergeFrom(p0);
    }
    public static SCMicSeatsInvitationInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMicSeatsInvitationInfo(), p0);
    }
    public SCMicSeatsInvitationInfo clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.guestUserId = 0;
       this.aryaConfig = "";
       this.invitationType = 0;
       this.token = "";
       this.friendshipType = 0;
       this.micSeatId = 0;
       this.inviter = null;
       this.inviterTag = WireFormatNano.EMPTY_STRING_ARRAY;
       this.deviceId = "";
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
       SCMicSeatsInvitationInfo tguestUserId = this.guestUserId;
       if (tguestUserId - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tguestUserId);
       }
       if (!(this.aryaConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.aryaConfig);
       }
       SCMicSeatsInvitationInfo tinvitationT = this.invitationType;
       if (tinvitationT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tinvitationT);
       }
       if (!(this.token).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.token);
       }
       tinvitationT = this.friendshipType;
       if (tinvitationT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tinvitationT);
       }
       tinvitationT = this.micSeatId;
       if (tinvitationT != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tinvitationT);
       }
       tinvitationT = this.inviter;
       if (tinvitationT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tinvitationT);
       }
       tinvitationT = this.inviterTag;
       if (tinvitationT != null && tinvitationT.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          SCMicSeatsInvitationInfo tinviterTag = this.inviterTag;
          while (i1 < tinviterTag.length) {
             object oobject = tinviterTag[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       if (!(this.deviceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.deviceId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMicSeatsInvitationInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          SCMicSeatsInvitationInfo sCMicSeatsIn = 2;
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 18:
                this.voicePartyId = p0.readString();
                break;
              case 24:
                this.guestUserId = p0.readUInt64();
                break;
              case '"':
                this.aryaConfig = p0.readString();
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != i1 && i != sCMicSeatsIn)) {
                   continue ;
                }else {
                   this.invitationType = i;
                }
                break;
              case '2':
                this.token = p0.readString();
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != i1 && (i != sCMicSeatsIn && i != 3))) {
                   continue ;
                }else {
                   this.friendshipType = i;
                }
                break;
              case '@':
                this.micSeatId = p0.readUInt32();
                break;
              case 'J':
                if (this.inviter == null) {
                   this.inviter = new UserInfos$UserInfo();
                }
                p0.readMessage(this.inviter);
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                sCMicSeatsIn = this.inviterTag;
                i1 = 0;
                int i2 = (sCMicSeatsIn == null)? 0: sCMicSeatsIn.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(sCMicSeatsIn, i1, stringArray, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.inviterTag = stringArray;
                break;
              case 'Z':
                this.deviceId = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       SCMicSeatsInvitationInfo tguestUserId = this.guestUserId;
       if (tguestUserId) {
          p0.writeUInt64(3, tguestUserId);
       }
       if (!(this.aryaConfig).equals(str)) {
          p0.writeString(4, this.aryaConfig);
       }
       SCMicSeatsInvitationInfo tinvitationT = this.invitationType;
       if (tinvitationT != null) {
          p0.writeInt32(5, tinvitationT);
       }
       if (!(this.token).equals(str)) {
          p0.writeString(6, this.token);
       }
       tinvitationT = this.friendshipType;
       if (tinvitationT != null) {
          p0.writeInt32(7, tinvitationT);
       }
       tinvitationT = this.micSeatId;
       if (tinvitationT != null) {
          p0.writeUInt32(8, tinvitationT);
       }
       tinvitationT = this.inviter;
       if (tinvitationT != null) {
          p0.writeMessage(9, tinvitationT);
       }
       tinvitationT = this.inviterTag;
       if (tinvitationT != null && tinvitationT.length > 0) {
          int i = 0;
          tguestUserId = this.inviterTag;
          while (i < tguestUserId.length) {
             object oobject = tguestUserId[i];
             if (oobject != null) {
                p0.writeString(10, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.deviceId).equals(str)) {
          p0.writeString(11, this.deviceId);
       }
       super.writeTo(p0);
       return;
    }
}
