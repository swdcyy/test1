package com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEncodingDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoSegmentPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$VideoEncodingDetailPackage extends MessageNano	// class@0012f5
{
    public ClientContent$VideoSegmentPackage[] encodeSegmentPackage;
    public int encodeType;
    public static ClientContent$VideoEncodingDetailPackage[] _emptyArray;

    public void ClientContent$VideoEncodingDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$VideoEncodingDetailPackage[] emptyArray(){
       if (ClientContent$VideoEncodingDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$VideoEncodingDetailPackage._emptyArray == null) {
             ClientContent$VideoEncodingDetailPackage[] videoEncodin = new ClientContent$VideoEncodingDetailPackage[0];
             ClientContent$VideoEncodingDetailPackage._emptyArray = videoEncodin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$VideoEncodingDetailPackage._emptyArray;
    }
    public static ClientContent$VideoEncodingDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$VideoEncodingDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$VideoEncodingDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$VideoEncodingDetailPackage(), p0);
    }
    public ClientContent$VideoEncodingDetailPackage clear(){
       this.encodeSegmentPackage = ClientContent$VideoSegmentPackage.emptyArray();
       this.encodeType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$VideoEncodingDetailPackage tencodeSegme = this.encodeSegmentPackage;
       if (tencodeSegme != null && tencodeSegme.length > 0) {
          int i1 = 0;
          ClientContent$VideoEncodingDetailPackage tencodeSegme1 = this.encodeSegmentPackage;
          while (i1 < tencodeSegme1.length) {
             object oobject = tencodeSegme1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tencodeSegme = this.encodeType;
       if (tencodeSegme != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tencodeSegme);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$VideoEncodingDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
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
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ClientContent$VideoEncodingDetailPackage tencodeSegme = this.encodeSegmentPackage;
             int i2 = (tencodeSegme == null)? 0: tencodeSegme.length;
             i = i + i2;
             ClientContent$VideoSegmentPackage[] videoSegment = new ClientContent$VideoSegmentPackage[i];
             if (i2) {
                System.arraycopy(tencodeSegme, 0, videoSegment, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                videoSegment[i2] = new ClientContent$VideoSegmentPackage();
                p0.readMessage(videoSegment[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             videoSegment[i2] = new ClientContent$VideoSegmentPackage();
             p0.readMessage(videoSegment[i2]);
             this.encodeSegmentPackage = videoSegment;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$VideoEncodingDetailPackage tencodeSegme = this.encodeSegmentPackage;
       if (tencodeSegme != null && tencodeSegme.length > 0) {
          int i = 0;
          ClientContent$VideoEncodingDetailPackage tencodeSegme1 = this.encodeSegmentPackage;
          while (i < tencodeSegme1.length) {
             object oobject = tencodeSegme1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tencodeSegme = this.encodeType;
       if (tencodeSegme != null) {
          p0.writeInt32(2, tencodeSegme);
       }
       super.writeTo(p0);
       return;
    }
}
