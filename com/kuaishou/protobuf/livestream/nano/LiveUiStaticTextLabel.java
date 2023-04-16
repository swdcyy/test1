package com.kuaishou.protobuf.livestream.nano.LiveUiStaticTextLabel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveUiText;

public final class LiveUiStaticTextLabel extends MessageNano	// class@000d1e
{
    public LiveUiText text;
    public static LiveUiStaticTextLabel[] _emptyArray;

    public void LiveUiStaticTextLabel(){
       super();
       this.clear();
    }
    public static LiveUiStaticTextLabel[] emptyArray(){
       if (LiveUiStaticTextLabel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveUiStaticTextLabel._emptyArray == null) {
             LiveUiStaticTextLabel[] liveUiStatic = new LiveUiStaticTextLabel[0];
             LiveUiStaticTextLabel._emptyArray = liveUiStatic;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveUiStaticTextLabel._emptyArray;
    }
    public static LiveUiStaticTextLabel parseFrom(CodedInputByteBufferNano p0){
       return new LiveUiStaticTextLabel().mergeFrom(p0);
    }
    public static LiveUiStaticTextLabel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveUiStaticTextLabel(), p0);
    }
    public LiveUiStaticTextLabel clear(){
       this.text = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveUiStaticTextLabel ttext = this.text;
       if (ttext != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ttext);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveUiStaticTextLabel mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.text == null){
             this.text = new LiveUiText();
          }
          p0.readMessage(this.text);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveUiStaticTextLabel ttext = this.text;
       if (ttext != null) {
          p0.writeMessage(1, ttext);
       }
       super.writeTo(p0);
       return;
    }
}
