package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneGameStoreRefresh;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneQuickPromotionInfo;

public final class LiveStreamMessages$SCGzoneGameStoreRefresh extends MessageNano	// class@001332
{
    public LiveStreamMessages$GzoneQuickPromotionInfo quickPromotionInfo;
    public long refreshMaxDelayMillis;
    public static LiveStreamMessages$SCGzoneGameStoreRefresh[] _emptyArray;

    public void LiveStreamMessages$SCGzoneGameStoreRefresh(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCGzoneGameStoreRefresh[] emptyArray(){
       if (LiveStreamMessages$SCGzoneGameStoreRefresh._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCGzoneGameStoreRefresh._emptyArray == null) {
             LiveStreamMessages$SCGzoneGameStoreRefresh[] sCGzoneGameS = new LiveStreamMessages$SCGzoneGameStoreRefresh[0];
             LiveStreamMessages$SCGzoneGameStoreRefresh._emptyArray = sCGzoneGameS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCGzoneGameStoreRefresh._emptyArray;
    }
    public static LiveStreamMessages$SCGzoneGameStoreRefresh parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCGzoneGameStoreRefresh().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCGzoneGameStoreRefresh parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCGzoneGameStoreRefresh(), p0);
    }
    public LiveStreamMessages$SCGzoneGameStoreRefresh clear(){
       this.refreshMaxDelayMillis = 0;
       this.quickPromotionInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCGzoneGameStoreRefresh trefreshMaxD = this.refreshMaxDelayMillis;
       if (trefreshMaxD) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, trefreshMaxD);
       }
       trefreshMaxD = this.quickPromotionInfo;
       if (trefreshMaxD != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, trefreshMaxD);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCGzoneGameStoreRefresh mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.quickPromotionInfo == null){
                this.quickPromotionInfo = new LiveStreamMessages$GzoneQuickPromotionInfo();
             }
             p0.readMessage(this.quickPromotionInfo);
          }else {
             this.refreshMaxDelayMillis = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCGzoneGameStoreRefresh trefreshMaxD = this.refreshMaxDelayMillis;
       if (trefreshMaxD) {
          p0.writeUInt64(1, trefreshMaxD);
       }
       trefreshMaxD = this.quickPromotionInfo;
       if (trefreshMaxD != null) {
          p0.writeMessage(2, trefreshMaxD);
       }
       super.writeTo(p0);
       return;
    }
}
