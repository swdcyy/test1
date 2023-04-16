package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo extends MessageNano	// class@000c65
{
    public int mediaType;
    public long userId;
    public static LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo[] _emptyArray;

    public void LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo[] emptyArray(){
       if (LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo._emptyArray == null) {
             LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo[] liveCentaurL = new LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo[0];
             LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo._emptyArray = liveCentaurL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo._emptyArray;
    }
    public static LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo(), p0);
    }
    public LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo clear(){
       this.userId = 0;
       this.mediaType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.mediaType;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.mediaType = i;
                }
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.mediaType;
       if (tuserId != null) {
          p0.writeInt32(2, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
