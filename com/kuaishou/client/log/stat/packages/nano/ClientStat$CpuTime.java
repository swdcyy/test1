package com.kuaishou.client.log.stat.packages.nano.ClientStat$CpuTime;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$CpuTime extends MessageNano	// class@0013c3
{
    public long cputime;
    public String process;
    public long wallClockTime;
    public static ClientStat$CpuTime[] _emptyArray;

    public void ClientStat$CpuTime(){
       super();
       this.clear();
    }
    public static ClientStat$CpuTime[] emptyArray(){
       if (ClientStat$CpuTime._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$CpuTime._emptyArray == null) {
             ClientStat$CpuTime[] uCpuTimeArra = new ClientStat$CpuTime[0];
             ClientStat$CpuTime._emptyArray = uCpuTimeArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$CpuTime._emptyArray;
    }
    public static ClientStat$CpuTime parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$CpuTime().mergeFrom(p0);
    }
    public static ClientStat$CpuTime parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$CpuTime(), p0);
    }
    public ClientStat$CpuTime clear(){
       this.process = "";
       this.cputime = 0;
       this.wallClockTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.process).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.process);
       }
       ClientStat$CpuTime tcputime = this.cputime;
       int i1 = 0;
       if (tcputime - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tcputime);
       }
       tcputime = this.wallClockTime;
       if (tcputime - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, tcputime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$CpuTime mergeFrom(CodedInputByteBufferNano p0){
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
                   this.wallClockTime = p0.readInt64();
                }
             }else {
                this.cputime = p0.readInt64();
             }
          }else {
             this.process = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.process).equals("")) {
          p0.writeString(1, this.process);
       }
       ClientStat$CpuTime tcputime = this.cputime;
       int i = 0;
       if (tcputime - i) {
          p0.writeInt64(2, tcputime);
       }
       tcputime = this.wallClockTime;
       if (tcputime - i) {
          p0.writeInt64(3, tcputime);
       }
       super.writeTo(p0);
       return;
    }
}
