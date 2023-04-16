package com.kuaishou.livestream.message.nano.LiveCommonRoutePopupStrategy;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonRoutePopupStrategy extends MessageNano	// class@001169
{
    public long minIntervalMs;
    public int pendingStrategy;
    public static LiveCommonRoutePopupStrategy[] _emptyArray;

    public void LiveCommonRoutePopupStrategy(){
       super();
       this.clear();
    }
    public static LiveCommonRoutePopupStrategy[] emptyArray(){
       if (LiveCommonRoutePopupStrategy._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonRoutePopupStrategy._emptyArray == null) {
             LiveCommonRoutePopupStrategy[] liveCommonRo = new LiveCommonRoutePopupStrategy[0];
             LiveCommonRoutePopupStrategy._emptyArray = liveCommonRo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonRoutePopupStrategy._emptyArray;
    }
    public static LiveCommonRoutePopupStrategy parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonRoutePopupStrategy().mergeFrom(p0);
    }
    public static LiveCommonRoutePopupStrategy parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonRoutePopupStrategy(), p0);
    }
    public LiveCommonRoutePopupStrategy clear(){
       this.pendingStrategy = 0;
       this.minIntervalMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonRoutePopupStrategy tpendingStra = this.pendingStrategy;
       if (tpendingStra != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tpendingStra);
       }
       tpendingStra = this.minIntervalMs;
       if (tpendingStra) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tpendingStra);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonRoutePopupStrategy mergeFrom(CodedInputByteBufferNano p0){
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
                this.minIntervalMs = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.pendingStrategy = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommonRoutePopupStrategy tpendingStra = this.pendingStrategy;
       if (tpendingStra != null) {
          p0.writeInt32(1, tpendingStra);
       }
       tpendingStra = this.minIntervalMs;
       if (tpendingStra) {
          p0.writeUInt64(2, tpendingStra);
       }
       super.writeTo(p0);
       return;
    }
}
