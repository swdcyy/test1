package com.kuaishou.client.log.stat.packages.nano.ClientStat$CpuUsageInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CpuUsage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$CpuUsageInfo extends MessageNano	// class@0013c6
{
    public ClientStat$CpuUsage[] cpuUsage;
    public static ClientStat$CpuUsageInfo[] _emptyArray;

    public void ClientStat$CpuUsageInfo(){
       super();
       this.clear();
    }
    public static ClientStat$CpuUsageInfo[] emptyArray(){
       if (ClientStat$CpuUsageInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$CpuUsageInfo._emptyArray == null) {
             ClientStat$CpuUsageInfo[] uCpuUsageInf = new ClientStat$CpuUsageInfo[0];
             ClientStat$CpuUsageInfo._emptyArray = uCpuUsageInf;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$CpuUsageInfo._emptyArray;
    }
    public static ClientStat$CpuUsageInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$CpuUsageInfo().mergeFrom(p0);
    }
    public static ClientStat$CpuUsageInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$CpuUsageInfo(), p0);
    }
    public ClientStat$CpuUsageInfo clear(){
       this.cpuUsage = ClientStat$CpuUsage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$CpuUsageInfo tcpuUsage = this.cpuUsage;
       if (tcpuUsage != null && tcpuUsage.length > 0) {
          int i1 = 0;
          ClientStat$CpuUsageInfo tcpuUsage1 = this.cpuUsage;
          while (i1 < tcpuUsage1.length) {
             object oobject = tcpuUsage1[i1];
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
    public ClientStat$CpuUsageInfo mergeFrom(CodedInputByteBufferNano p0){
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
             ClientStat$CpuUsageInfo tcpuUsage = this.cpuUsage;
             int i2 = (tcpuUsage == null)? 0: tcpuUsage.length;
             i = i + i2;
             ClientStat$CpuUsage[] uCpuUsageArr = new ClientStat$CpuUsage[i];
             if (i2) {
                System.arraycopy(tcpuUsage, 0, uCpuUsageArr, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uCpuUsageArr[i2] = new ClientStat$CpuUsage();
                p0.readMessage(uCpuUsageArr[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uCpuUsageArr[i2] = new ClientStat$CpuUsage();
             p0.readMessage(uCpuUsageArr[i2]);
             this.cpuUsage = uCpuUsageArr;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$CpuUsageInfo tcpuUsage = this.cpuUsage;
       if (tcpuUsage != null && tcpuUsage.length > 0) {
          int i = 0;
          ClientStat$CpuUsageInfo tcpuUsage1 = this.cpuUsage;
          while (i < tcpuUsage1.length) {
             object oobject = tcpuUsage1[i];
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
