package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantDisplayStyle;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$LiveActivityPendantDisplayStyle extends MessageNano	// class@0012eb
{
    public boolean canAutoClose;
    public long durationTime;
    public long endShowTime;
    public long startShowTime;
    public static LiveStreamMessages$LiveActivityPendantDisplayStyle[] _emptyArray;

    public void LiveStreamMessages$LiveActivityPendantDisplayStyle(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityPendantDisplayStyle[] emptyArray(){
       if (LiveStreamMessages$LiveActivityPendantDisplayStyle._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityPendantDisplayStyle._emptyArray == null) {
             LiveStreamMessages$LiveActivityPendantDisplayStyle[] liveActivity = new LiveStreamMessages$LiveActivityPendantDisplayStyle[0];
             LiveStreamMessages$LiveActivityPendantDisplayStyle._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityPendantDisplayStyle._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityPendantDisplayStyle parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityPendantDisplayStyle().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityPendantDisplayStyle parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityPendantDisplayStyle(), p0);
    }
    public LiveStreamMessages$LiveActivityPendantDisplayStyle clear(){
       this.canAutoClose = false;
       this.durationTime = 0;
       this.startShowTime = 0;
       this.endShowTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$LiveActivityPendantDisplayStyle tcanAutoClos = this.canAutoClose;
       if (tcanAutoClos != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tcanAutoClos);
       }
       tcanAutoClos = this.durationTime;
       int i1 = 0;
       if (tcanAutoClos - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcanAutoClos);
       }
       tcanAutoClos = this.startShowTime;
       if (tcanAutoClos - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tcanAutoClos);
       }
       tcanAutoClos = this.endShowTime;
       if (tcanAutoClos - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcanAutoClos);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityPendantDisplayStyle mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.endShowTime = p0.readUInt64();
                   }
                }else {
                   this.startShowTime = p0.readUInt64();
                }
             }else {
                this.durationTime = p0.readUInt64();
             }
          }else {
             this.canAutoClose = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$LiveActivityPendantDisplayStyle tcanAutoClos = this.canAutoClose;
       if (tcanAutoClos != null) {
          p0.writeBool(1, tcanAutoClos);
       }
       tcanAutoClos = this.durationTime;
       int i = 0;
       if (tcanAutoClos - i) {
          p0.writeUInt64(2, tcanAutoClos);
       }
       tcanAutoClos = this.startShowTime;
       if (tcanAutoClos - i) {
          p0.writeUInt64(3, tcanAutoClos);
       }
       tcanAutoClos = this.endShowTime;
       if (tcanAutoClos - i) {
          p0.writeUInt64(4, tcanAutoClos);
       }
       super.writeTo(p0);
       return;
    }
}
