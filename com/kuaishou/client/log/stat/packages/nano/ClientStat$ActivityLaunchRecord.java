package com.kuaishou.client.log.stat.packages.nano.ClientStat$ActivityLaunchRecord;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ActivityLaunchRecord$CustomEvent;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ActivityLaunchTimeline;

public final class ClientStat$ActivityLaunchRecord extends MessageNano	// class@0013a1
{
    public int activityHashcode;
    public String activityName;
    public String callStartStack;
    public ClientStat$ActivityLaunchRecord$CustomEvent[] customEvent;
    public String intentDetail;
    public ClientStat$ActivityLaunchTimeline launchTimeLine;
    public String processName;
    public long processStartTimestamp;
    public static ClientStat$ActivityLaunchRecord[] _emptyArray;

    public void ClientStat$ActivityLaunchRecord(){
       super();
       this.clear();
    }
    public static ClientStat$ActivityLaunchRecord[] emptyArray(){
       if (ClientStat$ActivityLaunchRecord._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ActivityLaunchRecord._emptyArray == null) {
             ClientStat$ActivityLaunchRecord[] uActivityLau = new ClientStat$ActivityLaunchRecord[0];
             ClientStat$ActivityLaunchRecord._emptyArray = uActivityLau;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ActivityLaunchRecord._emptyArray;
    }
    public static ClientStat$ActivityLaunchRecord parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ActivityLaunchRecord().mergeFrom(p0);
    }
    public static ClientStat$ActivityLaunchRecord parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ActivityLaunchRecord(), p0);
    }
    public ClientStat$ActivityLaunchRecord clear(){
       this.activityName = "";
       this.processName = "";
       this.processStartTimestamp = 0;
       this.callStartStack = "";
       this.activityHashcode = 0;
       this.intentDetail = "";
       this.launchTimeLine = null;
       this.customEvent = ClientStat$ActivityLaunchRecord$CustomEvent.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.activityName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activityName);
       }
       if (!(this.processName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.processName);
       }
       ClientStat$ActivityLaunchRecord tprocessStar = this.processStartTimestamp;
       if (tprocessStar) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, tprocessStar);
       }
       if (!(this.callStartStack).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.callStartStack);
       }
       ClientStat$ActivityLaunchRecord tactivityHas = this.activityHashcode;
       if (tactivityHas != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tactivityHas);
       }
       if (!(this.intentDetail).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.intentDetail);
       }
       tactivityHas = this.launchTimeLine;
       if (tactivityHas != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tactivityHas);
       }
       tactivityHas = this.customEvent;
       if (tactivityHas != null && tactivityHas.length > 0) {
          int i1 = 0;
          ClientStat$ActivityLaunchRecord tcustomEvent = this.customEvent;
          while (i1 < tcustomEvent.length) {
             object oobject = tcustomEvent[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$ActivityLaunchRecord mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 58) {
                               int i1 = 66;
                               if (i != i1) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                                  ClientStat$ActivityLaunchRecord tcustomEvent = this.customEvent;
                                  int i2 = (tcustomEvent == null)? 0: tcustomEvent.length;
                                  i = i + i2;
                                  ClientStat$ActivityLaunchRecord$CustomEvent[] uActivityLau = new ClientStat$ActivityLaunchRecord$CustomEvent[i];
                                  if (i2) {
                                     System.arraycopy(tcustomEvent, 0, uActivityLau, 0, i2);
                                  }
                                  i1 = i - 1;
                                  while (i2 < i1) {
                                     uActivityLau[i2] = new ClientStat$ActivityLaunchRecord$CustomEvent();
                                     p0.readMessage(uActivityLau[i2]);
                                     p0.readTag();
                                     i2 = i2 + 1;
                                  }
                                  uActivityLau[i2] = new ClientStat$ActivityLaunchRecord$CustomEvent();
                                  p0.readMessage(uActivityLau[i2]);
                                  this.customEvent = uActivityLau;
                               }
                            }else if(this.launchTimeLine == null){
                               this.launchTimeLine = new ClientStat$ActivityLaunchTimeline();
                            }
                            p0.readMessage(this.launchTimeLine);
                         }else {
                            this.intentDetail = p0.readString();
                         }
                      }else {
                         this.activityHashcode = p0.readInt32();
                      }
                   }else {
                      this.callStartStack = p0.readString();
                   }
                }else {
                   this.processStartTimestamp = p0.readInt64();
                }
             }else {
                this.processName = p0.readString();
             }
          }else {
             this.activityName = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.activityName).equals(str)) {
          p0.writeString(1, this.activityName);
       }
       if (!(this.processName).equals(str)) {
          p0.writeString(2, this.processName);
       }
       ClientStat$ActivityLaunchRecord tprocessStar = this.processStartTimestamp;
       if (tprocessStar) {
          p0.writeInt64(3, tprocessStar);
       }
       if (!(this.callStartStack).equals(str)) {
          p0.writeString(4, this.callStartStack);
       }
       ClientStat$ActivityLaunchRecord tactivityHas = this.activityHashcode;
       if (tactivityHas != null) {
          p0.writeInt32(5, tactivityHas);
       }
       if (!(this.intentDetail).equals(str)) {
          p0.writeString(6, this.intentDetail);
       }
       tactivityHas = this.launchTimeLine;
       if (tactivityHas != null) {
          p0.writeMessage(7, tactivityHas);
       }
       tactivityHas = this.customEvent;
       if (tactivityHas != null && tactivityHas.length > 0) {
          int i = 0;
          ClientStat$ActivityLaunchRecord tcustomEvent = this.customEvent;
          while (i < tcustomEvent.length) {
             object oobject = tcustomEvent[i];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
