package com.kuaishou.livestream.message.nano.LiveStreamMessages$PKFlowDiversionPayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PKFlowDiversionUserInfo;

public final class LiveStreamMessages$PKFlowDiversionPayInfo extends MessageNano	// class@001309
{
    public LiveStreamMessages$PKFlowDiversionUserInfo inviteeUserInfo;
    public LiveStreamMessages$PKFlowDiversionUserInfo inviterUserInfo;
    public int payType;
    public static LiveStreamMessages$PKFlowDiversionPayInfo[] _emptyArray;

    public void LiveStreamMessages$PKFlowDiversionPayInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PKFlowDiversionPayInfo[] emptyArray(){
       if (LiveStreamMessages$PKFlowDiversionPayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PKFlowDiversionPayInfo._emptyArray == null) {
             LiveStreamMessages$PKFlowDiversionPayInfo[] pKFlowDivers = new LiveStreamMessages$PKFlowDiversionPayInfo[0];
             LiveStreamMessages$PKFlowDiversionPayInfo._emptyArray = pKFlowDivers;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PKFlowDiversionPayInfo._emptyArray;
    }
    public static LiveStreamMessages$PKFlowDiversionPayInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PKFlowDiversionPayInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PKFlowDiversionPayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PKFlowDiversionPayInfo(), p0);
    }
    public LiveStreamMessages$PKFlowDiversionPayInfo clear(){
       this.payType = 0;
       this.inviterUserInfo = null;
       this.inviteeUserInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PKFlowDiversionPayInfo tpayType = this.payType;
       if (tpayType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tpayType);
       }
       tpayType = this.inviterUserInfo;
       if (tpayType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tpayType);
       }
       tpayType = this.inviteeUserInfo;
       if (tpayType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tpayType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PKFlowDiversionPayInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.inviteeUserInfo == null){
                   this.inviteeUserInfo = new LiveStreamMessages$PKFlowDiversionUserInfo();
                }
                p0.readMessage(this.inviteeUserInfo);
             }else if(this.inviterUserInfo == null){
                this.inviterUserInfo = new LiveStreamMessages$PKFlowDiversionUserInfo();
             }
             p0.readMessage(this.inviterUserInfo);
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.payType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$PKFlowDiversionPayInfo tpayType = this.payType;
       if (tpayType != null) {
          p0.writeInt32(1, tpayType);
       }
       tpayType = this.inviterUserInfo;
       if (tpayType != null) {
          p0.writeMessage(2, tpayType);
       }
       tpayType = this.inviteeUserInfo;
       if (tpayType != null) {
          p0.writeMessage(3, tpayType);
       }
       super.writeTo(p0);
       return;
    }
}
