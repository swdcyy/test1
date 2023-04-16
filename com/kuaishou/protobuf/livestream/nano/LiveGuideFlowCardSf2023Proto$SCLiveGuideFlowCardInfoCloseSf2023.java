package com.kuaishou.protobuf.livestream.nano.LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023 extends MessageNano	// class@000c97
{
    public int cardTypeValue;
    public long timestamp;
    public int type;
    public static LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023[] _emptyArray;

    public void LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023(){
       super();
       this.clear();
    }
    public static LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023[] emptyArray(){
       if (LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023._emptyArray == null) {
             LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023[] sCLiveGuideF = new LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023[0];
             LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023._emptyArray = sCLiveGuideF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023._emptyArray;
    }
    public static LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023().mergeFrom(p0);
    }
    public static LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023(), p0);
    }
    public LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023 clear(){
       this.type = 0;
       this.timestamp = 0;
       this.cardTypeValue = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023 ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.timestamp;
       if (ttype) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       ttype = this.cardTypeValue;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023 mergeFrom(CodedInputByteBufferNano p0){
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
                   this.cardTypeValue = p0.readUInt32();
                }
             }else {
                this.timestamp = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoCloseSf2023 ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.timestamp;
       if (ttype) {
          p0.writeUInt64(2, ttype);
       }
       ttype = this.cardTypeValue;
       if (ttype != null) {
          p0.writeUInt32(3, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
