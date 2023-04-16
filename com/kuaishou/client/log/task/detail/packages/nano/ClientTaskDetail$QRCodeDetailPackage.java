package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$QRCodeDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$QRCodeDetailPackage extends MessageNano	// class@001472
{
    public int media;
    public String qrcodeContent;
    public int routeType;
    public static ClientTaskDetail$QRCodeDetailPackage[] _emptyArray;

    public void ClientTaskDetail$QRCodeDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$QRCodeDetailPackage[] emptyArray(){
       if (ClientTaskDetail$QRCodeDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$QRCodeDetailPackage._emptyArray == null) {
             ClientTaskDetail$QRCodeDetailPackage[] qRCodeDetail = new ClientTaskDetail$QRCodeDetailPackage[0];
             ClientTaskDetail$QRCodeDetailPackage._emptyArray = qRCodeDetail;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$QRCodeDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$QRCodeDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$QRCodeDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$QRCodeDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$QRCodeDetailPackage(), p0);
    }
    public ClientTaskDetail$QRCodeDetailPackage clear(){
       this.media = 0;
       this.routeType = 0;
       this.qrcodeContent = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$QRCodeDetailPackage tmedia = this.media;
       if (tmedia != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmedia);
       }
       tmedia = this.routeType;
       if (tmedia != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tmedia);
       }
       if (!(this.qrcodeContent).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.qrcodeContent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$QRCodeDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.qrcodeContent = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.routeType = i;
                }
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.media = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$QRCodeDetailPackage tmedia = this.media;
       if (tmedia != null) {
          p0.writeInt32(1, tmedia);
       }
       tmedia = this.routeType;
       if (tmedia != null) {
          p0.writeInt32(2, tmedia);
       }
       if (!(this.qrcodeContent).equals("")) {
          p0.writeString(3, this.qrcodeContent);
       }
       super.writeTo(p0);
       return;
    }
}
