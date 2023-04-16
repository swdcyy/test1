package com.kuaishou.protobuf.livestream.nano.LiveUiMarkLabel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveUiStaticTextLabel;

public final class LiveUiMarkLabel extends MessageNano	// class@000d1d
{
    public LiveUiStaticTextLabel staticTextLabel;
    public static LiveUiMarkLabel[] _emptyArray;

    public void LiveUiMarkLabel(){
       super();
       this.clear();
    }
    public static LiveUiMarkLabel[] emptyArray(){
       if (LiveUiMarkLabel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveUiMarkLabel._emptyArray == null) {
             LiveUiMarkLabel[] liveUiMarkLa = new LiveUiMarkLabel[0];
             LiveUiMarkLabel._emptyArray = liveUiMarkLa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveUiMarkLabel._emptyArray;
    }
    public static LiveUiMarkLabel parseFrom(CodedInputByteBufferNano p0){
       return new LiveUiMarkLabel().mergeFrom(p0);
    }
    public static LiveUiMarkLabel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveUiMarkLabel(), p0);
    }
    public LiveUiMarkLabel clear(){
       this.staticTextLabel = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveUiMarkLabel tstaticTextL = this.staticTextLabel;
       if (tstaticTextL != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tstaticTextL);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveUiMarkLabel mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.staticTextLabel == null){
             this.staticTextLabel = new LiveUiStaticTextLabel();
          }
          p0.readMessage(this.staticTextLabel);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveUiMarkLabel tstaticTextL = this.staticTextLabel;
       if (tstaticTextL != null) {
          p0.writeMessage(1, tstaticTextL);
       }
       super.writeTo(p0);
       return;
    }
}
