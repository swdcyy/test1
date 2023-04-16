package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PkPayInfo extends MessageNano	// class@001315
{
    public String acceptButtonTips;
    public boolean highFans;
    public String payBudgetPopUpTips;
    public String payNotice;
    public int payType;
    public String payUrl;
    public boolean shopLive;
    public Map userId2EstimateTransferAmount;
    public Map userId2PayAmount;
    public Map userId2UnitPrice;
    public static LiveStreamMessages$PkPayInfo[] _emptyArray;

    public void LiveStreamMessages$PkPayInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkPayInfo[] emptyArray(){
       if (LiveStreamMessages$PkPayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkPayInfo._emptyArray == null) {
             LiveStreamMessages$PkPayInfo[] pkPayInfoArr = new LiveStreamMessages$PkPayInfo[0];
             LiveStreamMessages$PkPayInfo._emptyArray = pkPayInfoArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkPayInfo._emptyArray;
    }
    public static LiveStreamMessages$PkPayInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkPayInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkPayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkPayInfo(), p0);
    }
    public LiveStreamMessages$PkPayInfo clear(){
       this.payType = 0;
       this.userId2PayAmount = null;
       this.payNotice = "";
       this.acceptButtonTips = "";
       this.payUrl = "";
       this.highFans = false;
       this.shopLive = false;
       this.userId2UnitPrice = null;
       this.userId2EstimateTransferAmount = null;
       this.payBudgetPopUpTips = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PkPayInfo tpayType = this.payType;
       if (tpayType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tpayType);
       }
       tpayType = this.userId2PayAmount;
       int i1 = 4;
       if (tpayType != null) {
          i = i + InternalNano.computeMapFieldSize(tpayType, 2, i1, i1);
       }
       if (!(this.payNotice).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.payNotice);
       }
       if (!(this.acceptButtonTips).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.acceptButtonTips);
       }
       if (!(this.payUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.payUrl);
       }
       tpayType = this.highFans;
       if (tpayType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tpayType);
       }
       tpayType = this.shopLive;
       if (tpayType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tpayType);
       }
       tpayType = this.userId2UnitPrice;
       if (tpayType != null) {
          i = i + InternalNano.computeMapFieldSize(tpayType, 8, i1, i1);
       }
       tpayType = this.userId2EstimateTransferAmount;
       if (tpayType != null) {
          i = i + InternalNano.computeMapFieldSize(tpayType, 9, i1, i1);
       }
       if (!(this.payBudgetPopUpTips).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.payBudgetPopUpTips);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkPayInfo mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.payType = i;
                }
                break;
              case 18:
                this.userId2PayAmount = InternalNano.mergeMapEntry(p0, this.userId2PayAmount, mapFactory, 4, 4, null, 8, 16);
                break;
              case 26:
                this.payNotice = p0.readString();
                break;
              case '"':
                this.acceptButtonTips = p0.readString();
                break;
              case '*':
                this.payUrl = p0.readString();
                break;
              case '0':
                this.highFans = p0.readBool();
                break;
              case '8':
                this.shopLive = p0.readBool();
                break;
              case 'B':
                this.userId2UnitPrice = InternalNano.mergeMapEntry(p0, this.userId2UnitPrice, mapFactory, 4, 4, null, 8, 16);
                break;
              case 'J':
                this.userId2EstimateTransferAmount = InternalNano.mergeMapEntry(p0, this.userId2EstimateTransferAmount, mapFactory, 4, 4, null, 8, 16);
                break;
              case 'R':
                this.payBudgetPopUpTips = p0.readString();
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
       LiveStreamMessages$PkPayInfo tpayType = this.payType;
       if (tpayType != null) {
          p0.writeInt32(1, tpayType);
       }
       tpayType = this.userId2PayAmount;
       int i = 4;
       if (tpayType != null) {
          InternalNano.serializeMapField(p0, tpayType, 2, i, i);
       }
       if (!(this.payNotice).equals("")) {
          p0.writeString(3, this.payNotice);
       }
       if (!(this.acceptButtonTips).equals("")) {
          p0.writeString(i, this.acceptButtonTips);
       }
       if (!(this.payUrl).equals("")) {
          p0.writeString(5, this.payUrl);
       }
       tpayType = this.highFans;
       if (tpayType != null) {
          p0.writeBool(6, tpayType);
       }
       tpayType = this.shopLive;
       if (tpayType != null) {
          p0.writeBool(7, tpayType);
       }
       tpayType = this.userId2UnitPrice;
       if (tpayType != null) {
          InternalNano.serializeMapField(p0, tpayType, 8, i, i);
       }
       tpayType = this.userId2EstimateTransferAmount;
       if (tpayType != null) {
          InternalNano.serializeMapField(p0, tpayType, 9, i, i);
       }
       if (!(this.payBudgetPopUpTips).equals("")) {
          p0.writeString(10, this.payBudgetPopUpTips);
       }
       super.writeTo(p0);
       return;
    }
}
