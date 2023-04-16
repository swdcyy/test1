package com.kuaishou.client.log.stat.packages.nano.ClientStat$MainThreadBlockEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StackTraceSample;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$SystemTraceSample;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.System;

public final class ClientStat$MainThreadBlockEvent extends MessageNano	// class@0007eb
{
    public long applicationCreateElapseTime;
    public long applicationForegroundElapseTime;
    public long applicationForegroundTime;
    public long blockDuration;
    public long calcBlockOverhead;
    public String currentActivity;
    public ClientEvent$UrlPackage currentUrlPackage;
    public String extraMap;
    public String handlerClassName;
    public String messageRunnable;
    public String messageWhat;
    public String page;
    public String processName;
    public ClientStat$StackTraceSample[] stackTraceSample;
    public ClientStat$SystemTraceSample[] systemTraceSample;
    public static ClientStat$MainThreadBlockEvent[] _emptyArray;

    public void ClientStat$MainThreadBlockEvent(){
       super();
       this.clear();
    }
    public static ClientStat$MainThreadBlockEvent[] emptyArray(){
       if (ClientStat$MainThreadBlockEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$MainThreadBlockEvent._emptyArray == null) {
             ClientStat$MainThreadBlockEvent[] mainThreadBl = new ClientStat$MainThreadBlockEvent[0];
             ClientStat$MainThreadBlockEvent._emptyArray = mainThreadBl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$MainThreadBlockEvent._emptyArray;
    }
    public static ClientStat$MainThreadBlockEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$MainThreadBlockEvent().mergeFrom(p0);
    }
    public static ClientStat$MainThreadBlockEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$MainThreadBlockEvent(), p0);
    }
    public ClientStat$MainThreadBlockEvent clear(){
       this.blockDuration = 0;
       this.handlerClassName = "";
       this.messageRunnable = "";
       this.messageWhat = "";
       this.stackTraceSample = ClientStat$StackTraceSample.emptyArray();
       this.systemTraceSample = ClientStat$SystemTraceSample.emptyArray();
       this.currentUrlPackage = null;
       this.calcBlockOverhead = 0;
       this.currentActivity = "";
       this.applicationCreateElapseTime = 0;
       this.applicationForegroundTime = 0;
       this.applicationForegroundElapseTime = 0;
       this.processName = "";
       this.extraMap = "";
       this.page = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$MainThreadBlockEvent tblockDurati = this.blockDuration;
       ClientStat$MainThreadBlockEvent mainThreadBl = null;
       if (tblockDurati - mainThreadBl) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, tblockDurati);
       }
       String str = "";
       if (!(this.handlerClassName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.handlerClassName);
       }
       if (!(this.messageRunnable).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.messageRunnable);
       }
       if (!(this.messageWhat).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.messageWhat);
       }
       tblockDurati = this.stackTraceSample;
       int i1 = 0;
       if (tblockDurati != null && tblockDurati.length > 0) {
          int i2 = 0;
          ClientStat$MainThreadBlockEvent tstackTraceS = this.stackTraceSample;
          while (i2 < tstackTraceS.length) {
             object oobject = tstackTraceS[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tblockDurati = this.systemTraceSample;
       if (tblockDurati != null && tblockDurati.length > 0) {
          tblockDurati = this.systemTraceSample;
          while (i1 < tblockDurati.length) {
             object oobject1 = tblockDurati[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tblockDurati = this.currentUrlPackage;
       if (tblockDurati != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tblockDurati);
       }
       ClientStat$MainThreadBlockEvent tcalcBlockOv = this.calcBlockOverhead;
       if (tcalcBlockOv - mainThreadBl) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(8, tcalcBlockOv);
       }
       if (!(this.currentActivity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.currentActivity);
       }
       tcalcBlockOv = this.applicationCreateElapseTime;
       if (tcalcBlockOv - mainThreadBl) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(10, tcalcBlockOv);
       }
       tcalcBlockOv = this.applicationForegroundTime;
       if (tcalcBlockOv - mainThreadBl) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(11, tcalcBlockOv);
       }
       tcalcBlockOv = this.applicationForegroundElapseTime;
       if (tcalcBlockOv - mainThreadBl) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(12, tcalcBlockOv);
       }
       if (!(this.processName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.processName);
       }
       if (!(this.extraMap).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.extraMap);
       }
       if (!(this.page).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.page);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$MainThreadBlockEvent mergeFrom(CodedInputByteBufferNano p0){
       ClientStat$MainThreadBlockEvent tstackTraceS;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.blockDuration = p0.readInt64();
                break;
              case 18:
                this.handlerClassName = p0.readString();
                break;
              case 26:
                this.messageRunnable = p0.readString();
                break;
              case '"':
                this.messageWhat = p0.readString();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tstackTraceS = this.stackTraceSample;
                i2 = (tstackTraceS == null)? 0: tstackTraceS.length;
                i = i + i2;
                ClientStat$StackTraceSample[] stackTraceSa = new ClientStat$StackTraceSample[i];
                if (i2) {
                   System.arraycopy(tstackTraceS, i1, stackTraceSa, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stackTraceSa[i2] = new ClientStat$StackTraceSample();
                   p0.readMessage(stackTraceSa[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stackTraceSa[i2] = new ClientStat$StackTraceSample();
                p0.readMessage(stackTraceSa[i2]);
                this.stackTraceSample = stackTraceSa;
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tstackTraceS = this.systemTraceSample;
                i2 = (tstackTraceS == null)? 0: tstackTraceS.length;
                i = i + i2;
                ClientStat$SystemTraceSample[] systemTraceS = new ClientStat$SystemTraceSample[i];
                if (i2) {
                   System.arraycopy(tstackTraceS, i1, systemTraceS, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   systemTraceS[i2] = new ClientStat$SystemTraceSample();
                   p0.readMessage(systemTraceS[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                systemTraceS[i2] = new ClientStat$SystemTraceSample();
                p0.readMessage(systemTraceS[i2]);
                this.systemTraceSample = systemTraceS;
                break;
              case ':':
                if (this.currentUrlPackage == null) {
                   this.currentUrlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.currentUrlPackage);
                break;
              case '@':
                this.calcBlockOverhead = p0.readInt64();
                break;
              case 'J':
                this.currentActivity = p0.readString();
                break;
              case 'P':
                this.applicationCreateElapseTime = p0.readInt64();
                break;
              case 'X':
                this.applicationForegroundTime = p0.readInt64();
                break;
              case '`':
                this.applicationForegroundElapseTime = p0.readInt64();
                break;
              case 'j':
                this.processName = p0.readString();
                break;
              case 'r':
                this.extraMap = p0.readString();
                break;
              case 'z':
                this.page = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$MainThreadBlockEvent tblockDurati = this.blockDuration;
       ClientStat$MainThreadBlockEvent mainThreadBl = null;
       if (tblockDurati - mainThreadBl) {
          p0.writeInt64(1, tblockDurati);
       }
       String str = "";
       if (!(this.handlerClassName).equals(str)) {
          p0.writeString(2, this.handlerClassName);
       }
       if (!(this.messageRunnable).equals(str)) {
          p0.writeString(3, this.messageRunnable);
       }
       if (!(this.messageWhat).equals(str)) {
          p0.writeString(4, this.messageWhat);
       }
       tblockDurati = this.stackTraceSample;
       int i = 0;
       if (tblockDurati != null && tblockDurati.length > 0) {
          int i1 = 0;
          ClientStat$MainThreadBlockEvent tstackTraceS = this.stackTraceSample;
          while (i1 < tstackTraceS.length) {
             object oobject = tstackTraceS[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tblockDurati = this.systemTraceSample;
       if (tblockDurati != null && tblockDurati.length > 0) {
          tblockDurati = this.systemTraceSample;
          while (i < tblockDurati.length) {
             object oobject1 = tblockDurati[i];
             if (oobject1 != null) {
                p0.writeMessage(6, oobject1);
             }
             i = i + 1;
          }
       }
       tblockDurati = this.currentUrlPackage;
       if (tblockDurati != null) {
          p0.writeMessage(7, tblockDurati);
       }
       ClientStat$MainThreadBlockEvent tcalcBlockOv = this.calcBlockOverhead;
       if (tcalcBlockOv - mainThreadBl) {
          p0.writeInt64(8, tcalcBlockOv);
       }
       if (!(this.currentActivity).equals(str)) {
          p0.writeString(9, this.currentActivity);
       }
       tcalcBlockOv = this.applicationCreateElapseTime;
       if (tcalcBlockOv - mainThreadBl) {
          p0.writeInt64(10, tcalcBlockOv);
       }
       tcalcBlockOv = this.applicationForegroundTime;
       if (tcalcBlockOv - mainThreadBl) {
          p0.writeInt64(11, tcalcBlockOv);
       }
       tcalcBlockOv = this.applicationForegroundElapseTime;
       if (tcalcBlockOv - mainThreadBl) {
          p0.writeInt64(12, tcalcBlockOv);
       }
       if (!(this.processName).equals(str)) {
          p0.writeString(13, this.processName);
       }
       if (!(this.extraMap).equals(str)) {
          p0.writeString(14, this.extraMap);
       }
       if (!(this.page).equals(str)) {
          p0.writeString(15, this.page);
       }
       super.writeTo(p0);
       return;
    }
}
