package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$SwitchPlayUrlDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$SwitchPlayUrlDetailPackage extends MessageNano	// class@001482
{
    public long emptySize;
    public long stalledDuration;
    public static ClientTaskDetail$SwitchPlayUrlDetailPackage[] _emptyArray;

    public void ClientTaskDetail$SwitchPlayUrlDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$SwitchPlayUrlDetailPackage[] emptyArray(){
       if (ClientTaskDetail$SwitchPlayUrlDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$SwitchPlayUrlDetailPackage._emptyArray == null) {
             ClientTaskDetail$SwitchPlayUrlDetailPackage[] switchPlayUr = new ClientTaskDetail$SwitchPlayUrlDetailPackage[0];
             ClientTaskDetail$SwitchPlayUrlDetailPackage._emptyArray = switchPlayUr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$SwitchPlayUrlDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$SwitchPlayUrlDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$SwitchPlayUrlDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$SwitchPlayUrlDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$SwitchPlayUrlDetailPackage(), p0);
    }
    public ClientTaskDetail$SwitchPlayUrlDetailPackage clear(){
       this.emptySize = 0;
       this.stalledDuration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$SwitchPlayUrlDetailPackage temptySize = this.emptySize;
       int i1 = 0;
       if (temptySize - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, temptySize);
       }
       temptySize = this.stalledDuration;
       if (temptySize - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, temptySize);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$SwitchPlayUrlDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.stalledDuration = p0.readUInt64();
             }
          }else {
             this.emptySize = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$SwitchPlayUrlDetailPackage temptySize = this.emptySize;
       int i = 0;
       if (temptySize - i) {
          p0.writeUInt64(1, temptySize);
       }
       temptySize = this.stalledDuration;
       if (temptySize - i) {
          p0.writeUInt64(2, temptySize);
       }
       super.writeTo(p0);
       return;
    }
}
