package com.kuaishou.livestream.message.nano.TeamPkTopUser;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class TeamPkTopUser extends MessageNano	// class@001474
{
    public int rank;
    public UserInfos$UserInfo user;
    public static TeamPkTopUser[] _emptyArray;

    public void TeamPkTopUser(){
       super();
       this.clear();
    }
    public static TeamPkTopUser[] emptyArray(){
       if (TeamPkTopUser._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TeamPkTopUser._emptyArray == null) {
             TeamPkTopUser[] teamPkTopUse = new TeamPkTopUser[0];
             TeamPkTopUser._emptyArray = teamPkTopUse;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TeamPkTopUser._emptyArray;
    }
    public static TeamPkTopUser parseFrom(CodedInputByteBufferNano p0){
       return new TeamPkTopUser().mergeFrom(p0);
    }
    public static TeamPkTopUser parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TeamPkTopUser(), p0);
    }
    public TeamPkTopUser clear(){
       this.user = null;
       this.rank = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       TeamPkTopUser tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       tuser = this.rank;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TeamPkTopUser mergeFrom(CodedInputByteBufferNano p0){
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
                this.rank = p0.readUInt32();
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       TeamPkTopUser tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.rank;
       if (tuser != null) {
          p0.writeUInt32(2, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
