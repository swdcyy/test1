package com.kuaishou.client.log.content.packages.nano.ClientContent$VideoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$VideoPackage extends MessageNano	// class@0012f7
{
    public float bitrate;
    public int codec;
    public long duration;
    public String filePath;
    public long fileSize;
    public int skipTranscodeCode;
    public int videoHeight;
    public int videoWidth;
    public String x264Params;
    public static ClientContent$VideoPackage[] _emptyArray;

    public void ClientContent$VideoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$VideoPackage[] emptyArray(){
       if (ClientContent$VideoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$VideoPackage._emptyArray == null) {
             ClientContent$VideoPackage[] videoPackage = new ClientContent$VideoPackage[0];
             ClientContent$VideoPackage._emptyArray = videoPackage;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$VideoPackage._emptyArray;
    }
    public static ClientContent$VideoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$VideoPackage().mergeFrom(p0);
    }
    public static ClientContent$VideoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$VideoPackage(), p0);
    }
    public ClientContent$VideoPackage clear(){
       this.filePath = "";
       this.fileSize = 0;
       this.codec = 0;
       this.duration = 0;
       this.bitrate = 0;
       this.x264Params = "";
       this.videoWidth = 0;
       this.videoHeight = 0;
       this.skipTranscodeCode = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.filePath).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.filePath);
       }
       ClientContent$VideoPackage tfileSize = this.fileSize;
       if (tfileSize) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tfileSize);
       }
       ClientContent$VideoPackage tcodec = this.codec;
       if (tcodec != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tcodec);
       }
       tfileSize = this.duration;
       if (tfileSize) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tfileSize);
       }
       if (Float.floatToIntBits(this.bitrate) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(5, this.bitrate);
       }
       if (!(this.x264Params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.x264Params);
       }
       tcodec = this.videoWidth;
       if (tcodec != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tcodec);
       }
       tcodec = this.videoHeight;
       if (tcodec != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tcodec);
       }
       tcodec = this.skipTranscodeCode;
       if (tcodec != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tcodec);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$VideoPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 45) {
                         if (i != 50) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.skipTranscodeCode = p0.readInt32();
                                  }
                               }else {
                                  this.videoHeight = p0.readUInt32();
                               }
                            }else {
                               this.videoWidth = p0.readUInt32();
                            }
                         }else {
                            this.x264Params = p0.readString();
                         }
                      }else {
                         this.bitrate = p0.readFloat();
                      }
                   }else {
                      this.duration = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.codec = i;
                   }
                }
             }else {
                this.fileSize = p0.readUInt64();
             }
          }else {
             this.filePath = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.filePath).equals(str)) {
          p0.writeString(1, this.filePath);
       }
       ClientContent$VideoPackage tfileSize = this.fileSize;
       if (tfileSize) {
          p0.writeUInt64(2, tfileSize);
       }
       ClientContent$VideoPackage tcodec = this.codec;
       if (tcodec != null) {
          p0.writeInt32(3, tcodec);
       }
       tfileSize = this.duration;
       if (tfileSize) {
          p0.writeUInt64(4, tfileSize);
       }
       if (Float.floatToIntBits(this.bitrate) != Float.floatToIntBits(0)) {
          p0.writeFloat(5, this.bitrate);
       }
       if (!(this.x264Params).equals(str)) {
          p0.writeString(6, this.x264Params);
       }
       tcodec = this.videoWidth;
       if (tcodec != null) {
          p0.writeUInt32(7, tcodec);
       }
       tcodec = this.videoHeight;
       if (tcodec != null) {
          p0.writeUInt32(8, tcodec);
       }
       tcodec = this.skipTranscodeCode;
       if (tcodec != null) {
          p0.writeInt32(9, tcodec);
       }
       super.writeTo(p0);
       return;
    }
}
