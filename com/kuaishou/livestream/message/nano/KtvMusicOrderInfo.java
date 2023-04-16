package com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.KtvMusicInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class KtvMusicOrderInfo extends MessageNano	// class@0010bd
{
    public long endTimeOffset;
    public KtvMusicInfo musicInfo;
    public String musicOrderId;
    public boolean singerVideoStatus;
    public long startTimeOffset;
    public UserInfos$UserInfo user;
    public long userId;
    public static KtvMusicOrderInfo[] _emptyArray;

    public void KtvMusicOrderInfo(){
       super();
       this.clear();
    }
    public static KtvMusicOrderInfo[] emptyArray(){
       if (KtvMusicOrderInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (KtvMusicOrderInfo._emptyArray == null) {
             KtvMusicOrderInfo[] ktvMusicOrde = new KtvMusicOrderInfo[0];
             KtvMusicOrderInfo._emptyArray = ktvMusicOrde;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return KtvMusicOrderInfo._emptyArray;
    }
    public static KtvMusicOrderInfo parseFrom(CodedInputByteBufferNano p0){
       return new KtvMusicOrderInfo().mergeFrom(p0);
    }
    public static KtvMusicOrderInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new KtvMusicOrderInfo(), p0);
    }
    public KtvMusicOrderInfo clear(){
       this.musicOrderId = "";
       this.userId = 0;
       this.startTimeOffset = 0;
       this.endTimeOffset = 0;
       this.user = null;
       this.musicInfo = null;
       this.singerVideoStatus = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.musicOrderId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.musicOrderId);
       }
       KtvMusicOrderInfo tuserId = this.userId;
       int i1 = 0;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       tuserId = this.startTimeOffset;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuserId);
       }
       tuserId = this.endTimeOffset;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tuserId);
       }
       tuserId = this.user;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tuserId);
       }
       tuserId = this.musicInfo;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tuserId);
       }
       tuserId = this.singerVideoStatus;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public KtvMusicOrderInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.singerVideoStatus = p0.readBool();
                            }
                         }else if(this.musicInfo == null){
                            this.musicInfo = new KtvMusicInfo();
                         }
                         p0.readMessage(this.musicInfo);
                      }else if(this.user == null){
                         this.user = new UserInfos$UserInfo();
                      }
                      p0.readMessage(this.user);
                   }else {
                      this.endTimeOffset = p0.readUInt64();
                   }
                }else {
                   this.startTimeOffset = p0.readUInt64();
                }
             }else {
                this.userId = p0.readUInt64();
             }
          }else {
             this.musicOrderId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.musicOrderId).equals("")) {
          p0.writeString(1, this.musicOrderId);
       }
       KtvMusicOrderInfo tuserId = this.userId;
       int i = 0;
       if (tuserId - i) {
          p0.writeUInt64(2, tuserId);
       }
       tuserId = this.startTimeOffset;
       if (tuserId - i) {
          p0.writeUInt64(3, tuserId);
       }
       tuserId = this.endTimeOffset;
       if (tuserId - i) {
          p0.writeUInt64(4, tuserId);
       }
       tuserId = this.user;
       if (tuserId != null) {
          p0.writeMessage(5, tuserId);
       }
       tuserId = this.musicInfo;
       if (tuserId != null) {
          p0.writeMessage(6, tuserId);
       }
       tuserId = this.singerVideoStatus;
       if (tuserId != null) {
          p0.writeBool(7, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
