package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveStageLayoutConfigHashMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveStageLayoutConfigHashMessage extends MessageNano	// class@000c81
{
    public int bizType;
    public long layoutConfigHash;
    public static LiveFlvStream$LiveStageLayoutConfigHashMessage[] _emptyArray;

    public void LiveFlvStream$LiveStageLayoutConfigHashMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveStageLayoutConfigHashMessage[] emptyArray(){
       if (LiveFlvStream$LiveStageLayoutConfigHashMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveStageLayoutConfigHashMessage._emptyArray == null) {
             LiveFlvStream$LiveStageLayoutConfigHashMessage[] liveStageLay = new LiveFlvStream$LiveStageLayoutConfigHashMessage[0];
             LiveFlvStream$LiveStageLayoutConfigHashMessage._emptyArray = liveStageLay;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveStageLayoutConfigHashMessage._emptyArray;
    }
    public static LiveFlvStream$LiveStageLayoutConfigHashMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveStageLayoutConfigHashMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveStageLayoutConfigHashMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveStageLayoutConfigHashMessage(), p0);
    }
    public LiveFlvStream$LiveStageLayoutConfigHashMessage clear(){
       this.bizType = 0;
       this.layoutConfigHash = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveStageLayoutConfigHashMessage tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       tbizType = this.layoutConfigHash;
       if (tbizType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tbizType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveStageLayoutConfigHashMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.layoutConfigHash = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveStageLayoutConfigHashMessage tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       tbizType = this.layoutConfigHash;
       if (tbizType) {
          p0.writeUInt64(2, tbizType);
       }
       super.writeTo(p0);
       return;
    }
}
