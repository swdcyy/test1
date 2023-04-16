package com.kuaishou.protobuf.gamezone.nano.SCGzoneLiveWidgetHideMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneLiveWidgetHideMessage extends MessageNano	// class@000bdb
{
    public int widgetId;
    public static SCGzoneLiveWidgetHideMessage[] _emptyArray;

    public void SCGzoneLiveWidgetHideMessage(){
       super();
       this.clear();
    }
    public static SCGzoneLiveWidgetHideMessage[] emptyArray(){
       if (SCGzoneLiveWidgetHideMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneLiveWidgetHideMessage._emptyArray == null) {
             SCGzoneLiveWidgetHideMessage[] sCGzoneLiveW = new SCGzoneLiveWidgetHideMessage[0];
             SCGzoneLiveWidgetHideMessage._emptyArray = sCGzoneLiveW;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneLiveWidgetHideMessage._emptyArray;
    }
    public static SCGzoneLiveWidgetHideMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneLiveWidgetHideMessage().mergeFrom(p0);
    }
    public static SCGzoneLiveWidgetHideMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneLiveWidgetHideMessage(), p0);
    }
    public SCGzoneLiveWidgetHideMessage clear(){
       this.widgetId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneLiveWidgetHideMessage twidgetId = this.widgetId;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidgetId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneLiveWidgetHideMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.widgetId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneLiveWidgetHideMessage twidgetId = this.widgetId;
       if (twidgetId != null) {
          p0.writeUInt32(1, twidgetId);
       }
       super.writeTo(p0);
       return;
    }
}
