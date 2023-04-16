package com.kuaishou.client.log.content.packages.nano.ClientContent$VideoClipDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoSegmentPackage;

public final class ClientContent$VideoClipDetailPackage extends MessageNano	// class@0012f0
{
    public ClientContent$VideoSegmentPackage clippedVideoPackage;
    public boolean isClipped;
    public boolean isRotated;
    public ClientContent$VideoSegmentPackage originVideoPackage;
    public float speed;
    public static ClientContent$VideoClipDetailPackage[] _emptyArray;

    public void ClientContent$VideoClipDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$VideoClipDetailPackage[] emptyArray(){
       if (ClientContent$VideoClipDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$VideoClipDetailPackage._emptyArray == null) {
             ClientContent$VideoClipDetailPackage[] videoClipDet = new ClientContent$VideoClipDetailPackage[0];
             ClientContent$VideoClipDetailPackage._emptyArray = videoClipDet;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$VideoClipDetailPackage._emptyArray;
    }
    public static ClientContent$VideoClipDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$VideoClipDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$VideoClipDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$VideoClipDetailPackage(), p0);
    }
    public ClientContent$VideoClipDetailPackage clear(){
       this.isClipped = false;
       this.isRotated = false;
       this.originVideoPackage = null;
       this.clippedVideoPackage = null;
       this.speed = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$VideoClipDetailPackage tisClipped = this.isClipped;
       if (tisClipped != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tisClipped);
       }
       tisClipped = this.isRotated;
       if (tisClipped != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisClipped);
       }
       tisClipped = this.originVideoPackage;
       if (tisClipped != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tisClipped);
       }
       tisClipped = this.clippedVideoPackage;
       if (tisClipped != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tisClipped);
       }
       if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(5, this.speed);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$VideoClipDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 45) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.speed = p0.readFloat();
                      }
                   }else if(this.clippedVideoPackage == null){
                      this.clippedVideoPackage = new ClientContent$VideoSegmentPackage();
                   }
                   p0.readMessage(this.clippedVideoPackage);
                }else if(this.originVideoPackage == null){
                   this.originVideoPackage = new ClientContent$VideoSegmentPackage();
                }
                p0.readMessage(this.originVideoPackage);
             }else {
                this.isRotated = p0.readBool();
             }
          }else {
             this.isClipped = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$VideoClipDetailPackage tisClipped = this.isClipped;
       if (tisClipped != null) {
          p0.writeBool(1, tisClipped);
       }
       tisClipped = this.isRotated;
       if (tisClipped != null) {
          p0.writeBool(2, tisClipped);
       }
       tisClipped = this.originVideoPackage;
       if (tisClipped != null) {
          p0.writeMessage(3, tisClipped);
       }
       tisClipped = this.clippedVideoPackage;
       if (tisClipped != null) {
          p0.writeMessage(4, tisClipped);
       }
       if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0)) {
          p0.writeFloat(5, this.speed);
       }
       super.writeTo(p0);
       return;
    }
}
