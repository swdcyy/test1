package com.kuaishou.livestream.message.nano.LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo extends MessageNano	// class@001104
{
    public int tradeCntInService;
    public int tradeCntNotService;
    public static LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo[] _emptyArray;

    public void LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo(){
       super();
       this.clear();
    }
    public static LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo[] emptyArray(){
       if (LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo._emptyArray == null) {
             LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo[] sCLiveAuthor = new LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo[0];
             LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo._emptyArray = sCLiveAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo._emptyArray;
    }
    public static LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo().mergeFrom(p0);
    }
    public static LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo(), p0);
    }
    public LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo clear(){
       this.tradeCntNotService = 0;
       this.tradeCntInService = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo ttradeCntNot = this.tradeCntNotService;
       if (ttradeCntNot != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttradeCntNot);
       }
       ttradeCntNot = this.tradeCntInService;
       if (ttradeCntNot != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttradeCntNot);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo mergeFrom(CodedInputByteBufferNano p0){
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
                this.tradeCntInService = p0.readUInt32();
             }
          }else {
             this.tradeCntNotService = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorTradeInfo ttradeCntNot = this.tradeCntNotService;
       if (ttradeCntNot != null) {
          p0.writeUInt32(1, ttradeCntNot);
       }
       ttradeCntNot = this.tradeCntInService;
       if (ttradeCntNot != null) {
          p0.writeUInt32(2, ttradeCntNot);
       }
       super.writeTo(p0);
       return;
    }
}
