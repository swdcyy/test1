package com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPackShowPage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.System;

public final class LiveKrnRedPackMessage$LiveKrnRedPack extends MessageNano	// class@0011d0
{
    public String bundleId;
    public String componentName;
    public Map extraMessage;
    public String followBizCustomParams;
    public long grabTime;
    public String kwaiUrl;
    public String place;
    public UserInfos$UserInfo receiverInfo;
    public String redPackId;
    public int redPackType;
    public long senderId;
    public UserInfos$UserInfo senderInfo;
    public long showDeadline;
    public LiveKrnRedPackMessage$LiveKrnRedPackShowPage[] showPage;
    public long showTime;
    public long totalKsCoin;
    public String transparent;
    public static LiveKrnRedPackMessage$LiveKrnRedPack[] _emptyArray;

    public void LiveKrnRedPackMessage$LiveKrnRedPack(){
       super();
       this.clear();
    }
    public static LiveKrnRedPackMessage$LiveKrnRedPack[] emptyArray(){
       if (LiveKrnRedPackMessage$LiveKrnRedPack._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveKrnRedPackMessage$LiveKrnRedPack._emptyArray == null) {
             LiveKrnRedPackMessage$LiveKrnRedPack[] liveKrnRedPa = new LiveKrnRedPackMessage$LiveKrnRedPack[0];
             LiveKrnRedPackMessage$LiveKrnRedPack._emptyArray = liveKrnRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveKrnRedPackMessage$LiveKrnRedPack._emptyArray;
    }
    public static LiveKrnRedPackMessage$LiveKrnRedPack parseFrom(CodedInputByteBufferNano p0){
       return new LiveKrnRedPackMessage$LiveKrnRedPack().mergeFrom(p0);
    }
    public static LiveKrnRedPackMessage$LiveKrnRedPack parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveKrnRedPackMessage$LiveKrnRedPack(), p0);
    }
    public LiveKrnRedPackMessage$LiveKrnRedPack clear(){
       this.redPackId = "";
       this.senderId = 0;
       this.redPackType = 0;
       this.kwaiUrl = "";
       this.showTime = 0;
       this.showDeadline = 0;
       this.grabTime = 0;
       this.showPage = LiveKrnRedPackMessage$LiveKrnRedPackShowPage.emptyArray();
       this.extraMessage = null;
       this.bundleId = "";
       this.componentName = "";
       this.senderInfo = null;
       this.receiverInfo = null;
       this.totalKsCoin = 0;
       this.followBizCustomParams = "";
       this.place = "";
       this.transparent = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.redPackId);
       }
       LiveKrnRedPackMessage$LiveKrnRedPack tsenderId = this.senderId;
       if (tsenderId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tsenderId);
       }
       LiveKrnRedPackMessage$LiveKrnRedPack tredPackType = this.redPackType;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tredPackType);
       }
       if (!(this.kwaiUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.kwaiUrl);
       }
       tsenderId = this.showTime;
       if (tsenderId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tsenderId);
       }
       tsenderId = this.showDeadline;
       if (tsenderId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tsenderId);
       }
       tsenderId = this.grabTime;
       if (tsenderId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tsenderId);
       }
       tredPackType = this.showPage;
       if (tredPackType != null && tredPackType.length > 0) {
          int i1 = 0;
          tsenderId = this.showPage;
          while (i1 < tsenderId.length) {
             object oobject = tsenderId[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tredPackType = this.extraMessage;
       if (tredPackType != null) {
          i = i + InternalNano.computeMapFieldSize(tredPackType, 9, 9, 9);
       }
       if (!(this.bundleId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.bundleId);
       }
       if (!(this.componentName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.componentName);
       }
       tredPackType = this.senderInfo;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tredPackType);
       }
       tredPackType = this.receiverInfo;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, tredPackType);
       }
       tsenderId = this.totalKsCoin;
       if (tsenderId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tsenderId);
       }
       if (!(this.followBizCustomParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.followBizCustomParams);
       }
       if (!(this.place).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.place);
       }
       if (!(this.transparent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.transparent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveKrnRedPackMessage$LiveKrnRedPack mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.redPackId = p0.readString();
                break;
              case 16:
                this.senderId = p0.readUInt64();
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   switch (i){
                       case 11:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case '%':
                       case '&':
                       case 39:
                       case '(':
                       case ')':
                       case '*':
                       case '+':
                       case ',':
                       case '-':
                       case '.':
                       case '/':
                       case '0':
                       case 12:
                         break;
                       default:
                   }
                }
                this.redPackType = i;
                break;
              case '"':
                this.kwaiUrl = p0.readString();
                break;
              case '(':
                this.showTime = p0.readUInt64();
                break;
              case '0':
                this.showDeadline = p0.readUInt64();
                break;
              case '8':
                this.grabTime = p0.readUInt64();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                LiveKrnRedPackMessage$LiveKrnRedPack tshowPage = this.showPage;
                int i1 = 0;
                int i2 = (tshowPage == null)? 0: tshowPage.length;
                i = i + i2;
                LiveKrnRedPackMessage$LiveKrnRedPackShowPage[] liveKrnRedPa = new LiveKrnRedPackMessage$LiveKrnRedPackShowPage[i];
                if (i2) {
                   System.arraycopy(tshowPage, i1, liveKrnRedPa, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   liveKrnRedPa[i2] = new LiveKrnRedPackMessage$LiveKrnRedPackShowPage();
                   p0.readMessage(liveKrnRedPa[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveKrnRedPa[i2] = new LiveKrnRedPackMessage$LiveKrnRedPackShowPage();
                p0.readMessage(liveKrnRedPa[i2]);
                this.showPage = liveKrnRedPa;
                break;
              case 'J':
                this.extraMessage = InternalNano.mergeMapEntry(p0, this.extraMessage, mapFactory, 9, 9, null, 10, 18);
                break;
              case 'R':
                this.bundleId = p0.readString();
                break;
              case 'Z':
                this.componentName = p0.readString();
                break;
              case 'b':
                if (this.senderInfo == null) {
                   this.senderInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.senderInfo);
                break;
              case 'j':
                if (this.receiverInfo == null) {
                   this.receiverInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.receiverInfo);
                break;
              case 'p':
                this.totalKsCoin = p0.readUInt64();
                break;
              case 'z':
                this.followBizCustomParams = p0.readString();
                break;
              case 130:
                this.place = p0.readString();
                break;
              case 138:
                this.transparent = p0.readString();
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
       if (!(this.redPackId).equals(str)) {
          p0.writeString(1, this.redPackId);
       }
       LiveKrnRedPackMessage$LiveKrnRedPack tsenderId = this.senderId;
       if (tsenderId) {
          p0.writeUInt64(2, tsenderId);
       }
       LiveKrnRedPackMessage$LiveKrnRedPack tredPackType = this.redPackType;
       if (tredPackType != null) {
          p0.writeInt32(3, tredPackType);
       }
       if (!(this.kwaiUrl).equals(str)) {
          p0.writeString(4, this.kwaiUrl);
       }
       tsenderId = this.showTime;
       if (tsenderId) {
          p0.writeUInt64(5, tsenderId);
       }
       tsenderId = this.showDeadline;
       if (tsenderId) {
          p0.writeUInt64(6, tsenderId);
       }
       tsenderId = this.grabTime;
       if (tsenderId) {
          p0.writeUInt64(7, tsenderId);
       }
       tredPackType = this.showPage;
       if (tredPackType != null && tredPackType.length > 0) {
          int i = 0;
          tsenderId = this.showPage;
          while (i < tsenderId.length) {
             object oobject = tsenderId[i];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i = i + 1;
          }
       }
       tredPackType = this.extraMessage;
       if (tredPackType != null) {
          InternalNano.serializeMapField(p0, tredPackType, 9, 9, 9);
       }
       if (!(this.bundleId).equals(str)) {
          p0.writeString(10, this.bundleId);
       }
       if (!(this.componentName).equals(str)) {
          p0.writeString(11, this.componentName);
       }
       tredPackType = this.senderInfo;
       if (tredPackType != null) {
          p0.writeMessage(12, tredPackType);
       }
       tredPackType = this.receiverInfo;
       if (tredPackType != null) {
          p0.writeMessage(13, tredPackType);
       }
       tsenderId = this.totalKsCoin;
       if (tsenderId) {
          p0.writeUInt64(14, tsenderId);
       }
       if (!(this.followBizCustomParams).equals(str)) {
          p0.writeString(15, this.followBizCustomParams);
       }
       if (!(this.place).equals(str)) {
          p0.writeString(16, this.place);
       }
       if (!(this.transparent).equals(str)) {
          p0.writeString(17, this.transparent);
       }
       super.writeTo(p0);
       return;
    }
}
