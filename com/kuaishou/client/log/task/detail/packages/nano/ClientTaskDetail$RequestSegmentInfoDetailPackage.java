package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$RequestSegmentInfoDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$RequestSegmentInfoDetailPackage extends MessageNano	// class@001473
{
    public long crcCost;
    public long encodeConfigId;
    public String host;
    public String ip;
    public long requestCost;
    public static ClientTaskDetail$RequestSegmentInfoDetailPackage[] _emptyArray;

    public void ClientTaskDetail$RequestSegmentInfoDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$RequestSegmentInfoDetailPackage[] emptyArray(){
       if (ClientTaskDetail$RequestSegmentInfoDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$RequestSegmentInfoDetailPackage._emptyArray == null) {
             ClientTaskDetail$RequestSegmentInfoDetailPackage[] requestSegme = new ClientTaskDetail$RequestSegmentInfoDetailPackage[0];
             ClientTaskDetail$RequestSegmentInfoDetailPackage._emptyArray = requestSegme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$RequestSegmentInfoDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$RequestSegmentInfoDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$RequestSegmentInfoDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$RequestSegmentInfoDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$RequestSegmentInfoDetailPackage(), p0);
    }
    public ClientTaskDetail$RequestSegmentInfoDetailPackage clear(){
       this.crcCost = 0;
       this.requestCost = 0;
       this.host = "";
       this.ip = "";
       this.encodeConfigId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$RequestSegmentInfoDetailPackage tcrcCost = this.crcCost;
       int i1 = 0;
       if (tcrcCost - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tcrcCost);
       }
       tcrcCost = this.requestCost;
       if (tcrcCost - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcrcCost);
       }
       String str = "";
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.host);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.ip);
       }
       tcrcCost = this.encodeConfigId;
       if (tcrcCost - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tcrcCost);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$RequestSegmentInfoDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.encodeConfigId = p0.readUInt64();
                      }
                   }else {
                      this.ip = p0.readString();
                   }
                }else {
                   this.host = p0.readString();
                }
             }else {
                this.requestCost = p0.readUInt64();
             }
          }else {
             this.crcCost = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$RequestSegmentInfoDetailPackage tcrcCost = this.crcCost;
       int i = 0;
       if (tcrcCost - i) {
          p0.writeUInt64(1, tcrcCost);
       }
       tcrcCost = this.requestCost;
       if (tcrcCost - i) {
          p0.writeUInt64(2, tcrcCost);
       }
       String str = "";
       if (!(this.host).equals(str)) {
          p0.writeString(3, this.host);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(4, this.ip);
       }
       tcrcCost = this.encodeConfigId;
       if (tcrcCost - i) {
          p0.writeUInt64(5, tcrcCost);
       }
       super.writeTo(p0);
       return;
    }
}
