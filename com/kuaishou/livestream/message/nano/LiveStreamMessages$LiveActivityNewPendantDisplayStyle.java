package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityNewPendantDisplayStyle;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$LiveActivityNewPendantDisplayStyle extends MessageNano	// class@0012e0
{
    public boolean canAutoClose;
    public long endShowTime;
    public long startShowTime;
    public static LiveStreamMessages$LiveActivityNewPendantDisplayStyle[] _emptyArray;

    public void LiveStreamMessages$LiveActivityNewPendantDisplayStyle(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityNewPendantDisplayStyle[] emptyArray(){
       if (LiveStreamMessages$LiveActivityNewPendantDisplayStyle._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityNewPendantDisplayStyle._emptyArray == null) {
             LiveStreamMessages$LiveActivityNewPendantDisplayStyle[] liveActivity = new LiveStreamMessages$LiveActivityNewPendantDisplayStyle[0];
             LiveStreamMessages$LiveActivityNewPendantDisplayStyle._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityNewPendantDisplayStyle._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityNewPendantDisplayStyle parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityNewPendantDisplayStyle().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityNewPendantDisplayStyle parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityNewPendantDisplayStyle(), p0);
    }
    public LiveStreamMessages$LiveActivityNewPendantDisplayStyle clear(){
       this.canAutoClose = false;
       this.startShowTime = 0;
       this.endShowTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$LiveActivityNewPendantDisplayStyle tcanAutoClos = this.canAutoClose;
       if (tcanAutoClos != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tcanAutoClos);
       }
       tcanAutoClos = this.startShowTime;
       int i1 = 0;
       if (tcanAutoClos - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcanAutoClos);
       }
       tcanAutoClos = this.endShowTime;
       if (tcanAutoClos - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tcanAutoClos);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityNewPendantDisplayStyle mergeFrom(CodedInputByteBufferNano p0){
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
                   this.endShowTime = p0.readUInt64();
                }
             }else {
                this.startShowTime = p0.readUInt64();
             }
          }else {
             this.canAutoClose = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$LiveActivityNewPendantDisplayStyle tcanAutoClos = this.canAutoClose;
       if (tcanAutoClos != null) {
          p0.writeBool(1, tcanAutoClos);
       }
       tcanAutoClos = this.startShowTime;
       int i = 0;
       if (tcanAutoClos - i) {
          p0.writeUInt64(2, tcanAutoClos);
       }
       tcanAutoClos = this.endShowTime;
       if (tcanAutoClos - i) {
          p0.writeUInt64(3, tcanAutoClos);
       }
       super.writeTo(p0);
       return;
    }
}
