package com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSponsorRankInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveActivitySignalMessage$LiveSponsorRankInfo extends MessageNano	// class@0010ce
{
    public int rankIndex;
    public UserInfos$UserInfo sponsorUser;
    public static LiveActivitySignalMessage$LiveSponsorRankInfo[] _emptyArray;

    public void LiveActivitySignalMessage$LiveSponsorRankInfo(){
       super();
       this.clear();
    }
    public static LiveActivitySignalMessage$LiveSponsorRankInfo[] emptyArray(){
       if (LiveActivitySignalMessage$LiveSponsorRankInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivitySignalMessage$LiveSponsorRankInfo._emptyArray == null) {
             LiveActivitySignalMessage$LiveSponsorRankInfo[] liveSponsorR = new LiveActivitySignalMessage$LiveSponsorRankInfo[0];
             LiveActivitySignalMessage$LiveSponsorRankInfo._emptyArray = liveSponsorR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivitySignalMessage$LiveSponsorRankInfo._emptyArray;
    }
    public static LiveActivitySignalMessage$LiveSponsorRankInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivitySignalMessage$LiveSponsorRankInfo().mergeFrom(p0);
    }
    public static LiveActivitySignalMessage$LiveSponsorRankInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivitySignalMessage$LiveSponsorRankInfo(), p0);
    }
    public LiveActivitySignalMessage$LiveSponsorRankInfo clear(){
       this.sponsorUser = null;
       this.rankIndex = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActivitySignalMessage$LiveSponsorRankInfo tsponsorUser = this.sponsorUser;
       if (tsponsorUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tsponsorUser);
       }
       tsponsorUser = this.rankIndex;
       if (tsponsorUser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tsponsorUser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivitySignalMessage$LiveSponsorRankInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.rankIndex = p0.readUInt32();
             }
          }else if(this.sponsorUser == null){
             this.sponsorUser = new UserInfos$UserInfo();
          }
          p0.readMessage(this.sponsorUser);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActivitySignalMessage$LiveSponsorRankInfo tsponsorUser = this.sponsorUser;
       if (tsponsorUser != null) {
          p0.writeMessage(1, tsponsorUser);
       }
       tsponsorUser = this.rankIndex;
       if (tsponsorUser != null) {
          p0.writeUInt32(2, tsponsorUser);
       }
       super.writeTo(p0);
       return;
    }
}
