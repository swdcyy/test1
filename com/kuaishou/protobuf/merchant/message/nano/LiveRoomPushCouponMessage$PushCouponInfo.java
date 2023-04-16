package com.kuaishou.protobuf.merchant.message.nano.LiveRoomPushCouponMessage$PushCouponInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomPushCouponMessage$PushCouponInfo extends MessageNano	// class@000df3
{
    public long activitySessionEndTime;
    public String activitySessionId;
    public long activitySessionStartTime;
    public int activityType;
    public int channelType;
    public String couponDisplayTitle;
    public String couponId;
    public long couponPrice;
    public long expireTime;
    public Map extraMap;
    public String jumpUrl;
    public int status;
    public int type;
    public String useConditionTitle;
    public String useRangeTitle;
    public static LiveRoomPushCouponMessage$PushCouponInfo[] _emptyArray;

    public void LiveRoomPushCouponMessage$PushCouponInfo(){
       super();
       this.clear();
    }
    public static LiveRoomPushCouponMessage$PushCouponInfo[] emptyArray(){
       if (LiveRoomPushCouponMessage$PushCouponInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomPushCouponMessage$PushCouponInfo._emptyArray == null) {
             LiveRoomPushCouponMessage$PushCouponInfo[] pushCouponIn = new LiveRoomPushCouponMessage$PushCouponInfo[0];
             LiveRoomPushCouponMessage$PushCouponInfo._emptyArray = pushCouponIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomPushCouponMessage$PushCouponInfo._emptyArray;
    }
    public static LiveRoomPushCouponMessage$PushCouponInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomPushCouponMessage$PushCouponInfo().mergeFrom(p0);
    }
    public static LiveRoomPushCouponMessage$PushCouponInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomPushCouponMessage$PushCouponInfo(), p0);
    }
    public LiveRoomPushCouponMessage$PushCouponInfo clear(){
       this.activitySessionId = "";
       this.couponId = "";
       this.couponDisplayTitle = "";
       this.couponPrice = 0;
       this.useConditionTitle = "";
       this.useRangeTitle = "";
       this.expireTime = 0;
       this.type = 0;
       this.status = 0;
       this.jumpUrl = "";
       this.activityType = 0;
       this.channelType = 0;
       this.activitySessionStartTime = 0;
       this.activitySessionEndTime = 0;
       this.extraMap = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.activitySessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activitySessionId);
       }
       if (!(this.couponId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.couponId);
       }
       if (!(this.couponDisplayTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.couponDisplayTitle);
       }
       LiveRoomPushCouponMessage$PushCouponInfo tcouponPrice = this.couponPrice;
       if (tcouponPrice) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcouponPrice);
       }
       if (!(this.useConditionTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.useConditionTitle);
       }
       if (!(this.useRangeTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.useRangeTitle);
       }
       tcouponPrice = this.expireTime;
       if (tcouponPrice) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tcouponPrice);
       }
       LiveRoomPushCouponMessage$PushCouponInfo ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, ttype);
       }
       ttype = this.status;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, ttype);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.jumpUrl);
       }
       ttype = this.activityType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, ttype);
       }
       ttype = this.channelType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, ttype);
       }
       ttype = this.activitySessionStartTime;
       if (ttype) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, ttype);
       }
       ttype = this.activitySessionEndTime;
       if (ttype) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, ttype);
       }
       ttype = this.extraMap;
       if (ttype != null) {
          i = i + InternalNano.computeMapFieldSize(ttype, 15, 9, 9);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomPushCouponMessage$PushCouponInfo mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.activitySessionId = p0.readString();
                break;
              case 18:
                this.couponId = p0.readString();
                break;
              case 26:
                this.couponDisplayTitle = p0.readString();
                break;
              case 32:
                this.couponPrice = p0.readUInt64();
                break;
              case '*':
                this.useConditionTitle = p0.readString();
                break;
              case '2':
                this.useRangeTitle = p0.readString();
                break;
              case '8':
                this.expireTime = p0.readUInt64();
                break;
              case '@':
                this.type = p0.readUInt32();
                break;
              case 'H':
                this.status = p0.readUInt32();
                break;
              case 'R':
                this.jumpUrl = p0.readString();
                break;
              case 'X':
                this.activityType = p0.readUInt32();
                break;
              case '`':
                this.channelType = p0.readUInt32();
                break;
              case 'h':
                this.activitySessionStartTime = p0.readUInt64();
                break;
              case 'p':
                this.activitySessionEndTime = p0.readUInt64();
                break;
              case 'z':
                this.extraMap = InternalNano.mergeMapEntry(p0, this.extraMap, mapFactory, 9, 9, null, 10, 18);
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
       if (!(this.activitySessionId).equals(str)) {
          p0.writeString(1, this.activitySessionId);
       }
       if (!(this.couponId).equals(str)) {
          p0.writeString(2, this.couponId);
       }
       if (!(this.couponDisplayTitle).equals(str)) {
          p0.writeString(3, this.couponDisplayTitle);
       }
       LiveRoomPushCouponMessage$PushCouponInfo tcouponPrice = this.couponPrice;
       if (tcouponPrice) {
          p0.writeUInt64(4, tcouponPrice);
       }
       if (!(this.useConditionTitle).equals(str)) {
          p0.writeString(5, this.useConditionTitle);
       }
       if (!(this.useRangeTitle).equals(str)) {
          p0.writeString(6, this.useRangeTitle);
       }
       tcouponPrice = this.expireTime;
       if (tcouponPrice) {
          p0.writeUInt64(7, tcouponPrice);
       }
       LiveRoomPushCouponMessage$PushCouponInfo ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(8, ttype);
       }
       ttype = this.status;
       if (ttype != null) {
          p0.writeUInt32(9, ttype);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(10, this.jumpUrl);
       }
       ttype = this.activityType;
       if (ttype != null) {
          p0.writeUInt32(11, ttype);
       }
       ttype = this.channelType;
       if (ttype != null) {
          p0.writeUInt32(12, ttype);
       }
       ttype = this.activitySessionStartTime;
       if (ttype) {
          p0.writeUInt64(13, ttype);
       }
       ttype = this.activitySessionEndTime;
       if (ttype) {
          p0.writeUInt64(14, ttype);
       }
       ttype = this.extraMap;
       if (ttype != null) {
          InternalNano.serializeMapField(p0, ttype, 15, 9, 9);
       }
       super.writeTo(p0);
       return;
    }
}
