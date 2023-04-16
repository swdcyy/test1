package com.kuaishou.client.log.stat.packages.nano.ClientStat$StackTraceSample;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$StackTraceSample extends MessageNano	// class@001428
{
    public long endTimestamp;
    public int repeatCount;
    public boolean runIdle;
    public String stackTraceDetail;
    public long startTimestamp;
    public static ClientStat$StackTraceSample[] _emptyArray;

    public void ClientStat$StackTraceSample(){
       super();
       this.clear();
    }
    public static ClientStat$StackTraceSample[] emptyArray(){
       if (ClientStat$StackTraceSample._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$StackTraceSample._emptyArray == null) {
             ClientStat$StackTraceSample[] stackTraceSa = new ClientStat$StackTraceSample[0];
             ClientStat$StackTraceSample._emptyArray = stackTraceSa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$StackTraceSample._emptyArray;
    }
    public static ClientStat$StackTraceSample parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$StackTraceSample().mergeFrom(p0);
    }
    public static ClientStat$StackTraceSample parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$StackTraceSample(), p0);
    }
    public ClientStat$StackTraceSample clear(){
       this.startTimestamp = 0;
       this.endTimestamp = 0;
       this.stackTraceDetail = "";
       this.runIdle = false;
       this.repeatCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$StackTraceSample tstartTimest = this.startTimestamp;
       int i1 = 0;
       if (tstartTimest - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, tstartTimest);
       }
       tstartTimest = this.endTimestamp;
       if (tstartTimest - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tstartTimest);
       }
       if (!(this.stackTraceDetail).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.stackTraceDetail);
       }
       tstartTimest = this.runIdle;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tstartTimest);
       }
       tstartTimest = this.repeatCount;
       if (tstartTimest != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tstartTimest);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$StackTraceSample mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.repeatCount = p0.readInt32();
                      }
                   }else {
                      this.runIdle = p0.readBool();
                   }
                }else {
                   this.stackTraceDetail = p0.readString();
                }
             }else {
                this.endTimestamp = p0.readInt64();
             }
          }else {
             this.startTimestamp = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$StackTraceSample tstartTimest = this.startTimestamp;
       int i = 0;
       if (tstartTimest - i) {
          p0.writeInt64(1, tstartTimest);
       }
       tstartTimest = this.endTimestamp;
       if (tstartTimest - i) {
          p0.writeInt64(2, tstartTimest);
       }
       if (!(this.stackTraceDetail).equals("")) {
          p0.writeString(3, this.stackTraceDetail);
       }
       tstartTimest = this.runIdle;
       if (tstartTimest != null) {
          p0.writeBool(4, tstartTimest);
       }
       tstartTimest = this.repeatCount;
       if (tstartTimest != null) {
          p0.writeInt32(5, tstartTimest);
       }
       super.writeTo(p0);
       return;
    }
}
