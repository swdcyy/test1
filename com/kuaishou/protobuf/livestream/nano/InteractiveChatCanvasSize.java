package com.kuaishou.protobuf.livestream.nano.InteractiveChatCanvasSize;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveChatCanvasSize extends MessageNano	// class@000c11
{
    public int height;
    public int width;
    public static InteractiveChatCanvasSize[] _emptyArray;

    public void InteractiveChatCanvasSize(){
       super();
       this.clear();
    }
    public static InteractiveChatCanvasSize[] emptyArray(){
       if (InteractiveChatCanvasSize._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatCanvasSize._emptyArray == null) {
             InteractiveChatCanvasSize[] interactiveC = new InteractiveChatCanvasSize[0];
             InteractiveChatCanvasSize._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatCanvasSize._emptyArray;
    }
    public static InteractiveChatCanvasSize parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatCanvasSize().mergeFrom(p0);
    }
    public static InteractiveChatCanvasSize parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatCanvasSize(), p0);
    }
    public InteractiveChatCanvasSize clear(){
       this.width = 0;
       this.height = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatCanvasSize twidth = this.width;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, twidth);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatCanvasSize mergeFrom(CodedInputByteBufferNano p0){
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
                this.height = p0.readUInt32();
             }
          }else {
             this.width = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveChatCanvasSize twidth = this.width;
       if (twidth != null) {
          p0.writeUInt32(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          p0.writeUInt32(2, twidth);
       }
       super.writeTo(p0);
       return;
    }
}
