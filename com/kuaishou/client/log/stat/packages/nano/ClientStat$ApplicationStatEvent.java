package com.kuaishou.client.log.stat.packages.nano.ClientStat$ApplicationStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.packages.nano.ClientBase$ApplicationPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$ApplicationStatEvent extends MessageNano	// class@0007a0
{
    public ClientBase$ApplicationPackage[] app;
    public static ClientStat$ApplicationStatEvent[] _emptyArray;

    public void ClientStat$ApplicationStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$ApplicationStatEvent[] emptyArray(){
       if (ClientStat$ApplicationStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ApplicationStatEvent._emptyArray == null) {
             ClientStat$ApplicationStatEvent[] uApplication = new ClientStat$ApplicationStatEvent[0];
             ClientStat$ApplicationStatEvent._emptyArray = uApplication;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ApplicationStatEvent._emptyArray;
    }
    public static ClientStat$ApplicationStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ApplicationStatEvent().mergeFrom(p0);
    }
    public static ClientStat$ApplicationStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ApplicationStatEvent(), p0);
    }
    public ClientStat$ApplicationStatEvent clear(){
       this.app = ClientBase$ApplicationPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$ApplicationStatEvent tapp = this.app;
       if (tapp != null && tapp.length > 0) {
          int i1 = 0;
          ClientStat$ApplicationStatEvent tapp1 = this.app;
          while (i1 < tapp1.length) {
             object oobject = tapp1[i1];
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
    public ClientStat$ApplicationStatEvent mergeFrom(CodedInputByteBufferNano p0){
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
             ClientStat$ApplicationStatEvent tapp = this.app;
             int i2 = (tapp == null)? 0: tapp.length;
             i = i + i2;
             ClientBase$ApplicationPackage[] uApplication = new ClientBase$ApplicationPackage[i];
             if (i2) {
                System.arraycopy(tapp, 0, uApplication, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uApplication[i2] = new ClientBase$ApplicationPackage();
                p0.readMessage(uApplication[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uApplication[i2] = new ClientBase$ApplicationPackage();
             p0.readMessage(uApplication[i2]);
             this.app = uApplication;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$ApplicationStatEvent tapp = this.app;
       if (tapp != null && tapp.length > 0) {
          int i = 0;
          ClientStat$ApplicationStatEvent tapp1 = this.app;
          while (i < tapp1.length) {
             object oobject = tapp1[i];
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
