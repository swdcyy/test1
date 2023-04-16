package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$SCActivityWidgetUpdated;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetExtend;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetScaling;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetMessage;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetBase;

public final class LiveActivityWidgetProto$SCActivityWidgetUpdated extends MessageNano	// class@0010e1
{
    public LiveActivityWidgetProto$LiveActivityWidgetBase base;
    public LiveActivityWidgetProto$LiveActivityWidgetExtend extend;
    public long id;
    public LiveActivityWidgetProto$LiveActivityWidgetMessage message;
    public LiveActivityWidgetProto$LiveActivityWidgetScaling scaling;
    public int weight;
    public static LiveActivityWidgetProto$SCActivityWidgetUpdated[] _emptyArray;

    public void LiveActivityWidgetProto$SCActivityWidgetUpdated(){
       super();
       this.clear();
    }
    public static LiveActivityWidgetProto$SCActivityWidgetUpdated[] emptyArray(){
       if (LiveActivityWidgetProto$SCActivityWidgetUpdated._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$SCActivityWidgetUpdated._emptyArray == null) {
             LiveActivityWidgetProto$SCActivityWidgetUpdated[] sCActivityWi = new LiveActivityWidgetProto$SCActivityWidgetUpdated[0];
             LiveActivityWidgetProto$SCActivityWidgetUpdated._emptyArray = sCActivityWi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$SCActivityWidgetUpdated._emptyArray;
    }
    public static LiveActivityWidgetProto$SCActivityWidgetUpdated parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$SCActivityWidgetUpdated().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$SCActivityWidgetUpdated parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$SCActivityWidgetUpdated(), p0);
    }
    public LiveActivityWidgetProto$SCActivityWidgetUpdated clear(){
       this.id = 0;
       this.base = null;
       this.message = null;
       this.scaling = null;
       this.extend = null;
       this.weight = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActivityWidgetProto$SCActivityWidgetUpdated tid = this.id;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tid);
       }
       tid = this.base;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tid);
       }
       tid = this.message;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tid);
       }
       tid = this.scaling;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tid);
       }
       tid = this.extend;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tid);
       }
       tid = this.weight;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityWidgetProto$SCActivityWidgetUpdated mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.weight = p0.readUInt32();
                         }
                      }else if(this.extend == null){
                         this.extend = new LiveActivityWidgetProto$LiveActivityWidgetExtend();
                      }
                      p0.readMessage(this.extend);
                   }else if(this.scaling == null){
                      this.scaling = new LiveActivityWidgetProto$LiveActivityWidgetScaling();
                   }
                   p0.readMessage(this.scaling);
                }else if(this.message == null){
                   this.message = new LiveActivityWidgetProto$LiveActivityWidgetMessage();
                }
                p0.readMessage(this.message);
             }else if(this.base == null){
                this.base = new LiveActivityWidgetProto$LiveActivityWidgetBase();
             }
             p0.readMessage(this.base);
          }else {
             this.id = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActivityWidgetProto$SCActivityWidgetUpdated tid = this.id;
       if (tid) {
          p0.writeUInt64(1, tid);
       }
       tid = this.base;
       if (tid != null) {
          p0.writeMessage(2, tid);
       }
       tid = this.message;
       if (tid != null) {
          p0.writeMessage(3, tid);
       }
       tid = this.scaling;
       if (tid != null) {
          p0.writeMessage(4, tid);
       }
       tid = this.extend;
       if (tid != null) {
          p0.writeMessage(5, tid);
       }
       tid = this.weight;
       if (tid != null) {
          p0.writeUInt32(6, tid);
       }
       super.writeTo(p0);
       return;
    }
}
