package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadAtlasElementDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$UploadAtlasElementDetailPackage extends MessageNano	// class@001488
{
    public long completedLength;
    public long encodeConfigId;
    public String extraMessage;
    public long fileLength;
    public String host;
    public String ip;
    public int type;
    public static ClientTaskDetail$UploadAtlasElementDetailPackage[] _emptyArray;

    public void ClientTaskDetail$UploadAtlasElementDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$UploadAtlasElementDetailPackage[] emptyArray(){
       if (ClientTaskDetail$UploadAtlasElementDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$UploadAtlasElementDetailPackage._emptyArray == null) {
             ClientTaskDetail$UploadAtlasElementDetailPackage[] uploadAtlasE = new ClientTaskDetail$UploadAtlasElementDetailPackage[0];
             ClientTaskDetail$UploadAtlasElementDetailPackage._emptyArray = uploadAtlasE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$UploadAtlasElementDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$UploadAtlasElementDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$UploadAtlasElementDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$UploadAtlasElementDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$UploadAtlasElementDetailPackage(), p0);
    }
    public ClientTaskDetail$UploadAtlasElementDetailPackage clear(){
       this.fileLength = 0;
       this.type = 0;
       this.host = "";
       this.ip = "";
       this.completedLength = 0;
       this.encodeConfigId = 0;
       this.extraMessage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$UploadAtlasElementDetailPackage tfileLength = this.fileLength;
       if (tfileLength) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tfileLength);
       }
       tfileLength = this.type;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tfileLength);
       }
       String str = "";
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.host);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.ip);
       }
       ClientTaskDetail$UploadAtlasElementDetailPackage tcompletedLe = this.completedLength;
       if (tcompletedLe) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tcompletedLe);
       }
       tcompletedLe = this.encodeConfigId;
       if (tcompletedLe) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tcompletedLe);
       }
       if (!(this.extraMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.extraMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$UploadAtlasElementDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.extraMessage = p0.readString();
                            }
                         }else {
                            this.encodeConfigId = p0.readUInt64();
                         }
                      }else {
                         this.completedLength = p0.readUInt64();
                      }
                   }else {
                      this.ip = p0.readString();
                   }
                }else {
                   this.host = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.type = i;
                }
             }
          }else {
             this.fileLength = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$UploadAtlasElementDetailPackage tfileLength = this.fileLength;
       if (tfileLength) {
          p0.writeUInt64(1, tfileLength);
       }
       tfileLength = this.type;
       if (tfileLength != null) {
          p0.writeInt32(2, tfileLength);
       }
       String str = "";
       if (!(this.host).equals(str)) {
          p0.writeString(3, this.host);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(4, this.ip);
       }
       ClientTaskDetail$UploadAtlasElementDetailPackage tcompletedLe = this.completedLength;
       if (tcompletedLe) {
          p0.writeUInt64(5, tcompletedLe);
       }
       tcompletedLe = this.encodeConfigId;
       if (tcompletedLe) {
          p0.writeUInt64(6, tcompletedLe);
       }
       if (!(this.extraMessage).equals(str)) {
          p0.writeString(7, this.extraMessage);
       }
       super.writeTo(p0);
       return;
    }
}
