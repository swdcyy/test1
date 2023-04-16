package com.kuaishou.livestream.message.nano.LiveBeautyMessages$SCLiveBeautyLabel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBeautyMessages$SCLiveBeautyLabel extends MessageNano	// class@00110e
{
    public int beautyLabel;
    public static LiveBeautyMessages$SCLiveBeautyLabel[] _emptyArray;

    public void LiveBeautyMessages$SCLiveBeautyLabel(){
       super();
       this.clear();
    }
    public static LiveBeautyMessages$SCLiveBeautyLabel[] emptyArray(){
       if (LiveBeautyMessages$SCLiveBeautyLabel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBeautyMessages$SCLiveBeautyLabel._emptyArray == null) {
             LiveBeautyMessages$SCLiveBeautyLabel[] sCLiveBeauty = new LiveBeautyMessages$SCLiveBeautyLabel[0];
             LiveBeautyMessages$SCLiveBeautyLabel._emptyArray = sCLiveBeauty;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBeautyMessages$SCLiveBeautyLabel._emptyArray;
    }
    public static LiveBeautyMessages$SCLiveBeautyLabel parseFrom(CodedInputByteBufferNano p0){
       return new LiveBeautyMessages$SCLiveBeautyLabel().mergeFrom(p0);
    }
    public static LiveBeautyMessages$SCLiveBeautyLabel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBeautyMessages$SCLiveBeautyLabel(), p0);
    }
    public LiveBeautyMessages$SCLiveBeautyLabel clear(){
       this.beautyLabel = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveBeautyMessages$SCLiveBeautyLabel tbeautyLabel = this.beautyLabel;
       if (tbeautyLabel != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbeautyLabel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBeautyMessages$SCLiveBeautyLabel mergeFrom(CodedInputByteBufferNano p0){
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
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.beautyLabel = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveBeautyMessages$SCLiveBeautyLabel tbeautyLabel = this.beautyLabel;
       if (tbeautyLabel != null) {
          p0.writeInt32(1, tbeautyLabel);
       }
       super.writeTo(p0);
       return;
    }
}
