package com.kuaishou.client.log.content.packages.nano.ClientContent$VideoWatermarkDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$VideoWatermarkDetailPackage extends MessageNano	// class@0012ff
{
    public long cost;
    public String downloadUrl;
    public long duration;
    public long length;
    public int type;
    public static ClientContent$VideoWatermarkDetailPackage[] _emptyArray;

    public void ClientContent$VideoWatermarkDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$VideoWatermarkDetailPackage[] emptyArray(){
       if (ClientContent$VideoWatermarkDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$VideoWatermarkDetailPackage._emptyArray == null) {
             ClientContent$VideoWatermarkDetailPackage[] videoWaterma = new ClientContent$VideoWatermarkDetailPackage[0];
             ClientContent$VideoWatermarkDetailPackage._emptyArray = videoWaterma;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$VideoWatermarkDetailPackage._emptyArray;
    }
    public static ClientContent$VideoWatermarkDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$VideoWatermarkDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$VideoWatermarkDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$VideoWatermarkDetailPackage(), p0);
    }
    public ClientContent$VideoWatermarkDetailPackage clear(){
       this.type = 0;
       this.duration = 0;
       this.cost = 0;
       this.length = 0;
       this.downloadUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$VideoWatermarkDetailPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.duration;
       int i1 = 0;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       ttype = this.cost;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttype);
       }
       ttype = this.length;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttype);
       }
       if (!(this.downloadUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.downloadUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$VideoWatermarkDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.downloadUrl = p0.readString();
                      }
                   }else {
                      this.length = p0.readUInt64();
                   }
                }else {
                   this.cost = p0.readUInt64();
                }
             }else {
                this.duration = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$VideoWatermarkDetailPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.duration;
       int i = 0;
       if (ttype - i) {
          p0.writeUInt64(2, ttype);
       }
       ttype = this.cost;
       if (ttype - i) {
          p0.writeUInt64(3, ttype);
       }
       ttype = this.length;
       if (ttype - i) {
          p0.writeUInt64(4, ttype);
       }
       if (!(this.downloadUrl).equals("")) {
          p0.writeString(5, this.downloadUrl);
       }
       super.writeTo(p0);
       return;
    }
}
