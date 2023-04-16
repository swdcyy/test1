package com.kuaishou.client.log.content.packages.nano.ClientContent$RecordFpsInfoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$RecordFpsInfoPackage extends MessageNano	// class@0012cf
{
    public long average;
    public boolean beauty;
    public int cameraType;
    public boolean changePreviewSize;
    public long durationMs;
    public int encodeType;
    public long height;
    public ClientContent$MagicFacePackage[] magicFacePackage;
    public long maxFps;
    public long minFps;
    public int type;
    public long width;
    public static ClientContent$RecordFpsInfoPackage[] _emptyArray;

    public void ClientContent$RecordFpsInfoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$RecordFpsInfoPackage[] emptyArray(){
       if (ClientContent$RecordFpsInfoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$RecordFpsInfoPackage._emptyArray == null) {
             ClientContent$RecordFpsInfoPackage[] recordFpsInf = new ClientContent$RecordFpsInfoPackage[0];
             ClientContent$RecordFpsInfoPackage._emptyArray = recordFpsInf;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$RecordFpsInfoPackage._emptyArray;
    }
    public static ClientContent$RecordFpsInfoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$RecordFpsInfoPackage().mergeFrom(p0);
    }
    public static ClientContent$RecordFpsInfoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$RecordFpsInfoPackage(), p0);
    }
    public ClientContent$RecordFpsInfoPackage clear(){
       this.type = 0;
       this.minFps = 0;
       this.maxFps = 0;
       this.average = 0;
       this.magicFacePackage = ClientContent$MagicFacePackage.emptyArray();
       this.beauty = false;
       this.cameraType = 0;
       this.width = 0;
       this.height = 0;
       this.encodeType = 0;
       this.changePreviewSize = false;
       this.durationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$RecordFpsInfoPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.minFps;
       int i1 = 0;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       ttype = this.maxFps;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttype);
       }
       ttype = this.average;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttype);
       }
       ttype = this.magicFacePackage;
       if (ttype != null && ttype.length > 0) {
          int i2 = 0;
          ClientContent$RecordFpsInfoPackage tmagicFacePa = this.magicFacePackage;
          while (i2 < tmagicFacePa.length) {
             object oobject = tmagicFacePa[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ttype = this.beauty;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttype);
       }
       ttype = this.cameraType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, ttype);
       }
       ttype = this.width;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttype);
       }
       ttype = this.height;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttype);
       }
       ttype = this.encodeType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, ttype);
       }
       ttype = this.changePreviewSize;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, ttype);
       }
       ttype = this.durationMs;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$RecordFpsInfoPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          ClientContent$RecordFpsInfoPackage recordFpsInf = 2;
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != i1 && i != recordFpsInf)) {
                   continue ;
                }else {
                   this.type = i;
                }
                break;
              case 16:
                this.minFps = p0.readUInt64();
                break;
              case 24:
                this.maxFps = p0.readUInt64();
                break;
              case 32:
                this.average = p0.readUInt64();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                recordFpsInf = this.magicFacePackage;
                i1 = 0;
                int i2 = (recordFpsInf == null)? 0: recordFpsInf.length;
                i = i + i2;
                ClientContent$MagicFacePackage[] magicFacePac = new ClientContent$MagicFacePackage[i];
                if (i2) {
                   System.arraycopy(recordFpsInf, i1, magicFacePac, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   magicFacePac[i2] = new ClientContent$MagicFacePackage();
                   p0.readMessage(magicFacePac[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                magicFacePac[i2] = new ClientContent$MagicFacePackage();
                p0.readMessage(magicFacePac[i2]);
                this.magicFacePackage = magicFacePac;
                break;
              case '0':
                this.beauty = p0.readBool();
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != i1 && i != recordFpsInf)) {
                   continue ;
                }else {
                   this.cameraType = i;
                }
                break;
              case '@':
                this.width = p0.readUInt64();
                break;
              case 'H':
                this.height = p0.readUInt64();
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != i1 && i != recordFpsInf)) {
                   continue ;
                }else {
                   this.encodeType = i;
                }
                break;
              case 'X':
                this.changePreviewSize = p0.readBool();
                break;
              case '`':
                this.durationMs = p0.readUInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$RecordFpsInfoPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.minFps;
       int i = 0;
       if (ttype - i) {
          p0.writeUInt64(2, ttype);
       }
       ttype = this.maxFps;
       if (ttype - i) {
          p0.writeUInt64(3, ttype);
       }
       ttype = this.average;
       if (ttype - i) {
          p0.writeUInt64(4, ttype);
       }
       ttype = this.magicFacePackage;
       if (ttype != null && ttype.length > 0) {
          int i1 = 0;
          ClientContent$RecordFpsInfoPackage tmagicFacePa = this.magicFacePackage;
          while (i1 < tmagicFacePa.length) {
             object oobject = tmagicFacePa[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.beauty;
       if (ttype != null) {
          p0.writeBool(6, ttype);
       }
       ttype = this.cameraType;
       if (ttype != null) {
          p0.writeInt32(7, ttype);
       }
       ttype = this.width;
       if (ttype - i) {
          p0.writeUInt64(8, ttype);
       }
       ttype = this.height;
       if (ttype - i) {
          p0.writeUInt64(9, ttype);
       }
       ttype = this.encodeType;
       if (ttype != null) {
          p0.writeInt32(10, ttype);
       }
       ttype = this.changePreviewSize;
       if (ttype != null) {
          p0.writeBool(11, ttype);
       }
       ttype = this.durationMs;
       if (ttype - i) {
          p0.writeUInt64(12, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
