package com.kuaishou.livestream.message.nano.LiveStreamMessages$PKFlowDiversionUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PKFlowDiversionUserInfo extends MessageNano	// class@00130b
{
    public boolean highFans;
    public boolean shopLive;
    public long userId;
    public static LiveStreamMessages$PKFlowDiversionUserInfo[] _emptyArray;

    public void LiveStreamMessages$PKFlowDiversionUserInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PKFlowDiversionUserInfo[] emptyArray(){
       if (LiveStreamMessages$PKFlowDiversionUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PKFlowDiversionUserInfo._emptyArray == null) {
             LiveStreamMessages$PKFlowDiversionUserInfo[] pKFlowDivers = new LiveStreamMessages$PKFlowDiversionUserInfo[0];
             LiveStreamMessages$PKFlowDiversionUserInfo._emptyArray = pKFlowDivers;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PKFlowDiversionUserInfo._emptyArray;
    }
    public static LiveStreamMessages$PKFlowDiversionUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PKFlowDiversionUserInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PKFlowDiversionUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PKFlowDiversionUserInfo(), p0);
    }
    public LiveStreamMessages$PKFlowDiversionUserInfo clear(){
       this.userId = 0;
       this.highFans = false;
       this.shopLive = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PKFlowDiversionUserInfo tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.highFans;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tuserId);
       }
       tuserId = this.shopLive;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PKFlowDiversionUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.shopLive = p0.readBool();
                }
             }else {
                this.highFans = p0.readBool();
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$PKFlowDiversionUserInfo tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.highFans;
       if (tuserId != null) {
          p0.writeBool(2, tuserId);
       }
       tuserId = this.shopLive;
       if (tuserId != null) {
          p0.writeBool(3, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
