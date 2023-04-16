package com.kuaishou.client.log.stat.packages.nano.ClientStat$TrafficSlicePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$TrafficSlicePackage extends MessageNano	// class@001435
{
    public long duration;
    public long endTime;
    public long startTime;
    public long traffic;
    public static ClientStat$TrafficSlicePackage[] _emptyArray;

    public void ClientStat$TrafficSlicePackage(){
       super();
       this.clear();
    }
    public static ClientStat$TrafficSlicePackage[] emptyArray(){
       if (ClientStat$TrafficSlicePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$TrafficSlicePackage._emptyArray == null) {
             ClientStat$TrafficSlicePackage[] trafficSlice = new ClientStat$TrafficSlicePackage[0];
             ClientStat$TrafficSlicePackage._emptyArray = trafficSlice;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$TrafficSlicePackage._emptyArray;
    }
    public static ClientStat$TrafficSlicePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$TrafficSlicePackage().mergeFrom(p0);
    }
    public static ClientStat$TrafficSlicePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$TrafficSlicePackage(), p0);
    }
    public ClientStat$TrafficSlicePackage clear(){
       this.duration = 0;
       this.startTime = 0;
       this.endTime = 0;
       this.traffic = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$TrafficSlicePackage tduration = this.duration;
       int i1 = 0;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tduration);
       }
       tduration = this.startTime;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tduration);
       }
       tduration = this.endTime;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tduration);
       }
       tduration = this.traffic;
       if (tduration - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tduration);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$TrafficSlicePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.traffic = p0.readUInt64();
                   }
                }else {
                   this.endTime = p0.readUInt64();
                }
             }else {
                this.startTime = p0.readUInt64();
             }
          }else {
             this.duration = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$TrafficSlicePackage tduration = this.duration;
       int i = 0;
       if (tduration - i) {
          p0.writeUInt64(1, tduration);
       }
       tduration = this.startTime;
       if (tduration - i) {
          p0.writeUInt64(2, tduration);
       }
       tduration = this.endTime;
       if (tduration - i) {
          p0.writeUInt64(3, tduration);
       }
       tduration = this.traffic;
       if (tduration - i) {
          p0.writeUInt64(4, tduration);
       }
       super.writeTo(p0);
       return;
    }
}
