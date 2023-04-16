package com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserHatInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$MicSeatUserHatInfo extends MessageNano	// class@0012fd
{
    public int hatLevel;
    public boolean isDisplay;
    public boolean isStrawHat;
    public static LiveStreamMessages$MicSeatUserHatInfo[] _emptyArray;

    public void LiveStreamMessages$MicSeatUserHatInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$MicSeatUserHatInfo[] emptyArray(){
       if (LiveStreamMessages$MicSeatUserHatInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$MicSeatUserHatInfo._emptyArray == null) {
             LiveStreamMessages$MicSeatUserHatInfo[] micSeatUserH = new LiveStreamMessages$MicSeatUserHatInfo[0];
             LiveStreamMessages$MicSeatUserHatInfo._emptyArray = micSeatUserH;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$MicSeatUserHatInfo._emptyArray;
    }
    public static LiveStreamMessages$MicSeatUserHatInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$MicSeatUserHatInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$MicSeatUserHatInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$MicSeatUserHatInfo(), p0);
    }
    public LiveStreamMessages$MicSeatUserHatInfo clear(){
       this.hatLevel = 0;
       this.isDisplay = false;
       this.isStrawHat = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$MicSeatUserHatInfo thatLevel = this.hatLevel;
       if (thatLevel != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, thatLevel);
       }
       thatLevel = this.isDisplay;
       if (thatLevel != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, thatLevel);
       }
       thatLevel = this.isStrawHat;
       if (thatLevel != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, thatLevel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$MicSeatUserHatInfo mergeFrom(CodedInputByteBufferNano p0){
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
                   this.isStrawHat = p0.readBool();
                }
             }else {
                this.isDisplay = p0.readBool();
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 7:
                 case 1:
                   break;
                 default:
             }
             this.hatLevel = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$MicSeatUserHatInfo thatLevel = this.hatLevel;
       if (thatLevel != null) {
          p0.writeInt32(1, thatLevel);
       }
       thatLevel = this.isDisplay;
       if (thatLevel != null) {
          p0.writeBool(2, thatLevel);
       }
       thatLevel = this.isStrawHat;
       if (thatLevel != null) {
          p0.writeBool(3, thatLevel);
       }
       super.writeTo(p0);
       return;
    }
}
