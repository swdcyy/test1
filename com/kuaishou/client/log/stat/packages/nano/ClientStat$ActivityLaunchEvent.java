package com.kuaishou.client.log.stat.packages.nano.ClientStat$ActivityLaunchEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ActivityLaunchRecord;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$ActivityLaunchEvent extends MessageNano	// class@000792
{
    public ClientStat$ActivityLaunchRecord[] launchRecord;
    public static ClientStat$ActivityLaunchEvent[] _emptyArray;

    public void ClientStat$ActivityLaunchEvent(){
       super();
       this.clear();
    }
    public static ClientStat$ActivityLaunchEvent[] emptyArray(){
       if (ClientStat$ActivityLaunchEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ActivityLaunchEvent._emptyArray == null) {
             ClientStat$ActivityLaunchEvent[] uActivityLau = new ClientStat$ActivityLaunchEvent[0];
             ClientStat$ActivityLaunchEvent._emptyArray = uActivityLau;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ActivityLaunchEvent._emptyArray;
    }
    public static ClientStat$ActivityLaunchEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ActivityLaunchEvent().mergeFrom(p0);
    }
    public static ClientStat$ActivityLaunchEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ActivityLaunchEvent(), p0);
    }
    public ClientStat$ActivityLaunchEvent clear(){
       this.launchRecord = ClientStat$ActivityLaunchRecord.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$ActivityLaunchEvent tlaunchRecor = this.launchRecord;
       if (tlaunchRecor != null && tlaunchRecor.length > 0) {
          int i1 = 0;
          ClientStat$ActivityLaunchEvent tlaunchRecor1 = this.launchRecord;
          while (i1 < tlaunchRecor1.length) {
             object oobject = tlaunchRecor1[i1];
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
    public ClientStat$ActivityLaunchEvent mergeFrom(CodedInputByteBufferNano p0){
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
             ClientStat$ActivityLaunchEvent tlaunchRecor = this.launchRecord;
             int i2 = (tlaunchRecor == null)? 0: tlaunchRecor.length;
             i = i + i2;
             ClientStat$ActivityLaunchRecord[] uActivityLau = new ClientStat$ActivityLaunchRecord[i];
             if (i2) {
                System.arraycopy(tlaunchRecor, 0, uActivityLau, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uActivityLau[i2] = new ClientStat$ActivityLaunchRecord();
                p0.readMessage(uActivityLau[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uActivityLau[i2] = new ClientStat$ActivityLaunchRecord();
             p0.readMessage(uActivityLau[i2]);
             this.launchRecord = uActivityLau;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$ActivityLaunchEvent tlaunchRecor = this.launchRecord;
       if (tlaunchRecor != null && tlaunchRecor.length > 0) {
          int i = 0;
          ClientStat$ActivityLaunchEvent tlaunchRecor1 = this.launchRecord;
          while (i < tlaunchRecor1.length) {
             object oobject = tlaunchRecor1[i];
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
