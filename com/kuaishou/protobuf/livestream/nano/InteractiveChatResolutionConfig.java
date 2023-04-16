package com.kuaishou.protobuf.livestream.nano.InteractiveChatResolutionConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveChatResolutionConfig extends MessageNano	// class@000c18
{
    public int bitRateLevel;
    public int height;
    public int level;
    public long userId;
    public int width;
    public static InteractiveChatResolutionConfig[] _emptyArray;

    public void InteractiveChatResolutionConfig(){
       super();
       this.clear();
    }
    public static InteractiveChatResolutionConfig[] emptyArray(){
       if (InteractiveChatResolutionConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatResolutionConfig._emptyArray == null) {
             InteractiveChatResolutionConfig[] interactiveC = new InteractiveChatResolutionConfig[0];
             InteractiveChatResolutionConfig._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatResolutionConfig._emptyArray;
    }
    public static InteractiveChatResolutionConfig parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatResolutionConfig().mergeFrom(p0);
    }
    public static InteractiveChatResolutionConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatResolutionConfig(), p0);
    }
    public InteractiveChatResolutionConfig clear(){
       this.width = 0;
       this.height = 0;
       this.level = 0;
       this.userId = 0;
       this.bitRateLevel = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatResolutionConfig twidth = this.width;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, twidth);
       }
       twidth = this.level;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, twidth);
       }
       twidth = this.userId;
       if (twidth) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, twidth);
       }
       twidth = this.bitRateLevel;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, twidth);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatResolutionConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                            continue ;
                         }else {
                            this.bitRateLevel = i;
                         }
                      }
                   }else {
                      this.userId = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                      continue ;
                   }else {
                      this.level = i;
                   }
                }
             }else {
                this.height = p0.readUInt32();
             }
          }else {
             this.width = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveChatResolutionConfig twidth = this.width;
       if (twidth != null) {
          p0.writeUInt32(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          p0.writeUInt32(2, twidth);
       }
       twidth = this.level;
       if (twidth != null) {
          p0.writeInt32(3, twidth);
       }
       twidth = this.userId;
       if (twidth) {
          p0.writeUInt64(4, twidth);
       }
       twidth = this.bitRateLevel;
       if (twidth != null) {
          p0.writeInt32(5, twidth);
       }
       super.writeTo(p0);
       return;
    }
}
