package com.kuaishou.protobuf.livestream.nano.LiveUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveUserInfo extends MessageNano	// class@000d20
{
    public String nickname;
    public long userId;
    public static LiveUserInfo[] _emptyArray;

    public void LiveUserInfo(){
       super();
       this.clear();
    }
    public static LiveUserInfo[] emptyArray(){
       if (LiveUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveUserInfo._emptyArray == null) {
             LiveUserInfo[] liveUserInfo = new LiveUserInfo[0];
             LiveUserInfo._emptyArray = liveUserInfo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveUserInfo._emptyArray;
    }
    public static LiveUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveUserInfo().mergeFrom(p0);
    }
    public static LiveUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveUserInfo(), p0);
    }
    public LiveUserInfo clear(){
       this.nickname = "";
       this.userId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.nickname).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.nickname);
       }
       LiveUserInfo tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveUserInfo mergeFrom(CodedInputByteBufferNano p0){
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
                this.userId = p0.readUInt64();
             }
          }else {
             this.nickname = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.nickname).equals("")) {
          p0.writeString(1, this.nickname);
       }
       LiveUserInfo tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(2, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
