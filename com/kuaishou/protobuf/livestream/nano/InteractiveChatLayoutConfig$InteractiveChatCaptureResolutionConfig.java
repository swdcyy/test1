package com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig extends MessageNano	// class@000c13
{
    public int height;
    public int width;
    public static InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig[] _emptyArray;

    public void InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig(){
       super();
       this.clear();
    }
    public static InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig[] emptyArray(){
       if (InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig._emptyArray == null) {
             InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig[] interactiveC = new InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig[0];
             InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig._emptyArray;
    }
    public static InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig().mergeFrom(p0);
    }
    public static InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig(), p0);
    }
    public InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig clear(){
       this.width = 0;
       this.height = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig twidth = this.width;
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
    public InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig mergeFrom(CodedInputByteBufferNano p0){
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
       InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig twidth = this.width;
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
