package com.kuaishou.client.log.content.packages.nano.ClientContent$CustomV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$CustomV2 extends MessageNano	// class@001232
{
    public String activityId;
    public String authorId;
    public String brand;
    public String btnName;
    public String buyType;
    public String chargeType;
    public String conversionId;
    public String couponId;
    public String couponUserId;
    public String duration;
    public String failType;
    public String goodsId;
    public String identity;
    public String index;
    public String isPhoto;
    public boolean isRealtime;
    public String liveStreamId;
    public long llsid;
    public String model;
    public String orderId;
    public String orderStatus;
    public String photoId;
    public String poiId;
    public String promotionType;
    public String source;
    public long splashId;
    public String splashIdNew;
    public String spreadType;
    public String status;
    public String subBusinessLine;
    public String subTabName;
    public String tabName;
    public String tagetPhotoType;
    public static ClientContent$CustomV2[] _emptyArray;

    public void ClientContent$CustomV2(){
       super();
       this.clear();
    }
    public static ClientContent$CustomV2[] emptyArray(){
       if (ClientContent$CustomV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$CustomV2._emptyArray == null) {
             ClientContent$CustomV2[] uCustomV2Arr = new ClientContent$CustomV2[0];
             ClientContent$CustomV2._emptyArray = uCustomV2Arr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$CustomV2._emptyArray;
    }
    public static ClientContent$CustomV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$CustomV2().mergeFrom(p0);
    }
    public static ClientContent$CustomV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$CustomV2(), p0);
    }
    public ClientContent$CustomV2 clear(){
       this.btnName = "";
       this.index = "";
       this.conversionId = "";
       this.status = "";
       this.source = "";
       this.activityId = "";
       this.spreadType = "";
       this.orderStatus = "";
       this.orderId = "";
       this.couponId = "";
       this.identity = "";
       this.subBusinessLine = "";
       this.buyType = "";
       this.tagetPhotoType = "";
       this.promotionType = "";
       this.chargeType = "";
       this.isPhoto = "";
       this.couponUserId = "";
       this.brand = "";
       this.model = "";
       this.tabName = "";
       this.subTabName = "";
       this.duration = "";
       this.llsid = 0;
       this.isRealtime = false;
       this.failType = "";
       this.splashId = 0;
       this.splashIdNew = "";
       this.poiId = "";
       this.authorId = "";
       this.photoId = "";
       this.liveStreamId = "";
       this.goodsId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.btnName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.btnName);
       }
       if (!(this.index).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.index);
       }
       if (!(this.conversionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.conversionId);
       }
       if (!(this.status).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.status);
       }
       if (!(this.source).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.source);
       }
       if (!(this.activityId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.activityId);
       }
       if (!(this.spreadType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.spreadType);
       }
       if (!(this.orderStatus).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.orderStatus);
       }
       if (!(this.orderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.orderId);
       }
       if (!(this.couponId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.couponId);
       }
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.identity);
       }
       if (!(this.subBusinessLine).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.subBusinessLine);
       }
       if (!(this.buyType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.buyType);
       }
       if (!(this.tagetPhotoType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.tagetPhotoType);
       }
       if (!(this.promotionType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.promotionType);
       }
       if (!(this.chargeType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.chargeType);
       }
       if (!(this.isPhoto).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.isPhoto);
       }
       if (!(this.couponUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.couponUserId);
       }
       if (!(this.brand).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.brand);
       }
       if (!(this.model).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.model);
       }
       if (!(this.tabName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.tabName);
       }
       if (!(this.subTabName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.subTabName);
       }
       if (!(this.duration).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.duration);
       }
       ClientContent$CustomV2 tllsid = this.llsid;
       if (tllsid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, tllsid);
       }
       ClientContent$CustomV2 tisRealtime = this.isRealtime;
       if (tisRealtime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(25, tisRealtime);
       }
       if (!(this.failType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(26, this.failType);
       }
       tllsid = this.splashId;
       if (tllsid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(27, tllsid);
       }
       if (!(this.splashIdNew).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.splashIdNew);
       }
       if (!(this.poiId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(29, this.poiId);
       }
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(30, this.authorId);
       }
       if (!(this.photoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(31, this.photoId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.liveStreamId);
       }
       if (!(this.goodsId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.goodsId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$CustomV2 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.btnName = p0.readString();
                break;
              case 18:
                this.index = p0.readString();
                break;
              case 26:
                this.conversionId = p0.readString();
                break;
              case '"':
                this.status = p0.readString();
                break;
              case '*':
                this.source = p0.readString();
                break;
              case '2':
                this.activityId = p0.readString();
                break;
              case ':':
                this.spreadType = p0.readString();
                break;
              case 'B':
                this.orderStatus = p0.readString();
                break;
              case 'J':
                this.orderId = p0.readString();
                break;
              case 'R':
                this.couponId = p0.readString();
                break;
              case 'Z':
                this.identity = p0.readString();
                break;
              case 'b':
                this.subBusinessLine = p0.readString();
                break;
              case 'j':
                this.buyType = p0.readString();
                break;
              case 'r':
                this.tagetPhotoType = p0.readString();
                break;
              case 'z':
                this.promotionType = p0.readString();
                break;
              case 130:
                this.chargeType = p0.readString();
                break;
              case 138:
                this.isPhoto = p0.readString();
                break;
              case 146:
                this.couponUserId = p0.readString();
                break;
              case 154:
                this.brand = p0.readString();
                break;
              case 162:
                this.model = p0.readString();
                break;
              case 170:
                this.tabName = p0.readString();
                break;
              case 178:
                this.subTabName = p0.readString();
                break;
              case 186:
                this.duration = p0.readString();
                break;
              case 192:
                this.llsid = p0.readUInt64();
                break;
              case 200:
                this.isRealtime = p0.readBool();
                break;
              case 210:
                this.failType = p0.readString();
                break;
              case 216:
                this.splashId = p0.readUInt64();
                break;
              case 226:
                this.splashIdNew = p0.readString();
                break;
              case 234:
                this.poiId = p0.readString();
                break;
              case 242:
                this.authorId = p0.readString();
                break;
              case 250:
                this.photoId = p0.readString();
                break;
              case 258:
                this.liveStreamId = p0.readString();
                break;
              case 266:
                this.goodsId = p0.readString();
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
       if (!(this.btnName).equals(str)) {
          p0.writeString(1, this.btnName);
       }
       if (!(this.index).equals(str)) {
          p0.writeString(2, this.index);
       }
       if (!(this.conversionId).equals(str)) {
          p0.writeString(3, this.conversionId);
       }
       if (!(this.status).equals(str)) {
          p0.writeString(4, this.status);
       }
       if (!(this.source).equals(str)) {
          p0.writeString(5, this.source);
       }
       if (!(this.activityId).equals(str)) {
          p0.writeString(6, this.activityId);
       }
       if (!(this.spreadType).equals(str)) {
          p0.writeString(7, this.spreadType);
       }
       if (!(this.orderStatus).equals(str)) {
          p0.writeString(8, this.orderStatus);
       }
       if (!(this.orderId).equals(str)) {
          p0.writeString(9, this.orderId);
       }
       if (!(this.couponId).equals(str)) {
          p0.writeString(10, this.couponId);
       }
       if (!(this.identity).equals(str)) {
          p0.writeString(11, this.identity);
       }
       if (!(this.subBusinessLine).equals(str)) {
          p0.writeString(12, this.subBusinessLine);
       }
       if (!(this.buyType).equals(str)) {
          p0.writeString(13, this.buyType);
       }
       if (!(this.tagetPhotoType).equals(str)) {
          p0.writeString(14, this.tagetPhotoType);
       }
       if (!(this.promotionType).equals(str)) {
          p0.writeString(15, this.promotionType);
       }
       if (!(this.chargeType).equals(str)) {
          p0.writeString(16, this.chargeType);
       }
       if (!(this.isPhoto).equals(str)) {
          p0.writeString(17, this.isPhoto);
       }
       if (!(this.couponUserId).equals(str)) {
          p0.writeString(18, this.couponUserId);
       }
       if (!(this.brand).equals(str)) {
          p0.writeString(19, this.brand);
       }
       if (!(this.model).equals(str)) {
          p0.writeString(20, this.model);
       }
       if (!(this.tabName).equals(str)) {
          p0.writeString(21, this.tabName);
       }
       if (!(this.subTabName).equals(str)) {
          p0.writeString(22, this.subTabName);
       }
       if (!(this.duration).equals(str)) {
          p0.writeString(23, this.duration);
       }
       ClientContent$CustomV2 tllsid = this.llsid;
       if (tllsid) {
          p0.writeUInt64(24, tllsid);
       }
       ClientContent$CustomV2 tisRealtime = this.isRealtime;
       if (tisRealtime != null) {
          p0.writeBool(25, tisRealtime);
       }
       if (!(this.failType).equals(str)) {
          p0.writeString(26, this.failType);
       }
       tllsid = this.splashId;
       if (tllsid) {
          p0.writeUInt64(27, tllsid);
       }
       if (!(this.splashIdNew).equals(str)) {
          p0.writeString(28, this.splashIdNew);
       }
       if (!(this.poiId).equals(str)) {
          p0.writeString(29, this.poiId);
       }
       if (!(this.authorId).equals(str)) {
          p0.writeString(30, this.authorId);
       }
       if (!(this.photoId).equals(str)) {
          p0.writeString(31, this.photoId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(32, this.liveStreamId);
       }
       if (!(this.goodsId).equals(str)) {
          p0.writeString(33, this.goodsId);
       }
       super.writeTo(p0);
       return;
    }
}
