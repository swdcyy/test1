package com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkInvitation;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCLiveVoicePartyPkInvitation extends MessageNano	// class@00144f
{
    public int invitationSource;
    public long inviteEndTime;
    public UserInfos$UserInfo inviter;
    public String pkId;
    public long queryIntervalMillis;
    public long time;
    public static SCLiveVoicePartyPkInvitation[] _emptyArray;

    public void SCLiveVoicePartyPkInvitation(){
       super();
       this.clear();
    }
    public static SCLiveVoicePartyPkInvitation[] emptyArray(){
       if (SCLiveVoicePartyPkInvitation._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveVoicePartyPkInvitation._emptyArray == null) {
             SCLiveVoicePartyPkInvitation[] sCLiveVoiceP = new SCLiveVoicePartyPkInvitation[0];
             SCLiveVoicePartyPkInvitation._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveVoicePartyPkInvitation._emptyArray;
    }
    public static SCLiveVoicePartyPkInvitation parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveVoicePartyPkInvitation().mergeFrom(p0);
    }
    public static SCLiveVoicePartyPkInvitation parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveVoicePartyPkInvitation(), p0);
    }
    public SCLiveVoicePartyPkInvitation clear(){
       this.pkId = "";
       this.time = 0;
       this.inviter = null;
       this.queryIntervalMillis = 0;
       this.inviteEndTime = 0;
       this.invitationSource = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       SCLiveVoicePartyPkInvitation ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       ttime = this.inviter;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttime);
       }
       ttime = this.queryIntervalMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       ttime = this.inviteEndTime;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       ttime = this.invitationSource;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveVoicePartyPkInvitation mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.invitationSource = i;
                            }
                         }
                      }else {
                         this.inviteEndTime = p0.readUInt64();
                      }
                   }else {
                      this.queryIntervalMillis = p0.readUInt64();
                   }
                }else if(this.inviter == null){
                   this.inviter = new UserInfos$UserInfo();
                }
                p0.readMessage(this.inviter);
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
       SCLiveVoicePartyPkInvitation ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(2, ttime);
       }
       ttime = this.inviter;
       if (ttime != null) {
          p0.writeMessage(3, ttime);
       }
       ttime = this.queryIntervalMillis;
       if (ttime - i) {
          p0.writeUInt64(4, ttime);
       }
       ttime = this.inviteEndTime;
       if (ttime - i) {
          p0.writeUInt64(5, ttime);
       }
       ttime = this.invitationSource;
       if (ttime != null) {
          p0.writeInt32(6, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
