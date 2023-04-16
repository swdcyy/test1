package com.kuaishou.protobuf.gamezone.gameinteractive.nano.GzoneLiveStream$GzoneLiveStreamMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

public final class GzoneLiveStream$GzoneLiveStreamMessage extends MessageNano	// class@000bac
{
    public byte[] extra;
    public int msgType;
    public static GzoneLiveStream$GzoneLiveStreamMessage[] _emptyArray;

    public void GzoneLiveStream$GzoneLiveStreamMessage(){
       super();
       this.clear();
    }
    public static GzoneLiveStream$GzoneLiveStreamMessage[] emptyArray(){
       if (GzoneLiveStream$GzoneLiveStreamMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneLiveStream$GzoneLiveStreamMessage._emptyArray == null) {
             GzoneLiveStream$GzoneLiveStreamMessage[] gzoneLiveStr = new GzoneLiveStream$GzoneLiveStreamMessage[0];
             GzoneLiveStream$GzoneLiveStreamMessage._emptyArray = gzoneLiveStr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneLiveStream$GzoneLiveStreamMessage._emptyArray;
    }
    public static GzoneLiveStream$GzoneLiveStreamMessage parseFrom(CodedInputByteBufferNano p0){
       return new GzoneLiveStream$GzoneLiveStreamMessage().mergeFrom(p0);
    }
    public static GzoneLiveStream$GzoneLiveStreamMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneLiveStream$GzoneLiveStreamMessage(), p0);
    }
    public GzoneLiveStream$GzoneLiveStreamMessage clear(){
       this.msgType = 0;
       this.extra = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneLiveStream$GzoneLiveStreamMessage tmsgType = this.msgType;
       if (tmsgType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmsgType);
       }
       if (!Arrays.equals(this.extra, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.extra);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneLiveStream$GzoneLiveStreamMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.extra = p0.readBytes();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.msgType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneLiveStream$GzoneLiveStreamMessage tmsgType = this.msgType;
       if (tmsgType != null) {
          p0.writeInt32(1, tmsgType);
       }
       if (!Arrays.equals(this.extra, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(2, this.extra);
       }
       super.writeTo(p0);
       return;
    }
}
