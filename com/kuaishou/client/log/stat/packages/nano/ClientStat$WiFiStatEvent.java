package com.kuaishou.client.log.stat.packages.nano.ClientStat$WiFiStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$WiFiPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$WiFiStatEvent extends MessageNano	// class@00081d
{
    public ClientStat$WiFiPackage[] wifi;
    public static ClientStat$WiFiStatEvent[] _emptyArray;

    public void ClientStat$WiFiStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$WiFiStatEvent[] emptyArray(){
       if (ClientStat$WiFiStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$WiFiStatEvent._emptyArray == null) {
             ClientStat$WiFiStatEvent[] wiFiStatEven = new ClientStat$WiFiStatEvent[0];
             ClientStat$WiFiStatEvent._emptyArray = wiFiStatEven;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$WiFiStatEvent._emptyArray;
    }
    public static ClientStat$WiFiStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$WiFiStatEvent().mergeFrom(p0);
    }
    public static ClientStat$WiFiStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$WiFiStatEvent(), p0);
    }
    public ClientStat$WiFiStatEvent clear(){
       this.wifi = ClientStat$WiFiPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$WiFiStatEvent twifi = this.wifi;
       if (twifi != null && twifi.length > 0) {
          int i1 = 0;
          ClientStat$WiFiStatEvent twifi1 = this.wifi;
          while (i1 < twifi1.length) {
             object oobject = twifi1[i1];
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
    public ClientStat$WiFiStatEvent mergeFrom(CodedInputByteBufferNano p0){
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
             ClientStat$WiFiStatEvent twifi = this.wifi;
             int i2 = (twifi == null)? 0: twifi.length;
             i = i + i2;
             ClientStat$WiFiPackage[] wiFiPackageA = new ClientStat$WiFiPackage[i];
             if (i2) {
                System.arraycopy(twifi, 0, wiFiPackageA, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                wiFiPackageA[i2] = new ClientStat$WiFiPackage();
                p0.readMessage(wiFiPackageA[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             wiFiPackageA[i2] = new ClientStat$WiFiPackage();
             p0.readMessage(wiFiPackageA[i2]);
             this.wifi = wiFiPackageA;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$WiFiStatEvent twifi = this.wifi;
       if (twifi != null && twifi.length > 0) {
          int i = 0;
          ClientStat$WiFiStatEvent twifi1 = this.wifi;
          while (i < twifi1.length) {
             object oobject = twifi1[i];
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
