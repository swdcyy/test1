package com.kuaishou.client.log.stat.packages.nano.ClientStat$CpuTimeInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CpuTime;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$CpuTimeInfo extends MessageNano	// class@0013c4
{
    public ClientStat$CpuTime[] cpuTimeArray;
    public static ClientStat$CpuTimeInfo[] _emptyArray;

    public void ClientStat$CpuTimeInfo(){
       super();
       this.clear();
    }
    public static ClientStat$CpuTimeInfo[] emptyArray(){
       if (ClientStat$CpuTimeInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$CpuTimeInfo._emptyArray == null) {
             ClientStat$CpuTimeInfo[] uCpuTimeInfo = new ClientStat$CpuTimeInfo[0];
             ClientStat$CpuTimeInfo._emptyArray = uCpuTimeInfo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$CpuTimeInfo._emptyArray;
    }
    public static ClientStat$CpuTimeInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$CpuTimeInfo().mergeFrom(p0);
    }
    public static ClientStat$CpuTimeInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$CpuTimeInfo(), p0);
    }
    public ClientStat$CpuTimeInfo clear(){
       this.cpuTimeArray = ClientStat$CpuTime.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$CpuTimeInfo tcpuTimeArra = this.cpuTimeArray;
       if (tcpuTimeArra != null && tcpuTimeArra.length > 0) {
          int i1 = 0;
          ClientStat$CpuTimeInfo tcpuTimeArra1 = this.cpuTimeArray;
          while (i1 < tcpuTimeArra1.length) {
             object oobject = tcpuTimeArra1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$CpuTimeInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ClientStat$CpuTimeInfo tcpuTimeArra = this.cpuTimeArray;
             int i2 = (tcpuTimeArra == null)? 0: tcpuTimeArra.length;
             i = i + i2;
             ClientStat$CpuTime[] uCpuTimeArra = new ClientStat$CpuTime[i];
             if (i2) {
                System.arraycopy(tcpuTimeArra, 0, uCpuTimeArra, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uCpuTimeArra[i2] = new ClientStat$CpuTime();
                p0.readMessage(uCpuTimeArra[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uCpuTimeArra[i2] = new ClientStat$CpuTime();
             p0.readMessage(uCpuTimeArra[i2]);
             this.cpuTimeArray = uCpuTimeArra;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$CpuTimeInfo tcpuTimeArra = this.cpuTimeArray;
       if (tcpuTimeArra != null && tcpuTimeArra.length > 0) {
          int i = 0;
          ClientStat$CpuTimeInfo tcpuTimeArra1 = this.cpuTimeArray;
          while (i < tcpuTimeArra1.length) {
             object oobject = tcpuTimeArra1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
