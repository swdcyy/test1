package com.kuaishou.livestream.message.nano.SCLiveRevenueActivityInfoShakeActivityConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveRevenueActivityInfoShakeActivityConfig extends MessageNano	// class@001440
{
    public boolean enableSlide;
    public String shakeGuideBackgroundColor;
    public long shakeGuideDelayMs;
    public long shakeGuideDisplayMs;
    public String shakeGuideImage;
    public long shakeGuideIntervalMs;
    public String shakeGuideSecondText;
    public String shakeGuideSecondTextColor;
    public String shakeGuideText;
    public String shakeGuideTextColor;
    public String shakeImage;
    public String shakeResultDialogDescription;
    public String shakeText;
    public String shakeTextColor;
    public String shakeTipsDialogDescription;
    public long shakeTipsDialogMinDisplayMs;
    public String shakeTipsDialogTitle;
    public static SCLiveRevenueActivityInfoShakeActivityConfig[] _emptyArray;

    public void SCLiveRevenueActivityInfoShakeActivityConfig(){
       super();
       this.clear();
    }
    public static SCLiveRevenueActivityInfoShakeActivityConfig[] emptyArray(){
       if (SCLiveRevenueActivityInfoShakeActivityConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveRevenueActivityInfoShakeActivityConfig._emptyArray == null) {
             SCLiveRevenueActivityInfoShakeActivityConfig[] sCLiveRevenu = new SCLiveRevenueActivityInfoShakeActivityConfig[0];
             SCLiveRevenueActivityInfoShakeActivityConfig._emptyArray = sCLiveRevenu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveRevenueActivityInfoShakeActivityConfig._emptyArray;
    }
    public static SCLiveRevenueActivityInfoShakeActivityConfig parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveRevenueActivityInfoShakeActivityConfig().mergeFrom(p0);
    }
    public static SCLiveRevenueActivityInfoShakeActivityConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveRevenueActivityInfoShakeActivityConfig(), p0);
    }
    public SCLiveRevenueActivityInfoShakeActivityConfig clear(){
       this.shakeGuideText = "";
       this.shakeGuideTextColor = "";
       this.shakeGuideSecondText = "";
       this.shakeGuideSecondTextColor = "";
       this.shakeGuideBackgroundColor = "";
       this.shakeGuideImage = "";
       this.shakeText = "";
       this.shakeTextColor = "";
       this.shakeImage = "";
       this.shakeTipsDialogTitle = "";
       this.shakeTipsDialogDescription = "";
       this.shakeResultDialogDescription = "";
       this.shakeGuideDelayMs = 0;
       this.shakeGuideDisplayMs = 0;
       this.shakeGuideIntervalMs = 0;
       this.shakeTipsDialogMinDisplayMs = 0;
       this.enableSlide = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.shakeGuideText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.shakeGuideText);
       }
       if (!(this.shakeGuideTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.shakeGuideTextColor);
       }
       if (!(this.shakeGuideSecondText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.shakeGuideSecondText);
       }
       if (!(this.shakeGuideSecondTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.shakeGuideSecondTextColor);
       }
       if (!(this.shakeGuideBackgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.shakeGuideBackgroundColor);
       }
       if (!(this.shakeGuideImage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.shakeGuideImage);
       }
       if (!(this.shakeText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.shakeText);
       }
       if (!(this.shakeTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.shakeTextColor);
       }
       if (!(this.shakeImage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.shakeImage);
       }
       if (!(this.shakeTipsDialogTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.shakeTipsDialogTitle);
       }
       if (!(this.shakeTipsDialogDescription).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.shakeTipsDialogDescription);
       }
       if (!(this.shakeResultDialogDescription).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.shakeResultDialogDescription);
       }
       SCLiveRevenueActivityInfoShakeActivityConfig tshakeGuideD = this.shakeGuideDelayMs;
       int i1 = 0;
       if (tshakeGuideD - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tshakeGuideD);
       }
       tshakeGuideD = this.shakeGuideDisplayMs;
       if (tshakeGuideD - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tshakeGuideD);
       }
       tshakeGuideD = this.shakeGuideIntervalMs;
       if (tshakeGuideD - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tshakeGuideD);
       }
       tshakeGuideD = this.shakeTipsDialogMinDisplayMs;
       if (tshakeGuideD - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tshakeGuideD);
       }
       tshakeGuideD = this.enableSlide;
       if (tshakeGuideD != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tshakeGuideD);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveRevenueActivityInfoShakeActivityConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.shakeGuideText = p0.readString();
                break;
              case 18:
                this.shakeGuideTextColor = p0.readString();
                break;
              case 26:
                this.shakeGuideSecondText = p0.readString();
                break;
              case '"':
                this.shakeGuideSecondTextColor = p0.readString();
                break;
              case '*':
                this.shakeGuideBackgroundColor = p0.readString();
                break;
              case '2':
                this.shakeGuideImage = p0.readString();
                break;
              case ':':
                this.shakeText = p0.readString();
                break;
              case 'B':
                this.shakeTextColor = p0.readString();
                break;
              case 'J':
                this.shakeImage = p0.readString();
                break;
              case 'R':
                this.shakeTipsDialogTitle = p0.readString();
                break;
              case 'Z':
                this.shakeTipsDialogDescription = p0.readString();
                break;
              case 'b':
                this.shakeResultDialogDescription = p0.readString();
                break;
              case 'h':
                this.shakeGuideDelayMs = p0.readUInt64();
                break;
              case 'p':
                this.shakeGuideDisplayMs = p0.readUInt64();
                break;
              case 'x':
                this.shakeGuideIntervalMs = p0.readUInt64();
                break;
              case 128:
                this.shakeTipsDialogMinDisplayMs = p0.readUInt64();
                break;
              case 136:
                this.enableSlide = p0.readBool();
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
       if (!(this.shakeGuideText).equals(str)) {
          p0.writeString(1, this.shakeGuideText);
       }
       if (!(this.shakeGuideTextColor).equals(str)) {
          p0.writeString(2, this.shakeGuideTextColor);
       }
       if (!(this.shakeGuideSecondText).equals(str)) {
          p0.writeString(3, this.shakeGuideSecondText);
       }
       if (!(this.shakeGuideSecondTextColor).equals(str)) {
          p0.writeString(4, this.shakeGuideSecondTextColor);
       }
       if (!(this.shakeGuideBackgroundColor).equals(str)) {
          p0.writeString(5, this.shakeGuideBackgroundColor);
       }
       if (!(this.shakeGuideImage).equals(str)) {
          p0.writeString(6, this.shakeGuideImage);
       }
       if (!(this.shakeText).equals(str)) {
          p0.writeString(7, this.shakeText);
       }
       if (!(this.shakeTextColor).equals(str)) {
          p0.writeString(8, this.shakeTextColor);
       }
       if (!(this.shakeImage).equals(str)) {
          p0.writeString(9, this.shakeImage);
       }
       if (!(this.shakeTipsDialogTitle).equals(str)) {
          p0.writeString(10, this.shakeTipsDialogTitle);
       }
       if (!(this.shakeTipsDialogDescription).equals(str)) {
          p0.writeString(11, this.shakeTipsDialogDescription);
       }
       if (!(this.shakeResultDialogDescription).equals(str)) {
          p0.writeString(12, this.shakeResultDialogDescription);
       }
       SCLiveRevenueActivityInfoShakeActivityConfig tshakeGuideD = this.shakeGuideDelayMs;
       int i = 0;
       if (tshakeGuideD - i) {
          p0.writeUInt64(13, tshakeGuideD);
       }
       tshakeGuideD = this.shakeGuideDisplayMs;
       if (tshakeGuideD - i) {
          p0.writeUInt64(14, tshakeGuideD);
       }
       tshakeGuideD = this.shakeGuideIntervalMs;
       if (tshakeGuideD - i) {
          p0.writeUInt64(15, tshakeGuideD);
       }
       tshakeGuideD = this.shakeTipsDialogMinDisplayMs;
       if (tshakeGuideD - i) {
          p0.writeUInt64(16, tshakeGuideD);
       }
       tshakeGuideD = this.enableSlide;
       if (tshakeGuideD != null) {
          p0.writeBool(17, tshakeGuideD);
       }
       super.writeTo(p0);
       return;
    }
}
