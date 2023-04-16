package com.kuaishou.livestream.message.nano.LiveGiftNamingInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveGiftNamingDisplayInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveGiftNamingInfo extends MessageNano	// class@0011bb
{
    public LiveGiftNamingDisplayInfo displayInfo;
    public int giftId;
    public UserInfos$UserInfo namingUser;
    public int type;
    public static LiveGiftNamingInfo[] _emptyArray;

    public void LiveGiftNamingInfo(){
       super();
       this.clear();
    }
    public static LiveGiftNamingInfo[] emptyArray(){
       if (LiveGiftNamingInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGiftNamingInfo._emptyArray == null) {
             LiveGiftNamingInfo[] liveGiftNami = new LiveGiftNamingInfo[0];
             LiveGiftNamingInfo._emptyArray = liveGiftNami;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGiftNamingInfo._emptyArray;
    }
    public static LiveGiftNamingInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveGiftNamingInfo().mergeFrom(p0);
    }
    public static LiveGiftNamingInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGiftNamingInfo(), p0);
    }
    public LiveGiftNamingInfo clear(){
       this.type = 0;
       this.giftId = 0;
       this.namingUser = null;
       this.displayInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveGiftNamingInfo ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttype);
       }
       ttype = this.giftId;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttype);
       }
       ttype = this.namingUser;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttype);
       }
       ttype = this.displayInfo;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGiftNamingInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.displayInfo == null){
                      this.displayInfo = new LiveGiftNamingDisplayInfo();
                   }
                   p0.readMessage(this.displayInfo);
                }else if(this.namingUser == null){
                   this.namingUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.namingUser);
             }else {
                this.giftId = p0.readUInt32();
             }
          }else {
             this.type = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveGiftNamingInfo ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(1, ttype);
       }
       ttype = this.giftId;
       if (ttype != null) {
          p0.writeUInt32(2, ttype);
       }
       ttype = this.namingUser;
       if (ttype != null) {
          p0.writeMessage(3, ttype);
       }
       ttype = this.displayInfo;
       if (ttype != null) {
          p0.writeMessage(4, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
