package com.kuaishou.protobuf.gamezone.nano.SCGzoneLiveWidgetBubble;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneLiveWidgetBubble extends MessageNano	// class@000bda
{
    public int frequencyType;
    public String text;
    public static SCGzoneLiveWidgetBubble[] _emptyArray;

    public void SCGzoneLiveWidgetBubble(){
       super();
       this.clear();
    }
    public static SCGzoneLiveWidgetBubble[] emptyArray(){
       if (SCGzoneLiveWidgetBubble._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneLiveWidgetBubble._emptyArray == null) {
             SCGzoneLiveWidgetBubble[] sCGzoneLiveW = new SCGzoneLiveWidgetBubble[0];
             SCGzoneLiveWidgetBubble._emptyArray = sCGzoneLiveW;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneLiveWidgetBubble._emptyArray;
    }
    public static SCGzoneLiveWidgetBubble parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneLiveWidgetBubble().mergeFrom(p0);
    }
    public static SCGzoneLiveWidgetBubble parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneLiveWidgetBubble(), p0);
    }
    public SCGzoneLiveWidgetBubble clear(){
       this.text = "";
       this.frequencyType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.text).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       SCGzoneLiveWidgetBubble tfrequencyTy = this.frequencyType;
       if (tfrequencyTy != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tfrequencyTy);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneLiveWidgetBubble mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.frequencyType = i;
                }
             }
          }else {
             this.text = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.text).equals("")) {
          p0.writeString(1, this.text);
       }
       SCGzoneLiveWidgetBubble tfrequencyTy = this.frequencyType;
       if (tfrequencyTy != null) {
          p0.writeInt32(2, tfrequencyTy);
       }
       super.writeTo(p0);
       return;
    }
}
