package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetLineText;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetTextModel;

public final class LiveActivityWidgetProto$LiveActivityWidgetLineText extends MessageNano	// class@0010d7
{
    public LiveActivityWidgetProto$LiveActivityWidgetTextModel firstFieldText;
    public LiveActivityWidgetProto$LiveActivityWidgetTextModel secondFieldText;
    public static LiveActivityWidgetProto$LiveActivityWidgetLineText[] _emptyArray;

    public void LiveActivityWidgetProto$LiveActivityWidgetLineText(){
       super();
       this.clear();
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetLineText[] emptyArray(){
       if (LiveActivityWidgetProto$LiveActivityWidgetLineText._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$LiveActivityWidgetLineText._emptyArray == null) {
             LiveActivityWidgetProto$LiveActivityWidgetLineText[] liveActivity = new LiveActivityWidgetProto$LiveActivityWidgetLineText[0];
             LiveActivityWidgetProto$LiveActivityWidgetLineText._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$LiveActivityWidgetLineText._emptyArray;
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetLineText parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$LiveActivityWidgetLineText().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetLineText parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$LiveActivityWidgetLineText(), p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLineText clear(){
       this.firstFieldText = null;
       this.secondFieldText = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActivityWidgetProto$LiveActivityWidgetLineText tfirstFieldT = this.firstFieldText;
       if (tfirstFieldT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tfirstFieldT);
       }
       tfirstFieldT = this.secondFieldText;
       if (tfirstFieldT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tfirstFieldT);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLineText mergeFrom(CodedInputByteBufferNano p0){
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
             }else if(this.secondFieldText == null){
                this.secondFieldText = new LiveActivityWidgetProto$LiveActivityWidgetTextModel();
             }
             p0.readMessage(this.secondFieldText);
          }else if(this.firstFieldText == null){
             this.firstFieldText = new LiveActivityWidgetProto$LiveActivityWidgetTextModel();
          }
          p0.readMessage(this.firstFieldText);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActivityWidgetProto$LiveActivityWidgetLineText tfirstFieldT = this.firstFieldText;
       if (tfirstFieldT != null) {
          p0.writeMessage(1, tfirstFieldT);
       }
       tfirstFieldT = this.secondFieldText;
       if (tfirstFieldT != null) {
          p0.writeMessage(2, tfirstFieldT);
       }
       super.writeTo(p0);
       return;
    }
}
