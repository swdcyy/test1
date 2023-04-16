package com.kuaishou.livestream.message.nano.LiveCustomizationCommentSpeedConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCustomizationCommentSpeedConfig extends MessageNano	// class@00117f
{
    public long autoScrollToBottomDelayTimeMs;
    public long cachedCommonMaxNum;
    public long changeScrollSpeedLimitNum;
    public long fastScrollSpeedDelayMs;
    public long fastScrollSpeedDp;
    public long fastScrollSpeedNum;
    public long foldContinueMaxNum;
    public long showFoldBatchNum;
    public long slowScrollSpeedDelayMs;
    public long slowScrollSpeedDp;
    public long slowScrollSpeedNum;
    public long updateFoldIntervalMs;
    public int version;
    public static LiveCustomizationCommentSpeedConfig[] _emptyArray;

    public void LiveCustomizationCommentSpeedConfig(){
       super();
       this.clear();
    }
    public static LiveCustomizationCommentSpeedConfig[] emptyArray(){
       if (LiveCustomizationCommentSpeedConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomizationCommentSpeedConfig._emptyArray == null) {
             LiveCustomizationCommentSpeedConfig[] liveCustomiz = new LiveCustomizationCommentSpeedConfig[0];
             LiveCustomizationCommentSpeedConfig._emptyArray = liveCustomiz;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomizationCommentSpeedConfig._emptyArray;
    }
    public static LiveCustomizationCommentSpeedConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomizationCommentSpeedConfig().mergeFrom(p0);
    }
    public static LiveCustomizationCommentSpeedConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomizationCommentSpeedConfig(), p0);
    }
    public LiveCustomizationCommentSpeedConfig clear(){
       this.version = 0;
       this.autoScrollToBottomDelayTimeMs = 0;
       this.cachedCommonMaxNum = 0;
       this.changeScrollSpeedLimitNum = 0;
       this.foldContinueMaxNum = 0;
       this.showFoldBatchNum = 0;
       this.updateFoldIntervalMs = 0;
       this.fastScrollSpeedDp = 0;
       this.fastScrollSpeedNum = 0;
       this.fastScrollSpeedDelayMs = 0;
       this.slowScrollSpeedDp = 0;
       this.slowScrollSpeedNum = 0;
       this.slowScrollSpeedDelayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomizationCommentSpeedConfig tversion = this.version;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tversion);
       }
       tversion = this.autoScrollToBottomDelayTimeMs;
       int i1 = 0;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tversion);
       }
       tversion = this.cachedCommonMaxNum;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, tversion);
       }
       tversion = this.changeScrollSpeedLimitNum;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(4, tversion);
       }
       tversion = this.foldContinueMaxNum;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(5, tversion);
       }
       tversion = this.showFoldBatchNum;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(6, tversion);
       }
       tversion = this.updateFoldIntervalMs;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(7, tversion);
       }
       tversion = this.fastScrollSpeedDp;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(8, tversion);
       }
       tversion = this.fastScrollSpeedNum;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(9, tversion);
       }
       tversion = this.fastScrollSpeedDelayMs;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(10, tversion);
       }
       tversion = this.slowScrollSpeedDp;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(11, tversion);
       }
       tversion = this.slowScrollSpeedNum;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(12, tversion);
       }
       tversion = this.slowScrollSpeedDelayMs;
       if (tversion - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(13, tversion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomizationCommentSpeedConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.version = p0.readUInt32();
                break;
              case 16:
                this.autoScrollToBottomDelayTimeMs = p0.readInt64();
                break;
              case 24:
                this.cachedCommonMaxNum = p0.readInt64();
                break;
              case 32:
                this.changeScrollSpeedLimitNum = p0.readInt64();
                break;
              case '(':
                this.foldContinueMaxNum = p0.readInt64();
                break;
              case '0':
                this.showFoldBatchNum = p0.readInt64();
                break;
              case '8':
                this.updateFoldIntervalMs = p0.readInt64();
                break;
              case '@':
                this.fastScrollSpeedDp = p0.readInt64();
                break;
              case 'H':
                this.fastScrollSpeedNum = p0.readInt64();
                break;
              case 'P':
                this.fastScrollSpeedDelayMs = p0.readInt64();
                break;
              case 'X':
                this.slowScrollSpeedDp = p0.readInt64();
                break;
              case '`':
                this.slowScrollSpeedNum = p0.readInt64();
                break;
              case 'h':
                this.slowScrollSpeedDelayMs = p0.readInt64();
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
       LiveCustomizationCommentSpeedConfig tversion = this.version;
       if (tversion != null) {
          p0.writeUInt32(1, tversion);
       }
       tversion = this.autoScrollToBottomDelayTimeMs;
       int i = 0;
       if (tversion - i) {
          p0.writeInt64(2, tversion);
       }
       tversion = this.cachedCommonMaxNum;
       if (tversion - i) {
          p0.writeInt64(3, tversion);
       }
       tversion = this.changeScrollSpeedLimitNum;
       if (tversion - i) {
          p0.writeInt64(4, tversion);
       }
       tversion = this.foldContinueMaxNum;
       if (tversion - i) {
          p0.writeInt64(5, tversion);
       }
       tversion = this.showFoldBatchNum;
       if (tversion - i) {
          p0.writeInt64(6, tversion);
       }
       tversion = this.updateFoldIntervalMs;
       if (tversion - i) {
          p0.writeInt64(7, tversion);
       }
       tversion = this.fastScrollSpeedDp;
       if (tversion - i) {
          p0.writeInt64(8, tversion);
       }
       tversion = this.fastScrollSpeedNum;
       if (tversion - i) {
          p0.writeInt64(9, tversion);
       }
       tversion = this.fastScrollSpeedDelayMs;
       if (tversion - i) {
          p0.writeInt64(10, tversion);
       }
       tversion = this.slowScrollSpeedDp;
       if (tversion - i) {
          p0.writeInt64(11, tversion);
       }
       tversion = this.slowScrollSpeedNum;
       if (tversion - i) {
          p0.writeInt64(12, tversion);
       }
       tversion = this.slowScrollSpeedDelayMs;
       if (tversion - i) {
          p0.writeInt64(13, tversion);
       }
       super.writeTo(p0);
       return;
    }
}
