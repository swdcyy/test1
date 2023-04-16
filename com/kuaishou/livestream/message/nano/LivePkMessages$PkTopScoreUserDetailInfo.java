package com.kuaishou.livestream.message.nano.LivePkMessages$PkTopScoreUserDetailInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LivePkMessages$PkTopScoreUserDetailInfo extends MessageNano	// class@001221
{
    public UserInfos$UserInfo userInfo;
    public static LivePkMessages$PkTopScoreUserDetailInfo[] _emptyArray;

    public void LivePkMessages$PkTopScoreUserDetailInfo(){
       super();
       this.clear();
    }
    public static LivePkMessages$PkTopScoreUserDetailInfo[] emptyArray(){
       if (LivePkMessages$PkTopScoreUserDetailInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$PkTopScoreUserDetailInfo._emptyArray == null) {
             LivePkMessages$PkTopScoreUserDetailInfo[] pkTopScoreUs = new LivePkMessages$PkTopScoreUserDetailInfo[0];
             LivePkMessages$PkTopScoreUserDetailInfo._emptyArray = pkTopScoreUs;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$PkTopScoreUserDetailInfo._emptyArray;
    }
    public static LivePkMessages$PkTopScoreUserDetailInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$PkTopScoreUserDetailInfo().mergeFrom(p0);
    }
    public static LivePkMessages$PkTopScoreUserDetailInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$PkTopScoreUserDetailInfo(), p0);
    }
    public LivePkMessages$PkTopScoreUserDetailInfo clear(){
       this.userInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$PkTopScoreUserDetailInfo tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuserInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$PkTopScoreUserDetailInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.userInfo == null){
             this.userInfo = new UserInfos$UserInfo();
          }
          p0.readMessage(this.userInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$PkTopScoreUserDetailInfo tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          p0.writeMessage(1, tuserInfo);
       }
       super.writeTo(p0);
       return;
    }
}
