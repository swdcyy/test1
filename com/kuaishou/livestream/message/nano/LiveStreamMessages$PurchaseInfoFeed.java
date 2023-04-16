package com.kuaishou.livestream.message.nano.LiveStreamMessages$PurchaseInfoFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$PurchaseInfoFeed extends MessageNano	// class@00131d
{
    public String commodityId;
    public String commodityName;
    public String id;
    public String jumpToken;
    public int liveAssistantType;
    public String orderId;
    public int purchaseCount;
    public LiveAudienceState senderState;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$PurchaseInfoFeed[] _emptyArray;

    public void LiveStreamMessages$PurchaseInfoFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PurchaseInfoFeed[] emptyArray(){
       if (LiveStreamMessages$PurchaseInfoFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PurchaseInfoFeed._emptyArray == null) {
             LiveStreamMessages$PurchaseInfoFeed[] purchaseInfo = new LiveStreamMessages$PurchaseInfoFeed[0];
             LiveStreamMessages$PurchaseInfoFeed._emptyArray = purchaseInfo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PurchaseInfoFeed._emptyArray;
    }
    public static LiveStreamMessages$PurchaseInfoFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PurchaseInfoFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$PurchaseInfoFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PurchaseInfoFeed(), p0);
    }
    public LiveStreamMessages$PurchaseInfoFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.commodityId = "";
       this.commodityName = "";
       this.purchaseCount = 0;
       this.orderId = "";
       this.sortRank = 0;
       this.liveAssistantType = 0;
       this.jumpToken = "";
       this.senderState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$PurchaseInfoFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$PurchaseInfoFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       if (!(this.commodityId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.commodityId);
       }
       if (!(this.commodityName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.commodityName);
       }
       tuser = this.purchaseCount;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tuser);
       }
       if (!(this.orderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.orderId);
       }
       ttime = this.sortRank;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tuser);
       }
       if (!(this.jumpToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.jumpToken);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PurchaseInfoFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                if (this.user == null) {
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
                break;
              case 24:
                this.time = p0.readUInt64();
                break;
              case '"':
                this.commodityId = p0.readString();
                break;
              case '*':
                this.commodityName = p0.readString();
                break;
              case '0':
                this.purchaseCount = p0.readUInt32();
                break;
              case ':':
                this.orderId = p0.readString();
                break;
              case '@':
                this.sortRank = p0.readUInt64();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case 'R':
                this.jumpToken = p0.readString();
                break;
              case 'Z':
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
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
       LiveStreamMessages$PurchaseInfoFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$PurchaseInfoFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       if (!(this.commodityId).equals(str)) {
          p0.writeString(4, this.commodityId);
       }
       if (!(this.commodityName).equals(str)) {
          p0.writeString(5, this.commodityName);
       }
       tuser = this.purchaseCount;
       if (tuser != null) {
          p0.writeUInt32(6, tuser);
       }
       if (!(this.orderId).equals(str)) {
          p0.writeString(7, this.orderId);
       }
       ttime = this.sortRank;
       if (ttime) {
          p0.writeUInt64(8, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(9, tuser);
       }
       if (!(this.jumpToken).equals(str)) {
          p0.writeString(10, this.jumpToken);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(11, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
