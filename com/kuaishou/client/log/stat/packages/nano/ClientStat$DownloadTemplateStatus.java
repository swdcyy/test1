package com.kuaishou.client.log.stat.packages.nano.ClientStat$DownloadTemplateStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$UrlRequestStatus;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$TemplateMeta;

public final class ClientStat$DownloadTemplateStatus extends MessageNano	// class@0013cd
{
    public ClientStat$TemplateMeta meta;
    public ClientStat$UrlRequestStatus status;
    public static ClientStat$DownloadTemplateStatus[] _emptyArray;

    public void ClientStat$DownloadTemplateStatus(){
       super();
       this.clear();
    }
    public static ClientStat$DownloadTemplateStatus[] emptyArray(){
       if (ClientStat$DownloadTemplateStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$DownloadTemplateStatus._emptyArray == null) {
             ClientStat$DownloadTemplateStatus[] uDownloadTem = new ClientStat$DownloadTemplateStatus[0];
             ClientStat$DownloadTemplateStatus._emptyArray = uDownloadTem;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$DownloadTemplateStatus._emptyArray;
    }
    public static ClientStat$DownloadTemplateStatus parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$DownloadTemplateStatus().mergeFrom(p0);
    }
    public static ClientStat$DownloadTemplateStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$DownloadTemplateStatus(), p0);
    }
    public ClientStat$DownloadTemplateStatus clear(){
       this.meta = null;
       this.status = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$DownloadTemplateStatus tmeta = this.meta;
       if (tmeta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tmeta);
       }
       tmeta = this.status;
       if (tmeta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tmeta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$DownloadTemplateStatus mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.status == null){
                this.status = new ClientStat$UrlRequestStatus();
             }
             p0.readMessage(this.status);
          }else if(this.meta == null){
             this.meta = new ClientStat$TemplateMeta();
          }
          p0.readMessage(this.meta);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$DownloadTemplateStatus tmeta = this.meta;
       if (tmeta != null) {
          p0.writeMessage(1, tmeta);
       }
       tmeta = this.status;
       if (tmeta != null) {
          p0.writeMessage(2, tmeta);
       }
       super.writeTo(p0);
       return;
    }
}
