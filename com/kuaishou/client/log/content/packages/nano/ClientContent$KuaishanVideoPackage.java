package com.kuaishou.client.log.content.packages.nano.ClientContent$KuaishanVideoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$KuaishanVideoPackage extends MessageNano	// class@001260
{
    public int tabId;
    public String tabName;
    public int templateId;
    public int templateIndex;
    public String templateName;
    public static ClientContent$KuaishanVideoPackage[] _emptyArray;

    public void ClientContent$KuaishanVideoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$KuaishanVideoPackage[] emptyArray(){
       if (ClientContent$KuaishanVideoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$KuaishanVideoPackage._emptyArray == null) {
             ClientContent$KuaishanVideoPackage[] kuaishanVide = new ClientContent$KuaishanVideoPackage[0];
             ClientContent$KuaishanVideoPackage._emptyArray = kuaishanVide;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$KuaishanVideoPackage._emptyArray;
    }
    public static ClientContent$KuaishanVideoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$KuaishanVideoPackage().mergeFrom(p0);
    }
    public static ClientContent$KuaishanVideoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$KuaishanVideoPackage(), p0);
    }
    public ClientContent$KuaishanVideoPackage clear(){
       this.tabId = 0;
       this.tabName = "";
       this.templateId = 0;
       this.templateName = "";
       this.templateIndex = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$KuaishanVideoPackage ttabId = this.tabId;
       if (ttabId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttabId);
       }
       String str = "";
       if (!(this.tabName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.tabName);
       }
       ttabId = this.templateId;
       if (ttabId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttabId);
       }
       if (!(this.templateName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.templateName);
       }
       ttabId = this.templateIndex;
       if (ttabId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, ttabId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$KuaishanVideoPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.templateIndex = p0.readUInt32();
                      }
                   }else {
                      this.templateName = p0.readString();
                   }
                }else {
                   this.templateId = p0.readUInt32();
                }
             }else {
                this.tabName = p0.readString();
             }
          }else {
             this.tabId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$KuaishanVideoPackage ttabId = this.tabId;
       if (ttabId != null) {
          p0.writeUInt32(1, ttabId);
       }
       String str = "";
       if (!(this.tabName).equals(str)) {
          p0.writeString(2, this.tabName);
       }
       ttabId = this.templateId;
       if (ttabId != null) {
          p0.writeUInt32(3, ttabId);
       }
       if (!(this.templateName).equals(str)) {
          p0.writeString(4, this.templateName);
       }
       ttabId = this.templateIndex;
       if (ttabId != null) {
          p0.writeUInt32(5, ttabId);
       }
       super.writeTo(p0);
       return;
    }
}
