package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadAtlasDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$UploadAtlasDetailPackage extends MessageNano	// class@001486
{
    public long completedLength;
    public int elementCount;
    public long encodeConfigId;
    public int failedElementCount;
    public long fileLength;
    public String host;
    public String ip;
    public int pictureCount;
    public int type;
    public static ClientTaskDetail$UploadAtlasDetailPackage[] _emptyArray;

    public void ClientTaskDetail$UploadAtlasDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$UploadAtlasDetailPackage[] emptyArray(){
       if (ClientTaskDetail$UploadAtlasDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$UploadAtlasDetailPackage._emptyArray == null) {
             ClientTaskDetail$UploadAtlasDetailPackage[] uploadAtlasD = new ClientTaskDetail$UploadAtlasDetailPackage[0];
             ClientTaskDetail$UploadAtlasDetailPackage._emptyArray = uploadAtlasD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$UploadAtlasDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$UploadAtlasDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$UploadAtlasDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$UploadAtlasDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$UploadAtlasDetailPackage(), p0);
    }
    public ClientTaskDetail$UploadAtlasDetailPackage clear(){
       this.fileLength = 0;
       this.type = 0;
       this.host = "";
       this.ip = "";
       this.completedLength = 0;
       this.encodeConfigId = 0;
       this.elementCount = 0;
       this.pictureCount = 0;
       this.failedElementCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$UploadAtlasDetailPackage tfileLength = this.fileLength;
       int i1 = 0;
       if (tfileLength - i1) {
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
       tfileLength = this.completedLength;
       if (tfileLength - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tfileLength);
       }
       tfileLength = this.encodeConfigId;
       if (tfileLength - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tfileLength);
       }
       tfileLength = this.elementCount;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tfileLength);
       }
       tfileLength = this.pictureCount;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tfileLength);
       }
       tfileLength = this.failedElementCount;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tfileLength);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$UploadAtlasDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
                            if (i != 56) {
                               if (i != 64) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.failedElementCount = p0.readUInt32();
                                  }
                               }else {
                                  this.pictureCount = p0.readUInt32();
                               }
                            }else {
                               this.elementCount = p0.readUInt32();
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
                if (i && (i != 1 && (i != 2 && i != 3))) {
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
       ClientTaskDetail$UploadAtlasDetailPackage tfileLength = this.fileLength;
       int i = 0;
       if (tfileLength - i) {
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
       tfileLength = this.completedLength;
       if (tfileLength - i) {
          p0.writeUInt64(5, tfileLength);
       }
       tfileLength = this.encodeConfigId;
       if (tfileLength - i) {
          p0.writeUInt64(6, tfileLength);
       }
       tfileLength = this.elementCount;
       if (tfileLength != null) {
          p0.writeUInt32(7, tfileLength);
       }
       tfileLength = this.pictureCount;
       if (tfileLength != null) {
          p0.writeUInt32(8, tfileLength);
       }
       tfileLength = this.failedElementCount;
       if (tfileLength != null) {
          p0.writeUInt32(9, tfileLength);
       }
       super.writeTo(p0);
       return;
    }
}
