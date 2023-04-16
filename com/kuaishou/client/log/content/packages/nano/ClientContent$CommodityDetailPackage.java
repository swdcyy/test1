package com.kuaishou.client.log.content.packages.nano.ClientContent$CommodityDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$CommodityDetailPackage extends MessageNano	// class@001230
{
    public String activityId;
    public String carrierEntry;
    public String carrierId;
    public String carrierType;
    public boolean hasCoupon;
    public String id;
    public int index;
    public int inventory;
    public int isFullReduction;
    public int isInExplanation;
    public int isMoreCheap;
    public int isNewExclusive;
    public int isPlayback;
    public int isSandeaPyItem;
    public int isSearchFlash;
    public boolean isSeckill;
    public int isSnapup;
    public int itemActivityType;
    public int itemType;
    public String lightSpot;
    public int marketGoodType;
    public String name;
    public String price;
    public String rightsName;
    public boolean selected;
    public String sellerId;
    public int skuNum;
    public int status;
    public static ClientContent$CommodityDetailPackage[] _emptyArray;

    public void ClientContent$CommodityDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$CommodityDetailPackage[] emptyArray(){
       if (ClientContent$CommodityDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$CommodityDetailPackage._emptyArray == null) {
             ClientContent$CommodityDetailPackage[] uCommodityDe = new ClientContent$CommodityDetailPackage[0];
             ClientContent$CommodityDetailPackage._emptyArray = uCommodityDe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$CommodityDetailPackage._emptyArray;
    }
    public static ClientContent$CommodityDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$CommodityDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$CommodityDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$CommodityDetailPackage(), p0);
    }
    public ClientContent$CommodityDetailPackage clear(){
       this.id = "";
       this.name = "";
       this.index = 0;
       this.selected = false;
       this.itemType = 0;
       this.hasCoupon = false;
       this.isSeckill = false;
       this.isInExplanation = 0;
       this.isPlayback = 0;
       this.isSnapup = 0;
       this.isMoreCheap = 0;
       this.isNewExclusive = 0;
       this.isFullReduction = 0;
       this.isSandeaPyItem = 0;
       this.isSearchFlash = 0;
       this.marketGoodType = 0;
       this.itemActivityType = 0;
       this.status = 0;
       this.inventory = 0;
       this.price = "";
       this.lightSpot = "";
       this.activityId = "";
       this.skuNum = 0;
       this.sellerId = "";
       this.carrierEntry = "";
       this.carrierId = "";
       this.carrierType = "";
       this.rightsName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       ClientContent$CommodityDetailPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tindex);
       }
       tindex = this.selected;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tindex);
       }
       tindex = this.itemType;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tindex);
       }
       tindex = this.hasCoupon;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tindex);
       }
       tindex = this.isSeckill;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tindex);
       }
       tindex = this.isInExplanation;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tindex);
       }
       tindex = this.isPlayback;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tindex);
       }
       tindex = this.isSnapup;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tindex);
       }
       tindex = this.isMoreCheap;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tindex);
       }
       tindex = this.isNewExclusive;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, tindex);
       }
       tindex = this.isFullReduction;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, tindex);
       }
       tindex = this.isSandeaPyItem;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, tindex);
       }
       tindex = this.isSearchFlash;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, tindex);
       }
       tindex = this.marketGoodType;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, tindex);
       }
       tindex = this.itemActivityType;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, tindex);
       }
       tindex = this.status;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(18, tindex);
       }
       tindex = this.inventory;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(19, tindex);
       }
       if (!(this.price).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.price);
       }
       if (!(this.lightSpot).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.lightSpot);
       }
       if (!(this.activityId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.activityId);
       }
       tindex = this.skuNum;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(23, tindex);
       }
       if (!(this.sellerId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.sellerId);
       }
       if (!(this.carrierEntry).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.carrierEntry);
       }
       if (!(this.carrierId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(26, this.carrierId);
       }
       if (!(this.carrierType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.carrierType);
       }
       if (!(this.rightsName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.rightsName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$CommodityDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                this.name = p0.readString();
                break;
              case 24:
                this.index = p0.readUInt32();
                break;
              case 32:
                this.selected = p0.readBool();
                break;
              case '(':
                this.itemType = p0.readUInt32();
                break;
              case '0':
                this.hasCoupon = p0.readBool();
                break;
              case '8':
                this.isSeckill = p0.readBool();
                break;
              case '@':
                this.isInExplanation = p0.readUInt32();
                break;
              case 'H':
                this.isPlayback = p0.readUInt32();
                break;
              case 'P':
                this.isSnapup = p0.readUInt32();
                break;
              case 'X':
                this.isMoreCheap = p0.readUInt32();
                break;
              case '`':
                this.isNewExclusive = p0.readUInt32();
                break;
              case 'h':
                this.isFullReduction = p0.readUInt32();
                break;
              case 'p':
                this.isSandeaPyItem = p0.readUInt32();
                break;
              case 'x':
                this.isSearchFlash = p0.readUInt32();
                break;
              case 128:
                this.marketGoodType = p0.readUInt32();
                break;
              case 136:
                this.itemActivityType = p0.readUInt32();
                break;
              case 144:
                this.status = p0.readUInt32();
                break;
              case 152:
                this.inventory = p0.readUInt32();
                break;
              case 162:
                this.price = p0.readString();
                break;
              case 170:
                this.lightSpot = p0.readString();
                break;
              case 178:
                this.activityId = p0.readString();
                break;
              case 184:
                this.skuNum = p0.readUInt32();
                break;
              case 194:
                this.sellerId = p0.readString();
                break;
              case 202:
                this.carrierEntry = p0.readString();
                break;
              case 210:
                this.carrierId = p0.readString();
                break;
              case 218:
                this.carrierType = p0.readString();
                break;
              case 226:
                this.rightsName = p0.readString();
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
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       ClientContent$CommodityDetailPackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(3, tindex);
       }
       tindex = this.selected;
       if (tindex != null) {
          p0.writeBool(4, tindex);
       }
       tindex = this.itemType;
       if (tindex != null) {
          p0.writeUInt32(5, tindex);
       }
       tindex = this.hasCoupon;
       if (tindex != null) {
          p0.writeBool(6, tindex);
       }
       tindex = this.isSeckill;
       if (tindex != null) {
          p0.writeBool(7, tindex);
       }
       tindex = this.isInExplanation;
       if (tindex != null) {
          p0.writeUInt32(8, tindex);
       }
       tindex = this.isPlayback;
       if (tindex != null) {
          p0.writeUInt32(9, tindex);
       }
       tindex = this.isSnapup;
       if (tindex != null) {
          p0.writeUInt32(10, tindex);
       }
       tindex = this.isMoreCheap;
       if (tindex != null) {
          p0.writeUInt32(11, tindex);
       }
       tindex = this.isNewExclusive;
       if (tindex != null) {
          p0.writeUInt32(12, tindex);
       }
       tindex = this.isFullReduction;
       if (tindex != null) {
          p0.writeUInt32(13, tindex);
       }
       tindex = this.isSandeaPyItem;
       if (tindex != null) {
          p0.writeUInt32(14, tindex);
       }
       tindex = this.isSearchFlash;
       if (tindex != null) {
          p0.writeUInt32(15, tindex);
       }
       tindex = this.marketGoodType;
       if (tindex != null) {
          p0.writeUInt32(16, tindex);
       }
       tindex = this.itemActivityType;
       if (tindex != null) {
          p0.writeUInt32(17, tindex);
       }
       tindex = this.status;
       if (tindex != null) {
          p0.writeUInt32(18, tindex);
       }
       tindex = this.inventory;
       if (tindex != null) {
          p0.writeUInt32(19, tindex);
       }
       if (!(this.price).equals(str)) {
          p0.writeString(20, this.price);
       }
       if (!(this.lightSpot).equals(str)) {
          p0.writeString(21, this.lightSpot);
       }
       if (!(this.activityId).equals(str)) {
          p0.writeString(22, this.activityId);
       }
       tindex = this.skuNum;
       if (tindex != null) {
          p0.writeUInt32(23, tindex);
       }
       if (!(this.sellerId).equals(str)) {
          p0.writeString(24, this.sellerId);
       }
       if (!(this.carrierEntry).equals(str)) {
          p0.writeString(25, this.carrierEntry);
       }
       if (!(this.carrierId).equals(str)) {
          p0.writeString(26, this.carrierId);
       }
       if (!(this.carrierType).equals(str)) {
          p0.writeString(27, this.carrierType);
       }
       if (!(this.rightsName).equals(str)) {
          p0.writeString(28, this.rightsName);
       }
       super.writeTo(p0);
       return;
    }
}
