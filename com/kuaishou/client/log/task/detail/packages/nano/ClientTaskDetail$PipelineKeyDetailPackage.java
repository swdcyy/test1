package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PipelineKeyDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientTaskDetail$PipelineKeyDetailPackage extends MessageNano	// class@00146b
{
    public String fileKey;
    public String host;
    public String ip;
    public ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo[] serverInfo;
    public static ClientTaskDetail$PipelineKeyDetailPackage[] _emptyArray;

    public void ClientTaskDetail$PipelineKeyDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$PipelineKeyDetailPackage[] emptyArray(){
       if (ClientTaskDetail$PipelineKeyDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$PipelineKeyDetailPackage._emptyArray == null) {
             ClientTaskDetail$PipelineKeyDetailPackage[] pipelineKeyD = new ClientTaskDetail$PipelineKeyDetailPackage[0];
             ClientTaskDetail$PipelineKeyDetailPackage._emptyArray = pipelineKeyD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$PipelineKeyDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$PipelineKeyDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$PipelineKeyDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$PipelineKeyDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$PipelineKeyDetailPackage(), p0);
    }
    public ClientTaskDetail$PipelineKeyDetailPackage clear(){
       this.host = "";
       this.ip = "";
       this.fileKey = "";
       this.serverInfo = ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.host);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.ip);
       }
       if (!(this.fileKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.fileKey);
       }
       ClientTaskDetail$PipelineKeyDetailPackage tserverInfo = this.serverInfo;
       if (tserverInfo != null && tserverInfo.length > 0) {
          int i1 = 0;
          ClientTaskDetail$PipelineKeyDetailPackage tserverInfo1 = this.serverInfo;
          while (i1 < tserverInfo1.length) {
             object oobject = tserverInfo1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$PipelineKeyDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   int i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      ClientTaskDetail$PipelineKeyDetailPackage tserverInfo = this.serverInfo;
                      int i2 = (tserverInfo == null)? 0: tserverInfo.length;
                      i = i + i2;
                      ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo[] pipelineKeyD = new ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo[i];
                      if (i2) {
                         System.arraycopy(tserverInfo, 0, pipelineKeyD, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         pipelineKeyD[i2] = new ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo();
                         p0.readMessage(pipelineKeyD[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      pipelineKeyD[i2] = new ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo();
                      p0.readMessage(pipelineKeyD[i2]);
                      this.serverInfo = pipelineKeyD;
                   }
                }else {
                   this.fileKey = p0.readString();
                }
             }else {
                this.ip = p0.readString();
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
       if (!(this.ip).equals(str)) {
          p0.writeString(2, this.ip);
       }
       if (!(this.fileKey).equals(str)) {
          p0.writeString(3, this.fileKey);
       }
       ClientTaskDetail$PipelineKeyDetailPackage tserverInfo = this.serverInfo;
       if (tserverInfo != null && tserverInfo.length > 0) {
          int i = 0;
          ClientTaskDetail$PipelineKeyDetailPackage tserverInfo1 = this.serverInfo;
          while (i < tserverInfo1.length) {
             object oobject = tserverInfo1[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
