package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$SendImageMessagePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$SendImageMessagePackage extends MessageNano	// class@001476
{
    public String fromUserId;
    public int source;
    public String toUserId;
    public static ClientTaskDetail$SendImageMessagePackage[] _emptyArray;

    public void ClientTaskDetail$SendImageMessagePackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$SendImageMessagePackage[] emptyArray(){
       if (ClientTaskDetail$SendImageMessagePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$SendImageMessagePackage._emptyArray == null) {
             ClientTaskDetail$SendImageMessagePackage[] sendImageMes = new ClientTaskDetail$SendImageMessagePackage[0];
             ClientTaskDetail$SendImageMessagePackage._emptyArray = sendImageMes;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$SendImageMessagePackage._emptyArray;
    }
    public static ClientTaskDetail$SendImageMessagePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$SendImageMessagePackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$SendImageMessagePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$SendImageMessagePackage(), p0);
    }
    public ClientTaskDetail$SendImageMessagePackage clear(){
       this.fromUserId = "";
       this.toUserId = "";
       this.source = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.fromUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.fromUserId);
       }
       if (!(this.toUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.toUserId);
       }
       ClientTaskDetail$SendImageMessagePackage tsource = this.source;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tsource);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$SendImageMessagePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.source = i;
                   }
                }
             }else {
                this.toUserId = p0.readString();
             }
          }else {
             this.fromUserId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.fromUserId).equals(str)) {
          p0.writeString(1, this.fromUserId);
       }
       if (!(this.toUserId).equals(str)) {
          p0.writeString(2, this.toUserId);
       }
       ClientTaskDetail$SendImageMessagePackage tsource = this.source;
       if (tsource != null) {
          p0.writeInt32(3, tsource);
       }
       super.writeTo(p0);
       return;
    }
}
