package com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatsApplyInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class MicSeatsApplyInfo extends MessageNano	// class@000bb2
{
    public int status;
    public UserInfos$UserInfo user;
    public String voicePartyId;
    public static MicSeatsApplyInfo[] _emptyArray;

    public void MicSeatsApplyInfo(){
       super();
       this.clear();
    }
    public static MicSeatsApplyInfo[] emptyArray(){
       if (MicSeatsApplyInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MicSeatsApplyInfo._emptyArray == null) {
             MicSeatsApplyInfo[] micSeatsAppl = new MicSeatsApplyInfo[0];
             MicSeatsApplyInfo._emptyArray = micSeatsAppl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MicSeatsApplyInfo._emptyArray;
    }
    public static MicSeatsApplyInfo parseFrom(CodedInputByteBufferNano p0){
       return new MicSeatsApplyInfo().mergeFrom(p0);
    }
    public static MicSeatsApplyInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MicSeatsApplyInfo(), p0);
    }
    public MicSeatsApplyInfo clear(){
       this.voicePartyId = "";
       this.user = null;
       this.status = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.voicePartyId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.voicePartyId);
       }
       MicSeatsApplyInfo tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       tuser = this.status;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MicSeatsApplyInfo mergeFrom(CodedInputByteBufferNano p0){
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
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.status = i;
                   }
                }
             }else if(this.user == null){
                this.user = new UserInfos$UserInfo();
             }
             p0.readMessage(this.user);
          }else {
             this.voicePartyId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.voicePartyId).equals("")) {
          p0.writeString(1, this.voicePartyId);
       }
       MicSeatsApplyInfo tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       tuser = this.status;
       if (tuser != null) {
          p0.writeInt32(3, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
