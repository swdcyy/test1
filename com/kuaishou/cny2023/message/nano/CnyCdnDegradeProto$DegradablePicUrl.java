package com.kuaishou.cny2023.message.nano.CnyCdnDegradeProto$DegradablePicUrl;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.cny2023.message.nano.CnyCdnDegradeProto$CdnDegradeConfig;
import java.lang.Object;
import java.lang.System;

public final class CnyCdnDegradeProto$DegradablePicUrl extends MessageNano	// class@001490
{
    public CnyCdnDegradeProto$CdnDegradeConfig cdnDegradeConfig;
    public UserInfos$PicUrl[] picUrl;
    public static CnyCdnDegradeProto$DegradablePicUrl[] _emptyArray;

    public void CnyCdnDegradeProto$DegradablePicUrl(){
       super();
       this.clear();
    }
    public static CnyCdnDegradeProto$DegradablePicUrl[] emptyArray(){
       if (CnyCdnDegradeProto$DegradablePicUrl._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CnyCdnDegradeProto$DegradablePicUrl._emptyArray == null) {
             CnyCdnDegradeProto$DegradablePicUrl[] uDegradableP = new CnyCdnDegradeProto$DegradablePicUrl[0];
             CnyCdnDegradeProto$DegradablePicUrl._emptyArray = uDegradableP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CnyCdnDegradeProto$DegradablePicUrl._emptyArray;
    }
    public static CnyCdnDegradeProto$DegradablePicUrl parseFrom(CodedInputByteBufferNano p0){
       return new CnyCdnDegradeProto$DegradablePicUrl().mergeFrom(p0);
    }
    public static CnyCdnDegradeProto$DegradablePicUrl parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CnyCdnDegradeProto$DegradablePicUrl(), p0);
    }
    public CnyCdnDegradeProto$DegradablePicUrl clear(){
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.cdnDegradeConfig = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       CnyCdnDegradeProto$DegradablePicUrl tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i1 = 0;
          CnyCdnDegradeProto$DegradablePicUrl tpicUrl1 = this.picUrl;
          while (i1 < tpicUrl1.length) {
             object oobject = tpicUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpicUrl = this.cdnDegradeConfig;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tpicUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CnyCdnDegradeProto$DegradablePicUrl mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.cdnDegradeConfig == null){
                this.cdnDegradeConfig = new CnyCdnDegradeProto$CdnDegradeConfig();
             }
             p0.readMessage(this.cdnDegradeConfig);
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             CnyCdnDegradeProto$DegradablePicUrl tpicUrl = this.picUrl;
             int i2 = (tpicUrl == null)? 0: tpicUrl.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tpicUrl, 0, picUrlArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             picUrlArray[i2] = new UserInfos$PicUrl();
             p0.readMessage(picUrlArray[i2]);
             this.picUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       CnyCdnDegradeProto$DegradablePicUrl tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i = 0;
          CnyCdnDegradeProto$DegradablePicUrl tpicUrl1 = this.picUrl;
          while (i < tpicUrl1.length) {
             object oobject = tpicUrl1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tpicUrl = this.cdnDegradeConfig;
       if (tpicUrl != null) {
          p0.writeMessage(2, tpicUrl);
       }
       super.writeTo(p0);
       return;
    }
}
