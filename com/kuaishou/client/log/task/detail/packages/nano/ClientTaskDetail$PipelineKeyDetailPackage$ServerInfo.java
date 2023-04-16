package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo extends MessageNano	// class@00146a
{
    public String host;
    public int port;
    public String protocol;
    public static ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo[] _emptyArray;

    public void ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo[] emptyArray(){
       if (ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo._emptyArray == null) {
             ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo[] pipelineKeyD = new ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo[0];
             ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo._emptyArray = pipelineKeyD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo._emptyArray;
    }
    public static ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo().mergeFrom(p0);
    }
    public static ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo(), p0);
    }
    public ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo clear(){
       this.host = "";
       this.port = 0;
       this.protocol = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.host);
       }
       ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo tport = this.port;
       if (tport != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tport);
       }
       if (!(this.protocol).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.protocol);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.protocol = p0.readString();
                }
             }else {
                this.port = p0.readUInt32();
             }
          }else {
             this.host = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.host).equals(str)) {
          p0.writeString(1, this.host);
       }
       ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo tport = this.port;
       if (tport != null) {
          p0.writeUInt32(2, tport);
       }
       if (!(this.protocol).equals(str)) {
          p0.writeString(3, this.protocol);
       }
       super.writeTo(p0);
       return;
    }
}
