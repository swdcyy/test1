package com.kuaishou.protobuf.livestream.nano.InteractiveGuideButton;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveGuideButton extends MessageNano	// class@000c23
{
    public String clickAction;
    public String content;
    public static InteractiveGuideButton[] _emptyArray;

    public void InteractiveGuideButton(){
       super();
       this.clear();
    }
    public static InteractiveGuideButton[] emptyArray(){
       if (InteractiveGuideButton._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveGuideButton._emptyArray == null) {
             InteractiveGuideButton[] interactiveG = new InteractiveGuideButton[0];
             InteractiveGuideButton._emptyArray = interactiveG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveGuideButton._emptyArray;
    }
    public static InteractiveGuideButton parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveGuideButton().mergeFrom(p0);
    }
    public static InteractiveGuideButton parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveGuideButton(), p0);
    }
    public InteractiveGuideButton clear(){
       this.content = "";
       this.clickAction = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.content);
       }
       if (!(this.clickAction).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.clickAction);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveGuideButton mergeFrom(CodedInputByteBufferNano p0){
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
                this.clickAction = p0.readString();
             }
          }else {
             this.content = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.content).equals(str)) {
          p0.writeString(1, this.content);
       }
       if (!(this.clickAction).equals(str)) {
          p0.writeString(2, this.clickAction);
       }
       super.writeTo(p0);
       return;
    }
}
