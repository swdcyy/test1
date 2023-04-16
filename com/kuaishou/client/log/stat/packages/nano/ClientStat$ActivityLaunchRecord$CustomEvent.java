package com.kuaishou.client.log.stat.packages.nano.ClientStat$ActivityLaunchRecord$CustomEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$ActivityLaunchRecord$CustomEvent extends MessageNano	// class@0013a0
{
    public String event;
    public long timestamp;
    public static ClientStat$ActivityLaunchRecord$CustomEvent[] _emptyArray;

    public void ClientStat$ActivityLaunchRecord$CustomEvent(){
       super();
       this.clear();
    }
    public static ClientStat$ActivityLaunchRecord$CustomEvent[] emptyArray(){
       if (ClientStat$ActivityLaunchRecord$CustomEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ActivityLaunchRecord$CustomEvent._emptyArray == null) {
             ClientStat$ActivityLaunchRecord$CustomEvent[] uActivityLau = new ClientStat$ActivityLaunchRecord$CustomEvent[0];
             ClientStat$ActivityLaunchRecord$CustomEvent._emptyArray = uActivityLau;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ActivityLaunchRecord$CustomEvent._emptyArray;
    }
    public static ClientStat$ActivityLaunchRecord$CustomEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ActivityLaunchRecord$CustomEvent().mergeFrom(p0);
    }
    public static ClientStat$ActivityLaunchRecord$CustomEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ActivityLaunchRecord$CustomEvent(), p0);
    }
    public ClientStat$ActivityLaunchRecord$CustomEvent clear(){
       this.event = "";
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.event).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.event);
       }
       ClientStat$ActivityLaunchRecord$CustomEvent ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, ttimestamp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$ActivityLaunchRecord$CustomEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.timestamp = p0.readInt64();
             }
          }else {
             this.event = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.event).equals("")) {
          p0.writeString(1, this.event);
       }
       ClientStat$ActivityLaunchRecord$CustomEvent ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeInt64(2, ttimestamp);
       }
       super.writeTo(p0);
       return;
    }
}
