package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneGameStoreOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneQuickPromotionInfo;

public final class LiveStreamMessages$SCGzoneGameStoreOpened extends MessageNano	// class@001331
{
    public long displayMaxDelayMillis;
    public long popupDisplayDelayMillis;
    public LiveStreamMessages$GzoneQuickPromotionInfo quickPromotionInfo;
    public static LiveStreamMessages$SCGzoneGameStoreOpened[] _emptyArray;

    public void LiveStreamMessages$SCGzoneGameStoreOpened(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCGzoneGameStoreOpened[] emptyArray(){
       if (LiveStreamMessages$SCGzoneGameStoreOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCGzoneGameStoreOpened._emptyArray == null) {
             LiveStreamMessages$SCGzoneGameStoreOpened[] sCGzoneGameS = new LiveStreamMessages$SCGzoneGameStoreOpened[0];
             LiveStreamMessages$SCGzoneGameStoreOpened._emptyArray = sCGzoneGameS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCGzoneGameStoreOpened._emptyArray;
    }
    public static LiveStreamMessages$SCGzoneGameStoreOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCGzoneGameStoreOpened().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCGzoneGameStoreOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCGzoneGameStoreOpened(), p0);
    }
    public LiveStreamMessages$SCGzoneGameStoreOpened clear(){
       this.displayMaxDelayMillis = 0;
       this.popupDisplayDelayMillis = 0;
       this.quickPromotionInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCGzoneGameStoreOpened tdisplayMaxD = this.displayMaxDelayMillis;
       int i1 = 0;
       if (tdisplayMaxD - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tdisplayMaxD);
       }
       tdisplayMaxD = this.popupDisplayDelayMillis;
       if (tdisplayMaxD - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tdisplayMaxD);
       }
       tdisplayMaxD = this.quickPromotionInfo;
       if (tdisplayMaxD != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tdisplayMaxD);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCGzoneGameStoreOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.quickPromotionInfo == null){
                   this.quickPromotionInfo = new LiveStreamMessages$GzoneQuickPromotionInfo();
                }
                p0.readMessage(this.quickPromotionInfo);
             }else {
                this.popupDisplayDelayMillis = p0.readUInt64();
             }
          }else {
             this.displayMaxDelayMillis = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCGzoneGameStoreOpened tdisplayMaxD = this.displayMaxDelayMillis;
       int i = 0;
       if (tdisplayMaxD - i) {
          p0.writeUInt64(1, tdisplayMaxD);
       }
       tdisplayMaxD = this.popupDisplayDelayMillis;
       if (tdisplayMaxD - i) {
          p0.writeUInt64(2, tdisplayMaxD);
       }
       tdisplayMaxD = this.quickPromotionInfo;
       if (tdisplayMaxD != null) {
          p0.writeMessage(3, tdisplayMaxD);
       }
       super.writeTo(p0);
       return;
    }
}
