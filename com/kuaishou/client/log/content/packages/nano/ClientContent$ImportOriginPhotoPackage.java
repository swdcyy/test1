package com.kuaishou.client.log.content.packages.nano.ClientContent$ImportOriginPhotoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoSegmentPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$ImportOriginPhotoPackage extends MessageNano	// class@001259
{
    public ClientContent$PhotoSegmentPackage[] clippedPhotoSegmentPackage;
    public boolean isClipped;
    public boolean isRotated;
    public ClientContent$PhotoSegmentPackage[] originPhotoSegmentPackage;
    public static ClientContent$ImportOriginPhotoPackage[] _emptyArray;

    public void ClientContent$ImportOriginPhotoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ImportOriginPhotoPackage[] emptyArray(){
       if (ClientContent$ImportOriginPhotoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ImportOriginPhotoPackage._emptyArray == null) {
             ClientContent$ImportOriginPhotoPackage[] importOrigin = new ClientContent$ImportOriginPhotoPackage[0];
             ClientContent$ImportOriginPhotoPackage._emptyArray = importOrigin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ImportOriginPhotoPackage._emptyArray;
    }
    public static ClientContent$ImportOriginPhotoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ImportOriginPhotoPackage().mergeFrom(p0);
    }
    public static ClientContent$ImportOriginPhotoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ImportOriginPhotoPackage(), p0);
    }
    public ClientContent$ImportOriginPhotoPackage clear(){
       this.isClipped = false;
       this.isRotated = false;
       this.originPhotoSegmentPackage = ClientContent$PhotoSegmentPackage.emptyArray();
       this.clippedPhotoSegmentPackage = ClientContent$PhotoSegmentPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$ImportOriginPhotoPackage tisClipped = this.isClipped;
       if (tisClipped != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tisClipped);
       }
       tisClipped = this.isRotated;
       if (tisClipped != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisClipped);
       }
       tisClipped = this.originPhotoSegmentPackage;
       int i1 = 0;
       if (tisClipped != null && tisClipped.length > 0) {
          int i2 = 0;
          ClientContent$ImportOriginPhotoPackage toriginPhoto = this.originPhotoSegmentPackage;
          while (i2 < toriginPhoto.length) {
             object oobject = toriginPhoto[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tisClipped = this.clippedPhotoSegmentPackage;
       if (tisClipped != null && tisClipped.length > 0) {
          tisClipped = this.clippedPhotoSegmentPackage;
          while (i1 < tisClipped.length) {
             object oobject1 = tisClipped[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ImportOriginPhotoPackage mergeFrom(CodedInputByteBufferNano p0){
       ClientContent$ImportOriginPhotoPackage tclippedPhot;
       int i2;
       ClientContent$PhotoSegmentPackage[] photoSegment;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tclippedPhot = this.clippedPhotoSegmentPackage;
                      i2 = (tclippedPhot == null)? 0: tclippedPhot.length;
                      i = i + i2;
                      photoSegment = new ClientContent$PhotoSegmentPackage[i];
                      if (i2) {
                         System.arraycopy(tclippedPhot, 0, photoSegment, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         photoSegment[i2] = new ClientContent$PhotoSegmentPackage();
                         p0.readMessage(photoSegment[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      photoSegment[i2] = new ClientContent$PhotoSegmentPackage();
                      p0.readMessage(photoSegment[i2]);
                      this.clippedPhotoSegmentPackage = photoSegment;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tclippedPhot = this.originPhotoSegmentPackage;
                   i2 = (tclippedPhot == null)? 0: tclippedPhot.length;
                   i = i + i2;
                   photoSegment = new ClientContent$PhotoSegmentPackage[i];
                   if (i2) {
                      System.arraycopy(tclippedPhot, 0, photoSegment, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      photoSegment[i2] = new ClientContent$PhotoSegmentPackage();
                      p0.readMessage(photoSegment[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   photoSegment[i2] = new ClientContent$PhotoSegmentPackage();
                   p0.readMessage(photoSegment[i2]);
                   this.originPhotoSegmentPackage = photoSegment;
                }
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
       ClientContent$ImportOriginPhotoPackage tisClipped = this.isClipped;
       if (tisClipped != null) {
          p0.writeBool(1, tisClipped);
       }
       tisClipped = this.isRotated;
       if (tisClipped != null) {
          p0.writeBool(2, tisClipped);
       }
       tisClipped = this.originPhotoSegmentPackage;
       int i = 0;
       if (tisClipped != null && tisClipped.length > 0) {
          int i1 = 0;
          ClientContent$ImportOriginPhotoPackage toriginPhoto = this.originPhotoSegmentPackage;
          while (i1 < toriginPhoto.length) {
             object oobject = toriginPhoto[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tisClipped = this.clippedPhotoSegmentPackage;
       if (tisClipped != null && tisClipped.length > 0) {
          tisClipped = this.clippedPhotoSegmentPackage;
          while (i < tisClipped.length) {
             object oobject1 = tisClipped[i];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
