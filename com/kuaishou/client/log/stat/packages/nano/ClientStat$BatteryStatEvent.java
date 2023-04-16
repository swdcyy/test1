package com.kuaishou.client.log.stat.packages.nano.ClientStat$BatteryStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$WakelockInfo;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AlarmInfo;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$NetworkInfo;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CpuUsageInfo;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CpuTimeInfo;

public final class ClientStat$BatteryStatEvent extends MessageNano	// class@0007a9
{
    public ClientStat$AlarmInfo alarmInfo;
    public ClientStat$CpuTimeInfo cpuTimeInfo;
    public ClientStat$CpuUsageInfo cpuUsageInfo;
    public ClientStat$NetworkInfo networkInfo;
    public ClientStat$WakelockInfo wakelockInfo;
    public static ClientStat$BatteryStatEvent[] _emptyArray;

    public void ClientStat$BatteryStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$BatteryStatEvent[] emptyArray(){
       if (ClientStat$BatteryStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$BatteryStatEvent._emptyArray == null) {
             ClientStat$BatteryStatEvent[] uBatteryStat = new ClientStat$BatteryStatEvent[0];
             ClientStat$BatteryStatEvent._emptyArray = uBatteryStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$BatteryStatEvent._emptyArray;
    }
    public static ClientStat$BatteryStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$BatteryStatEvent().mergeFrom(p0);
    }
    public static ClientStat$BatteryStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$BatteryStatEvent(), p0);
    }
    public ClientStat$BatteryStatEvent clear(){
       this.cpuTimeInfo = null;
       this.cpuUsageInfo = null;
       this.networkInfo = null;
       this.alarmInfo = null;
       this.wakelockInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$BatteryStatEvent tcpuTimeInfo = this.cpuTimeInfo;
       if (tcpuTimeInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tcpuTimeInfo);
       }
       tcpuTimeInfo = this.cpuUsageInfo;
       if (tcpuTimeInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tcpuTimeInfo);
       }
       tcpuTimeInfo = this.networkInfo;
       if (tcpuTimeInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tcpuTimeInfo);
       }
       tcpuTimeInfo = this.alarmInfo;
       if (tcpuTimeInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tcpuTimeInfo);
       }
       tcpuTimeInfo = this.wakelockInfo;
       if (tcpuTimeInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tcpuTimeInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$BatteryStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else if(this.wakelockInfo == null){
                         this.wakelockInfo = new ClientStat$WakelockInfo();
                      }
                      p0.readMessage(this.wakelockInfo);
                   }else if(this.alarmInfo == null){
                      this.alarmInfo = new ClientStat$AlarmInfo();
                   }
                   p0.readMessage(this.alarmInfo);
                }else if(this.networkInfo == null){
                   this.networkInfo = new ClientStat$NetworkInfo();
                }
                p0.readMessage(this.networkInfo);
             }else if(this.cpuUsageInfo == null){
                this.cpuUsageInfo = new ClientStat$CpuUsageInfo();
             }
             p0.readMessage(this.cpuUsageInfo);
          }else if(this.cpuTimeInfo == null){
             this.cpuTimeInfo = new ClientStat$CpuTimeInfo();
          }
          p0.readMessage(this.cpuTimeInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$BatteryStatEvent tcpuTimeInfo = this.cpuTimeInfo;
       if (tcpuTimeInfo != null) {
          p0.writeMessage(1, tcpuTimeInfo);
       }
       tcpuTimeInfo = this.cpuUsageInfo;
       if (tcpuTimeInfo != null) {
          p0.writeMessage(2, tcpuTimeInfo);
       }
       tcpuTimeInfo = this.networkInfo;
       if (tcpuTimeInfo != null) {
          p0.writeMessage(3, tcpuTimeInfo);
       }
       tcpuTimeInfo = this.alarmInfo;
       if (tcpuTimeInfo != null) {
          p0.writeMessage(4, tcpuTimeInfo);
       }
       tcpuTimeInfo = this.wakelockInfo;
       if (tcpuTimeInfo != null) {
          p0.writeMessage(5, tcpuTimeInfo);
       }
       super.writeTo(p0);
       return;
    }
}
