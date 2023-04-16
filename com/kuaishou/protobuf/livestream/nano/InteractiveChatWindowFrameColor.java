package com.kuaishou.protobuf.livestream.nano.InteractiveChatWindowFrameColor;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveChatWindowFrameColor extends MessageNano	// class@000c20
{
    public String endColor;
    public String startColor;
    public static InteractiveChatWindowFrameColor[] _emptyArray;

    public void InteractiveChatWindowFrameColor(){
       super();
       this.clear();
    }
    public static InteractiveChatWindowFrameColor[] emptyArray(){
       if (InteractiveChatWindowFrameColor._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatWindowFrameColor._emptyArray == null) {
             InteractiveChatWindowFrameColor[] interactiveC = new InteractiveChatWindowFrameColor[0];
             InteractiveChatWindowFrameColor._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatWindowFrameColor._emptyArray;
    }
    public static InteractiveChatWindowFrameColor parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatWindowFrameColor().mergeFrom(p0);
    }
    public static InteractiveChatWindowFrameColor parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatWindowFrameColor(), p0);
    }
    public InteractiveChatWindowFrameColor clear(){
       this.startColor = "";
       this.endColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.startColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.startColor);
       }
       if (!(this.endColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.endColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatWindowFrameColor mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.endColor = p0.readString();
             }
          }else {
             this.startColor = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.startColor).equals(str)) {
          p0.writeString(1, this.startColor);
       }
       if (!(this.endColor).equals(str)) {
          p0.writeString(2, this.endColor);
       }
       super.writeTo(p0);
       return;
    }
}
