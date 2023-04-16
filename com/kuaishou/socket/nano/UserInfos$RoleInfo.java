package com.kuaishou.socket.nano.UserInfos$RoleInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class UserInfos$RoleInfo extends MessageNano	// class@000f54
{
    public int roleType;
    public static UserInfos$RoleInfo[] _emptyArray;

    public void UserInfos$RoleInfo(){
       super();
       this.clear();
    }
    public static UserInfos$RoleInfo[] emptyArray(){
       if (UserInfos$RoleInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (UserInfos$RoleInfo._emptyArray == null) {
             UserInfos$RoleInfo[] roleInfoArra = new UserInfos$RoleInfo[0];
             UserInfos$RoleInfo._emptyArray = roleInfoArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return UserInfos$RoleInfo._emptyArray;
    }
    public static UserInfos$RoleInfo parseFrom(CodedInputByteBufferNano p0){
       return new UserInfos$RoleInfo().mergeFrom(p0);
    }
    public static UserInfos$RoleInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new UserInfos$RoleInfo(), p0);
    }
    public UserInfos$RoleInfo clear(){
       this.roleType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       UserInfos$RoleInfo troleType = this.roleType;
       if (troleType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, troleType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public UserInfos$RoleInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.roleType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       UserInfos$RoleInfo troleType = this.roleType;
       if (troleType != null) {
          p0.writeInt32(1, troleType);
       }
       super.writeTo(p0);
       return;
    }
}
