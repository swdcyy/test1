package com.kuaishou.protobuf.gamezone.gameinteractive.nano.MicSeatUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class MicSeatUserInfo extends MessageNano	// class@000bb1
{
    public int fansGroupIntimacyLevel;
    public String fansGroupName;
    public boolean isMuted;
    public long ksCoin;
    public UserInfos$UserInfo user;
    public static MicSeatUserInfo[] _emptyArray;

    public void MicSeatUserInfo(){
       super();
       this.clear();
    }
    public static MicSeatUserInfo[] emptyArray(){
       if (MicSeatUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MicSeatUserInfo._emptyArray == null) {
             MicSeatUserInfo[] micSeatUserI = new MicSeatUserInfo[0];
             MicSeatUserInfo._emptyArray = micSeatUserI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MicSeatUserInfo._emptyArray;
    }
    public static MicSeatUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new MicSeatUserInfo().mergeFrom(p0);
    }
    public static MicSeatUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MicSeatUserInfo(), p0);
    }
    public MicSeatUserInfo clear(){
       this.user = null;
       this.isMuted = false;
       this.fansGroupIntimacyLevel = 0;
       this.fansGroupName = "";
       this.ksCoin = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       MicSeatUserInfo tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       tuser = this.isMuted;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tuser);
       }
       tuser = this.fansGroupIntimacyLevel;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tuser);
       }
       if (!(this.fansGroupName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.fansGroupName);
       }
       tuser = this.ksCoin;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MicSeatUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.ksCoin = p0.readUInt64();
                      }
                   }else {
                      this.fansGroupName = p0.readString();
                   }
                }else {
                   this.fansGroupIntimacyLevel = p0.readUInt32();
                }
             }else {
                this.isMuted = p0.readBool();
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       MicSeatUserInfo tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.isMuted;
       if (tuser != null) {
          p0.writeBool(2, tuser);
       }
       tuser = this.fansGroupIntimacyLevel;
       if (tuser != null) {
          p0.writeUInt32(3, tuser);
       }
       if (!(this.fansGroupName).equals("")) {
          p0.writeString(4, this.fansGroupName);
       }
       tuser = this.ksCoin;
       if (tuser) {
          p0.writeUInt64(5, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
