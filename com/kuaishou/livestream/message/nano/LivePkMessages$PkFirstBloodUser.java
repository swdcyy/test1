package com.kuaishou.livestream.message.nano.LivePkMessages$PkFirstBloodUser;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LivePkMessages$PkFirstBloodUser extends MessageNano	// class@001215
{
    public UserInfos$UserInfo firstBloodUser;
    public static LivePkMessages$PkFirstBloodUser[] _emptyArray;

    public void LivePkMessages$PkFirstBloodUser(){
       super();
       this.clear();
    }
    public static LivePkMessages$PkFirstBloodUser[] emptyArray(){
       if (LivePkMessages$PkFirstBloodUser._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$PkFirstBloodUser._emptyArray == null) {
             LivePkMessages$PkFirstBloodUser[] pkFirstBlood = new LivePkMessages$PkFirstBloodUser[0];
             LivePkMessages$PkFirstBloodUser._emptyArray = pkFirstBlood;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$PkFirstBloodUser._emptyArray;
    }
    public static LivePkMessages$PkFirstBloodUser parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$PkFirstBloodUser().mergeFrom(p0);
    }
    public static LivePkMessages$PkFirstBloodUser parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$PkFirstBloodUser(), p0);
    }
    public LivePkMessages$PkFirstBloodUser clear(){
       this.firstBloodUser = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$PkFirstBloodUser tfirstBloodU = this.firstBloodUser;
       if (tfirstBloodU != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tfirstBloodU);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$PkFirstBloodUser mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.firstBloodUser == null){
             this.firstBloodUser = new UserInfos$UserInfo();
          }
          p0.readMessage(this.firstBloodUser);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$PkFirstBloodUser tfirstBloodU = this.firstBloodUser;
       if (tfirstBloodU != null) {
          p0.writeMessage(1, tfirstBloodU);
       }
       super.writeTo(p0);
       return;
    }
}
