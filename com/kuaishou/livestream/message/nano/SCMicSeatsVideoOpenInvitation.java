package com.kuaishou.livestream.message.nano.SCMicSeatsVideoOpenInvitation;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCMicSeatsVideoOpenInvitation extends MessageNano	// class@00145d
{
    public int friendshipType;
    public long guestId;
    public UserInfos$UserInfo inviter;
    public String liveStreamId;
    public String voicePartyId;
    public static SCMicSeatsVideoOpenInvitation[] _emptyArray;

    public void SCMicSeatsVideoOpenInvitation(){
       super();
       this.clear();
    }
    public static SCMicSeatsVideoOpenInvitation[] emptyArray(){
       if (SCMicSeatsVideoOpenInvitation._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMicSeatsVideoOpenInvitation._emptyArray == null) {
             SCMicSeatsVideoOpenInvitation[] sCMicSeatsVi = new SCMicSeatsVideoOpenInvitation[0];
             SCMicSeatsVideoOpenInvitation._emptyArray = sCMicSeatsVi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMicSeatsVideoOpenInvitation._emptyArray;
    }
    public static SCMicSeatsVideoOpenInvitation parseFrom(CodedInputByteBufferNano p0){
       return new SCMicSeatsVideoOpenInvitation().mergeFrom(p0);
    }
    public static SCMicSeatsVideoOpenInvitation parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMicSeatsVideoOpenInvitation(), p0);
    }
    public SCMicSeatsVideoOpenInvitation clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.guestId = 0;
       this.inviter = null;
       this.friendshipType = 0;
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
       SCMicSeatsVideoOpenInvitation tguestId = this.guestId;
       if (tguestId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tguestId);
       }
       tguestId = this.inviter;
       if (tguestId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tguestId);
       }
       tguestId = this.friendshipType;
       if (tguestId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tguestId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMicSeatsVideoOpenInvitation mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && i != 3))) {
                            continue ;
                         }else {
                            this.friendshipType = i;
                         }
                      }
                   }else if(this.inviter == null){
                      this.inviter = new UserInfos$UserInfo();
                   }
                   p0.readMessage(this.inviter);
                }else {
                   this.guestId = p0.readUInt64();
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
       SCMicSeatsVideoOpenInvitation tguestId = this.guestId;
       if (tguestId) {
          p0.writeUInt64(3, tguestId);
       }
       tguestId = this.inviter;
       if (tguestId != null) {
          p0.writeMessage(4, tguestId);
       }
       tguestId = this.friendshipType;
       if (tguestId != null) {
          p0.writeInt32(5, tguestId);
       }
       super.writeTo(p0);
       return;
    }
}
