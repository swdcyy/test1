package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoiceCommentBgmClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCVoiceCommentBgmClosed extends MessageNano	// class@001370
{
    public long time;
    public static LiveStreamMessages$SCVoiceCommentBgmClosed[] _emptyArray;

    public void LiveStreamMessages$SCVoiceCommentBgmClosed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCVoiceCommentBgmClosed[] emptyArray(){
       if (LiveStreamMessages$SCVoiceCommentBgmClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCVoiceCommentBgmClosed._emptyArray == null) {
             LiveStreamMessages$SCVoiceCommentBgmClosed[] sCVoiceComme = new LiveStreamMessages$SCVoiceCommentBgmClosed[0];
             LiveStreamMessages$SCVoiceCommentBgmClosed._emptyArray = sCVoiceComme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCVoiceCommentBgmClosed._emptyArray;
    }
    public static LiveStreamMessages$SCVoiceCommentBgmClosed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCVoiceCommentBgmClosed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCVoiceCommentBgmClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCVoiceCommentBgmClosed(), p0);
    }
    public LiveStreamMessages$SCVoiceCommentBgmClosed clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCVoiceCommentBgmClosed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCVoiceCommentBgmClosed mergeFrom(CodedInputByteBufferNano p0){
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
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCVoiceCommentBgmClosed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
