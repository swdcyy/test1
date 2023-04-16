package com.kuaishou.client.log.stat.packages.nano.ClientStat$PerformanceMonitoringEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$BatteryStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$PerfCustomStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$MainThreadBlockEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ActivityLaunchEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$FrameRateStatEvent;
import com.kuaishou.client.log.packages.nano.ClientBase$PerformanceMonitoringStatus;

public final class ClientStat$PerformanceMonitoringEvent extends MessageNano	// class@0007f4
{
    public ClientStat$ActivityLaunchEvent activityLaunchInfo;
    public ClientStat$BatteryStatEvent batteryStatInfo;
    public int eventType;
    public ClientStat$FrameRateStatEvent frameRateInfo;
    public ClientStat$MainThreadBlockEvent mainThreadBlockInfo;
    public ClientStat$PerfCustomStatEvent perfCustomStatInfo;
    public ClientBase$PerformanceMonitoringStatus performanceMonitoringStatus;
    public static ClientStat$PerformanceMonitoringEvent[] _emptyArray;

    public void ClientStat$PerformanceMonitoringEvent(){
       super();
       this.clear();
    }
    public static ClientStat$PerformanceMonitoringEvent[] emptyArray(){
       if (ClientStat$PerformanceMonitoringEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$PerformanceMonitoringEvent._emptyArray == null) {
             ClientStat$PerformanceMonitoringEvent[] performanceM = new ClientStat$PerformanceMonitoringEvent[0];
             ClientStat$PerformanceMonitoringEvent._emptyArray = performanceM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$PerformanceMonitoringEvent._emptyArray;
    }
    public static ClientStat$PerformanceMonitoringEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$PerformanceMonitoringEvent().mergeFrom(p0);
    }
    public static ClientStat$PerformanceMonitoringEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$PerformanceMonitoringEvent(), p0);
    }
    public ClientStat$PerformanceMonitoringEvent clear(){
       this.performanceMonitoringStatus = null;
       this.eventType = 0;
       this.frameRateInfo = null;
       this.activityLaunchInfo = null;
       this.mainThreadBlockInfo = null;
       this.perfCustomStatInfo = null;
       this.batteryStatInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$PerformanceMonitoringEvent tperformance = this.performanceMonitoringStatus;
       if (tperformance != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tperformance);
       }
       tperformance = this.eventType;
       if (tperformance != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tperformance);
       }
       tperformance = this.frameRateInfo;
       if (tperformance != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tperformance);
       }
       tperformance = this.activityLaunchInfo;
       if (tperformance != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tperformance);
       }
       tperformance = this.mainThreadBlockInfo;
       if (tperformance != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tperformance);
       }
       tperformance = this.perfCustomStatInfo;
       if (tperformance != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tperformance);
       }
       tperformance = this.batteryStatInfo;
       if (tperformance != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tperformance);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$PerformanceMonitoringEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else if(this.batteryStatInfo == null){
                               this.batteryStatInfo = new ClientStat$BatteryStatEvent();
                            }
                            p0.readMessage(this.batteryStatInfo);
                         }else if(this.perfCustomStatInfo == null){
                            this.perfCustomStatInfo = new ClientStat$PerfCustomStatEvent();
                         }
                         p0.readMessage(this.perfCustomStatInfo);
                      }else if(this.mainThreadBlockInfo == null){
                         this.mainThreadBlockInfo = new ClientStat$MainThreadBlockEvent();
                      }
                      p0.readMessage(this.mainThreadBlockInfo);
                   }else if(this.activityLaunchInfo == null){
                      this.activityLaunchInfo = new ClientStat$ActivityLaunchEvent();
                   }
                   p0.readMessage(this.activityLaunchInfo);
                }else if(this.frameRateInfo == null){
                   this.frameRateInfo = new ClientStat$FrameRateStatEvent();
                }
                p0.readMessage(this.frameRateInfo);
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.eventType = i;
                }
             }
          }else if(this.performanceMonitoringStatus == null){
             this.performanceMonitoringStatus = new ClientBase$PerformanceMonitoringStatus();
          }
          p0.readMessage(this.performanceMonitoringStatus);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$PerformanceMonitoringEvent tperformance = this.performanceMonitoringStatus;
       if (tperformance != null) {
          p0.writeMessage(1, tperformance);
       }
       tperformance = this.eventType;
       if (tperformance != null) {
          p0.writeInt32(2, tperformance);
       }
       tperformance = this.frameRateInfo;
       if (tperformance != null) {
          p0.writeMessage(3, tperformance);
       }
       tperformance = this.activityLaunchInfo;
       if (tperformance != null) {
          p0.writeMessage(4, tperformance);
       }
       tperformance = this.mainThreadBlockInfo;
       if (tperformance != null) {
          p0.writeMessage(5, tperformance);
       }
       tperformance = this.perfCustomStatInfo;
       if (tperformance != null) {
          p0.writeMessage(6, tperformance);
       }
       tperformance = this.batteryStatInfo;
       if (tperformance != null) {
          p0.writeMessage(7, tperformance);
       }
       super.writeTo(p0);
       return;
    }
}
