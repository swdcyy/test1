package com.kuaishou.client.log.stat.packages.nano.ClientStat$BaseStationPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$BaseStationPackage extends MessageNano	// class@0013b6
{
    public int cellId;
    public boolean connected;
    public int locationAreaCode;
    public int mobileCountryCode;
    public int mobileNetworkCode;
    public int signalStrength;
    public static ClientStat$BaseStationPackage[] _emptyArray;

    public void ClientStat$BaseStationPackage(){
       super();
       this.clear();
    }
    public static ClientStat$BaseStationPackage[] emptyArray(){
       if (ClientStat$BaseStationPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$BaseStationPackage._emptyArray == null) {
             ClientStat$BaseStationPackage[] uBaseStation = new ClientStat$BaseStationPackage[0];
             ClientStat$BaseStationPackage._emptyArray = uBaseStation;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$BaseStationPackage._emptyArray;
    }
    public static ClientStat$BaseStationPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$BaseStationPackage().mergeFrom(p0);
    }
    public static ClientStat$BaseStationPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$BaseStationPackage(), p0);
    }
    public ClientStat$BaseStationPackage clear(){
       this.mobileCountryCode = 0;
       this.mobileNetworkCode = 0;
       this.locationAreaCode = 0;
       this.cellId = 0;
       this.signalStrength = 0;
       this.connected = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$BaseStationPackage tmobileCount = this.mobileCountryCode;
       if (tmobileCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tmobileCount);
       }
       tmobileCount = this.mobileNetworkCode;
       if (tmobileCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tmobileCount);
       }
       tmobileCount = this.locationAreaCode;
       if (tmobileCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tmobileCount);
       }
       tmobileCount = this.cellId;
       if (tmobileCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tmobileCount);
       }
       tmobileCount = this.signalStrength;
       if (tmobileCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tmobileCount);
       }
       tmobileCount = this.connected;
       if (tmobileCount != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tmobileCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$BaseStationPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.connected = p0.readBool();
                         }
                      }else {
                         this.signalStrength = p0.readUInt32();
                      }
                   }else {
                      this.cellId = p0.readUInt32();
                   }
                }else {
                   this.locationAreaCode = p0.readUInt32();
                }
             }else {
                this.mobileNetworkCode = p0.readUInt32();
             }
          }else {
             this.mobileCountryCode = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$BaseStationPackage tmobileCount = this.mobileCountryCode;
       if (tmobileCount != null) {
          p0.writeUInt32(1, tmobileCount);
       }
       tmobileCount = this.mobileNetworkCode;
       if (tmobileCount != null) {
          p0.writeUInt32(2, tmobileCount);
       }
       tmobileCount = this.locationAreaCode;
       if (tmobileCount != null) {
          p0.writeUInt32(3, tmobileCount);
       }
       tmobileCount = this.cellId;
       if (tmobileCount != null) {
          p0.writeUInt32(4, tmobileCount);
       }
       tmobileCount = this.signalStrength;
       if (tmobileCount != null) {
          p0.writeUInt32(5, tmobileCount);
       }
       tmobileCount = this.connected;
       if (tmobileCount != null) {
          p0.writeBool(6, tmobileCount);
       }
       super.writeTo(p0);
       return;
    }
}
