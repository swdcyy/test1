package com.kuaishou.protobuf.livestream.nano.LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.cny2023.message.nano.CnyCdnDegradeProto$DegradableHeadUrlUserInfo;
import com.kuaishou.protobuf.livestream.nano.LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023;

public final class LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023 extends MessageNano	// class@000c85
{
    public String buttonText;
    public String cardId;
    public long endTimeMillis;
    public LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 priority;
    public long scatterTimeMillis;
    public long showDurationMillis;
    public boolean showHalfProfile;
    public String subtitle;
    public String title;
    public CnyCdnDegradeProto$DegradableHeadUrlUserInfo userInfo;
    public static LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023[] _emptyArray;

    public void LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023(){
       super();
       this.clear();
    }
    public static LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023[] emptyArray(){
       if (LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023._emptyArray == null) {
             LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023[] sCLiveFollow = new LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023[0];
             LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023._emptyArray = sCLiveFollow;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023._emptyArray;
    }
    public static LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023().mergeFrom(p0);
    }
    public static LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023(), p0);
    }
    public LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023 clear(){
       this.cardId = "";
       this.title = "";
       this.subtitle = "";
       this.buttonText = "";
       this.scatterTimeMillis = 0;
       this.showDurationMillis = 0;
       this.endTimeMillis = 0;
       this.priority = null;
       this.userInfo = null;
       this.showHalfProfile = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.cardId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.cardId);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.subtitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.subtitle);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.buttonText);
       }
       LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023 tscatterTime = this.scatterTimeMillis;
       int i1 = 0;
       if (tscatterTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tscatterTime);
       }
       tscatterTime = this.showDurationMillis;
       if (tscatterTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tscatterTime);
       }
       tscatterTime = this.endTimeMillis;
       if (tscatterTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tscatterTime);
       }
       tscatterTime = this.priority;
       if (tscatterTime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tscatterTime);
       }
       tscatterTime = this.userInfo;
       if (tscatterTime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tscatterTime);
       }
       tscatterTime = this.showHalfProfile;
       if (tscatterTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tscatterTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.cardId = p0.readString();
                break;
              case 18:
                this.title = p0.readString();
                break;
              case 26:
                this.subtitle = p0.readString();
                break;
              case '"':
                this.buttonText = p0.readString();
                break;
              case '(':
                this.scatterTimeMillis = p0.readUInt64();
                break;
              case '0':
                this.showDurationMillis = p0.readUInt64();
                break;
              case '8':
                this.endTimeMillis = p0.readUInt64();
                break;
              case 'B':
                if (this.priority == null) {
                   this.priority = new LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023();
                }
                p0.readMessage(this.priority);
                break;
              case 'J':
                if (this.userInfo == null) {
                   this.userInfo = new CnyCdnDegradeProto$DegradableHeadUrlUserInfo();
                }
                p0.readMessage(this.userInfo);
                break;
              case 'P':
                this.showHalfProfile = p0.readBool();
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
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.subtitle).equals(str)) {
          p0.writeString(3, this.subtitle);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(4, this.buttonText);
       }
       LiveFollowCardCny2023Proto$SCLiveFollowCardInfoCny2023 tscatterTime = this.scatterTimeMillis;
       int i = 0;
       if (tscatterTime - i) {
          p0.writeUInt64(5, tscatterTime);
       }
       tscatterTime = this.showDurationMillis;
       if (tscatterTime - i) {
          p0.writeUInt64(6, tscatterTime);
       }
       tscatterTime = this.endTimeMillis;
       if (tscatterTime - i) {
          p0.writeUInt64(7, tscatterTime);
       }
       tscatterTime = this.priority;
       if (tscatterTime != null) {
          p0.writeMessage(8, tscatterTime);
       }
       tscatterTime = this.userInfo;
       if (tscatterTime != null) {
          p0.writeMessage(9, tscatterTime);
       }
       tscatterTime = this.showHalfProfile;
       if (tscatterTime != null) {
          p0.writeBool(10, tscatterTime);
       }
       super.writeTo(p0);
       return;
    }
}
