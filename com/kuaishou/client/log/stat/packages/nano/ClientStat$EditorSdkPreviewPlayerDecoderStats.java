package com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerDecoderStats;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Double;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$EditorSdkPreviewPlayerDecoderStats extends MessageNano	// class@0013d7
{
    public int averageIdrInterval;
    public double averageSeekCostMs;
    public double decoderAvgMs;
    public String decoderConfig;
    public double decoderPercentile50Ms;
    public double decoderPercentile5Ms;
    public double decoderPercentile95Ms;
    public String decoderType;
    public boolean fieldContent;
    public double frameRate;
    public int height;
    public double seekCostMs5;
    public double seekCostMs50;
    public double seekCostMs95;
    public int seekCount;
    public int timeIndex;
    public int width;
    public static ClientStat$EditorSdkPreviewPlayerDecoderStats[] _emptyArray;

    public void ClientStat$EditorSdkPreviewPlayerDecoderStats(){
       super();
       this.clear();
    }
    public static ClientStat$EditorSdkPreviewPlayerDecoderStats[] emptyArray(){
       if (ClientStat$EditorSdkPreviewPlayerDecoderStats._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EditorSdkPreviewPlayerDecoderStats._emptyArray == null) {
             ClientStat$EditorSdkPreviewPlayerDecoderStats[] uEditorSdkPr = new ClientStat$EditorSdkPreviewPlayerDecoderStats[0];
             ClientStat$EditorSdkPreviewPlayerDecoderStats._emptyArray = uEditorSdkPr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EditorSdkPreviewPlayerDecoderStats._emptyArray;
    }
    public static ClientStat$EditorSdkPreviewPlayerDecoderStats parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EditorSdkPreviewPlayerDecoderStats().mergeFrom(p0);
    }
    public static ClientStat$EditorSdkPreviewPlayerDecoderStats parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EditorSdkPreviewPlayerDecoderStats(), p0);
    }
    public ClientStat$EditorSdkPreviewPlayerDecoderStats clear(){
       this.decoderAvgMs = 0;
       this.decoderPercentile5Ms = 0;
       this.decoderPercentile50Ms = 0;
       this.decoderPercentile95Ms = 0;
       this.width = 0;
       this.height = 0;
       this.timeIndex = 0;
       this.decoderType = "";
       this.frameRate = 0;
       this.averageSeekCostMs = 0;
       this.seekCostMs5 = 0;
       this.seekCostMs50 = 0;
       this.seekCostMs95 = 0;
       this.seekCount = 0;
       this.decoderConfig = "";
       this.fieldContent = false;
       this.averageIdrInterval = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       double d = 0;
       if (Double.doubleToLongBits(this.decoderAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(1, this.decoderAvgMs);
       }
       if (Double.doubleToLongBits(this.decoderPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(2, this.decoderPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.decoderPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(3, this.decoderPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.decoderPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(4, this.decoderPercentile95Ms);
       }
       ClientStat$EditorSdkPreviewPlayerDecoderStats twidth = this.width;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, twidth);
       }
       twidth = this.timeIndex;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, twidth);
       }
       String str = "";
       if (!(this.decoderType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.decoderType);
       }
       if (Double.doubleToLongBits(this.frameRate) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(9, this.frameRate);
       }
       if (Double.doubleToLongBits(this.averageSeekCostMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(10, this.averageSeekCostMs);
       }
       if (Double.doubleToLongBits(this.seekCostMs5) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(11, this.seekCostMs5);
       }
       if (Double.doubleToLongBits(this.seekCostMs50) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(12, this.seekCostMs50);
       }
       if (Double.doubleToLongBits(this.seekCostMs95) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(13, this.seekCostMs95);
       }
       twidth = this.seekCount;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, twidth);
       }
       if (!(this.decoderConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.decoderConfig);
       }
       twidth = this.fieldContent;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, twidth);
       }
       twidth = this.averageIdrInterval;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, twidth);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EditorSdkPreviewPlayerDecoderStats mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 9:
                this.decoderAvgMs = p0.readDouble();
                break;
              case 17:
                this.decoderPercentile5Ms = p0.readDouble();
                break;
              case 25:
                this.decoderPercentile50Ms = p0.readDouble();
                break;
              case '!':
                this.decoderPercentile95Ms = p0.readDouble();
                break;
              case '(':
                this.width = p0.readUInt32();
                break;
              case '0':
                this.height = p0.readUInt32();
                break;
              case '8':
                this.timeIndex = p0.readUInt32();
                break;
              case 'B':
                this.decoderType = p0.readString();
                break;
              case 'I':
                this.frameRate = p0.readDouble();
                break;
              case 'Q':
                this.averageSeekCostMs = p0.readDouble();
                break;
              case 'Y':
                this.seekCostMs5 = p0.readDouble();
                break;
              case 'a':
                this.seekCostMs50 = p0.readDouble();
                break;
              case 'i':
                this.seekCostMs95 = p0.readDouble();
                break;
              case 'p':
                this.seekCount = p0.readUInt32();
                break;
              case 'z':
                this.decoderConfig = p0.readString();
                break;
              case 128:
                this.fieldContent = p0.readBool();
                break;
              case 136:
                this.averageIdrInterval = p0.readUInt32();
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
       double d = 0;
       if (Double.doubleToLongBits(this.decoderAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(1, this.decoderAvgMs);
       }
       if (Double.doubleToLongBits(this.decoderPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(2, this.decoderPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.decoderPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(3, this.decoderPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.decoderPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(4, this.decoderPercentile95Ms);
       }
       ClientStat$EditorSdkPreviewPlayerDecoderStats twidth = this.width;
       if (twidth != null) {
          p0.writeUInt32(5, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          p0.writeUInt32(6, twidth);
       }
       twidth = this.timeIndex;
       if (twidth != null) {
          p0.writeUInt32(7, twidth);
       }
       String str = "";
       if (!(this.decoderType).equals(str)) {
          p0.writeString(8, this.decoderType);
       }
       if (Double.doubleToLongBits(this.frameRate) - Double.doubleToLongBits(d)) {
          p0.writeDouble(9, this.frameRate);
       }
       if (Double.doubleToLongBits(this.averageSeekCostMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(10, this.averageSeekCostMs);
       }
       if (Double.doubleToLongBits(this.seekCostMs5) - Double.doubleToLongBits(d)) {
          p0.writeDouble(11, this.seekCostMs5);
       }
       if (Double.doubleToLongBits(this.seekCostMs50) - Double.doubleToLongBits(d)) {
          p0.writeDouble(12, this.seekCostMs50);
       }
       if (Double.doubleToLongBits(this.seekCostMs95) - Double.doubleToLongBits(d)) {
          p0.writeDouble(13, this.seekCostMs95);
       }
       twidth = this.seekCount;
       if (twidth != null) {
          p0.writeUInt32(14, twidth);
       }
       if (!(this.decoderConfig).equals(str)) {
          p0.writeString(15, this.decoderConfig);
       }
       twidth = this.fieldContent;
       if (twidth != null) {
          p0.writeBool(16, twidth);
       }
       twidth = this.averageIdrInterval;
       if (twidth != null) {
          p0.writeUInt32(17, twidth);
       }
       super.writeTo(p0);
       return;
    }
}
