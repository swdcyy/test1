package com.kuaishou.livestream.message.nano.Widget$LoopInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class Widget$LoopInfo extends MessageNano	// class@00148b
{
    public long endTime;
    public long startTime;
    public String title;
    public static Widget$LoopInfo[] _emptyArray;

    public void Widget$LoopInfo(){
       super();
       this.clear();
    }
    public static Widget$LoopInfo[] emptyArray(){
       if (Widget$LoopInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (Widget$LoopInfo._emptyArray == null) {
             Widget$LoopInfo[] loopInfoArra = new Widget$LoopInfo[0];
             Widget$LoopInfo._emptyArray = loopInfoArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return Widget$LoopInfo._emptyArray;
    }
    public static Widget$LoopInfo parseFrom(CodedInputByteBufferNano p0){
       return new Widget$LoopInfo().mergeFrom(p0);
    }
    public static Widget$LoopInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new Widget$LoopInfo(), p0);
    }
    public Widget$LoopInfo clear(){
       this.title = "";
       this.startTime = 0;
       this.endTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.title).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       Widget$LoopInfo tstartTime = this.startTime;
       int i1 = 0;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tstartTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public Widget$LoopInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.endTime = p0.readUInt64();
                }
             }else {
                this.startTime = p0.readUInt64();
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.title).equals("")) {
          p0.writeString(1, this.title);
       }
       Widget$LoopInfo tstartTime = this.startTime;
       int i = 0;
       if (tstartTime - i) {
          p0.writeUInt64(2, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i) {
          p0.writeUInt64(3, tstartTime);
       }
       super.writeTo(p0);
       return;
    }
}
