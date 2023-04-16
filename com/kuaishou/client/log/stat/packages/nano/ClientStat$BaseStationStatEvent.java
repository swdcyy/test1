package com.kuaishou.client.log.stat.packages.nano.ClientStat$BaseStationStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$BaseStationPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$BaseStationStatEvent extends MessageNano	// class@0007a8
{
    public ClientStat$BaseStationPackage[] baseStation;
    public static ClientStat$BaseStationStatEvent[] _emptyArray;

    public void ClientStat$BaseStationStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$BaseStationStatEvent[] emptyArray(){
       if (ClientStat$BaseStationStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$BaseStationStatEvent._emptyArray == null) {
             ClientStat$BaseStationStatEvent[] uBaseStation = new ClientStat$BaseStationStatEvent[0];
             ClientStat$BaseStationStatEvent._emptyArray = uBaseStation;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$BaseStationStatEvent._emptyArray;
    }
    public static ClientStat$BaseStationStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$BaseStationStatEvent().mergeFrom(p0);
    }
    public static ClientStat$BaseStationStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$BaseStationStatEvent(), p0);
    }
    public ClientStat$BaseStationStatEvent clear(){
       this.baseStation = ClientStat$BaseStationPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$BaseStationStatEvent tbaseStation = this.baseStation;
       if (tbaseStation != null && tbaseStation.length > 0) {
          int i1 = 0;
          ClientStat$BaseStationStatEvent tbaseStation1 = this.baseStation;
          while (i1 < tbaseStation1.length) {
             object oobject = tbaseStation1[i1];
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
    public ClientStat$BaseStationStatEvent mergeFrom(CodedInputByteBufferNano p0){
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
             ClientStat$BaseStationStatEvent tbaseStation = this.baseStation;
             int i2 = (tbaseStation == null)? 0: tbaseStation.length;
             i = i + i2;
             ClientStat$BaseStationPackage[] uBaseStation = new ClientStat$BaseStationPackage[i];
             if (i2) {
                System.arraycopy(tbaseStation, 0, uBaseStation, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uBaseStation[i2] = new ClientStat$BaseStationPackage();
                p0.readMessage(uBaseStation[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uBaseStation[i2] = new ClientStat$BaseStationPackage();
             p0.readMessage(uBaseStation[i2]);
             this.baseStation = uBaseStation;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$BaseStationStatEvent tbaseStation = this.baseStation;
       if (tbaseStation != null && tbaseStation.length > 0) {
          int i = 0;
          ClientStat$BaseStationStatEvent tbaseStation1 = this.baseStation;
          while (i < tbaseStation1.length) {
             object oobject = tbaseStation1[i];
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
