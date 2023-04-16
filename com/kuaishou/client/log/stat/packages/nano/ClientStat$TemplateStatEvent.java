package com.kuaishou.client.log.stat.packages.nano.ClientStat$TemplateStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$TemplateMeta;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$DownloadTemplateStatus;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$UrlRequestStatus;

public final class ClientStat$TemplateStatEvent extends MessageNano	// class@000809
{
    public ClientStat$DownloadTemplateStatus[] downloadTemplatesStatus;
    public int persistentCostMs;
    public ClientStat$UrlRequestStatus templateApiStatus;
    public ClientStat$TemplateMeta[] templatesMeta;
    public static ClientStat$TemplateStatEvent[] _emptyArray;

    public void ClientStat$TemplateStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$TemplateStatEvent[] emptyArray(){
       if (ClientStat$TemplateStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$TemplateStatEvent._emptyArray == null) {
             ClientStat$TemplateStatEvent[] templateStat = new ClientStat$TemplateStatEvent[0];
             ClientStat$TemplateStatEvent._emptyArray = templateStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$TemplateStatEvent._emptyArray;
    }
    public static ClientStat$TemplateStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$TemplateStatEvent().mergeFrom(p0);
    }
    public static ClientStat$TemplateStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$TemplateStatEvent(), p0);
    }
    public ClientStat$TemplateStatEvent clear(){
       this.templateApiStatus = null;
       this.templatesMeta = ClientStat$TemplateMeta.emptyArray();
       this.downloadTemplatesStatus = ClientStat$DownloadTemplateStatus.emptyArray();
       this.persistentCostMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$TemplateStatEvent ttemplateApi = this.templateApiStatus;
       if (ttemplateApi != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ttemplateApi);
       }
       ttemplateApi = this.templatesMeta;
       int i1 = 0;
       if (ttemplateApi != null && ttemplateApi.length > 0) {
          int i2 = 0;
          ClientStat$TemplateStatEvent ttemplatesMe = this.templatesMeta;
          while (i2 < ttemplatesMe.length) {
             object oobject = ttemplatesMe[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttemplateApi = this.downloadTemplatesStatus;
       if (ttemplateApi != null && ttemplateApi.length > 0) {
          ttemplateApi = this.downloadTemplatesStatus;
          while (i1 < ttemplateApi.length) {
             object oobject1 = ttemplateApi[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       ttemplateApi = this.persistentCostMs;
       if (ttemplateApi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, ttemplateApi);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$TemplateStatEvent mergeFrom(CodedInputByteBufferNano p0){
       ClientStat$TemplateStatEvent tdownloadTem;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.persistentCostMs = p0.readUInt32();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tdownloadTem = this.downloadTemplatesStatus;
                   i2 = (tdownloadTem == null)? 0: tdownloadTem.length;
                   i = i + i2;
                   ClientStat$DownloadTemplateStatus[] uDownloadTem = new ClientStat$DownloadTemplateStatus[i];
                   if (i2) {
                      System.arraycopy(tdownloadTem, 0, uDownloadTem, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      uDownloadTem[i2] = new ClientStat$DownloadTemplateStatus();
                      p0.readMessage(uDownloadTem[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   uDownloadTem[i2] = new ClientStat$DownloadTemplateStatus();
                   p0.readMessage(uDownloadTem[i2]);
                   this.downloadTemplatesStatus = uDownloadTem;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tdownloadTem = this.templatesMeta;
                i2 = (tdownloadTem == null)? 0: tdownloadTem.length;
                i = i + i2;
                ClientStat$TemplateMeta[] templateMeta = new ClientStat$TemplateMeta[i];
                if (i2) {
                   System.arraycopy(tdownloadTem, 0, templateMeta, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   templateMeta[i2] = new ClientStat$TemplateMeta();
                   p0.readMessage(templateMeta[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                templateMeta[i2] = new ClientStat$TemplateMeta();
                p0.readMessage(templateMeta[i2]);
                this.templatesMeta = templateMeta;
             }
          }else if(this.templateApiStatus == null){
             this.templateApiStatus = new ClientStat$UrlRequestStatus();
          }
          p0.readMessage(this.templateApiStatus);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$TemplateStatEvent ttemplateApi = this.templateApiStatus;
       if (ttemplateApi != null) {
          p0.writeMessage(1, ttemplateApi);
       }
       ttemplateApi = this.templatesMeta;
       int i = 0;
       if (ttemplateApi != null && ttemplateApi.length > 0) {
          int i1 = 0;
          ClientStat$TemplateStatEvent ttemplatesMe = this.templatesMeta;
          while (i1 < ttemplatesMe.length) {
             object oobject = ttemplatesMe[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttemplateApi = this.downloadTemplatesStatus;
       if (ttemplateApi != null && ttemplateApi.length > 0) {
          ttemplateApi = this.downloadTemplatesStatus;
          while (i < ttemplateApi.length) {
             object oobject1 = ttemplateApi[i];
             if (oobject1 != null) {
                p0.writeMessage(3, oobject1);
             }
             i = i + 1;
          }
       }
       ttemplateApi = this.persistentCostMs;
       if (ttemplateApi != null) {
          p0.writeUInt32(4, ttemplateApi);
       }
       super.writeTo(p0);
       return;
    }
}
