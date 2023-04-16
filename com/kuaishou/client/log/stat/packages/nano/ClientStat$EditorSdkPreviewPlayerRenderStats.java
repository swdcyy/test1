package com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerRenderStats;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Double;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$EditorSdkPreviewPlayerRenderStats extends MessageNano	// class@0013d8
{
    public double distinctFrameCountPerSec;
    public int droppedFrameCount;
    public double externalFilterAvgMs;
    public double externalFilterOriginalFrameConfigAvgMs;
    public double externalFilterOriginalFrameConfigPercentile50Ms;
    public double externalFilterOriginalFrameConfigPercentile5Ms;
    public double externalFilterOriginalFrameConfigPercentile95Ms;
    public double externalFilterOriginalFrameDataAvgMs;
    public double externalFilterOriginalFrameDataPercentile50Ms;
    public double externalFilterOriginalFrameDataPercentile5Ms;
    public double externalFilterOriginalFrameDataPercentile95Ms;
    public double externalFilterPercentile50Ms;
    public double externalFilterPercentile5Ms;
    public double externalFilterPercentile95Ms;
    public double externalFilterProcessedFrameConfigAvgMs;
    public double externalFilterProcessedFrameConfigPercentile50Ms;
    public double externalFilterProcessedFrameConfigPercentile5Ms;
    public double externalFilterProcessedFrameConfigPercentile95Ms;
    public double externalFilterProcessedFrameDataAvgMs;
    public double externalFilterProcessedFrameDataPercentile50Ms;
    public double externalFilterProcessedFrameDataPercentile5Ms;
    public double externalFilterProcessedFrameDataPercentile95Ms;
    public double externalFilterRawAvgMs;
    public double externalFilterRawPercentile50Ms;
    public double externalFilterRawPercentile5Ms;
    public double externalFilterRawPercentile95Ms;
    public double firstFrameRenderMs;
    public double mvFilterAvgMs;
    public double mvFilterPercentile50Ms;
    public double mvFilterPercentile5Ms;
    public double mvFilterPercentile95Ms;
    public int projectHeight;
    public int projectWidth;
    public double renderAvgMs;
    public int renderHeight;
    public long renderModuleFlags;
    public double renderPercentile50Ms;
    public double renderPercentile5Ms;
    public double renderPercentile95Ms;
    public int renderWidth;
    public int seekCacheHit;
    public int seekCacheMiss;
    public double statsDurationMs;
    public int waitingCount;
    public double waitingDurationMs;
    public double westerosFilterAvgMs;
    public double westerosFilterPercentile50Ms;
    public double westerosFilterPercentile5Ms;
    public double westerosFilterPercentile95Ms;
    public static ClientStat$EditorSdkPreviewPlayerRenderStats[] _emptyArray;

    public void ClientStat$EditorSdkPreviewPlayerRenderStats(){
       super();
       this.clear();
    }
    public static ClientStat$EditorSdkPreviewPlayerRenderStats[] emptyArray(){
       if (ClientStat$EditorSdkPreviewPlayerRenderStats._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EditorSdkPreviewPlayerRenderStats._emptyArray == null) {
             ClientStat$EditorSdkPreviewPlayerRenderStats[] uEditorSdkPr = new ClientStat$EditorSdkPreviewPlayerRenderStats[0];
             ClientStat$EditorSdkPreviewPlayerRenderStats._emptyArray = uEditorSdkPr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EditorSdkPreviewPlayerRenderStats._emptyArray;
    }
    public static ClientStat$EditorSdkPreviewPlayerRenderStats parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EditorSdkPreviewPlayerRenderStats().mergeFrom(p0);
    }
    public static ClientStat$EditorSdkPreviewPlayerRenderStats parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EditorSdkPreviewPlayerRenderStats(), p0);
    }
    public ClientStat$EditorSdkPreviewPlayerRenderStats clear(){
       this.renderAvgMs = 0;
       this.renderPercentile5Ms = 0;
       this.renderPercentile50Ms = 0;
       this.renderPercentile95Ms = 0;
       this.renderWidth = 0;
       this.renderHeight = 0;
       this.projectWidth = 0;
       this.projectHeight = 0;
       this.renderModuleFlags = 0;
       this.firstFrameRenderMs = 0;
       this.droppedFrameCount = 0;
       this.distinctFrameCountPerSec = 0;
       this.seekCacheHit = 0;
       this.seekCacheMiss = 0;
       this.waitingCount = 0;
       this.waitingDurationMs = 0;
       this.statsDurationMs = 0;
       this.externalFilterAvgMs = 0;
       this.externalFilterPercentile5Ms = 0;
       this.externalFilterPercentile50Ms = 0;
       this.externalFilterPercentile95Ms = 0;
       this.westerosFilterAvgMs = 0;
       this.westerosFilterPercentile5Ms = 0;
       this.westerosFilterPercentile50Ms = 0;
       this.westerosFilterPercentile95Ms = 0;
       this.mvFilterAvgMs = 0;
       this.mvFilterPercentile5Ms = 0;
       this.mvFilterPercentile50Ms = 0;
       this.mvFilterPercentile95Ms = 0;
       this.externalFilterOriginalFrameConfigAvgMs = 0;
       this.externalFilterOriginalFrameConfigPercentile5Ms = 0;
       this.externalFilterOriginalFrameConfigPercentile50Ms = 0;
       this.externalFilterOriginalFrameConfigPercentile95Ms = 0;
       this.externalFilterOriginalFrameDataAvgMs = 0;
       this.externalFilterOriginalFrameDataPercentile5Ms = 0;
       this.externalFilterOriginalFrameDataPercentile50Ms = 0;
       this.externalFilterOriginalFrameDataPercentile95Ms = 0;
       this.externalFilterProcessedFrameConfigAvgMs = 0;
       this.externalFilterProcessedFrameConfigPercentile5Ms = 0;
       this.externalFilterProcessedFrameConfigPercentile50Ms = 0;
       this.externalFilterProcessedFrameConfigPercentile95Ms = 0;
       this.externalFilterProcessedFrameDataAvgMs = 0;
       this.externalFilterProcessedFrameDataPercentile5Ms = 0;
       this.externalFilterProcessedFrameDataPercentile50Ms = 0;
       this.externalFilterProcessedFrameDataPercentile95Ms = 0;
       this.externalFilterRawAvgMs = 0;
       this.externalFilterRawPercentile5Ms = 0;
       this.externalFilterRawPercentile50Ms = 0;
       this.externalFilterRawPercentile95Ms = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       double d = 0;
       if (Double.doubleToLongBits(this.renderAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(1, this.renderAvgMs);
       }
       if (Double.doubleToLongBits(this.renderPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(2, this.renderPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.renderPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(3, this.renderPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.renderPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(4, this.renderPercentile95Ms);
       }
       ClientStat$EditorSdkPreviewPlayerRenderStats trenderWidth = this.renderWidth;
       if (trenderWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, trenderWidth);
       }
       trenderWidth = this.renderHeight;
       if (trenderWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, trenderWidth);
       }
       trenderWidth = this.projectWidth;
       if (trenderWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, trenderWidth);
       }
       trenderWidth = this.projectHeight;
       if (trenderWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, trenderWidth);
       }
       trenderWidth = this.renderModuleFlags;
       if (trenderWidth) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, trenderWidth);
       }
       if (Double.doubleToLongBits(this.firstFrameRenderMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(10, this.firstFrameRenderMs);
       }
       trenderWidth = this.droppedFrameCount;
       if (trenderWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, trenderWidth);
       }
       if (Double.doubleToLongBits(this.distinctFrameCountPerSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(12, this.distinctFrameCountPerSec);
       }
       trenderWidth = this.seekCacheHit;
       if (trenderWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, trenderWidth);
       }
       trenderWidth = this.seekCacheMiss;
       if (trenderWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, trenderWidth);
       }
       trenderWidth = this.waitingCount;
       if (trenderWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, trenderWidth);
       }
       if (Double.doubleToLongBits(this.waitingDurationMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(16, this.waitingDurationMs);
       }
       if (Double.doubleToLongBits(this.statsDurationMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(17, this.statsDurationMs);
       }
       if (Double.doubleToLongBits(this.externalFilterAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(18, this.externalFilterAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(19, this.externalFilterPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(20, this.externalFilterPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(21, this.externalFilterPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.westerosFilterAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(22, this.westerosFilterAvgMs);
       }
       if (Double.doubleToLongBits(this.westerosFilterPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(23, this.westerosFilterPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.westerosFilterPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(24, this.westerosFilterPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.westerosFilterPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(25, this.westerosFilterPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.mvFilterAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(26, this.mvFilterAvgMs);
       }
       if (Double.doubleToLongBits(this.mvFilterPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(27, this.mvFilterPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.mvFilterPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(28, this.mvFilterPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.mvFilterPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(29, this.mvFilterPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameConfigAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(30, this.externalFilterOriginalFrameConfigAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameConfigPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(31, this.externalFilterOriginalFrameConfigPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameConfigPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(32, this.externalFilterOriginalFrameConfigPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameConfigPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(33, this.externalFilterOriginalFrameConfigPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameDataAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(34, this.externalFilterOriginalFrameDataAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameDataPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(35, this.externalFilterOriginalFrameDataPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameDataPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(36, this.externalFilterOriginalFrameDataPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameDataPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(37, this.externalFilterOriginalFrameDataPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameConfigAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(38, this.externalFilterProcessedFrameConfigAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameConfigPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(39, this.externalFilterProcessedFrameConfigPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameConfigPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(40, this.externalFilterProcessedFrameConfigPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameConfigPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(41, this.externalFilterProcessedFrameConfigPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameDataAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(42, this.externalFilterProcessedFrameDataAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameDataPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(43, this.externalFilterProcessedFrameDataPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameDataPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(44, this.externalFilterProcessedFrameDataPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameDataPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(45, this.externalFilterProcessedFrameDataPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterRawAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(46, this.externalFilterRawAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterRawPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(47, this.externalFilterRawPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterRawPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(48, this.externalFilterRawPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterRawPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(49, this.externalFilterRawPercentile95Ms);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EditorSdkPreviewPlayerRenderStats mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 9:
                this.renderAvgMs = p0.readDouble();
                break;
              case 17:
                this.renderPercentile5Ms = p0.readDouble();
                break;
              case 25:
                this.renderPercentile50Ms = p0.readDouble();
                break;
              case '!':
                this.renderPercentile95Ms = p0.readDouble();
                break;
              case '(':
                this.renderWidth = p0.readUInt32();
                break;
              case '0':
                this.renderHeight = p0.readUInt32();
                break;
              case '8':
                this.projectWidth = p0.readUInt32();
                break;
              case '@':
                this.projectHeight = p0.readUInt32();
                break;
              case 'H':
                this.renderModuleFlags = p0.readUInt64();
                break;
              case 'Q':
                this.firstFrameRenderMs = p0.readDouble();
                break;
              case 'X':
                this.droppedFrameCount = p0.readUInt32();
                break;
              case 'a':
                this.distinctFrameCountPerSec = p0.readDouble();
                break;
              case 'h':
                this.seekCacheHit = p0.readUInt32();
                break;
              case 'p':
                this.seekCacheMiss = p0.readUInt32();
                break;
              case 'x':
                this.waitingCount = p0.readUInt32();
                break;
              case 129:
                this.waitingDurationMs = p0.readDouble();
                break;
              case 137:
                this.statsDurationMs = p0.readDouble();
                break;
              case 145:
                this.externalFilterAvgMs = p0.readDouble();
                break;
              case 153:
                this.externalFilterPercentile5Ms = p0.readDouble();
                break;
              case 161:
                this.externalFilterPercentile50Ms = p0.readDouble();
                break;
              case 169:
                this.externalFilterPercentile95Ms = p0.readDouble();
                break;
              case 177:
                this.westerosFilterAvgMs = p0.readDouble();
                break;
              case 185:
                this.westerosFilterPercentile5Ms = p0.readDouble();
                break;
              case 193:
                this.westerosFilterPercentile50Ms = p0.readDouble();
                break;
              case 201:
                this.westerosFilterPercentile95Ms = p0.readDouble();
                break;
              case 209:
                this.mvFilterAvgMs = p0.readDouble();
                break;
              case 217:
                this.mvFilterPercentile5Ms = p0.readDouble();
                break;
              case 225:
                this.mvFilterPercentile50Ms = p0.readDouble();
                break;
              case 233:
                this.mvFilterPercentile95Ms = p0.readDouble();
                break;
              case 241:
                this.externalFilterOriginalFrameConfigAvgMs = p0.readDouble();
                break;
              case 249:
                this.externalFilterOriginalFrameConfigPercentile5Ms = p0.readDouble();
                break;
              case 257:
                this.externalFilterOriginalFrameConfigPercentile50Ms = p0.readDouble();
                break;
              case 265:
                this.externalFilterOriginalFrameConfigPercentile95Ms = p0.readDouble();
                break;
              case 273:
                this.externalFilterOriginalFrameDataAvgMs = p0.readDouble();
                break;
              case 281:
                this.externalFilterOriginalFrameDataPercentile5Ms = p0.readDouble();
                break;
              case 289:
                this.externalFilterOriginalFrameDataPercentile50Ms = p0.readDouble();
                break;
              case 297:
                this.externalFilterOriginalFrameDataPercentile95Ms = p0.readDouble();
                break;
              case 305:
                this.externalFilterProcessedFrameConfigAvgMs = p0.readDouble();
                break;
              case 313:
                this.externalFilterProcessedFrameConfigPercentile5Ms = p0.readDouble();
                break;
              case 321:
                this.externalFilterProcessedFrameConfigPercentile50Ms = p0.readDouble();
                break;
              case 329:
                this.externalFilterProcessedFrameConfigPercentile95Ms = p0.readDouble();
                break;
              case 337:
                this.externalFilterProcessedFrameDataAvgMs = p0.readDouble();
                break;
              case 345:
                this.externalFilterProcessedFrameDataPercentile5Ms = p0.readDouble();
                break;
              case 353:
                this.externalFilterProcessedFrameDataPercentile50Ms = p0.readDouble();
                break;
              case 361:
                this.externalFilterProcessedFrameDataPercentile95Ms = p0.readDouble();
                break;
              case 369:
                this.externalFilterRawAvgMs = p0.readDouble();
                break;
              case 377:
                this.externalFilterRawPercentile5Ms = p0.readDouble();
                break;
              case 385:
                this.externalFilterRawPercentile50Ms = p0.readDouble();
                break;
              case 393:
                this.externalFilterRawPercentile95Ms = p0.readDouble();
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
       if (Double.doubleToLongBits(this.renderAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(1, this.renderAvgMs);
       }
       if (Double.doubleToLongBits(this.renderPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(2, this.renderPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.renderPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(3, this.renderPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.renderPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(4, this.renderPercentile95Ms);
       }
       ClientStat$EditorSdkPreviewPlayerRenderStats trenderWidth = this.renderWidth;
       if (trenderWidth != null) {
          p0.writeUInt32(5, trenderWidth);
       }
       trenderWidth = this.renderHeight;
       if (trenderWidth != null) {
          p0.writeUInt32(6, trenderWidth);
       }
       trenderWidth = this.projectWidth;
       if (trenderWidth != null) {
          p0.writeUInt32(7, trenderWidth);
       }
       trenderWidth = this.projectHeight;
       if (trenderWidth != null) {
          p0.writeUInt32(8, trenderWidth);
       }
       trenderWidth = this.renderModuleFlags;
       if (trenderWidth) {
          p0.writeUInt64(9, trenderWidth);
       }
       if (Double.doubleToLongBits(this.firstFrameRenderMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(10, this.firstFrameRenderMs);
       }
       trenderWidth = this.droppedFrameCount;
       if (trenderWidth != null) {
          p0.writeUInt32(11, trenderWidth);
       }
       if (Double.doubleToLongBits(this.distinctFrameCountPerSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(12, this.distinctFrameCountPerSec);
       }
       trenderWidth = this.seekCacheHit;
       if (trenderWidth != null) {
          p0.writeUInt32(13, trenderWidth);
       }
       trenderWidth = this.seekCacheMiss;
       if (trenderWidth != null) {
          p0.writeUInt32(14, trenderWidth);
       }
       trenderWidth = this.waitingCount;
       if (trenderWidth != null) {
          p0.writeUInt32(15, trenderWidth);
       }
       if (Double.doubleToLongBits(this.waitingDurationMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(16, this.waitingDurationMs);
       }
       if (Double.doubleToLongBits(this.statsDurationMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(17, this.statsDurationMs);
       }
       if (Double.doubleToLongBits(this.externalFilterAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(18, this.externalFilterAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(19, this.externalFilterPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(20, this.externalFilterPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(21, this.externalFilterPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.westerosFilterAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(22, this.westerosFilterAvgMs);
       }
       if (Double.doubleToLongBits(this.westerosFilterPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(23, this.westerosFilterPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.westerosFilterPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(24, this.westerosFilterPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.westerosFilterPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(25, this.westerosFilterPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.mvFilterAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(26, this.mvFilterAvgMs);
       }
       if (Double.doubleToLongBits(this.mvFilterPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(27, this.mvFilterPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.mvFilterPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(28, this.mvFilterPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.mvFilterPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(29, this.mvFilterPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameConfigAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(30, this.externalFilterOriginalFrameConfigAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameConfigPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(31, this.externalFilterOriginalFrameConfigPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameConfigPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(32, this.externalFilterOriginalFrameConfigPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameConfigPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(33, this.externalFilterOriginalFrameConfigPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameDataAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(34, this.externalFilterOriginalFrameDataAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameDataPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(35, this.externalFilterOriginalFrameDataPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameDataPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(36, this.externalFilterOriginalFrameDataPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterOriginalFrameDataPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(37, this.externalFilterOriginalFrameDataPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameConfigAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(38, this.externalFilterProcessedFrameConfigAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameConfigPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(39, this.externalFilterProcessedFrameConfigPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameConfigPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(40, this.externalFilterProcessedFrameConfigPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameConfigPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(41, this.externalFilterProcessedFrameConfigPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameDataAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(42, this.externalFilterProcessedFrameDataAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameDataPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(43, this.externalFilterProcessedFrameDataPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameDataPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(44, this.externalFilterProcessedFrameDataPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterProcessedFrameDataPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(45, this.externalFilterProcessedFrameDataPercentile95Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterRawAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(46, this.externalFilterRawAvgMs);
       }
       if (Double.doubleToLongBits(this.externalFilterRawPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(47, this.externalFilterRawPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterRawPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(48, this.externalFilterRawPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.externalFilterRawPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(49, this.externalFilterRawPercentile95Ms);
       }
       super.writeTo(p0);
       return;
    }
}
