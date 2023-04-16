package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$SendGiftDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$SendGiftDetailPackage extends MessageNano	// class@001474
{
    public int comboCount;
    public long cost;
    public int count;
    public static ClientTaskDetail$SendGiftDetailPackage[] _emptyArray;

    public void ClientTaskDetail$SendGiftDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$SendGiftDetailPackage[] emptyArray(){
       if (ClientTaskDetail$SendGiftDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$SendGiftDetailPackage._emptyArray == null) {
             ClientTaskDetail$SendGiftDetailPackage[] sendGiftDeta = new ClientTaskDetail$SendGiftDetailPackage[0];
             ClientTaskDetail$SendGiftDetailPackage._emptyArray = sendGiftDeta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$SendGiftDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$SendGiftDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$SendGiftDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$SendGiftDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$SendGiftDetailPackage(), p0);
    }
    public ClientTaskDetail$SendGiftDetailPackage clear(){
       this.count = 0;
       this.comboCount = 0;
       this.cost = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$SendGiftDetailPackage tcount = this.count;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tcount);
       }
       tcount = this.comboCount;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tcount);
       }
       tcount = this.cost;
       if (tcount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tcount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$SendGiftDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.cost = p0.readUInt64();
                }
             }else {
                this.comboCount = p0.readUInt32();
             }
          }else {
             this.count = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$SendGiftDetailPackage tcount = this.count;
       if (tcount != null) {
          p0.writeUInt32(1, tcount);
       }
       tcount = this.comboCount;
       if (tcount != null) {
          p0.writeUInt32(2, tcount);
       }
       tcount = this.cost;
       if (tcount) {
          p0.writeUInt64(3, tcount);
       }
       super.writeTo(p0);
       return;
    }
}
