package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal extends MessageNano	// class@001c58
{
    public String amountColor;
    public String animationPicUrl;
    public String displayAwardAmount;
    public String displayUnit;
    public long hiddenDelayMillis;
    public String id;
    public boolean isShow;
    public int redPackType;
    public long requestAnimationMaxDelayMillis;
    public String title;
    public String titleColor;
    public String widgetBackgroundUrl;
    public static LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal[] liveKwaishop = new LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal[0];
             LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal._emptyArray = liveKwaishop;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal clear(){
       this.id = "";
       this.displayAwardAmount = "";
       this.displayUnit = "";
       this.title = "";
       this.isShow = false;
       this.hiddenDelayMillis = 0;
       this.redPackType = 0;
       this.animationPicUrl = "";
       this.requestAnimationMaxDelayMillis = 0;
       this.widgetBackgroundUrl = "";
       this.amountColor = "";
       this.titleColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.displayAwardAmount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.displayAwardAmount);
       }
       if (!(this.displayUnit).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayUnit);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.title);
       }
       LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal tisShow = this.isShow;
       if (tisShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tisShow);
       }
       LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal thiddenDelay = this.hiddenDelayMillis;
       if (thiddenDelay) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, thiddenDelay);
       }
       tisShow = this.redPackType;
       if (tisShow != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tisShow);
       }
       if (!(this.animationPicUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.animationPicUrl);
       }
       thiddenDelay = this.requestAnimationMaxDelayMillis;
       if (thiddenDelay) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, thiddenDelay);
       }
       if (!(this.widgetBackgroundUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.widgetBackgroundUrl);
       }
       if (!(this.amountColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.amountColor);
       }
       if (!(this.titleColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.titleColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                this.displayAwardAmount = p0.readString();
                break;
              case 26:
                this.displayUnit = p0.readString();
                break;
              case '"':
                this.title = p0.readString();
                break;
              case '(':
                this.isShow = p0.readBool();
                break;
              case '0':
                this.hiddenDelayMillis = p0.readUInt64();
                break;
              case '8':
                this.redPackType = p0.readUInt32();
                break;
              case 'B':
                this.animationPicUrl = p0.readString();
                break;
              case 'H':
                this.requestAnimationMaxDelayMillis = p0.readUInt64();
                break;
              case 'R':
                this.widgetBackgroundUrl = p0.readString();
                break;
              case 'Z':
                this.amountColor = p0.readString();
                break;
              case 'b':
                this.titleColor = p0.readString();
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
       if (!(this.displayAwardAmount).equals(str)) {
          p0.writeString(2, this.displayAwardAmount);
       }
       if (!(this.displayUnit).equals(str)) {
          p0.writeString(3, this.displayUnit);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(4, this.title);
       }
       LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal tisShow = this.isShow;
       if (tisShow != null) {
          p0.writeBool(5, tisShow);
       }
       LiveRoomSignalMessage$LiveKwaishopShareRedPackSignal thiddenDelay = this.hiddenDelayMillis;
       if (thiddenDelay) {
          p0.writeUInt64(6, thiddenDelay);
       }
       tisShow = this.redPackType;
       if (tisShow != null) {
          p0.writeUInt32(7, tisShow);
       }
       if (!(this.animationPicUrl).equals(str)) {
          p0.writeString(8, this.animationPicUrl);
       }
       thiddenDelay = this.requestAnimationMaxDelayMillis;
       if (thiddenDelay) {
          p0.writeUInt64(9, thiddenDelay);
       }
       if (!(this.widgetBackgroundUrl).equals(str)) {
          p0.writeString(10, this.widgetBackgroundUrl);
       }
       if (!(this.amountColor).equals(str)) {
          p0.writeString(11, this.amountColor);
       }
       if (!(this.titleColor).equals(str)) {
          p0.writeString(12, this.titleColor);
       }
       super.writeTo(p0);
       return;
    }
}
