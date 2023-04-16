package com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty extends MessageNano	// class@0011cd
{
    public long expireTime;
    public long order;
    public int priority;
    public static LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty[] _emptyArray;

    public void LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty(){
       super();
       this.clear();
    }
    public static LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty[] emptyArray(){
       if (LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty._emptyArray == null) {
             LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty[] liveInteract = new LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty[0];
             LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty._emptyArray = liveInteract;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty._emptyArray;
    }
    public static LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty parseFrom(CodedInputByteBufferNano p0){
       return new LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty().mergeFrom(p0);
    }
    public static LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty(), p0);
    }
    public LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty clear(){
       this.priority = 0;
       this.order = 0;
       this.expireTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty tpriority = this.priority;
       if (tpriority != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tpriority);
       }
       tpriority = this.order;
       int i1 = 0;
       if (tpriority - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tpriority);
       }
       tpriority = this.expireTime;
       if (tpriority - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tpriority);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.expireTime = p0.readUInt64();
                }
             }else {
                this.order = p0.readUInt64();
             }
          }else {
             this.priority = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty tpriority = this.priority;
       if (tpriority != null) {
          p0.writeUInt32(1, tpriority);
       }
       tpriority = this.order;
       int i = 0;
       if (tpriority - i) {
          p0.writeUInt64(2, tpriority);
       }
       tpriority = this.expireTime;
       if (tpriority - i) {
          p0.writeUInt64(3, tpriority);
       }
       super.writeTo(p0);
       return;
    }
}
