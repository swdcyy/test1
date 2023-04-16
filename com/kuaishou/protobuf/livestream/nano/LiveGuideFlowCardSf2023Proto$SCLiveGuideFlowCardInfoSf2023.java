package com.kuaishou.protobuf.livestream.nano.LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023;

public final class LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023 extends MessageNano	// class@000c98
{
    public String buttonText;
    public String cardId;
    public int cardTypeValue;
    public long delayTimeUpper;
    public long endTimeMillis;
    public String extraInfo;
    public String jumpUrl;
    public LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023 priority;
    public int resourceType;
    public long showDuration;
    public String subtitle;
    public String title;
    public int type;
    public long weight;
    public static LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023[] _emptyArray;

    public void LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023(){
       super();
       this.clear();
    }
    public static LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023[] emptyArray(){
       if (LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023._emptyArray == null) {
             LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023[] sCLiveGuideF = new LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023[0];
             LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023._emptyArray = sCLiveGuideF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023._emptyArray;
    }
    public static LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023().mergeFrom(p0);
    }
    public static LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023(), p0);
    }
    public LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023 clear(){
       this.cardId = "";
       this.type = 0;
       this.weight = 0;
       this.title = "";
       this.subtitle = "";
       this.buttonText = "";
       this.jumpUrl = "";
       this.showDuration = 0;
       this.delayTimeUpper = 0;
       this.endTimeMillis = 0;
       this.priority = null;
       this.resourceType = 0;
       this.cardTypeValue = 0;
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.cardId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.cardId);
       }
       LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023 ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttype);
       }
       LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023 tweight = this.weight;
       if (tweight) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tweight);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.title);
       }
       if (!(this.subtitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.subtitle);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.buttonText);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.jumpUrl);
       }
       tweight = this.showDuration;
       if (tweight) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tweight);
       }
       tweight = this.delayTimeUpper;
       if (tweight) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tweight);
       }
       tweight = this.endTimeMillis;
       if (tweight) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tweight);
       }
       ttype = this.priority;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, ttype);
       }
       ttype = this.resourceType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, ttype);
       }
       ttype = this.cardTypeValue;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, ttype);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.cardId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.type = i;
                }
                break;
              case 24:
                this.weight = p0.readUInt64();
                break;
              case '"':
                this.title = p0.readString();
                break;
              case '*':
                this.subtitle = p0.readString();
                break;
              case '2':
                this.buttonText = p0.readString();
                break;
              case ':':
                this.jumpUrl = p0.readString();
                break;
              case '@':
                this.showDuration = p0.readUInt64();
                break;
              case 'H':
                this.delayTimeUpper = p0.readUInt64();
                break;
              case 'P':
                this.endTimeMillis = p0.readUInt64();
                break;
              case 'Z':
                if (this.priority == null) {
                   this.priority = new LiveCardCommonModelCny2023Proto$LiveCardPriorityCny2023();
                }
                p0.readMessage(this.priority);
                break;
              case '`':
                this.resourceType = p0.readUInt32();
                break;
              case 'h':
                this.cardTypeValue = p0.readUInt32();
                break;
              case 'r':
                this.extraInfo = p0.readString();
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
       LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023 ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(2, ttype);
       }
       LiveGuideFlowCardSf2023Proto$SCLiveGuideFlowCardInfoSf2023 tweight = this.weight;
       if (tweight) {
          p0.writeUInt64(3, tweight);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(4, this.title);
       }
       if (!(this.subtitle).equals(str)) {
          p0.writeString(5, this.subtitle);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(6, this.buttonText);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(7, this.jumpUrl);
       }
       tweight = this.showDuration;
       if (tweight) {
          p0.writeUInt64(8, tweight);
       }
       tweight = this.delayTimeUpper;
       if (tweight) {
          p0.writeUInt64(9, tweight);
       }
       tweight = this.endTimeMillis;
       if (tweight) {
          p0.writeUInt64(10, tweight);
       }
       ttype = this.priority;
       if (ttype != null) {
          p0.writeMessage(11, ttype);
       }
       ttype = this.resourceType;
       if (ttype != null) {
          p0.writeUInt32(12, ttype);
       }
       ttype = this.cardTypeValue;
       if (ttype != null) {
          p0.writeUInt32(13, ttype);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(14, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
