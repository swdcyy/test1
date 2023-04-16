package com.kuaishou.client.log.content.packages.nano.ClientContent$VideoSegmentPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$VideoSegmentPackage extends MessageNano	// class@0012fd
{
    public float avgFps;
    public int decodeType;
    public long duration;
    public int encodeType;
    public int height;
    public float maxFps;
    public float minFps;
    public int width;
    public static ClientContent$VideoSegmentPackage[] _emptyArray;

    public void ClientContent$VideoSegmentPackage(){
       super();
       this.clear();
    }
    public static ClientContent$VideoSegmentPackage[] emptyArray(){
       if (ClientContent$VideoSegmentPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$VideoSegmentPackage._emptyArray == null) {
             ClientContent$VideoSegmentPackage[] videoSegment = new ClientContent$VideoSegmentPackage[0];
             ClientContent$VideoSegmentPackage._emptyArray = videoSegment;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$VideoSegmentPackage._emptyArray;
    }
    public static ClientContent$VideoSegmentPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$VideoSegmentPackage().mergeFrom(p0);
    }
    public static ClientContent$VideoSegmentPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$VideoSegmentPackage(), p0);
    }
    public ClientContent$VideoSegmentPackage clear(){
       this.width = 0;
       this.height = 0;
       this.duration = 0;
       this.avgFps = 0;
       this.maxFps = 0;
       this.minFps = 0;
       this.encodeType = 0;
       this.decodeType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$VideoSegmentPackage twidth = this.width;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, twidth);
       }
       twidth = this.duration;
       if (twidth) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, twidth);
       }
       float f = 0;
       if (Float.floatToIntBits(this.avgFps) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(4, this.avgFps);
       }
       if (Float.floatToIntBits(this.maxFps) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(5, this.maxFps);
       }
       if (Float.floatToIntBits(this.minFps) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(6, this.minFps);
       }
       twidth = this.encodeType;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, twidth);
       }
       twidth = this.decodeType;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, twidth);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$VideoSegmentPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 37) {
                      if (i != 45) {
                         if (i != 53) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  i = p0.readInt32();
                                  if (i && (i != 1 && i != 2)) {
                                     continue ;
                                  }else {
                                     this.decodeType = i;
                                  }
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && (i != 1 && i != 2)) {
                                  continue ;
                               }else {
                                  this.encodeType = i;
                               }
                            }
                         }else {
                            this.minFps = p0.readFloat();
                         }
                      }else {
                         this.maxFps = p0.readFloat();
                      }
                   }else {
                      this.avgFps = p0.readFloat();
                   }
                }else {
                   this.duration = p0.readUInt64();
                }
             }else {
                this.height = p0.readUInt32();
             }
          }else {
             this.width = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$VideoSegmentPackage twidth = this.width;
       if (twidth != null) {
          p0.writeUInt32(1, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          p0.writeUInt32(2, twidth);
       }
       twidth = this.duration;
       if (twidth) {
          p0.writeUInt64(3, twidth);
       }
       float f = 0;
       if (Float.floatToIntBits(this.avgFps) != Float.floatToIntBits(f)) {
          p0.writeFloat(4, this.avgFps);
       }
       if (Float.floatToIntBits(this.maxFps) != Float.floatToIntBits(f)) {
          p0.writeFloat(5, this.maxFps);
       }
       if (Float.floatToIntBits(this.minFps) != Float.floatToIntBits(f)) {
          p0.writeFloat(6, this.minFps);
       }
       twidth = this.encodeType;
       if (twidth != null) {
          p0.writeInt32(7, twidth);
       }
       twidth = this.decodeType;
       if (twidth != null) {
          p0.writeInt32(8, twidth);
       }
       super.writeTo(p0);
       return;
    }
}
