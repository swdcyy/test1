package com.kuaishou.livestream.message.nano.LiveSignalTestMessage$SCLiveSignalTest;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveSignalTestMessage$SCLiveSignalTest extends MessageNano	// class@0012aa
{
    public String content;
    public long id;
    public static LiveSignalTestMessage$SCLiveSignalTest[] _emptyArray;

    public void LiveSignalTestMessage$SCLiveSignalTest(){
       super();
       this.clear();
    }
    public static LiveSignalTestMessage$SCLiveSignalTest[] emptyArray(){
       if (LiveSignalTestMessage$SCLiveSignalTest._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSignalTestMessage$SCLiveSignalTest._emptyArray == null) {
             LiveSignalTestMessage$SCLiveSignalTest[] sCLiveSignal = new LiveSignalTestMessage$SCLiveSignalTest[0];
             LiveSignalTestMessage$SCLiveSignalTest._emptyArray = sCLiveSignal;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSignalTestMessage$SCLiveSignalTest._emptyArray;
    }
    public static LiveSignalTestMessage$SCLiveSignalTest parseFrom(CodedInputByteBufferNano p0){
       return new LiveSignalTestMessage$SCLiveSignalTest().mergeFrom(p0);
    }
    public static LiveSignalTestMessage$SCLiveSignalTest parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSignalTestMessage$SCLiveSignalTest(), p0);
    }
    public LiveSignalTestMessage$SCLiveSignalTest clear(){
       this.id = 0;
       this.content = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSignalTestMessage$SCLiveSignalTest tid = this.id;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tid);
       }
       if (!(this.content).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSignalTestMessage$SCLiveSignalTest mergeFrom(CodedInputByteBufferNano p0){
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
                this.content = p0.readString();
             }
          }else {
             this.id = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSignalTestMessage$SCLiveSignalTest tid = this.id;
       if (tid) {
          p0.writeUInt64(1, tid);
       }
       if (!(this.content).equals("")) {
          p0.writeString(2, this.content);
       }
       super.writeTo(p0);
       return;
    }
}
