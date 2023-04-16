package com.kuaishou.protobuf.livestream.nano.LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023;

public final class LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023 extends MessageNano	// class@000ca4
{
    public String backgroundJumpUrl;
    public String buttonText;
    public String cardId;
    public long endTimeMillis;
    public String initialPriceYuan;
    public String itemIconKey;
    public String itemId;
    public String jumpUrl;
    public String priceYuan;
    public LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 priority;
    public long scatterTimeMillis;
    public long showDurationMillis;
    public String subtitle;
    public String tagCode;
    public String title;
    public static LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023[] _emptyArray;

    public void LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023(){
       super();
       this.clear();
    }
    public static LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023[] emptyArray(){
       if (LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023._emptyArray == null) {
             LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023[] sCLiveMercha = new LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023[0];
             LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023._emptyArray = sCLiveMercha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023._emptyArray;
    }
    public static LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023().mergeFrom(p0);
    }
    public static LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023(), p0);
    }
    public LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023 clear(){
       this.cardId = "";
       this.itemId = "";
       this.title = "";
       this.subtitle = "";
       this.buttonText = "";
       this.jumpUrl = "";
       this.backgroundJumpUrl = "";
       this.itemIconKey = "";
       this.priceYuan = "";
       this.initialPriceYuan = "";
       this.showDurationMillis = 0;
       this.priority = null;
       this.tagCode = "";
       this.endTimeMillis = 0;
       this.scatterTimeMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.cardId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.cardId);
       }
       if (!(this.itemId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.itemId);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.title);
       }
       if (!(this.subtitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.subtitle);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.buttonText);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.jumpUrl);
       }
       if (!(this.backgroundJumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.backgroundJumpUrl);
       }
       if (!(this.itemIconKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.itemIconKey);
       }
       if (!(this.priceYuan).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.priceYuan);
       }
       if (!(this.initialPriceYuan).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.initialPriceYuan);
       }
       LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023 tshowDuratio = this.showDurationMillis;
       if (tshowDuratio) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tshowDuratio);
       }
       LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023 tpriority = this.priority;
       if (tpriority != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tpriority);
       }
       if (!(this.tagCode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.tagCode);
       }
       tpriority = this.endTimeMillis;
       if (tpriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tpriority);
       }
       tpriority = this.scatterTimeMillis;
       if (tpriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tpriority);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.cardId = p0.readString();
                break;
              case 18:
                this.itemId = p0.readString();
                break;
              case 26:
                this.title = p0.readString();
                break;
              case '"':
                this.subtitle = p0.readString();
                break;
              case '*':
                this.buttonText = p0.readString();
                break;
              case '2':
                this.jumpUrl = p0.readString();
                break;
              case ':':
                this.backgroundJumpUrl = p0.readString();
                break;
              case 'B':
                this.itemIconKey = p0.readString();
                break;
              case 'J':
                this.priceYuan = p0.readString();
                break;
              case 'R':
                this.initialPriceYuan = p0.readString();
                break;
              case 'X':
                this.showDurationMillis = p0.readUInt64();
                break;
              case 'b':
                if (this.priority == null) {
                   this.priority = new LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023();
                }
                p0.readMessage(this.priority);
                break;
              case 'j':
                this.tagCode = p0.readString();
                break;
              case 'p':
                this.endTimeMillis = p0.readUInt64();
                break;
              case 'x':
                this.scatterTimeMillis = p0.readUInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.cardId).equals(str)) {
          p0.writeString(1, this.cardId);
       }
       if (!(this.itemId).equals(str)) {
          p0.writeString(2, this.itemId);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(3, this.title);
       }
       if (!(this.subtitle).equals(str)) {
          p0.writeString(4, this.subtitle);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(5, this.buttonText);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(6, this.jumpUrl);
       }
       if (!(this.backgroundJumpUrl).equals(str)) {
          p0.writeString(7, this.backgroundJumpUrl);
       }
       if (!(this.itemIconKey).equals(str)) {
          p0.writeString(8, this.itemIconKey);
       }
       if (!(this.priceYuan).equals(str)) {
          p0.writeString(9, this.priceYuan);
       }
       if (!(this.initialPriceYuan).equals(str)) {
          p0.writeString(10, this.initialPriceYuan);
       }
       LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023 tshowDuratio = this.showDurationMillis;
       if (tshowDuratio) {
          p0.writeUInt64(11, tshowDuratio);
       }
       LiveMerchantCardCny2023Proto$SCLiveMerchantCardInfoCny2023 tpriority = this.priority;
       if (tpriority != null) {
          p0.writeMessage(12, tpriority);
       }
       if (!(this.tagCode).equals(str)) {
          p0.writeString(13, this.tagCode);
       }
       tpriority = this.endTimeMillis;
       if (tpriority) {
          p0.writeUInt64(14, tpriority);
       }
       tpriority = this.scatterTimeMillis;
       if (tpriority) {
          p0.writeUInt64(15, tpriority);
       }
       super.writeTo(p0);
       return;
    }
}
