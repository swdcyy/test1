package com.kuaishou.protobuf.livestream.nano.LiveTextToSpeechResponse;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

public final class LiveTextToSpeechResponse extends MessageNano	// class@000d1c
{
    public byte[] audio;
    public long playDuration;
    public int result;
    public static LiveTextToSpeechResponse[] _emptyArray;

    public void LiveTextToSpeechResponse(){
       super();
       this.clear();
    }
    public static LiveTextToSpeechResponse[] emptyArray(){
       if (LiveTextToSpeechResponse._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTextToSpeechResponse._emptyArray == null) {
             LiveTextToSpeechResponse[] liveTextToSp = new LiveTextToSpeechResponse[0];
             LiveTextToSpeechResponse._emptyArray = liveTextToSp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTextToSpeechResponse._emptyArray;
    }
    public static LiveTextToSpeechResponse parseFrom(CodedInputByteBufferNano p0){
       return new LiveTextToSpeechResponse().mergeFrom(p0);
    }
    public static LiveTextToSpeechResponse parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTextToSpeechResponse(), p0);
    }
    public LiveTextToSpeechResponse clear(){
       this.result = 0;
       this.playDuration = 0;
       this.audio = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveTextToSpeechResponse tresult = this.result;
       if (tresult != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tresult);
       }
       tresult = this.playDuration;
       if (tresult) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tresult);
       }
       if (!Arrays.equals(this.audio, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(3, this.audio);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTextToSpeechResponse mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.audio = p0.readBytes();
                }
             }else {
                this.playDuration = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.result = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveTextToSpeechResponse tresult = this.result;
       if (tresult != null) {
          p0.writeInt32(1, tresult);
       }
       tresult = this.playDuration;
       if (tresult) {
          p0.writeUInt64(2, tresult);
       }
       if (!Arrays.equals(this.audio, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(3, this.audio);
       }
       super.writeTo(p0);
       return;
    }
}
