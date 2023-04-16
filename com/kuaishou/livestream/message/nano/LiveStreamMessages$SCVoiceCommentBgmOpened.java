package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoiceCommentBgmOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCVoiceCommentBgmOpened extends MessageNano	// class@001371
{
    public long time;
    public static LiveStreamMessages$SCVoiceCommentBgmOpened[] _emptyArray;

    public void LiveStreamMessages$SCVoiceCommentBgmOpened(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCVoiceCommentBgmOpened[] emptyArray(){
       if (LiveStreamMessages$SCVoiceCommentBgmOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCVoiceCommentBgmOpened._emptyArray == null) {
             LiveStreamMessages$SCVoiceCommentBgmOpened[] sCVoiceComme = new LiveStreamMessages$SCVoiceCommentBgmOpened[0];
             LiveStreamMessages$SCVoiceCommentBgmOpened._emptyArray = sCVoiceComme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCVoiceCommentBgmOpened._emptyArray;
    }
    public static LiveStreamMessages$SCVoiceCommentBgmOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCVoiceCommentBgmOpened().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCVoiceCommentBgmOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCVoiceCommentBgmOpened(), p0);
    }
    public LiveStreamMessages$SCVoiceCommentBgmOpened clear(){
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCVoiceCommentBgmOpened ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCVoiceCommentBgmOpened mergeFrom(CodedInputByteBufferNano p0){
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
       LiveStreamMessages$SCVoiceCommentBgmOpened ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
