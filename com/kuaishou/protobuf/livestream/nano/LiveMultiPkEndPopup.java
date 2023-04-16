package com.kuaishou.protobuf.livestream.nano.LiveMultiPkEndPopup;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkEndPopup extends MessageNano	// class@000cc0
{
    public boolean enableDisplayEndPopup;
    public long popupDisplayMs;
    public static LiveMultiPkEndPopup[] _emptyArray;

    public void LiveMultiPkEndPopup(){
       super();
       this.clear();
    }
    public static LiveMultiPkEndPopup[] emptyArray(){
       if (LiveMultiPkEndPopup._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkEndPopup._emptyArray == null) {
             LiveMultiPkEndPopup[] liveMultiPkE = new LiveMultiPkEndPopup[0];
             LiveMultiPkEndPopup._emptyArray = liveMultiPkE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkEndPopup._emptyArray;
    }
    public static LiveMultiPkEndPopup parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkEndPopup().mergeFrom(p0);
    }
    public static LiveMultiPkEndPopup parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkEndPopup(), p0);
    }
    public LiveMultiPkEndPopup clear(){
       this.enableDisplayEndPopup = false;
       this.popupDisplayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkEndPopup tenableDispl = this.enableDisplayEndPopup;
       if (tenableDispl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableDispl);
       }
       tenableDispl = this.popupDisplayMs;
       if (tenableDispl) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tenableDispl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkEndPopup mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.popupDisplayMs = p0.readUInt64();
             }
          }else {
             this.enableDisplayEndPopup = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkEndPopup tenableDispl = this.enableDisplayEndPopup;
       if (tenableDispl != null) {
          p0.writeBool(1, tenableDispl);
       }
       tenableDispl = this.popupDisplayMs;
       if (tenableDispl) {
          p0.writeUInt64(2, tenableDispl);
       }
       super.writeTo(p0);
       return;
    }
}
